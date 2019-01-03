package com.codegen.platform.dao.mybatis.interceptor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;

import com.codegen.platform.dao.mybatis.dialect.Dialect;
import com.codegen.platform.dao.mybatis.util.MbgConstants;

/**
 * add phy page to mysql by interceptor
 *
 * @author Jackie
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class})})
public class TranslationInterceptor implements Interceptor {

    private final static Log log = LogFactory.getLog(TranslationInterceptor.class);
    private Dialect dialect;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        try {
            Connection conn = (Connection) invocation.getArgs()[0];
            StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
            MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, MbgConstants.DEFAULT_OBJECT_FACTORY,
                    MbgConstants.DEFAULT_OBJECT_WRAPPER_FACTORY, MbgConstants.DEFAULT_REFLECTOR_FACTORY);
            MappedStatement mappedStatement = ExecutorInterceptor.getMappedStatement();
            if (mappedStatement == null) {
                return invocation.proceed();
            }
            ExecutorInterceptor.clearMappedStatement();
            String id = mappedStatement.getId();
            String originalSql = (String) metaStatementHandler.getValue("boundSql.sql");
            originalSql = originalSql.trim();
            if (!id.contains("selectByExampleWithTranslation")
                    && (originalSql.startsWith("select") || originalSql.startsWith("SELECT"))) {
                return invocation.proceed();
            }
            String tableName = getTableName(id);
            String columns[] = dialect.getSqlColumn(originalSql);
            String translateColumn = getTranslateColumn(conn, columns, tableName);
            String translateSql = dialect.getTranslateString(originalSql, translateColumn);
            metaStatementHandler.setValue("boundSql.sql", translateSql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invocation.proceed();
    }

    private String getTranslateColumn(Connection conn, String[] columns, String tableName) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        StringBuffer colsb = new StringBuffer();
        colsb.append(StringUtils.join(columns));
        try {
            PreparedStatement pstm = conn.prepareStatement(
                    "select * from tb_em_translate where table_name='" + tableName + "' and status = 'S0A'");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String transType = rs.getString("trans_type");
                String columName = rs.getString("colum_name");
                if (buildColumnTranslateSql(columName, transType, sb, rs, colsb)) {
                    colsb.append(columName);
                    if (!rs.isLast()) {
                        sb.append(", "); //$NON-NLS-1$
                    }
                }
            }
            rs.close();
            pstm.close();
            pstm = conn.prepareStatement("select * from tb_em_translate where table_name='*' and status = 'S0A'");
            rs = pstm.executeQuery();
            while (rs.next()) {
                String transType = rs.getString("trans_type");
                String columName = rs.getString("colum_name");
                for (String colum : columns) {
                    if (columName.equals(colum) && buildColumnTranslateSql(columName, transType, sb2, rs, colsb)) {
                        colsb.append(columName);
                        if (!rs.isLast()) {
                            sb2.append(", "); //$NON-NLS-1$
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (sb.length() > 0 && sb2.length() > 0) {
            sb.append(",");
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    private boolean buildColumnTranslateSql(String columName, String transType, StringBuffer sb, ResultSet rs,
                                            StringBuffer colsb) {
        try {
            if (colsb.toString().contains(name_of(columName))) {
                return false;
            }
            if (transType.equals("S01")) {
                String dictTypeid = rs.getString("dict_type");
                sb.append(
                        "(select dict_name from tb_pc_dict b where b.dict_type='" + dictTypeid + "' and b.dict_id = a."
                                + columName + " and b.status = 'S0A' limit 0, 1) AS " + name_of(columName));
                return true;
            } else if (transType.equals("S02")) {
                String relaColumName = rs.getString("rela_colum_name");
                String transTableName = rs.getString("trans_table_name");
                String transColumName = rs.getString("trans_colum_name");
                sb.append("(select " + transColumName + " from " + transTableName + " b where b." + relaColumName
                        + " = a." + columName + " limit 0, 1) AS " + name_of(columName));
                return true;
            } else if (transType.equals("S03")) {
                String transSql = rs.getString("trans_sql");
                sb.append("(" + transSql + ") AS " + name_of(columName));
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private String name_of(String str) {
        return "name_of_" + str;
    }

    private String getTableName(String id) {
        Pattern pattern = Pattern.compile(".*\\.(\\w*)\\.(\\w*)Mapper.selectByExampleWithTranslation");
        Matcher matcher = pattern.matcher(id);
        while (matcher.find()) {
            String module = matcher.group(1);
            String domainName = matcher.group(2);
            String tableName = "tb_" + module + decodeDomainName(domainName);
            return tableName;
        }
        return null;
    }

    private String decodeDomainName(String domainName) {
        StringBuffer sb = new StringBuffer();
        int sz = domainName.length();
        for (int i = 0; i < sz; i++) {
            if (Character.isUpperCase(domainName.charAt(i))) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(domainName.charAt(i)));
        }
        return sb.toString();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String dialectClass = properties.getProperty("dialectClass");
        try {
            dialect = (Dialect) Class.forName(dialectClass).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("cannot create dialect instance by dialectClass:" + dialectClass, e);
        }
    }

    public void setDialect(Dialect dialect) {
        this.dialect = dialect;
    }

}

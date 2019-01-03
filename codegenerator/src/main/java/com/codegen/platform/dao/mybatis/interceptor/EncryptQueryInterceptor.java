package com.codegen.platform.dao.mybatis.interceptor;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import com.codegen.platform.dao.mybatis.typehandler.DbEncryptUtil;
import com.codegen.platform.util.ArrayUtils;

/**
 * add phy page to mysql by interceptor
 *
 * @author Jackie
 */
@Intercepts({
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class}),
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})})
public class EncryptQueryInterceptor implements Interceptor {

    private final static Log log = LogFactory.getLog(EncryptQueryInterceptor.class);

    @SuppressWarnings("unchecked")
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        try {
            MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
            Object obj = invocation.getArgs()[1];
            BoundSql boundSql = mappedStatement.getBoundSql(obj);
            String sql = boundSql.getSql().trim().toLowerCase();
            String table = "";
            Integer startidx = sql.lastIndexOf("from") + 5;
            Integer endidx = sql.indexOf(" ", startidx);
            if (endidx.equals(-1)) {
                endidx = sql.length();
            }
            table = sql.substring(startidx, endidx).trim();

            if (!DbEncryptUtil.encryptTable.contains(table.toUpperCase())) {
                return invocation.proceed();
            }

            if (obj instanceof Map) {
                Map m = (Map) obj;
                Set<Entry> entrys = m.entrySet();
                for (Entry entry : entrys) {
                    String key = table + "." + entry.getKey();
                    key = key.toUpperCase();
                    if (DbEncryptUtil.encryptTableColumn.contains(key)) {
                        entry.setValue(DbEncryptUtil.getEncodeString(entry.getValue().toString()));
                    }
                }
            } else {
                Field[] fields = obj.getClass().getDeclaredFields();
                if (ArrayUtils.isEmpty(fields)) {
                    return obj;
                }
                for (Field field : fields) {
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    try {
                        Object value = field.get(obj);
                        if (isNotStringClass(value)) {
                            continue;
                        }
                        String key = table + "." + getColName(field.getName());
                        key = key.toUpperCase().trim();
                        Set<String> keys = DbEncryptUtil.encryptTableColumn;
                        if (keys.contains(key)) {
                            field.set(obj, DbEncryptUtil.getEncodeString(value.toString()));
                        }
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return invocation.proceed();
    }

    private String getColName(String name) {
        String colName = "";
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                colName += "_";
            }
            colName += name.charAt(i);
        }
        return colName;
    }

    private static boolean isNotStringClass(Object value) {
        return null == value || value.getClass() != String.class;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }

}

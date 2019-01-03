package com.codegen.platform.dao.mybatis.interceptor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.RowBounds;

import com.codegen.platform.dao.SplitTableUtils;
import com.codegen.platform.dao.mybatis.dialect.Dialect;
import com.codegen.platform.dao.mybatis.util.MbgConstants;
import com.codegen.platform.datatables.util.DataTablesUtil;
import com.codegen.platform.util.LigerGridUtil;

/**
 * add phy page to mysql by interceptor
 * 
 * @author Jackie
 * 
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class StatementPrepareInterceptor implements Interceptor {

	private final static Log log = LogFactory.getLog(StatementPrepareInterceptor.class);
	private Dialect dialect;

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		Connection conn = (Connection) invocation.getArgs()[0];
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		BoundSql boundSql = statementHandler.getBoundSql();
		MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, MbgConstants.DEFAULT_OBJECT_FACTORY,
				MbgConstants.DEFAULT_OBJECT_WRAPPER_FACTORY, MbgConstants.DEFAULT_REFLECTOR_FACTORY);
		String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");

		String tableSuffix = SplitTableUtils.getTableSuffix();
		if (StringUtils.isNotEmpty(tableSuffix)) {
			originalSql = originalSql.replaceAll("@\\{tableSuffix\\}", tableSuffix);
		}
		metaStatementHandler.setValue("delegate.boundSql.sql", originalSql);

		RowBounds rowBounds = (RowBounds) metaStatementHandler.getValue("delegate.rowBounds");
		if (rowBounds == null || rowBounds == RowBounds.DEFAULT) {
			return invocation.proceed();
		}
		if (LigerGridUtil.getCountpage()) {
			log.info("StatementPrepareInterceptor count page for LigerGrid");
			ParameterHandler parameterHandler = statementHandler.getParameterHandler();
			int pagecount = getSqlCount(conn, parameterHandler, originalSql);
			LigerGridUtil.setTotal(pagecount);
		}
		if (DataTablesUtil.getCountpage()) {
			log.info("StatementPrepareInterceptor count page for DataTables");
			ParameterHandler parameterHandler = statementHandler.getParameterHandler();
			int pagecount = getSqlCount(conn, parameterHandler, originalSql);
			DataTablesUtil.setTotal(pagecount);
		}
		String limitSql = dialect.getLimitString(originalSql, rowBounds.getOffset(), rowBounds.getLimit());
		metaStatementHandler.setValue("delegate.boundSql.sql", limitSql);
		metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
		metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);
		if (log.isDebugEnabled()) {
			log.debug("Pagination SQL : " + boundSql.getSql());
		}
		return invocation.proceed();
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

	private int getSqlCount(Connection conn, ParameterHandler parameterHandler, String sql) {
		try {
			String statement = dialect.getCountString(sql);
			PreparedStatement st = conn.prepareStatement(statement);
			parameterHandler.setParameters(st);
			ResultSet rt = st.executeQuery();
			if (rt.next()) {
				return rt.getInt(1);
			}
			rt.close();
			st.close();
		} catch (Exception e) {
			log.error("分页获取记录总数失败！\n执行sql为：" + sql, e);
			e.printStackTrace();
		}
		return 0;
	}

}

package com.codegen.platform.dao.mybatis.interceptor;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * add phy page to mysql by interceptor
 * 
 * @author Jackie
 * 
 */
@Intercepts({ @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class,
		RowBounds.class, ResultHandler.class }) })
public class ExecutorInterceptor implements Interceptor {

	private final static Log log = LogFactory.getLog(ExecutorInterceptor.class);
	private static ThreadLocal<MappedStatement> mappedStatementLocal = new ThreadLocal<MappedStatement>();

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		mappedStatementLocal.set((MappedStatement) invocation.getArgs()[0]);
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {

	}

	public static MappedStatement getMappedStatement() {
		return mappedStatementLocal.get();
	}

	public static void clearMappedStatement() {
		ExecutorInterceptor.mappedStatementLocal.remove();
	}

}

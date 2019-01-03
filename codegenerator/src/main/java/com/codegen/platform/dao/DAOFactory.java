package com.codegen.platform.dao;

//import org.springframework.beans.factory.FactoryBean;
//
//import com.yy.server.frame.DaoClientProperty;
//import com.yy.server.frame.IDaoClientFactory;
//import com.yy.server.frame.impl.DaoClientFactorySLib3Impl;
//
//public class DAOFactory implements FactoryBean<IDaoClientFactory>{
//	
//	String authName = "yyms";
//	String daopxName = "daopx";
//	int	groupId = Integer.valueOf( getDefaultSetting("yy.group.id", "YY_GROUP_ID", "0") );	// 一般的，通过环境变量 yy.groupid获取
//	String	daemonHost = getDefaultSetting("yy.daemon.host", "YY_DAEMON_HOST", "balance.yy.duowan.com");
//	int	daemonPort = Integer.valueOf( getDefaultSetting("yy.daemon.port", "YY_DAEMON_PORT", "3000") );
//
//	@Override
//	public IDaoClientFactory getObject() throws Exception {
//		
//		DaoClientFactorySLib3Impl factory = new DaoClientFactorySLib3Impl();
//		
//		DaoClientProperty property = new DaoClientProperty();
//		property.authName = authName;
//		property.daopxName = "daopx";
//		property.groupId = groupId;
//		property.options.put("DaemonHost",  daemonHost);
//		property.options.put("DaemonPort", ""+ daemonPort);
//		
//		System.out.println("Daemon setting: groupId = " + groupId + " daemon=" + daemonHost + ":" + daemonPort + " authName=" + authName);
//		
//		factory.initFactory(property);
//		
//		return factory;
//	}
//	
//	public String getAuthName() {
//		return authName;
//	}
//
//	public void setAuthName(String authName) {
//		this.authName = authName;
//	}
//
//	public String getDaopxName() {
//		return daopxName;
//	}
//
//	public void setDaopxName(String daopxName) {
//		this.daopxName = daopxName;
//	}
//
//	public int getGroupId() {
//		return groupId;
//	}
//
//	public void setGroupId(int groupId) {
//		this.groupId = groupId;
//	}
//
//	public String getDaemonHost() {
//		return daemonHost;
//	}
//
//	public void setDaemonHost(String daemonHost) {
//		this.daemonHost = daemonHost;
//	}
//
//	public int getDaemonPort() {
//		return daemonPort;
//	}
//
//	public void setDaemonPort(int daemonPort) {
//		this.daemonPort = daemonPort;
//	}
//
//	String getDefaultSetting(String propKey, String envKey, String defValue) {
//		String prop = System.getProperty(propKey);
//		if(prop != null) return prop;
//		
//		String env = System.getenv(envKey);
//		if(env != null) return env;
//		
//		return defValue;
//	}
//	
//	@Override
//	public Class<?> getObjectType() {
//		return IDaoClientFactory.class;
//	}
//
//	@Override
//	public boolean isSingleton() {
//		return true;
//	}
//	
//
//
//}

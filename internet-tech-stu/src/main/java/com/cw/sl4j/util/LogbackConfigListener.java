/**
 * @Title: LogbackConfigListener.java
 * @Package com.cw.sl4j.util
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 17, 2014 9:26:56 PM
 * @version V1.0
 */

package com.cw.sl4j.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

/**
 * @ClassName: LogbackConfigListener
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 17, 2014 9:26:56 PM
 *
 */

public class LogbackConfigListener implements ServletContextListener {
	
	private static final Logger logger = LoggerFactory.getLogger(LogbackConfigListener.class);
	
	private static final String CONFIG_LOCATION = "logbackConfigLocation";
	

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String logbackConfigLocation = sce.getServletContext().getInitParameter(CONFIG_LOCATION);
		String fileName = sce.getServletContext().getRealPath(logbackConfigLocation);
		
		try {
			LoggerContext loggerContext = (LoggerContext)LoggerFactory.getILoggerFactory();
			loggerContext.reset();
			JoranConfigurator joranConfigurator = new JoranConfigurator();
			joranConfigurator.setContext(loggerContext);
			joranConfigurator.doConfigure(fileName);
			
			logger.info("loaded slf4j configure file from {}", fileName);
		} catch (JoranException e) {
			logger.error("can not load slf4j configure file from {}", fileName);
			logger.error(e.getMessage(), e);
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}

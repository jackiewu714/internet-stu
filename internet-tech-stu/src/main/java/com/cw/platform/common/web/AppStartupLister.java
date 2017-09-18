/**
 * @Title: AppStartupLister.java
 * @Package com.cw.platform.common.web
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 22, 2014 9:06:40 PM
 * @version V1.0
 */

package com.cw.platform.common.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cw.platform.util.SpringUtils;

/**
 * @ClassName: AppStartupLister
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 22, 2014 9:06:40 PM
 *
 */

public class AppStartupLister implements ServletContextListener{
	
	/**
	 * log printer
	 */
	private static final Logger logger = LoggerFactory.getLogger(AppStartupLister.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("AppStartupLister begin...");
		ServletContext servletContext = sce.getServletContext();
		SpringUtils.setContext(servletContext);
		
		logger.info("AppStartupLister end...");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}

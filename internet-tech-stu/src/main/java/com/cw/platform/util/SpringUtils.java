/**
 * @Title: SpringUtils.java
 * @Package com.cw.platform.util
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 22, 2014 8:25:54 PM
 * @version V1.0
 */

package com.cw.platform.util;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @ClassName: SpringUtils
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 22, 2014 8:25:54 PM
 * 
 */

public class SpringUtils {

	private static ApplicationContext context = null;

	public static ApplicationContext getContext() {
		return context;
	}

	public static void setContext(ApplicationContext context) {
		SpringUtils.context = context;
	}

	public static void setContext(ServletContext servletContext) {
		WebApplicationContext wctx = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		SpringUtils.context = wctx;
	}

	public static Object getBean(String beanName) {
		return context.getBean(beanName);
	}
}

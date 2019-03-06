package com.cw.stu.internet.tech.platform.util;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

public class SpringUtils {
    private static ApplicationContext context = null;

    public static ApplicationContext getContext() {
        return context;
    }

    public static void setContext(ApplicationContext context) {
        SpringUtils.context = context;
    }

    public static void setContext(ServletContext servletContext) {
        WebApplicationContext wctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        SpringUtils.context = wctx;
    }

    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }
}

package com.codegen.platform.web;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class ControllerContext implements Serializable {
    private static final long serialVersionUID = -1767714708233127983L;

    public static final String iPhone = "iPhone";
    public static final String iPad = "iPad";
    public static final String Android = "Android";
    public static final String Web = "web";
    private static String resourcePath = initResourcePath();

    protected transient static ThreadLocal<HttpServletRequest> request = new ThreadLocal<HttpServletRequest>();
    protected transient static ThreadLocal<HttpServletResponse> response = new ThreadLocal<HttpServletResponse>();
    
    public static String getIp() {
	String ip = request.get().getHeader("X-Forwarded-For");
	if (ip == null) {
	    ip = request.get().getRemoteAddr();
	}
	ip = ip == null ? "127.0.0.1" : ip;
	return ip;
    }
    
    public static HttpSession getSession() {
	return request.get().getSession();
    }

    public static HttpServletRequest getRequest() {
	return request.get();
    }

    public static void setRequest(HttpServletRequest request) {
	ControllerContext.request.set(request);
    }

    public static HttpServletResponse getResponse() {
	return response.get();
    }

    public static void setResponse(HttpServletResponse response) {
	ControllerContext.response.set(response);
    }
    
    private static String initResourcePath() {
	try {
	    String path = new ClassPathXmlApplicationContext().getResource("configs/spring/applicationContext.xml")
		    .getURL().getPath();
	    path = path.substring(0, path.lastIndexOf("/"));
	    return path;
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return null;
    }

    public static String getResourcePath() {
	return resourcePath;
    }

    public static String getContextPath() {
	try {
	    String path = getRequest().getContextPath();
	    if (path.equals(""))
		return "./src/main/webapp";
	    return path;
	} catch (Exception e) {
	    e.printStackTrace();
	    return "";
	}
    }

    public static String getClientType() {
	String useragent = getUserAgent();
	if (useragent.contains(iPhone))
	    return iPhone;
	else if (useragent.contains(iPad))
	    return iPad;
	else if (useragent.contains(Android))
	    return Android;
	else
	    return Web;
    }

    public static String getTokenType() {
	String useragent = getUserAgent();
	if (useragent.contains(iPhone) || useragent.contains(iPad))
	    return "ios";
	else if (useragent.contains(Android))
	    return "android";
	else
	    return "web";
    }

    public static String getUserAgent() {
	return getRequest().getHeader("user-agent");
    }

    public static String getSessionId() {
	return request.get().getSession().getId();
    }

   

}

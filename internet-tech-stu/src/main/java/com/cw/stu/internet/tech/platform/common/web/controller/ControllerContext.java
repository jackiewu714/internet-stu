package com.cw.stu.internet.tech.platform.common.web.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public final class ControllerContext implements Serializable {
    private static final long serialVersionUID = -1767714708233127983L;

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
}

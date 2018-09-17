package com.cw.stu.internet.tech.web.business.sysmgr.login.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.cw.stu.internet.tech.web.business.sysmgr.login.domain.OperInfo;

public class LoginHelper {

    public static String PRIVATE_KEY = "EF12ACD912AMOZGR";

    public static String DOMAIN = "315web.duowan.com";
//    public static String DOMAIN = "127.0.0.1";

    public static String TICKET_NAME = "RP315";

    public static String RP315_LOGIN_TIME = "RP315_LOGIN_TIME"; //登录时间

    public static String RP315_LOGIN_NAME = "RP315_LOGIN_NAME"; //登录用户名

    public static String RP315_LOGIN_PWD = "RP315_LOGIN_PWD"; //登录密码

    public static String RP315_REM_PWD = "RP315_REM_PWD"; //记住密码

    public static String RP315_AUTO_LOGIN = "RP315_AUTO_LOGIN"; //自动登录

    public static String SESSION_OPERINFO = "oper";

    public static String OPENAPI_APP = "openApp";


    /**
     * 设置登录session
     *
     * @param request HttpServletRequest
     * @param oper    OperInfo
     * @return  boolean
     * @throws Exception
     */
    public static boolean saveOperInfo(HttpServletRequest request, OperInfo oper) {
        if (oper == null) {
            return false;
        } else {
            HttpSession session = request.getSession(true);
            session.setAttribute(SESSION_OPERINFO, oper);
            session.setAttribute("staffName", oper.getOperName());
        }
        return true;
    }

    /**
     * 取登陆信息。若不存在则返回null。
     *
     * @param request
     * @return
     */
    public static OperInfo getLoginSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return null;
        }
        OperInfo operInfo = (OperInfo) session.getAttribute(SESSION_OPERINFO);
        return operInfo;
    }

    public static boolean removeLoginSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute(SESSION_OPERINFO);
        }
        return true;
    }
}

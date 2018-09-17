package com.cw.stu.internet.tech.web.business.sysmgr.login.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cw.stu.internet.tech.common.dao.domain.sm.Staff;
import com.cw.stu.internet.tech.common.dao.domain.sm.SysLog;
import com.cw.stu.internet.tech.platform.common.web.controller.BaseController;
import com.cw.stu.internet.tech.platform.util.Result;
import com.cw.stu.internet.tech.platform.util.web.IpUtil;
import com.cw.stu.internet.tech.platform.util.web.ValidateCodeUtil;
import com.cw.stu.internet.tech.web.business.sysmgr.login.service.LoginService;
import com.cw.stu.internet.tech.web.business.sysmgr.staff.service.StaffMgrService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cw.stu.internet.tech.web.business.log.service.LogMgrService;
import com.cw.stu.internet.tech.web.business.sysmgr.grant.service.AccessCrontrolListService;
import com.cw.stu.internet.tech.web.business.sysmgr.login.domain.OperInfo;
import com.cw.stu.internet.tech.web.business.sysmgr.login.util.LoginHelper;
import com.cw.stu.internet.tech.web.common.DictConstant;

/**
 * 验证是否是合法工号，则查询员工权限，返回菜单显示
 *
 * @author WuLiangzhi
 * @ClassName: LoginController
 * @Description: 验证是否是合法工号，则查询员工权限，返回菜单显示
 * @date May 7, 2014 11:46:58 AM
 */
@Controller
public class LoginController extends BaseController {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    public static String logoutUrl = "/logout.php";

    @Autowired
    private StaffMgrService staffMgrService;
    @Autowired
    private AccessCrontrolListService accessCrontrolListService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private LogMgrService logMgrService;

    /**
     * 登录
     *
     * @param staffName    登录名
     * @param password     密码
     * @param validateCode 验证码
     * @param remPwd       是否记住密码
     * @param autoLogin    是否自动登录
     * @return
     * @Title: login
     * @Description: 登录
     */
    @ResponseBody
    @RequestMapping("/login")
    public Result login(@RequestParam(required = true, value = "staffName") String staffName,
                        @RequestParam(required = true, value = "password") String password,
                        @RequestParam(required = true, value = "loginVerifyCode") String validateCode,
                        @RequestParam(required = false, value = "remPwd") boolean remPwd,
                        @RequestParam(required = false, value = "autoLogin") boolean autoLogin) {
        Result result = new Result();

        try {
            // TODO 1. 验证码验证
            boolean cheRet = ValidateCodeUtil.checkCode(DictConstant.VALIDATE_CODE_TYPE.LOGIN, validateCode,
                    getRequest());
            if (!cheRet) {// 验证码验证失败(自动登录不验证验证码)
                result.setSuccess(false);
                result.setMessage("验证码输入错误，请重新输入");
            } else {
                // 2. 账号密码验证
                result = loginService.checkAccount(staffName, password, true);
                if (result.isSuccess()) {// 账号密码验证通过
                    result = this.buildSession(staffName, remPwd, autoLogin);
                } else {
                    // 登录失败保存日志
                    this.saveLoginLog(false, 1, staffName, null, IpUtil.getIpAddress(getRequest()));
                }
            }
        } catch (Exception e) {
            logger.error("login error:", e);
            result.setSuccess(false);
            result.setMessage("登录失败，请联系管理员.");
        }

        logger.info("staff={} login result={}", staffName, result);
        return result;
    }

    /**
     * 构建session
     *
     * @param staffName 用户名
     * @param remPwd    是否记住密码
     * @param autoLogin 是否自动登录
     * @return Result
     * @Title: buildSession
     * @Description: 构建session
     */
    private Result buildSession(String staffName, boolean remPwd, boolean autoLogin) {
        Result rs = new Result();
        rs.setSuccess(true);
        try {
            rs = staffMgrService.getStaffByStaffName(staffName);
            if (!rs.isSuccess()) {
                logger.warn(rs.getMessage());
                return rs;
            }
            String ip = IpUtil.getIpAddress(getRequest()); // 客户ip地址
            // String mac = IpUtil.getMacAddress(ip); //先不执行，太慢了，卡程序
            Staff staff = (Staff) rs.getResult();
            staff.setLastLoginip(ip);
            staff.setLastLogintime(new Date());

            // 写入cookies，凭证,并存进session
            if (!buildSession(staff, staff.getPassword(), remPwd, autoLogin, this.getRequest(), this.getResponse())) {
                rs.setSuccess(false);
                rs.setMessage("构建会话失败，请联系管理员");
                return rs;
            }

            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put(LoginHelper.RP315_LOGIN_NAME, staff.getStaffName());
            resultMap.put(LoginHelper.RP315_LOGIN_PWD, staff.getPassword());
            resultMap.put(LoginHelper.RP315_REM_PWD, remPwd);
            resultMap.put(LoginHelper.RP315_AUTO_LOGIN, autoLogin);

            if (remPwd) {// 记住密码才返回值写入客户端浏览器
                rs.setResult(resultMap);
            }

            logger.warn("构建会话成功。ip:" + staff.getLastLoginip());
            // 更新上次登录时间和IP
            staffMgrService.updateLastLoginTimeAndIp(staff.getStaffId(), staff.getLastLoginip());

            this.saveLoginLog(true, staff.getStaffId(), staffName, staff.getStaffNick(), ip);
        } catch (Exception e) {
            rs.setSuccess(false);
            rs.setMessage("构建会话异常，请联系管理员");
            logger.error("login error:", e);
        }
        return rs;
    }

    /**
     * 构建session
     *
     * @param staff     Staff
     * @param password  密码
     * @param remPwd    是否记住密码
     * @param autoLogin 是否自动登录
     * @param request   HttpServletRequest
     * @param response  HttpServletResponse
     * @return true-构建成功 false-构建失败
     * @Title: buildSession
     * @Description: 构建session
     */
    private boolean buildSession(Staff staff, String password, boolean remPwd, boolean autoLogin,
                                 HttpServletRequest request, HttpServletResponse response) {
        Date now = new Date();
        OperInfo oper = new OperInfo();
        if (staff != null) {
            // 设置session
            oper.setLoginIp(staff.getLastLoginip());
            oper.setLastTime(now);
            oper.setOperId(staff.getStaffId());
            oper.setOperName(staff.getStaffName());

            oper.setUrls(accessCrontrolListService.getAllowAccesUrlList(staff.getStaffId()));
            oper.setMenuList(accessCrontrolListService.getAllowAccessMenuList(staff.getStaffId()));

            oper.getUrls().add("/index");
            LoginHelper.saveOperInfo(request, oper);
        }
        return true;
    }

    /**
     * 记录登录日志
     *
     * @param isSuccess true-成功 false-失败
     * @param staffId   登录工号
     * @param staffName 登录名称
     * @param staffNick 用户昵称
     * @param ip        IP地址
     * @Title: saveLoginLog
     * @Description: 记录登录日志
     */
    private void saveLoginLog(boolean isSuccess, Integer staffId, String staffName, String staffNick, String ip) {
        // 插入登录日志
        Date now = new Date();
        SysLog sysLog = new SysLog();
        sysLog.setLogType(DictConstant.LOG_TYPE.LOGIN);
        sysLog.setCreateStaff(staffId);
        sysLog.setCreateDate(now);
        sysLog.setOperStaffName(staffName);
        sysLog.setIpAddress(ip);
        sysLog.setMacAddress("");
        sysLog.setOperDate(now);
        sysLog.setContent("用户[" + staffName + "]登录系统" + (isSuccess ? "成功" : "失败"));
        logMgrService.saveSysLog(sysLog);
    }

    @RequestMapping("/logout")
    public String logout() {
        LoginHelper.removeLoginSession(getRequest());
        String redirectUrl = this.getRequest().getContextPath() + "/index.jsp";
        return "redirect:" + redirectUrl;
    }
}

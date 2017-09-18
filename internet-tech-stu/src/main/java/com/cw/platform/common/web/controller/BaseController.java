package com.cw.platform.common.web.controller;

import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.cw.platform.spring.property.DateEditor;
import com.cw.platform.util.DataUtil;
import com.cw.platform.util.Result;
import com.cw.web.business.sysmgr.login.domain.OperInfo;
import com.cw.web.business.sysmgr.login.util.LoginHelper;
import com.jcabi.aspects.Loggable;

public abstract class BaseController {

	protected final static String TEXT = "json";
	protected final static String ERROR = "/common/error/error";
	protected final static String SUCCESS = "success";

	// @Autowired
	// BizLoggerWriter loggerWriter;// 操作日志

	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		// 对于需要转换为Date类型的属性，使用DateEditor进行处理
		binder.registerCustomEditor(Date.class, new DateEditor());
	}

	/**
	 * 写操作日志
	 * 
	 * @param bizCode
	 * @param sid
	 * @param asid
	 * @param staffId
	 * @param newStatus
	 * @param reason
	 * @param msg
	 */
	protected void insertOperLog(Map<String, Object> param, String bizCode, String reason) {
		Result operLog = new Result();
		param.put("staffId", getStaffId());
		param.put("operDate", DataUtil.tryDateToString(new Date()));
		operLog.setResultMap(param);
		operLog.setMessage(reason);
		// loggerWriter.writeLog(bizCode, getStaffId(), operLog);
	}

	protected void insertOperLog(String bizCode, String message) {
		Result operLog = new Result();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("staffId", getStaffId());
		param.put("operDate", DataUtil.tryDateToString(new Date()));
		operLog.setResultMap(param);
		operLog.setMessage(message);
		// loggerWriter.writeLog(bizCode, getStaffId(), operLog);
	}

	protected HttpSession getSession() {
		return ControllerContext.getSession();
	}

	@Loggable(limit = 500, unit = TimeUnit.MILLISECONDS)
	protected OperInfo getOper() {
		Object obj = ControllerContext.getSession().getAttribute(LoginHelper.SESSION_OPERINFO);
		if (obj == null) {
			return null;
		}
		return (OperInfo) obj;
	}

	protected HttpServletRequest getRequest() {
		return ControllerContext.getRequest();
	}

	protected HttpServletResponse getResponse() {
		return ControllerContext.getResponse();
	}

	protected String getIp() {
		return ControllerContext.getIp();
	}

	protected Map getParameterMap() {
		Map param = new HashMap();
		Enumeration e = ControllerContext.getRequest().getParameterNames();
		while (e.hasMoreElements()) {
			String key = e.nextElement().toString();
			String value = ControllerContext.getRequest().getParameter(key);
			param.put(key, value);
		}
		return param;
	}

	/** 返回登陆系统操作员工号信息 */
	public OperInfo getLoginSession() {
		return LoginHelper.getLoginSession(this.getRequest());
	}

	protected Integer getStaffId() {
		if (getOper() == null) {
			return null;
		}
		return getOper().getOperId();
	}

	protected List<String> getAccessUrls() {
		if (getOper() == null) {
			return null;
		}
		return getOper().getUrls();
	}

	protected boolean isOkAccessUrl(String url) {
		Integer stafffId = getStaffId();
		if (stafffId == null) {
			return false;
		}
		if (url == null) {
			return false;
		}
		List<String> accessUrls = getAccessUrls();
		if (accessUrls == null) {
			return false;
		}
		for (String hadAccessUrl : accessUrls) {
			// 有权限
			if (hadAccessUrl != null && hadAccessUrl.equalsIgnoreCase(url)) {
				return true;
			}
		}
		return false;
	}
}

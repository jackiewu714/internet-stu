/**
 * @Title: IpUtil.java
 * @Package com.yy.rp.common.util.web
 * @Description: ip工具类
 * Copyright: Copyright (c) 2014 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date May 9, 2014 12:34:59 PM
 * @version V1.0
 */

package com.cw.platform.util.web;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: IpUtil
 * @Description: ip工具类
 * @author WuLiangzhi
 * @date May 9, 2014 12:34:59 PM
 *
 */

public class IpUtil {
    
    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(IpUtil.class);

    /**
     * 获取访问的客户端IP
      * @Title: getIpAddress
      * @Description: 获取访问的客户端IP
      * @param request	HttpServletRequest
      * @return	客户端IP
     */
    public static String getIpAddress(HttpServletRequest request) {
	String ip = request.getHeader("x-forwarded-for");
	if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)) {
	    ip = request.getHeader("Proxy-Client-IP");
	}
	
	if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)) {
	    ip = request.getHeader("WL-Proxy-Client-IP");
	}
	
	if(ip==null || ip.length()==0 || "unknown".equalsIgnoreCase(ip)) {
	    ip = request.getRemoteAddr();
	}
	
	return ip;
    }
    
    /**
     * 获取客户机器MAC地址
      * @Title: getMacAddress
      * @Description: 获取客户机器MAC地址
      * @param ip	客户端IP地址
      * @return	MAC地址
     */
    public static String getMacAddress(String ip) {
	String mac = "";
	InputStreamReader isr = null;
	LineNumberReader lnr = null;
	try {
	    Process p = Runtime.getRuntime().exec("nbtstat -a " + ip);
	    isr = new InputStreamReader(p.getInputStream());
	    lnr = new LineNumberReader(isr);
	    String str = "";
	    for(int i=0; i<100; i++) {
		str = lnr.readLine();
		if(str != null && str.indexOf("MAC Address")>1) {
		    mac = str.substring(str.indexOf("MAC Address") + 14, str.length());
		    break;
		}
	    }
	} catch (IOException e) {
	   logger.error(e.getMessage(), e);
	} finally {
	    try {
		lnr.close();
		isr.close();
	    } catch (IOException e) {
		logger.error(e.getMessage(), e);
	    }
	}
	return mac;
    }
    
    public static void main(String[] args) {
	String ip = "172.16.25.110";
	String mac = IpUtil.getMacAddress(ip);
	System.out.println("ip=" + ip + ", mac=" + mac);
    }
    
}

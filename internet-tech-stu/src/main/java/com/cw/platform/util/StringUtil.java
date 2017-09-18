package com.cw.platform.util;

import org.apache.commons.lang.StringUtils;

public class StringUtil extends StringUtils {
    
    public static String addRightRange(String value) {
	return value + "%";
    }

    public static String addLeftRange(String value) {
	return "%" + value;
    }

    public static String addAllRange(String value) {
	return "%" + value + "%";
    }
    
    /**
     * 判定两个字符串是否相等
      * @Title: checkIfEqual
      * @Description: 判定两个字符串是否相等
      * @param srcStr	源字符串
      * @param destStr	目的字符串
      * @return	true-相等  false-不相等
     */
    public static boolean checkIfEqual(String srcStr, String destStr) {
	if(srcStr == null && destStr == null) {
	    return true;
	}
	
	if(srcStr == null && destStr != null) {
	    return false;
	}
	
	if(destStr == null && srcStr != null) {
	    return false;
	}
	
	return srcStr.equals(destStr);
    }
}

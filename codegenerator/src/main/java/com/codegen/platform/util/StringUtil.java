package com.codegen.platform.util;

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
     * 
     * @Title: checkIfEqual
     * @Description: 判定两个字符串是否相等
     * @param srcStr
     *            源字符串
     * @param destStr
     *            目的字符串
     * @return true-相等 false-不相等
     */
    public static boolean checkIfEqual(String srcStr, String destStr) {
	if (StringUtils.isEmpty(srcStr) && StringUtils.isEmpty(destStr)) {
	    return true;
	}
	if (srcStr == null && destStr == null) {
	    return true;
	}

	if (srcStr == null && destStr != null) {
	    return false;
	}

	if (destStr == null && srcStr != null) {
	    return false;
	}

	return srcStr.equals(destStr);
    }

    public static String handlerNull(String str) {
	if (isEmpty(str)) {
	    str = "";
	}
	return str;
    }
    
    public static String handlerNull(Object obj) {
	if(obj == null) {
	    return "";
	}
	String str = String.valueOf(obj);
	if (isEmpty(str)) {
	    str = "";
	}
	return str;
    }

    /**
     * 过滤掉不可显示的奇怪字符
     * 
     * @Title: stripNonCharCodepoints
     * @Description: 过滤掉不可显示的奇怪字符
     * @param input
     * @return
     */
    public static String stripNonCharCodepoints(String input) {
	StringBuilder retval = new StringBuilder();
	char ch;

	for (int i = 0; i < input.length(); i++) {
	    ch = input.charAt(i);
	    if (ch % 0x10000 != 0xffff && // 0xffff - 0x10ffff range step
		    // 0x10000
		    ch % 0x10000 != 0xfffe && // 0xfffe - 0x10fffe range
		    (ch <= 0xfdd0 || ch >= 0xfdef) && // 0xfdd0 - 0xfdef
		    (ch > 0x1F || ch == 0x9 || ch == 0xa || ch == 0xd)) {

		retval.append(ch);
	    }
	}

	return retval.toString();
    }

    /**
     * 用*号隐藏字符串指定开始位置的指定数量的字符
     * 
     * @Title: shieldString
     * @Description: 用*号隐藏字符串指定开始位置的指定数量的字符
     * @param str
     *            字符串
     * @param start
     *            开始位置
     * @param shieldNum
     *            需隐藏字符数量
     * @return String
     */
    public static String shieldString(String str, int start, int shieldNum) {
	if (isNotEmpty(str)) {
	    char[] charArr = str.toCharArray();
	    int length = charArr.length;
	    if (start >= length) {
		return str;
	    }
	    int idxStart = start;
	    int idxEnd = start + shieldNum;
	    if (idxEnd >= length) {
		idxEnd = length;
	    }
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < charArr.length; i++) {
		if (i >= idxStart && i < idxEnd) {
		    sb.append("*");
		} else {
		    sb.append(charArr[i]);
		}
	    }
	    return sb.toString();
	}
	return "";
    }
}

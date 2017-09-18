/**
 * @Title: DataVerifyUtil.java
 * @Package com.duowan.common.util
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 2, 2014 3:44:57 PM
 * @version V1.0
 */

package com.cw.platform.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

/**
 * @ClassName: DataVerifyUtil
 * @Description: 数据验证工具类
 * @author WuLiangzhi
 * @date Apr 2, 2014 3:44:57 PM
 * 
 */

public class DataVerifyUtil {
	
	/**
	 * log printer
	 */
	private static final Logger logger = Logger.getLogger(DataVerifyUtil.class);

	/**
	 * 验证是否是手机号码
	  * @Title: isMobileNO	手机号码
	  * @Description: 验证是否是手机号码
	  * @param mobiles
	  * @return
	 */
	public static boolean isMobileNO(String mobile) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobile);
		boolean ret = m.matches();
		logger.info(String.format("DataVerifyUtil->isMobileNO, mobile=%s, ret=%s", mobile, ret));
		return ret;
	}
}

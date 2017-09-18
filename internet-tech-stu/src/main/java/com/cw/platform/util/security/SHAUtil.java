/**
 * @Title: SHAUtil.java
 * @Package com.yy.rp.common.util.security
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date May 16, 2014 9:05:08 PM
 * @version V1.0
 */

package com.cw.platform.util.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: SHAUtil
 * @Description: TODO
 * @author WuLiangzhi
 * @date May 16, 2014 9:05:08 PM
 *
 */

public class SHAUtil {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(SHAUtil.class);
    
    private static final String SHA = "SHA";
    private static final String SHA1 = "SHA-1";
    
    /**
     * SHA加密
      * @Title: SHA
      * @Description: SHA加密
      * @param src	明文
      * @return
     */
    public static String SHA(String src) {
	try {
	    MessageDigest digest = java.security.MessageDigest.getInstance(SHA);
	    digest.update(src.getBytes());
	    byte messageDigest[] = digest.digest();
	    // Create Hex String
	    StringBuffer hexString = new StringBuffer();
	    // 字节数组转换为 十六进制 数
	    for (int i = 0; i < messageDigest.length; i++) {
		String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
		if (shaHex.length() < 2) {
		    hexString.append(0);
		}
		hexString.append(shaHex);
	    }
	    return hexString.toString();

	} catch (NoSuchAlgorithmException e) {
	    logger.error("SHA1 error, the reason is:");
	    logger.error(e.getMessage(), e);
	}
	return "";
    }
    
    
    /**
     * SHA1加密
      * @Title: SHA1
      * @Description: SHA1加密
      * @param src	明文
      * @return
     */
    public static String SHA1(String src) {
	try {
	    MessageDigest digest = java.security.MessageDigest.getInstance(SHA1);
	    digest.update(src.getBytes());
	    byte messageDigest[] = digest.digest();
	    // Create Hex String
	    StringBuffer hexString = new StringBuffer();
	    // 字节数组转换为 十六进制 数
	    for (int i = 0; i < messageDigest.length; i++) {
		String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
		if (shaHex.length() < 2) {
		    hexString.append(0);
		}
		hexString.append(shaHex);
	    }
	    return hexString.toString();

	} catch (NoSuchAlgorithmException e) {
	    logger.error("SHA1 error, the reason is:");
	    logger.error(e.getMessage(), e);
	}
	return "";
    }

   
}

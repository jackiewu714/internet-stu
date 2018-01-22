/**
 * @Title: MD5Util.java
 * @Package com.yy.rp.common.util.security
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date May 16, 2014 9:11:27 PM
 * @version V1.0
 */

package com.cw.platform.util.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: MD5Util
 * @Description: TODO
 * @author WuLiangzhi
 * @date May 16, 2014 9:11:27 PM
 *
 */

public class MD5Util {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(MD5Util.class);

    /**
     * MD5加密
     *
     * @Title: MD5
     * @Description: MD5加密
     * @param src    明文
     * @return
     */
    public static String MD5(String src) {
        try {
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(src.getBytes());
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < md.length; i++) {
                String shaHex = Integer.toHexString(md[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            logger.error("MD5 error, the reason is:");
            logger.error(e.getMessage(), e);
        }
        return "";
    }

}

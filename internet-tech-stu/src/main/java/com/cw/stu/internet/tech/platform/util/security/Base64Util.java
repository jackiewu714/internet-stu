/**
 * @Title: Base64Util.java
 * @Package com.yy.rp.common.util.security
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date May 16, 2014 9:03:50 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.util.security;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Base64Util
 * @Description: TODO
 * @author WuLiangzhi
 * @date May 16, 2014 9:03:50 PM
 *
 */

public class Base64Util {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(Base64Util.class);

    public static final Base64 base64 = new Base64();

    /**
     * BASE64编码
     * @Title: base64Encoder
     * @Description: BASE64编码
     * @param src    源字符串
     * @param encoding    编码方式
     * @return
     */
    public static String base64Encoder(String src, String encoding) {
        try {
            return base64.encodeToString(src.getBytes(encoding));
        } catch (UnsupportedEncodingException e) {
            logger.error("base64Encoder error, the reason is:");
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * BASE64编码
     * @Title: base64Encoder
     * @Description: BASE64编码
     * @param src    字节数组
     * @return
     */
    public static String base64Encoder(byte[] src) {
        return base64.encodeToString(src);
    }

    public static String base64Decoder(String dest, String encoding) {
        byte[] b = null;
        try {
            b = base64.decode(dest.getBytes());
        } catch (Exception e) {
            logger.error("base64Decoder error, the reason is:");
            logger.error(e.getMessage(), e);
        }

        String src = null;
        try {
            src = new String(b, encoding);
        } catch (UnsupportedEncodingException e) {
            logger.error("base64Decoder error(UnsupportedEncodingException), the reason is:");
            logger.error(e.getMessage(), e);
        }
        return src;
    }

    /**
     * BASE64解码
     * @Title: decryptBASE64
     * @Description: BASE64解码
     * @param dest
     * @return
     */
    public static byte[] base64Decoder(String dest) {
        return base64.decode(dest);
    }


}

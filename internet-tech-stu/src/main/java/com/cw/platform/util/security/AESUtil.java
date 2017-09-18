/**
 * @Title: AESUtil.java
 * @Package com.yy.rp.common.util.security
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date May 16, 2014 9:08:44 PM
 * @version V1.0
 */

package com.cw.platform.util.security;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: AESUtil
 * @Description: TODO
 * @author WuLiangzhi
 * @date May 16, 2014 9:08:44 PM
 *
 */

public class AESUtil {
    
    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(AESUtil.class);

    /**
     * AES加密
     * 
     * @param content
     *            需要加密的内容
     * @param password
     *            加密密码
     * @return
     */
    public static byte[] encryptAES(String content, String password) {
	try {
	    KeyGenerator kgen = KeyGenerator.getInstance("AES");
	    kgen.init(128, new SecureRandom(password.getBytes()));
	    SecretKey secretKey = kgen.generateKey();
	    byte[] enCodeFormat = secretKey.getEncoded();
	    SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
	    Cipher cipher = Cipher.getInstance("AES");// 创建密码器
	    byte[] byteContent = content.getBytes("utf-8");
	    cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
	    byte[] result = cipher.doFinal(byteContent);
	    return result; // 加密
	} catch (NoSuchAlgorithmException e) {
	    logger.error("encryptAES error, NoSuchAlgorithmException:");
	    logger.error(e.getMessage(), e);
	} catch (NoSuchPaddingException e) {
	    logger.error("encryptAES error, NoSuchPaddingException:");
	    logger.error(e.getMessage(), e);
	} catch (InvalidKeyException e) {
	    logger.error("encryptAES error, InvalidKeyException:");
	    logger.error(e.getMessage(), e);
	} catch (UnsupportedEncodingException e) {
	    logger.error("encryptAES error, UnsupportedEncodingException:");
	    logger.error(e.getMessage(), e);
	} catch (IllegalBlockSizeException e) {
	    logger.error("encryptAES error, IllegalBlockSizeException:");
	    logger.error(e.getMessage(), e);
	} catch (BadPaddingException e) {
	    logger.error("encryptAES error, BadPaddingException:");
	    logger.error(e.getMessage(), e);
	}
	return null;
    }

    /**
     * AES解密
     * 
     * @param content
     *            待解密内容
     * @param password
     *            解密密钥
     * @return
     */
    public static byte[] decryptAES(byte[] content, String password) {
	try {
	    KeyGenerator kgen = KeyGenerator.getInstance("AES");
	    kgen.init(128, new SecureRandom(password.getBytes()));
	    SecretKey secretKey = kgen.generateKey();
	    byte[] enCodeFormat = secretKey.getEncoded();
	    SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
	    Cipher cipher = Cipher.getInstance("AES");// 创建密码器
	    cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
	    byte[] result = cipher.doFinal(content);
	    return result; // 加密
	} catch (NoSuchAlgorithmException e) {
	    logger.error("encryptAES error, NoSuchAlgorithmException:");
	    logger.error(e.getMessage(), e);
	} catch (NoSuchPaddingException e) {
	    logger.error("encryptAES error, NoSuchPaddingException:");
	    logger.error(e.getMessage(), e);
	} catch (InvalidKeyException e) {
	    logger.error("encryptAES error, InvalidKeyException:");
	    logger.error(e.getMessage(), e);
	} catch (IllegalBlockSizeException e) {
	    logger.error("encryptAES error, IllegalBlockSizeException:");
	    logger.error(e.getMessage(), e);
	} catch (BadPaddingException e) {
	    logger.error("encryptAES error, BadPaddingException:");
	    logger.error(e.getMessage(), e);
	}
	return null;
    }
    
}

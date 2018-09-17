package com.cw.stu.internet.tech.common.util.spring.property.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class EnCrypter {
    public static Key getKey(byte[] bytesKey) {
	byte[] kb = new byte[8];
	for (int i = 0; i < bytesKey.length; i++) {
	    kb[(i % 8)] = (byte) (kb[(i % 8)] + bytesKey[i]);
	}
	Key key = new SecretKeySpec(kb, "DES");
	return key;
    }

    public static String getEncodeString(String strMing, byte[] bytesKey) {
	byte[] byteMi = (byte[]) null;
	byte[] byteMing = (byte[]) null;
	String strMi = "";
	try {
	    Key key = getKey(bytesKey);
	    byteMing = strMing.getBytes("UTF8");
	    byteMi = getEncCode(byteMing, key);
	    strMi = new String(Base64.encodeBase64(byteMi));
	} catch (Exception e) {
	    e.printStackTrace();
	}

	return strMi;
    }

    private static byte[] getEncCode(byte[] byteS, Key key) {
	byte[] byteFina = (byte[]) null;
	try {
	    Cipher cipher = Cipher.getInstance("DES");
	    cipher.init(1, key);
	    byteFina = cipher.doFinal(byteS);
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return byteFina;
    }

    private static byte[] getDesCode(byte[] byteD, Key key) {
	byte[] byteFina = (byte[]) null;
	try {
	    Cipher cipher = Cipher.getInstance("DES");
	    cipher.init(2, key);
	    byteFina = cipher.doFinal(byteD);
	} catch (Exception e) {
	    e.printStackTrace();
	    System.out.println("发生解密异常时，原加密字符串为:" + new String(Base64.encodeBase64(byteD)));
	}
	return byteFina;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
	byte[] mainKey = { -46, -38, -47, -72, 53, 48, 53, -71, -85, -71, -78, -80, -4, 53, 48, 53, -57, -21, -50, -16,
		-73, -76, -79, -32, -46, -21 };

	String min = "0085731C540BB6D63C922BE81C00793B";
	String strEnc = getEncodeString(min, mainKey);
	System.out.println("{RSA}" + strEnc);
    }
}

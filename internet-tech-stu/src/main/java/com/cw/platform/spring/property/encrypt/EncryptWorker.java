package com.cw.platform.spring.property.encrypt;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Steven
 */
public final class EncryptWorker {

    private static final Log log = LogFactory.getLog(EncryptWorker.class);
    public static byte[] key = {-46, -38, -47, -72, 53, 48, 53, -71, -85, -71, -78, -80, -4, 53, 48, 53, -57, -21,
            -50, -16, -73, -76, -79, -32, -46, -21};

    public static final Key mainKey = initKey(key);

    public static String getDecodeString(String strMi) {
        return getDecodeString(strMi, mainKey);
    }

    public static String getDecodeString(String strMi, byte[] bytesKey) {
        return getDecodeString(strMi, getKey(bytesKey));
    }

    protected static String getDecodeString(String strMi, Key key) {

        String strMing = null;
        try {
            byte[] byteMi = Base64.decodeBase64(strMi.getBytes());
            byte[] byteMing = getDesCode(byteMi, key);
            strMing = new String(byteMing, "UTF8");
        } catch (Exception e) {
            log.error("error when decoding. please check your property configuration.", e);
        }

        return strMing;
    }

    protected static String deCodeProperty(String encyptedProperty) {
        if (encyptedProperty == null) {
            log.error("The argument[encyptedProperty] is null. please check your code call method deCodeProperty().");
            return null;
        }

        String property;
        try {
            property = EncryptWorker.getDecodeString(encyptedProperty.substring(5));
        } catch (Exception e) {
            log.error("error when decrypted property. please check your code call method deCodeProperty().");
            return null;
        }

        return property;
    }

    private static byte[] getDesCode(byte[] byteD, Key key) {
        Cipher cipher;
        byte[] byteFina = null;
        try {
            cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byteFina = cipher.doFinal(byteD);
        } catch (Exception e) {
            log.error("error[002] when decoding. please check your property configuration.", e);
        } finally {
            cipher = null;
        }
        return byteFina;

    }

    private static Key getKey(byte[] bytesKey) {
        byte[] kb = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < bytesKey.length; i++) {
            kb[i % 8] = (byte) (kb[i % 8] + bytesKey[i]);
        }
        Key key = new SecretKeySpec(kb, "DES");
        return key;
    }

    private static Key initKey(byte[] keyBytes) {

        Key key = null;
        try {
            key = EncryptWorker.getKey(keyBytes);
        } catch (Exception e) {
            log.error("Attention!! The main key is not properly initialized.", e);
            return null;
        }

        return key;
    }

    private EncryptWorker() {
        throw new RuntimeException("This class is not allowed to be instantialize.");
    }

    public static void main(String[] args) {
        String strEncode = "qrV3eavdOfthigrotfuEiPBARqliJu9s1ZGmPibmj04=";
        System.out.println("string to be decoded: " + strEncode);
        System.out.println("string decoded: " + EncryptWorker.getDecodeString(strEncode));
    }
}

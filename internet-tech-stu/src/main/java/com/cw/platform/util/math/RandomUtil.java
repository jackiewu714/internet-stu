/**
 * @Title: RandomUtil.java
 * @Package com.duowan.coreuser.common
 * @Description: 随机数工具类
 * Copyright: Copyright (c) 2011
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Dec 16, 2013 2:37:35 PM
 * @version V1.0
 */

package com.cw.platform.util.math;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 * @author WuLiangzhi
 * @ClassName: RandomUtil
 * @Description: 随机数工具类
 * @date Dec 16, 2013 2:37:36 PM
 */

public class RandomUtil {

    public static final String ALL_CHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LETTER_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBER_CHAR = "0123456789";

    /**
     * 生成指定位数的随机字符串(只包含大小写字母、数字)
     *
     * @param length 长度
     * @return
     * @Title: generateRandomString
     * @Description: 生成指定位数的随机字符串(只包含大小写字母 、 数字)
     */
    public static String generateRandomString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(ALL_CHAR.charAt(random.nextInt(ALL_CHAR.length())));
        }
        return sb.toString();
    }

    /**
     * 生成指定位数的随机字符串(只包含大小写字母)
     *
     * @param length 长度
     * @return
     * @Title: generateRandomMixString
     * @Description: 生成指定位数的随机字符串(只包含大小写字母)
     */
    public static String generateRandomMixString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(LETTER_CHAR.charAt(random.nextInt(LETTER_CHAR.length())));
        }
        return sb.toString();
    }

    /**
     * 生成指定位数的随机字符串(只包含数字)
     *
     * @param length 长度
     * @return
     * @Title: generateRandomNumberString
     * @Description: 生成指定位数的随机字符串(只包含数字)
     */
    public static String generateRandomNumberString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(NUMBER_CHAR.charAt(random.nextInt(NUMBER_CHAR.length())));
        }
        return sb.toString();
    }

    /**
     * 生成指定位数的随机字符串(只包含数字)
     *
     * @param length 长度
     * @return
     * @Title: generateRandomNumberString
     * @Description: 生成指定位数的随机字符串(只包含数字)
     */
    public static int getCurrentMilliseconds() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MILLISECOND);
    }

    /**
     * 获得当前时间字符串，格式yyMMddHHmmssSSS，例如:131217102334987
     *
     * @return 当前时间字符串，格式yyMMddHHmmssSSS，例如:131217102334987
     * @Title: getCurrentDateString
     * @Description: 获得当前时间字符串，格式yyMMddHHmmssSSS，例如:131217102334987
     */
    public static String getCurrentDateString() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSS");
        return sdf.format(calendar.getTime());
    }

    public static void main(String[] args) {
        /*
         * System.out.println(generateRandomNumberString(5));
         * System.out.println(generateRandomNumberString(5));
         * System.out.println(generateRandomNumberString(5));
         *
         * Random random = new Random(); System.out.println(random.nextInt(26));
         * System.out.println(random.nextInt(26));
         * System.out.println(random.nextInt(26));
         */
        System.out.println("begin:" + System.currentTimeMillis());
        for (int i = 0; i < 20; i++) {
            // System.out.println(getCurrentDateString());
            // System.out.println(System.currentTimeMillis());
            System.out.println(generateRandomString(3));
        }
        System.out.println("end:" + System.currentTimeMillis());
    }

}

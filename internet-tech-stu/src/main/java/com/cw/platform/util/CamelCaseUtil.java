package com.cw.platform.util;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 转化成驼峰式命名法.
 */
public class CamelCaseUtil {

    private static final String UNDERLINE_SEPARATOR = "_";

    /**
     * 转化成驼峰式命名法, 原字符串的分隔默认为: 下划线"_"
     *
     * @param key 原字符串
     * @return 驼峰式命名后的字符串
     */
    public static String transform(String key) {
        return transform(key, CamelCaseUtil.UNDERLINE_SEPARATOR);
    }

    /**
     * 转化成驼峰式命名法.
     *
     * @param key       原字符串
     * @param separator 分隔字符串
     * @return 驼峰式命名后的字符串
     */
    public static String transform(String key, String separator) {
        if (StringUtils.isBlank(key)) {
            return key;
        }
        if (!key.contains(separator)) {
            return key;
        }
        key = key.toLowerCase();
        String[] keys = key.split(separator);
        if (ArrayUtils.isEmpty(keys)) {
            return key;
        }
        if (keys.length == 1) {
            return key;
        }
        StringBuffer keyBuf = new StringBuffer(key.length());
        keyBuf.append(keys[0]);
        for (int i = 1, len = keys.length; i < len; i++) {
            keyBuf.append(StringUtils.capitalize(keys[i]));
        }
        return keyBuf.toString();
    }

    /**
     * 转化成驼峰式命名法.
     *
     * @param key       原字符串
     * @param separator 分隔字符
     * @return 驼峰式命名后的字符串
     */
    public static String transform(String key, char separator) {
        return transform(key, String.valueOf((separator)));
    }
}

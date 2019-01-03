package com.codegen.platform.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 字符的编码工具类.
 */
public class Encoder {

    /**
     * 进行字符串的URL编码.
     *
     * @param str      要进行编码的字符串
     * @param encoding 编码
     * @return 转换后的字符串, 若转化异常则返回原字符串
     */
    public static String encode(String str, String encoding) {
        if (StringUtils.isBlank(str)) {
            return "";
        }
        try {
            // 解决空格变+显示的问题
            return URLEncoder.encode(str, encoding).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /**
     * 进行字符串的URL编码，使用UTF-8编码.
     *
     * @param strs 要进行编码的字符串数组
     * @return 编码后的数组
     */
    public static String[] encode(String[] strs) {
        if (ArrayUtils.isEmpty(strs)) {
            return strs;
        }
        for (int i = 0, len = strs.length; i < len; i++) {
            strs[i] = String.valueOf(encode(strs[i]));
        }
        return strs;
    }

    public static List<Object> encode(List<Object> objs) {
        for (Object obj : objs) {
            encode(obj);
        }
        return objs;
    }

    /**
     * 进行字符串的URL编码，使用UTF-8编码.
     *
     * @param obj 要对其中的字符型属性进行编码的对象
     * @return 编码后的对象
     */
    @SuppressWarnings("rawtypes")
    public static Object encode(Object obj) {
        if (null == obj) {
            return new Object();
        }
        String pname = obj.getClass().getPackage().getName();
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Set set = map.keySet();
            for (Object key : set) {
                Object val = map.get(key);
                map.put(key, encode(val));
            }
            return obj;
        } else if (pname.startsWith("java") || obj.getClass().isPrimitive()) {
            if (obj instanceof String) {
                return encode(String.valueOf(obj), "utf-8");
            }
            return obj;
        } else {
            Field[] fields = obj.getClass().getDeclaredFields();
            if (ArrayUtils.isEmpty(fields)) {
                fields = obj.getClass().getSuperclass().getDeclaredFields();
            }
            if (ArrayUtils.isEmpty(fields)) {
                return obj;
            }
            for (Field field : fields) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                try {
                    Object value = field.get(obj);
                    if (value != null) {
                        field.set(obj, encode(value));
                    }
                } catch (Exception e) {
                    // e.printStackTrace();
                }
            }
            return obj;
        }

    }

    /**
     * encode map 一级，且只encode String
     *
     * @param map
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map encodeMap(Map map) {
        if (MapUtil.isEmpty(map)) {
            return map;
        }
        Set keys = map.keySet();
        if (CollectionUtils.isEmpty(keys)) {
            return map;
        }
        for (Object key : keys) {
            Object value = map.get(key);
            if (isNotStringClass(value)) {
                continue;
            }
            map.put(key, encode(value.toString()));
        }
        return map;
    }

    private static boolean isNotStringClass(Object value) {
        return null == value || value.getClass() != String.class;
    }

    public static List<Object> escape(List<Object> objs) {
        for (Object obj : objs) {
            escape(obj);
        }
        return objs;
    }

    /**
     * 进行字符串的URL编码，使用UTF-8编码.
     *
     * @param obj 要对其中的字符型属性进行编码的对象
     * @return 编码后的对象
     */
    public static Object escape(Object obj) {
        if (null == obj) {
            return obj;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Set set = map.keySet();
            for (Object key : set) {
                Object val = map.get(key);
                if (val instanceof String) {
                    map.put(key, escape(val));
                }
            }
            return obj;
        } else if (obj instanceof String) {
            return escape((String) obj);
        } else {
            Field[] fields = obj.getClass().getDeclaredFields();
            if (ArrayUtils.isEmpty(fields)) {
                return obj;
            }
            for (Field field : fields) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                try {
                    Object value = field.get(obj);
                    field.set(obj, escape(value));
                } catch (IllegalArgumentException e) {
                    // e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // e.printStackTrace();
                }
            }
        }

        return obj;
    }

    public static String escape(String src) {
        int i;
        char j;
        StringBuffer tmp = new StringBuffer();
        tmp.ensureCapacity(src.length() * 6);

        for (i = 0; i < src.length(); i++) {

            j = src.charAt(i);

            if (Character.isDigit(j) || Character.isLowerCase(j) || Character.isUpperCase(j)) {
                tmp.append(j);
            } else if (j < 256) {
                tmp.append("%");
                if (j < 16) {
                    tmp.append("0");
                }
                tmp.append(Integer.toString(j, 16));
            } else {
                tmp.append("%u");
                tmp.append(Integer.toString(j, 16));
            }
        }
        return tmp.toString();
    }

}

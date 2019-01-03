package com.codegen.platform.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 字符的解码工具类.
 * 
 * @author huang weijian
 */
public class Decoder {

	/**
	 * 进行字符串的URL编码转换.
	 * 
	 * @param str
	 *            要进行编码转换的字符串
	 * @param encoding
	 *            转换的编码
	 * @return 转换后的字符串, 若转化异常则返回原字符串
	 */
	public static String decode(String str, String encoding) {
		if (StringUtils.isBlank(str)) {
			return "";
		}
		try {
			return URLDecoder.decode(str, encoding).trim();
		} catch (UnsupportedEncodingException e) {
			return str;
		}
	}

	/**
	 * 进行字符串的URL编码转换，使用UTF-8编码.
	 * 
	 * @param strs
	 *            要进行编码转换的字符串数组
	 * @return 转换后的对象
	 */
	public static String[] decode(String[] strs) {
		if (ArrayUtils.isEmpty(strs)) {
			return strs;
		}
		for (int i = 0, len = strs.length; i < len; i++) {
			strs[i] = (String) decode(strs[i]);
		}
		return strs;
	}

	/**
	 * 进行字符串的URL编码转换，使用UTF-8编码.
	 * 
	 * @param collection
	 *            要进行编码转换的字符串集合
	 * @return 转换后的对象
	 */
	public static List<String> decode(List<String> list) {
		if (CollectionUtils.isEmpty(list)) {
			return list;
		}
		for (int i = 0, len = list.size(); i < len; i++) {
			list.set(i, (String) decode(list.get(i)));
		}
		return list;
	}

	/**
	 * 进行字符串的URL编码转换，使用UTF-8编码.
	 * 
	 * @param obj
	 *            要对其中的字符型属性进行编码转换的对象
	 * @return 转换后的对象
	 */
	public static Object decode(Object obj) {
		if (null == obj) {
			return new Object();
		}
		String pname = obj.getClass().getPackage().getName();
		if (obj instanceof Map) {
			Map map = (Map) obj;
			Set set = map.keySet();
			for (Object key : set) {
				Object val = map.get(key);
				map.put(key, decode(val));
			}
			return obj;
		} else if (pname.startsWith("java") || obj.getClass().isPrimitive()) {
			if (obj instanceof String) {
				return decode(String.valueOf(obj), "utf-8");
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
					if (value != null)
						field.set(obj, decode(value));
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}
			return obj;
		}
	}

	public static List<Object> unescape(List<Object> objs) {
		for (Object obj : objs) {
			unescape(obj);
		}
		return objs;
	}

	public static Object unescape(Object obj) {
		if (null == obj) {
			return obj;
		}
		if (obj instanceof Map) {
			Map map = (Map) obj;
			Set set = map.keySet();
			for (Object key : set) {
				Object val = map.get(key);
				if (val instanceof String) {
					map.put(key, unescape(val));
				}
			}
			return obj;
		} else if (obj instanceof String) {
			return unescape((String) obj);
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
					field.set(obj, unescape(value));
				} catch (IllegalArgumentException e) {
					// e.printStackTrace();
				} catch (IllegalAccessException e) {
					// e.printStackTrace();
				}
			}
		}

		return obj;
	}

	public static String unescape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length());
		int lastPos = 0, pos = 0;
		char ch;
		while (lastPos < src.length()) {
			pos = src.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (src.charAt(pos + 1) == 'u') {
					ch = (char) Integer.parseInt(src.substring(pos + 2, pos + 6), 16);
					tmp.append(ch);
					lastPos = pos + 6;
				} else {
					ch = (char) Integer.parseInt(src.substring(pos + 1, pos + 3), 16);
					tmp.append(ch);
					lastPos = pos + 3;
				}
			} else {
				if (pos == -1) {
					tmp.append(src.substring(lastPos));
					lastPos = src.length();
				} else {
					tmp.append(src.substring(lastPos, pos));
					lastPos = pos;
				}
			}
		}
		return tmp.toString();
	}
}

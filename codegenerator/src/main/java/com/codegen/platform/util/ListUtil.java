/**
 * 
 */
package com.codegen.platform.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 列表工具类
 * 
 * @author WuLiangzhi
 * 
 */
public class ListUtil {

	/**
	 * 默认分隔符
	 */
	public static final String DEFAULT_SEPARATOR = ",";

	/**
	 * 默认包含符
	 */
	public static final String DEFAULT_INCLUDE_CHARACTER = "'";

	/**
	 * 判断列表是否为空
	 * 
	 * @Title: isNullOrEmpty
	 * @Description: 判断列表是否为空
	 * @param list
	 * @return true-空 false-非空
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isNullOrEmpty(List list) {
		if (list == null || list.isEmpty()) {
			return true;
		}

		return false;
	}

	/**
	 * 将字符串解析成列表
	 * 
	 * @param str
	 *            IM号字符串，以","分割
	 * @return List<String>
	 */
	public static List<String> parseStringToList(String str) {
		return ListUtil.parseStringToList(str, DEFAULT_SEPARATOR);
	}

	/**
	 * 将字符串解析成列表
	 * 
	 * @param str
	 *            IM号字符串，以separator分割
	 * @param separator
	 *            分隔符
	 * @return List<String>
	 */
	public static List<String> parseStringToList(String str, String separator) {
		List<String> list = new ArrayList<String>();
		if (!StringUtil.isEmpty(str)) {
			String[] strArr = str.split(separator);
			if (strArr != null && strArr.length > 0) {
				for (int i = 0; i < strArr.length; i++) {
					if (!StringUtil.isEmpty(strArr[i])) {
						list.add(strArr[i]);
					}
				}
			}
		}
		return list;
	}

	/**
	 * 将字符串解析成列表
	 * 
	 * @param list
	 *            List<String> 对象列表
	 * @return String
	 */
	public static String parseListToString(List<String> list) {
		return ListUtil.parseListToString(list, DEFAULT_SEPARATOR);
	}

	/**
	 * 将字符串解析成列表
	 * 
	 * @param list
	 *            List<String> 对象列表
	 * @param separator
	 *            分隔符
	 * @return String
	 */
	public static String parseListToString(List<String> list, String separator) {
		StringBuffer sb = new StringBuffer();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				String str = list.get(i) == null ? "" : list.get(i).toString();
				if (!StringUtil.isEmpty(str)) {
					if (i == list.size() - 1) {
						sb.append(str);
					} else {
						sb.append(str).append(separator);
					}
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 将列表解析成字符串, 例如 123,456,789 -> '123','456','789'
	 * 
	 * @param list
	 *            List<String> 对象列表
	 * @return List<String> 字符串列表，例如: '123','456','789'
	 */
	public static String parseListToStringIncludeByCharacter(List<String> list) {
		return ListUtil.parseListToStringIncludeByCharacter(list, DEFAULT_SEPARATOR);
	}

	/**
	 * 将列表解析成字符串, 例如 123,456,789 -> '123','456','789'
	 * 
	 * @param list
	 *            List<Object> 对象列表
	 * @param separator
	 *            分隔符
	 * @return List<String> 字符串列表，例如: '123','456','789'
	 */
	public static String parseListToStringIncludeByCharacter(List<String> list, String separator) {
		return ListUtil.parseListToStringIncludeByCharacter(list, separator, DEFAULT_INCLUDE_CHARACTER);
	}

	/**
	 * 将列表解析成字符串, 例如 123,456,789 -> '123','456','789'
	 * 
	 * @param list
	 *            List<String> 对象列表
	 * @param separator
	 *            分隔符
	 * @param includeCharacter
	 *            包含每个字符串的字符，例如单引号"'"，包含 123 后变成 '123'
	 * @return List<String> 字符串列表，例如: '123','456','789'
	 */
	public static String parseListToStringIncludeByCharacter(List<String> list, String separator,
			String includeCharacter) {
		StringBuffer sb = new StringBuffer();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				String str = list.get(i) == null ? "" : list.get(i).toString();
				if (!StringUtil.isEmpty(str)) {
					if (i == list.size() - 1) {
						sb.append(includeCharacter).append(str).append(includeCharacter);
					} else {
						sb.append(includeCharacter).append(str).append(includeCharacter).append(separator);
					}
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 字符串数字转换成整形数组
	 * 
	 * @param list
	 * @return
	 */
	public static List<Long> toLongList(Collection<String> list) {
		List<Long> result = new ArrayList<Long>();
		for (String uid : list) {
			result.add(Long.valueOf(uid));
		}
		return result;
	}

	/**
	 * 字符串数字转换成整形数组
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> toStringList(Collection<Long> list) {
		List<String> result = new ArrayList<String>();
		for (Long uid : list) {
			result.add(String.valueOf(uid));
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abd");
		list.add("123");
		list.add("gds");
		list.add("965");
		System.out.println(ListUtil.parseListToString(list));
		System.out.println(ListUtil.parseListToStringIncludeByCharacter(list));
	}

}

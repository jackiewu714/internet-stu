package com.codegen.platform.util;

/**
 * 数组工具类
 * 
 */
public class ArrayUtils {

    /**
     * 泛型判断一个对象数组是否为null或长度为0
     * 
     * @param <T>
     *            泛型
     * @param array
     *            要检测的对象数组
     * @return 若对象数组为null或长度为0，则返回true；否则返回false
     */
    public static <T> boolean isEmpty(T[] array) {
	return array == null || array.length == 0;
    }

    /**
     * 泛型判断一个对象数组是否不为null且长度不为0
     * 
     * @param <T>
     *            泛型
     * @param array
     *            要检测的对象数组
     * @return 若对象数组不为null且长度不为0，则返回true；否则返回false
     */
    public static <T> boolean isNotEmpty(T[] array) {
	return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断一个int数组是否为null或长度为0
     * 
     * @param array
     *            要检测的int数组
     * @return 若int数组为null或长度为0，则返回true；否则返回false
     */
    public static boolean isEmpty(int[] array) {
	return array == null || array.length == 0;
    }

    /**
     * 判断一个int数组是否不为null且长度不为0
     * 
     * @param array
     *            要检测的int数组
     * @return 若int数组不为null且长度不为0，则返回true；否则返回false
     */
    public static boolean isNotEmpty(int[] array) {
	return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断一个long数组是否为null或长度为0
     * 
     * @param array
     *            要检测的long数组
     * @return 若long数组为null或长度为0，则返回true；否则返回false
     */
    public static boolean isEmpty(long[] array) {
	return array == null || array.length == 0;
    }

    /**
     * 判断一个long数组是否不为null且长度不为0
     * 
     * @param array
     *            要检测的long数组
     * @return 若long数组不为null且长度不为0，则返回true；否则返回false
     */
    public static boolean isNotEmpty(long[] array) {
	return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断一个double数组是否为null或长度为0
     * 
     * @param array
     *            要检测的double数组
     * @return 若double数组为null或长度为0，则返回true；否则返回false
     */
    public static boolean isEmpty(double[] array) {
	return array == null || array.length == 0;
    }

    /**
     * 判断一个double数组是否不为null且长度不为0
     * 
     * @param array
     *            要检测的double数组
     * @return 若double数组不为null且长度不为0，则返回true；否则返回false
     */
    public static boolean isNotEmpty(double[] array) {
	return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断一个char数组是否为null或长度为0
     * 
     * @param array
     *            要检测的char数组
     * @return 若char数组为null或长度为0，则返回true；否则返回false
     */
    public static boolean isEmpty(char[] array) {
	return array == null || array.length == 0;
    }

    /**
     * 判断一个char数组是否不为null且长度不为0
     * 
     * @param array
     *            要检测的char数组
     * @return 若char数组不为null且长度不为0，则返回true；否则返回false
     */
    public static boolean isNotEmpty(char[] array) {
	return !ArrayUtils.isEmpty(array);
    }
}

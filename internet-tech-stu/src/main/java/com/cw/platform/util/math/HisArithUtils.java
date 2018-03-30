package com.cw.platform.util.math;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 在Java中纯Double的计算会存在精度不准确的问题<br/>
 * 参考：http://zhaow-381002134.iteye.com/blog/420369<br/>
 * http://blog.csdn.net/yinan9/article/details/17283081
 */
public final class HisArithUtils {
    /**
     * Default Constructor
     */
    private HisArithUtils() {
    }

    /**
     * double 除法
     *
     * @param d1    double
     * @param d2    double
     * @param scale 四舍五入 小数点位数
     * @return double
     * @throws IllegalArgumentException 分母为0
     */
    public static double div(final double d1, final double d2, final int scale) {
        // 当然在此之前，你要判断分母是否为0，
        // 为0你可以根据实际需求做相应的处理
        if (d2 == 0) {
            throw new IllegalArgumentException("Division by zero, args=" + d1 + "," + d2 + "," + scale + ".");
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.divide(bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * double 乘法
     *
     * @param d1 double
     * @param d2 double
     * @return double
     */
    public static double mul(final double d1, final double d2) {
        final BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.multiply(bd2).doubleValue();
    }

    /**
     * 对double数据进行取精度.
     *
     * @param value        double数据.
     * @param scale        精度位数(保留的小数位数).
     * @param roundingMode 精度取值方式.
     * @return 精度计算后的数据.
     */
    public static double round(final double value, final int scale, final RoundingMode roundingMode) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, roundingMode);
        final double d = bd.doubleValue();
        bd = null;
        return d;
    }

    /**
     * double 相减
     *
     * @param d1 double
     * @param d2 double
     * @return double
     */
    public static double sub(final double d1, final double d2) {
        final BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.subtract(bd2).doubleValue();
    }

    /**
     * double 相加
     *
     * @param d1 double
     * @param d2 double
     * @return double
     */
    public static double sum(Double d1, Double d2) {
        if (d1 == null) {
            d1 = 0d;
        }
        if (d2 == null) {
            d2 = 0d;
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.add(bd2).doubleValue();
    }

    /**
     * 保留2位小数
     *
     * @return Double
     */
    public static Double accuracy(final Double douBle) {
        Double db = 0.0D;
        if (douBle != null) {
            db = douBle;
        }
        final BigDecimal bigDecimal = new BigDecimal(db);
        final Double d = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        return d;
    }

    /**
     * 保留2位小数
     *
     * @return Double
     */
    public static Double accuracy(final Double douBle, int newScale) {
        Double db = 0.0D;
        if (douBle != null) {
            db = douBle;
        }
        final BigDecimal bigDecimal = new BigDecimal(db);
        final Double d = bigDecimal.setScale(newScale, BigDecimal.ROUND_HALF_UP).doubleValue();
        return d;
    }

    /**
     * 比较两个BigDecimal对象的数值
     *
     * @param bd1 BigDecimal
     * @param bd2 BigDecimal
     * @return true-相等  false-不相等
     */
    public static boolean compareBigDecimal(BigDecimal bd1, BigDecimal bd2) {
        if (bd1 == null || bd2 == null) {
            return false;
        }
        int cr = bd1.compareTo(bd2);
        return cr == 0;
    }

    /**
     * 比较两个字符串对象的数值是否相等
     *
     * @param str1 String
     * @param str2 String
     * @return true-相等  false-不相等
     */
    public static boolean compareStringDecimalValue(String str1, String str2) {
        return compareBigDecimal(convertToBigDecimal(str1), convertToBigDecimal(str2));
    }

    /**
     * 比较BigDecimal和字符串对象的数值是否相等
     *
     * @param str1 String
     * @param bd1  BigDecimal
     * @return true-相等  false-不相等
     */
    public static boolean compareStringBigDecimal(String str1, BigDecimal bd1) {
        return compareBigDecimal(convertToBigDecimal(str1), bd1);
    }

    /**
     * 字符串转换为BigDecimal
     *
     * @param str String
     * @return BigDecimal
     */
    public static BigDecimal convertToBigDecimal(String str) {
        if (HisStringUtils.isNotEmpty(str) && HisStringUtils.isDecimalDigits(str)) {
            return new BigDecimal(str);
        }
        return null;
    }

    /**
     * double转换为BigDecimal
     *
     * @param dou Double
     * @return BigDecimal
     */
    public static BigDecimal convertToBigDecimal(Double dou) {
        if (dou != null) {
            return new BigDecimal(dou);
        }
        return null;
    }

    /**
     * BigDecimal转换为字符串，保留两位小数
     *
     * @param bd BigDecimal
     * @return String
     */
    public static String retainTwoDecimal(BigDecimal bd) {
        if (bd == null) {
            return "0.00";
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(bd);
    }

    /**
     * 判断是否小于0
     *
     * @param bigDecimal BigDecimal
     * @return true-是  false-否
     */
    public static boolean lessThanZero(BigDecimal bigDecimal) {
        int cRet = bigDecimal.compareTo(new BigDecimal("0"));
        return cRet == -1;
    }

    /**
     * 判断是否等于0
     *
     * @param bigDecimal BigDecimal
     * @return true-是  false-否
     */
    public static boolean equalToZero(BigDecimal bigDecimal) {
        int cRet = bigDecimal.compareTo(new BigDecimal("0"));
        return cRet == 0;
    }

    /**
     * 判断是否大于0
     *
     * @param bigDecimal BigDecimal
     * @return true-是  false-否
     */
    public static boolean greaterThanZero(BigDecimal bigDecimal) {
        int cRet = bigDecimal.compareTo(new BigDecimal("0"));
        return cRet == 1;
    }

    /**
     * 判断是否小于等于0
     *
     * @param bigDecimal BigDecimal
     * @return true-是  false-否
     */
    public static boolean lessEqualThanZero(BigDecimal bigDecimal) {
        return lessThanZero(bigDecimal) || equalToZero(bigDecimal);
    }

    /**
     * 判断是否大于等于0
     *
     * @param bigDecimal BigDecimal
     * @return true-是  false-否
     */
    public static boolean greaterEqualThanZero(BigDecimal bigDecimal) {
        return greaterThanZero(bigDecimal) || equalToZero(bigDecimal);
    }

    /**
     * 判断srcBd是否小于destBd
     *
     * @param srcBd BigDecimal
     * @param destBd BigDecimal
     * @return true-是  false-否
     */
    public static boolean compareBigDecimalLessThan(BigDecimal srcBd, BigDecimal destBd) {
        int cRet = srcBd.compareTo(destBd);
        return cRet == -1;
    }

    /**
     * 判断srcBd是否等于destBd
     *
     * @param srcBd BigDecimal
     * @param destBd BigDecimal
     * @return true-是  false-否
     */
    public static boolean compareBigDecimalEqualTo(BigDecimal srcBd, BigDecimal destBd) {
        int cRet = srcBd.compareTo(destBd);
        return cRet == 0;
    }

    /**
     * 判断srcBd是否大于destBd
     *
     * @param srcBd BigDecimal
     * @param destBd BigDecimal
     * @return true-是  false-否
     */
    public static boolean compareBigDecimalGreaterThan(BigDecimal srcBd, BigDecimal destBd) {
        int cRet = srcBd.compareTo(destBd);
        return cRet == 1;
    }

    /**
     * 判断srcBd是否小于等于destBd
     *
     * @param srcBd BigDecimal
     * @param destBd BigDecimal
     * @return true-是  false-否
     */
    public static boolean compareBigDecimalLessEqualThan(BigDecimal srcBd, BigDecimal destBd) {
        return compareBigDecimalLessThan(srcBd, destBd) || compareBigDecimalEqualTo(srcBd, destBd);
    }

    /**
     * 判断srcBd是否大于等于destBd
     *
     * @param srcBd BigDecimal
     * @param destBd BigDecimal
     * @return true-是  false-否
     */
    public static boolean compareBigDecimalGreaterEqualThan(BigDecimal srcBd, BigDecimal destBd) {
        return compareBigDecimalGreaterThan(srcBd, destBd) || compareBigDecimalEqualTo(srcBd, destBd);
    }

    public static void main(String[] args) {
        String str = "000000.0000001";
        Double dou1 = new Double(str);
        BigDecimal money = new BigDecimal(dou1);
        BigDecimal minBd = new BigDecimal("0.00");
        BigDecimal maxBd = new BigDecimal("10000000.00");
        boolean ret1 = compareBigDecimalLessEqualThan(money, minBd);
        boolean ret2 = compareBigDecimalGreaterEqualThan(money, maxBd);
        System.out.println("ret1=" + ret1 + ", ret2=" + ret2);
    }

}

/**
 * @Title: MathUtil.java
 * @Package com.yy.zbase.platform.util
 * @Description: 数学运算工具类
 * Copyright: Copyright (c) 2014
 * Company:YY
 * @author WuLiangzhi
 * @date Mar 24, 2014 11:58:07 AM
 * @version V1.0
 */

package com.cw.platform.util.math;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: MathUtil
 * @Description: 数学运算工具类
 * @author WuLiangzhi
 * @date Mar 24, 2014 11:58:07 AM
 *
 */

public class MathUtil {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(MathUtil.class);

    /**
     * 两个数相除，然后返回百分比
     * @Title: divideReturnPercentage
     * @Description: 两个数相除，然后返回百分比
     * @param leaftDivisor    被除数
     * @param rootDivisor    除数
     * @param scale        精度(小数点后面的位数)
     * @return 两个数相除，然后返回百分比
     * @throws Exception
     */
    public static String divideStrReturnPercentage(String leaftDivisor, String rootDivisor, int scale) throws Exception {
        return MathUtil.divideStr(leaftDivisor, rootDivisor, scale + 2).movePointRight(2) + "%";
    }

    /**
     * 两个数相除，返回BigDecimal
     * @Title: divide
     * @Description: 两个数相除，返回BigDecimal
     * @param leaftDivisor    被除数
     * @param rootDivisor    除数
     * @param scale        精度(小数点后面的位数)
     * @return 两个数相除，返回BigDecimal
     * @throws Exception
     */
    public static BigDecimal divideStr(String leaftDivisor, String rootDivisor, int scale) throws Exception {
        try {
            BigDecimal lbd = new BigDecimal(leaftDivisor);
            BigDecimal rbd = new BigDecimal(rootDivisor);
            BigDecimal retBd = lbd.divide(rbd, scale, BigDecimal.ROUND_HALF_UP);
            System.out.println(String.format("%s/%s=%s", new Object[]{leaftDivisor, rootDivisor, retBd}));
            logger.info("MathUtil -> divide: {}/{}={}", new Object[]{leaftDivisor, rootDivisor, retBd});
            return retBd;
        } catch (Exception e) {
            logger.error("MathUtil -> divide error, the reason is:");
            logger.error(e.getMessage(), e);
            throw new Exception("MathUtil -> divide error, the reason is:" + e.getMessage());
        }
    }

    /**
     * 两个int型数相除，然后返回百分比
     * @Title: divideReturnPercentage
     * @Description: 两个int型数相除，然后返回百分比
     * @param leaftDivisor    被除数
     * @param rootDivisor    除数
     * @param scale        精度(小数点后面的位数)
     * @return 两个int型数相除，然后返回百分比
     * @throws Exception
     */
    public static String divideIntReturnPercentage(int leaftDivisor, int rootDivisor, int scale) throws Exception {
        return MathUtil.divideDouble(leaftDivisor, rootDivisor, scale + 2).movePointRight(2) + "%";
    }

    /**
     * 两个long型数相除，然后返回百分比
     * @Title: divideReturnPercentage
     * @Description: 两个long型数相除，然后返回百分比
     * @param leaftDivisor    被除数
     * @param rootDivisor    除数
     * @param scale        精度(小数点后面的位数)
     * @return 两个long型数相除，然后返回百分比
     * @throws Exception
     */
    public static String divideLongReturnPercentage(long leaftDivisor, long rootDivisor, int scale) throws Exception {
        return MathUtil.divideDouble(leaftDivisor, rootDivisor, scale + 2).movePointRight(2) + "%";
    }

    /**
     * 两个double型数相除，然后返回百分比
     * @Title: divideReturnPercentage
     * @Description: 两个double型数相除，然后返回百分比
     * @param leaftDivisor    被除数
     * @param rootDivisor    除数
     * @param scale        精度(小数点后面的位数)
     * @return 两个double型数相除，然后返回百分比
     * @throws Exception
     */
    public static String divideDoubleReturnPercentage(double leaftDivisor, double rootDivisor, int scale) throws Exception {
        return MathUtil.divideDouble(leaftDivisor, rootDivisor, scale + 2).movePointRight(2) + "%";
    }

    /**
     * 两个double型数相除，返回BigDecimal
     * @Title: divide
     * @Description: 两个double型数相除，返回BigDecimal
     * @param leaftDivisor    被除数
     * @param rootDivisor    除数
     * @param scale        精度(小数点后面的位数)
     * @return 两个double型数相除，返回BigDecimal
     * @throws Exception
     */
    public static BigDecimal divideDouble(double leaftDivisor, double rootDivisor, int scale) throws Exception {
        try {
            BigDecimal lbd = new BigDecimal(leaftDivisor);
            BigDecimal rbd = new BigDecimal(rootDivisor);
            BigDecimal retBd = lbd.divide(rbd, scale, BigDecimal.ROUND_HALF_UP);
            System.out.println(String.format("%s/%s=%s", new Object[]{leaftDivisor, rootDivisor, retBd}));
            logger.info("MathUtil -> divide: {}/{}={}", new Object[]{leaftDivisor, rootDivisor, retBd});
            return retBd;
        } catch (Exception e) {
            logger.error("MathUtil -> divide error, the reason is:");
            logger.error(e.getMessage(), e);
            throw new Exception("MathUtil -> divide error, the reason is:" + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {

        MathUtil.divideDouble(100.098, 41.123, 3);

        System.out.println(0.7140d * 100);

        double d = 2;
        System.out.println("d=" + d);

    }

}

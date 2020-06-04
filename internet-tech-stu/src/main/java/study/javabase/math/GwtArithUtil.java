package study.javabase.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * GWT UI 端数学计算工具类
 *
 * @author WuLiangzhi  2018/10/18 19:23
 */
public class GwtArithUtil {

    /**
     * 两个Double相加
     *
     * @param d1 Double
     * @param d2 Double
     * @return double
     */
    public static double sum(Double d1, Double d2) {
        return sumArray(d1, d2);
    }


    /**
     * 多个Double相加
     *
     * @param doubles Double[]
     * @return double
     */
    public static double sumArray(Double... doubles) {
        BigDecimal total = new BigDecimal(0);
        for (Double aDouble : doubles) {
            if (aDouble == null) {
                aDouble = 0d;
            }
            total = total.add(new BigDecimal(Double.toString(aDouble)));
        }
        return total.doubleValue();
    }

    /**
     * double 相减
     *
     * @param d1 Double
     * @param d2 Double
     * @return  double
     */
    public static double sub(Double d1,
                             Double d2) {
        if (d1 == null) {
            d1 = 0d;
        }
        if (d2 == null) {
            d2 = 0d;
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString(d2));

        return bd1.subtract(bd2).doubleValue();
    }

    /**
     * double 乘法
     *
     * @param d1    Double
     * @param d2    Double
     * @return  double
     */
    public static double mul(final Double d1,
                             final Double d2) {
        final BigDecimal bd1 = new BigDecimal(d1);
        final BigDecimal bd2 = new BigDecimal(d2);
        return bd1.multiply(bd2).doubleValue();
    }

    /**
     * double 除法
     *
     * @param d1    Double
     * @param d2    Double
     * @param scale int 四舍五入小数点位数
     * @return  double
     * @throws IllegalArgumentException 分母为0
     */
    public static double div(final Double d1,
                             final Double d2,
                             final int scale) {
        // 当然在此之前，你要判断分母是否为0，
        // 为0你可以根据实际需求做相应的处理
        if (d2 == 0) {
            throw new IllegalArgumentException("分母不允许为0，参数信息：【" + d1 + "," + d2 + "," + scale + "】");
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.divide(bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 对double数据进行取精度.
     *
     * @param value        Double   double数据.
     * @param scale        int      精度位数(保留的小数位数).
     * @param roundingMode RoundingMode 精度取值方式.
     * @return 精度计算后的数据.
     */
    public static double round(final Double value,
                               final int scale,
                               final RoundingMode roundingMode) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, roundingMode);
        return bd.doubleValue();
    }

    /**
     * double保留2位小数
     *
     * @param douBle Double 传入需要转换的double
     * @return Double
     */
    public static Double retainDoubleTwo(final Double douBle) {
        return retainDoubleNum(douBle, 2);
    }

    /**
     * double保留n位小数的四舍五入
     *
     * @param douBle 传入需要转换的double
     * @return Double
     */
    public static Double retainDoubleNum(final Double douBle, final int newScale) {
        Double db = 0.0D;
        if (douBle != null) {
            db = douBle;
        }
        final BigDecimal bigDecimal = new BigDecimal(db);
        return bigDecimal.setScale(newScale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


}

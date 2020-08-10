package study.javabase.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author WuLiangzhi  2020/08/10 14:27
 */
public class DoubleFormatTest {

    /**
     * double保留2位小数
     *
     * @param douBle 传入需要转换的double
     * @return Double
     */
    private Double retainDoubleTwo1(final Double douBle) {
        Double db = 0.0D;
        if (douBle != null) {
            db = douBle;
        }
        final BigDecimal bigDecimal = BigDecimal.valueOf(db);
        final Double dRet1 = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println("retainDoubleTwo1, dRet1=" + dRet1);
        return dRet1;
    }

    /**
     * double保留2位小数
     *
     * @param douBle 传入需要转换的double
     * @return Double
     */
    private String retainDoubleTwo2(final Double douBle) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String dRet2 = decimalFormat.format(douBle);
        System.out.println("retainDoubleTwo2, dRet2=" + dRet2);
        return dRet2;
    }

    /**
     * double保留2位小数
     *
     * @param douBle 传入需要转换的double
     * @return Double
     */
    private String retainDoubleTwo3(final Double douBle) {
        String dRet3 = String.format("%.2f", douBle);
        System.out.println("retainDoubleTwo3, dRet3=" + dRet3);
        return dRet3;
    }

    /**
     * double保留2位小数
     *
     * @param douBle 传入需要转换的double
     * @return Double
     */
    private String retainDoubleTwo4(final Double douBle) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        final String dRet4 = numberFormat.format(douBle);
        System.out.println("retainDoubleTwo4, dRet4=" + dRet4);
        return dRet4;
    }

    /**
     * 新增保留两位小数（位数不足自动补0）
     *
     * @param douBle 传入需要转换的double
     * @return Double
     */
    private String accuracyStr(Double douBle) {
        Double db = 0.0D;
        if (douBle != null) {
            db = douBle;
        }
        DecimalFormat df = new DecimalFormat("#0.00");

        final String dRet5 = df.format(db);
        System.out.println("accuracyStr, dRet5=" + dRet5);
        return dRet5;
    }

    @Test
    public void testRetainDoubleTwo() {
        Double charges = 4.805D;
        charges = 11100.0D;
        charges = 0D;
        retainDoubleTwo1(charges);
        retainDoubleTwo2(charges);
        retainDoubleTwo3(charges);
        retainDoubleTwo4(charges);
        accuracyStr(charges);
        accuracyStr(null);
    }

}

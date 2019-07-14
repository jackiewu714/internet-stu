package study.javabase.math;

import com.cw.stu.internet.tech.platform.util.math.ArithUtil;
import com.cw.stu.internet.tech.platform.util.math.HisArithUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author wuliangzhi  2017/10/17 14:10
 **/
public class DoubleTest {
    @Ignore
    @Test
    public void testDoubleFormat() {
        double dou = 1.2d;

        DecimalFormat df = new DecimalFormat("#.00");
        String ret = df.format(dou);
        System.out.println("ret=" + ret);
        System.out.println("Double.valueOf(ret)=" + Double.valueOf(ret));

        BigDecimal bigDecimal = new BigDecimal(dou);
        double d2 = bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("d2=" + d2);
    }

    @Ignore
    @Test
    public void testDoubleCompare() {
        double d1 = 1.000001;
        double d2 = 0.000001;
        boolean ret = d1 == d2;
        System.out.println("ret=" + ret);

        double d3 = d1 - d2;
        System.out.println("d3=" + d3);

        double d4 = 0.00;
        ret = (d4 <= 0);
        System.out.println("ret=" + ret);
    }


    @Test
    public void testDoubleCompare1() {
        double d1 = 0.000000;
        double d2 = 0.000001;
        double d3 = -99999999.019;
        double d4 = 99999999.02;

        long l1 = Double.doubleToLongBits(d1);
        long l2 = Double.doubleToLongBits(d2);
        long l3 = Double.doubleToLongBits(d3);
        long l4 = Double.doubleToLongBits(d4);
        System.out.println(String.format("d1=%s, l1=%s", d1, l1));
        System.out.println(String.format("d2=%s, l2=%s", d2, l2));
        System.out.println(String.format("d3=%s, l3=%s", d3, l3));
        System.out.println(String.format("d4=%s, l4=%s", d4, l4));

        boolean ret = d1 == d2;
        System.out.println("ret=" + ret);
    }

    @Ignore
    @Test
    public void testDoubleCompare2() {
        double d1 = 0.000001;
        d1 = 0.00000;
        BigDecimal bd = new BigDecimal(d1);
        boolean lessEqualThanZero = HisArithUtils.lessThanZero(bd) || HisArithUtils.equalToZero(bd);
        System.out.println("lessEqualThanZero=" + lessEqualThanZero);
    }

    /**
     * 费用如果为0.0，则替换为空字符串
     *
     * @param douBle Double
     * @return String
     */
    private String replaceCharges(Double douBle) {
        //modify by zhilw, for ZJYYXM-1936【住院收费工作站 - 出院结算】发票上面大类费用为零的就不打印
        Double chargesD = ArithUtil.accuracy(douBle);
        String chargesStr = String.valueOf(chargesD);
        if (chargesD.doubleValue() == 0.0d) {
            chargesStr = ""; //自理自费大类费用为0，则将其设置为空字符串
        }
        return chargesStr;
    }

    @Ignore
    @Test
    public void testDouble3() {
        double d1 = 0.000001;
        d1 = 0.01;
        d1 = 89.91;
        d1 = 0.0d;
        String str = replaceCharges(d1);
        System.out.println("str=" + str);
    }

    /**
     * 测试double精度丢失问题
     */
    @Ignore
    @Test
    public void testDoublePrecision() {
        Double balance = 3.14;
        Double fee = Double.valueOf("3.15");

        if (fee > balance) {
            System.out.println("d1 greater than d2");
            BigDecimal bd1 = new BigDecimal(balance);   //直接以Double/double类型进行构造，会造成精度丢失
            BigDecimal bd2 = new BigDecimal(fee);       //直接以Double/double类型进行构造，会造成精度丢失
//            BigDecimal bd1 = new BigDecimal(String.valueOf(balance)); //以String类型进行构造，不会造成精度丢失
//            BigDecimal bd2 = new BigDecimal(String.valueOf(fee));     //以String类型进行构造，不会造成精度丢失
            System.out.println(String.format("bd1=%s", bd1));
            System.out.println(String.format("bd2=%s", bd2));

            double recharge = bd2.subtract(bd1).doubleValue();
            System.out.println(String.format("recharge=%s", recharge));
        }

    }

    @Ignore
    @Test
    public void testDoubleMultiply() {
//        Double salesPrice = 9.61D;
//        Double amount = 0.5D;
        Double salesPrice = 9.61;
        Double amount = 0.5;
        Double charges = salesPrice * amount;
        System.out.println("testDoubleMultiply charges=" + charges);
    }

    @Test
    public void testRetainDoubleTwo(){
        Double charges = 4.805D;
        Double result = retainDoubleTwo(charges);
        System.out.println("testRetainDoubleTwo, result=" + result);

        Double result11 = retainDoubleTwo(result);
        System.out.println("testRetainDoubleTwo, result11=" + result11);

        Double price = 9.61D;
        Double amount = 0.5D;
        Double result1 = ArithUtil.accuracy (ArithUtil.mul (price, amount));
        System.out.println("testRetainDoubleTwo, result1=" + result1);

        Double result2 = ArithUtil.accuracy (ArithUtil.mul (price, amount),2);
        System.out.println("testRetainDoubleTwo, result2=" + result2);
    }

    /**
     * double保留2位小数
     *
     * @param douBle 传入需要转换的double
     * @return Double
     */
    public static Double retainDoubleTwo (final Double douBle)
    {
        Double db = 0.0D;
        if (douBle != null)
        {
            db = douBle;
        }
//        final BigDecimal bigDecimal = new BigDecimal (db);
        final BigDecimal bigDecimal = BigDecimal.valueOf (db);
//        final BigDecimal bigDecimal = new BigDecimal (String.valueOf(db));
//        final BigDecimal bigDecimal = new BigDecimal (Double.toString(db));
//        final Double d = bigDecimal.setScale (2, BigDecimal.ROUND_HALF_UP).doubleValue ();
//        final Double d = bigDecimal.setScale (2, BigDecimal.ROUND_HALF_DOWN).doubleValue ();
        final Double d = bigDecimal.setScale (2, RoundingMode.HALF_UP).doubleValue ();
        return d;
    }

}

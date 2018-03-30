package study.javabase.math;

import com.cw.platform.util.math.HisArithUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
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

}

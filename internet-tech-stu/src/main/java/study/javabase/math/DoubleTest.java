package study.javabase.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author wuliangzhi  2017/10/17 14:10
 **/
public class DoubleTest
{
    @Test
    public void testDoubleFormat()
    {
        double dou = 1.2d;

        DecimalFormat df = new DecimalFormat("#.00");
        String ret = df.format(dou);
        System.out.println("ret=" + ret);
        System.out.println("Double.valueOf(ret)=" + Double.valueOf(ret));

        BigDecimal bigDecimal = new BigDecimal(dou);
        double d2 = bigDecimal.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("d2=" + d2);
    }

}

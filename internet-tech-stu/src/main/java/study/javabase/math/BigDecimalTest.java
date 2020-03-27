package study.javabase.math;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author WuLiangzhi  2019/01/14 17:58
 */
public class BigDecimalTest {

    @Test
    public void test1() {
        double d = 2.50d;
        BigDecimal bd = new BigDecimal(d);
        System.out.println("bd=" + bd);

        String d2 = "2.50";
        BigDecimal bd2 = new BigDecimal(d2);
        System.out.println("bd2=" + bd2);

//        Double d3 = 27.60D;
//        Double d3 = 0.60D;
        Double d3 = 62.50D;
        BigDecimal bd3 = new BigDecimal(d3);
        System.out.println("bd3=" + bd3);
        Double cash = bd3.setScale (1, BigDecimal.ROUND_UP).doubleValue ();
        System.out.println("cash=" + cash);
    }

}

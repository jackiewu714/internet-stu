package study.javabase.math;

import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author WuLiangzhi  2018/07/02 15:52
 */
public class DoubleRoundTest {

    @Ignore
    @Test
    public void testRoundUp(){
        Double d1 = 0.011;
        BigDecimal bd = new BigDecimal(d1.toString());
        Double dRet = bd.setScale(2, BigDecimal.ROUND_UP).doubleValue();
        System.out.println("dRet=" + dRet);
    }

    @Test
    public void testRoundHalfUp(){
        Double d1 = 0.011;
        d1 = 0.015; //四舍五入
        BigDecimal bd = new BigDecimal(d1.toString());
        Double dRet = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println("dRet=" + dRet);
    }

    @Test
    public void testRoundDown(){
        Double d1 = 0.011;
        BigDecimal bd = new BigDecimal(d1.toString());
        Double dRet = bd.setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
        System.out.println("dRet=" + dRet);
    }

    @Test
    public void testRoundHalfDown(){
        Double d1 = 0.011;
        BigDecimal bd = new BigDecimal(d1.toString());
        Double dRet = bd.setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        System.out.println("dRet=" + dRet);
    }

}

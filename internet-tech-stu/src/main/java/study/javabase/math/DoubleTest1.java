package study.javabase.math;

import com.cw.stu.internet.tech.platform.util.math.ArithUtil;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author WuLiangzhi  2019/07/01 13:50
 */
public class DoubleTest1 {

    /**
     * 获取药品金额
     *
     * @param pham
     * @param amount
     * @param factor
     * @return
     */
    private Double getPharmAmount (Double retailPrice, Double packageFactor, Double amount, Double factor)
    {
        // 药品金额 = 换算系数* 数量 * 包装价格 / 包装单位
        Double costs = ArithUtil.div (ArithUtil.mul (ArithUtil.mul (amount, factor), retailPrice), packageFactor, 2);
        return costs;
    }

    @Test
    public void test1(){
        Double retailPrice = 23.4780D;
        Double packageFactor = 2.0000D;
        Double amount = 1.0000D;
        Double factor = 1.0000D;
        Double costs = getPharmAmount(retailPrice, packageFactor, amount, factor);
        System.out.println("costs=" + costs);
    }

    @Test
    public void test2(){
        Double retailPrice = 23.4700D;
        Double packageFactor = 2.0000D;
        Double amount = 1.0000D;
        Double factor = 1.0000D;

        Double d1 = ArithUtil.mul(amount,factor);
        Double d2 = ArithUtil.mul (d1, retailPrice);
        Double charges = ArithUtil.div (d2, packageFactor,2);

        System.out.println("charges=" + charges);
    }

    @Test
    public void test3(){
        double d1 = 10.0d;
        double d2 = 10.01d;
        double d3 = d1 + d2;
        double d4 = 39.90d;
        BigDecimal bd1 = new BigDecimal(Double.toString(d2));
        BigDecimal bd2 = BigDecimal.valueOf(d2);
        BigDecimal bd3 = new BigDecimal(d2);
        System.out.println("test3 d1=" + d1);
        System.out.println("test3 d2=" + d2);
        System.out.println("test3 d3=" + d3);
        System.out.println("test3 d4=" + d4);
        System.out.println("test3 bd1=" + bd1);
        System.out.println("test3 bd2=" + bd2);
        System.out.println("test3 bd3=" + bd3);

    }

    @Test
    public void test4(){
//        double d1 = 547.74d;
//        double d2 = -516.74d;
//        double d3 = GwtArithUtil.sum(d1, d2);
//
//        System.out.println("test3 d1=" + d1);
//        System.out.println("test3 d2=" + d2);
//        System.out.println("test3 d3=" + d3);

        BigDecimal bd1 = new BigDecimal(-516.74d);
        System.out.println("test3 bd1=" + bd1);

    }

}

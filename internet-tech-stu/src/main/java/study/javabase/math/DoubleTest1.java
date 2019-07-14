package study.javabase.math;

import com.cw.stu.internet.tech.platform.util.math.ArithUtil;
import org.junit.Test;

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


}

package study.javabase.string;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author WuLiangzhi  2019/06/18 17:57
 */
public class StringTest2 {

    @Test
    public void testCompare(){
        String str1 = "HA0105B00801191102";
        String str2 = "HA0105B00801191102Z";

        int comp = str1.compareTo(str2);
        System.out.println("comp=" + comp);
    }

    @Test
    public void testSplit(){
        String str = "11";
        String[] strArr = str.split(",");
        System.out.println("strArr=" + strArr);
    }

    @Test
    public void testFormat(){
        Double sum = 0.0;
        sum = sum(sum, 0d);
        String str = String.format ("%.2f", sum);
        System.out.println("str=" + str);
    }

    /**
     * double 相加
     *
     * @param d1 double
     * @param d2 double
     * @return double
     */
    public static double sum(Double d1, Double d2) {
        if (d1 == null) {
            d1 = 0d;
        }
        if (d2 == null) {
            d2 = 0d;
        }
        final BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        final BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.add(bd2).doubleValue();
    }

}

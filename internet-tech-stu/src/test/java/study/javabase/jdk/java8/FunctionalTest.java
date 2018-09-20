package study.javabase.jdk.java8;

import org.junit.Test;
import study.javabase.jdk.java8.lambda.Functional;

import java.math.BigDecimal;

/**
 * @author WuLiangzhi  2018/09/19 20:21
 */
public class FunctionalTest {

    @Test
    public void test1() {
        Functional functional = new Functional() {
            @Override
            public <T extends Number> BigDecimal add(T a, T b) {
                String strA = a==null?"0":a.toString();
                String strB = b==null?"0":b.toString();
                BigDecimal bd1 = new BigDecimal(strA);
                BigDecimal bd2 = new BigDecimal(strB);
//                return (T) bd1.add(bd2);
//                return null;
                BigDecimal bdRet = bd1.add(bd2);
                return bdRet;
            }
        };

        BigDecimal ret = functional.add(1, 2);
        System.out.println("ret: " + ret);
    }


}
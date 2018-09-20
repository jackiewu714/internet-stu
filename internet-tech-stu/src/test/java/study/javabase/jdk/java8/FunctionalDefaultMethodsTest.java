package study.javabase.jdk.java8;

import org.junit.Test;
import study.javabase.jdk.java8.lambda.FunctionalDefaultMethods;

import java.math.BigDecimal;

/**
 * @author WuLiangzhi  2018/09/19 20:24
 */
public class FunctionalDefaultMethodsTest {

    @Test
    public void test1() {
        FunctionalDefaultMethods defaultMethods = new FunctionalDefaultMethods() {
            @Override
            public <T extends Number> BigDecimal add(T a, T b) {
                String strA = a==null?"0":a.toString();
                String strB = b==null?"0":b.toString();
                BigDecimal bd1 = new BigDecimal(strA);
                BigDecimal bd2 = new BigDecimal(strB);
                return bd1.add(bd2);
            }
        };

        BigDecimal bdRet = defaultMethods.add(12.3d, 532.1234d);
        System.out.println("bdRet: " + bdRet);

        String msg = defaultMethods.sayHello("Jackie");
        System.out.println("msg: " + msg);
    }

}
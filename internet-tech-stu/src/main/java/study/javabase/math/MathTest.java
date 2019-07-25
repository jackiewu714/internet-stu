package study.javabase.math;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author WuLiangzhi  2019/02/25 18:28
 */
public class MathTest {

    @Ignore
    @Test
    public void test1(){
        System.out.println(Math.round(109/10));
        System.out.println(Math.round(10.1));
        System.out.println(Math.round(10.9));
    }

    @Test
    public void test2(){
        int index=1000;
        Boolean flag = (index % 1000) == 999;
        System.out.println("flag=" + flag);
        System.out.println("5174 % 1000=" + (5174 % 1000));
        System.out.println("1998 % 999=" + (1998 % 999));
        System.out.println("998 % 999=" + (998 % 999));
        System.out.println("0 % 999=" + (0 % 999));
        System.out.println("999 % 1000=" + (999 % 1000));
        System.out.println("1000 % 1000=" + (1000 % 1000));
        System.out.println("1001 % 1000=" + (1001 % 1000));
        System.out.println("5162 % 1000=" + (5162 % 1000));

//        boolean bbb = flag > NULL;
    }

}

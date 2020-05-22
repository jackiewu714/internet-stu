package study.javabase.exceptions;

import org.junit.Test;

/**
 * @author WuLiangzhi  2020/03/28 20:38
 */
public class ExceptionTest {

    public int test1() {
        int a = 100;
        int b = 10;
        int c = 0;
        try {
            c = a / b;
            System.out.println("c=" + c);
            return c;
        } catch (Exception e) {
            System.out.println("Exception occurs");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("c2222=" + c);
        return c;
    }

    public int test2() throws Exception {
        int a = 100;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
            System.out.println("c=" + c);
            return c;
        } catch (Exception e) {
            System.out.println("Exception occurs");
            throw new Exception("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } finally {
            System.out.println("finally block");
        }
//        System.out.println("c2222=" + c);
//        return c;
    }

    public static void main(String[] args) throws Exception {
        ExceptionTest exceptionTest = new ExceptionTest();
//        exceptionTest.test1();
        exceptionTest.test2();
    }

}

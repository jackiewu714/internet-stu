package study.javabase.jdk.jvm;

/**
 * JVM虚拟机数学测试类
 * @author WuLiangzhi  2020/03/23 22:54
 */
public class JvmMathTest {

    public int math(){
        int a=1;
        int b=2;
        int c=(a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        JvmMathTest jvmMathTest = new JvmMathTest();
        jvmMathTest.math();
    }

}

package study.javabase.jdk.generics;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 泛型类测试用例
 * @author WuLiangzhi  2018/09/18 22:42
 */
public class GenericClassTest {

    /**
     * 传入泛型参数类型
     */
    @Ignore
    @Test
    public void test1() {
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型

        //传入的实参类型需与泛型的类型参数类型相同，即为Integer
        GenericCalss<Integer> genericInteger = new GenericCalss<Integer>(123456);

        //传入的实参类型需与泛型的类型参数类型相同，即为String
        GenericCalss<String> genericString  = new GenericCalss<String>("Hello Jackie!");

        System.out.println("泛型测试 key genericInteger: " + genericInteger.getKey());
        System.out.println("泛型测试 key genericString: " + genericString.getKey());
    }

    /**
     * 不传入泛型参数类型
     */
    @Ignore
    @Test
    public void test2() {
        GenericCalss generic1 = new GenericCalss("11111");
        GenericCalss generic2 = new GenericCalss(4444);
        GenericCalss generic3 = new GenericCalss(55.55);
        GenericCalss generic4 = new GenericCalss(false);

        System.out.println("泛型测试 key generic1: " + generic1.getKey());
        System.out.println("泛型测试 key generic2: " + generic2.getKey());
        System.out.println("泛型测试 key generic3: " + generic3.getKey());
        System.out.println("泛型测试 key generic4: " + generic4.getKey());
    }

    /**
     * 类型通配符一般是使用？代替具体的类型实参，注意了，此处’？’是类型实参，而不是类型形参 。
     * 直白点的意思就是，此处的？和Number、String、Integer一样都是一种实际的类型，可以把？看成所有类型的父类。是一种真实的类型。
     * 注意：
     * 1) 当具体类型不确定的时候，可以使用这个通配符 ?
     * 2）当操作类型时，不需要使用类型的具体功能时，只使用Object类中的功能。那么可以用 ? 通配符来表未知类型。
     * @param obj   GenericCalss<?>
     */
    public void showKeyValue(GenericCalss<?> obj) {
        System.out.println("泛型测试 key value is: " + obj.getKey());
    }

    @Test
    public void test3() {
        GenericCalss<Integer> gInteger = new GenericCalss<>(12345);
        GenericCalss<String> gString = new GenericCalss<>("泛型通配符");

        showKeyValue(gInteger);
        showKeyValue(gString);
    }

}

package study.javabase.generics;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 泛型上下边界 - 方法
 * @author WuLiangzhi  2018/09/19 14:09
 */
public class GenericBoundMethod {

    /**
     * 非泛型方法参数边界
     * 为泛型添加上边界，即传入的类型实参必须是指定类型的子类型
     * @param obj   GenericCalss<? extends Number>
     */
    public void showKeyValue1(GenericCalss<? extends Number> obj) {
        System.out.println("非泛型方法测试 showKeyValue1, key value is: " + obj.getKey());
    }

    @Ignore
    @Test
    public void test1() {
        GenericCalss<Integer> integerGeneric = new GenericCalss<Integer>(123);
        GenericCalss<Long> longGeneric = new GenericCalss<Long>(222L);
        GenericCalss<Double> doubleGeneric = new GenericCalss<Double>(333.0d);
        GenericCalss<String> stringGeneric = new GenericCalss<String>("为泛型添加上边界，即传入的类型实参必须是指定类型的子类型");

        showKeyValue1(integerGeneric);
        showKeyValue1(longGeneric);
        showKeyValue1(doubleGeneric);

        // 这一行代码编译器会提示错误，因为String类型并不是Number类型的子类
//        showKeyValue1(stringGeneric);
    }

    /**
     * 泛型方法边界
     * 在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
     * @param obj   GenericCalss<T>
     * @param <T>   <T extends Number>
     * @return  T
     */
    //    public <T> T showKeyValue2(GenericClass<T extends Number> obj){} //编译器会报错："Unexpected bound"
    public <T extends Number> T showKeyValue2(GenericCalss<T> obj) {
        System.out.println("泛型方法测试 showKeyValue1, key value is: " + obj.getKey());
        T key = obj.getKey();
        return key;
    }

    @Test
    public void test2() {
        GenericCalss<Integer> integerGeneric = new GenericCalss<Integer>(2123);
        GenericCalss<Long> longGeneric = new GenericCalss<Long>(3222L);
        GenericCalss<Double> doubleGeneric = new GenericCalss<Double>(4333.0d);
        GenericCalss<String> stringGeneric = new GenericCalss<String>("在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加");

        showKeyValue2(integerGeneric);
        showKeyValue2(longGeneric);
        showKeyValue2(doubleGeneric);

        // 这一行代码编译器会提示错误，因为String类型并不是Number类型的子类
//        showKeyValue2(stringGeneric);
    }

}

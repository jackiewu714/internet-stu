package study.javabase.java8.lambda;

import com.alibaba.fastjson.JSON;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Lambda测试类
 * @author WuLiangzhi  2018/09/19 19:45
 */
public class LambdaTest {

    private String separator1 = ",";

    @Ignore
    @Test
    public void test1() {
        // 最简单的Lambda表达式可由逗号分隔的参数列表、->符号和语句块组成
        // 参数e的类型是由编译器推理得出的
        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e));

        // 显式指定该参数的类型
        Arrays.asList("a", "b", "c").forEach((String e) -> System.out.println(e));

        // 如果Lambda表达式需要更复杂的语句块，则可以使用花括号将该语句块括起来，类似于Java中的函数体，例如：
        Arrays.asList("a", "b", "c").forEach(e -> {
            String str = "Hello " + e;
            System.out.println("str: " + str);
        });
    }

    @Ignore
    @Test
    public void test2() {
        // Lambda表达式可以引用类成员和局部变量（会将这些变量隐式得转换成final的），例如下列两个代码块的效果完全相同：

        // 1) Lambda表达式引用局部变量
        System.out.println("Lambda表达式引用局部变量");
        String separator2 = ",";
        Arrays.asList("a", "b", "c").forEach(
                (String e) -> System.out.print(e + separator2));
        System.out.println();

        System.out.println("Lambda表达式引用类成员变量");
        // 2) Lambda表达式引用类成员变量
        Arrays.asList("d", "e", "f").forEach(
                (String e) -> System.out.print(e + separator1));
        System.out.println();
    }

    @Test
    public void test3() {
        // Lambda表达式有返回值，返回值的类型也由编译器推理得出。

        // 1) 如果Lambda表达式中的语句块只有一行，则可以不用使用return语句
        List<String> list1 = Arrays.asList("d", "b", "a");
        list1.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println("step1 list1: " + JSON.toJSONString(list1));

        // 2) 如果Lambda表达式需要更复杂的语句块，则可以使用花括号将该语句块括起来
        List<String> list2 = Arrays.asList("abc", "cbd", "acd");
        list2.sort(
                (e1, e2) -> {
                    int result = e1.compareTo(e2);
                    return result;
                }
        );
        System.out.println("step2 list2: " + JSON.toJSONString(list2));
    }


}

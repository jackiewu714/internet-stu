package study.javabase.jdk.java8.compiler;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Java编译器的新特性 - 参数名称
 * @author WuLiangzhi  2018/09/19 21:46
 */
public class ParameterNames {

    public static void main(String[] args) {
        try {
            Method method = ParameterNames.class.getMethod("main", String[].class);
            for (Parameter parameter : method.getParameters()) {
                System.out.println("Parameter: " + parameter.getName());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}

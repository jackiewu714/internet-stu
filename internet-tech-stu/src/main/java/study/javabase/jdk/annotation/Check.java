package study.javabase.jdk.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 如果一个注解内仅仅只有一个名字为 value 的属性时，应用这个注解时可以直接接属性值填写到括号内。
 * @author WuLiangzhi  2018/09/20 20:56
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {

    String value();

}

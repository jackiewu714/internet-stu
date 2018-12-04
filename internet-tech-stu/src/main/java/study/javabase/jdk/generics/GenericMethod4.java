package study.javabase.jdk.generics;

/**
 * 泛型方法类4（静态方法与泛型）
 * @author WuLiangzhi  2018/09/19 0:07
 */
public class GenericMethod4<T> {

    /**
     * 如果在类中定义使用泛型的静态方法，需要添加额外的泛型声明（将这个方法定义成泛型方法）
     * 即使静态方法要使用泛型类中已经声明过的泛型也不可以。
     * 如：public statics void show(T t){..},此时编译器会提示错误信息：
     "StaticGenerator cannot be refrenced from statics context"
     */
    public static <T> void show(T t) {

    }

}

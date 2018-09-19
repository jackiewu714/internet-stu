package study.javabase.java8.typededuce;

/**
 * 类型推断
 *
 * @author WuLiangzhi  2018/09/19 21:34
 */
public class TypeDeduce<T> {

    public static <T> T defaultValue() {
        return null;
    }

    public T getOrDefault(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }

    public static void main(String[] args) {
        TypeDeduce<String> typeDeduce = new TypeDeduce<String>();

        // 参数 TypeDeduce.defaultValue() 的类型由编译器推导得出，不需要显式指明。
        // 在Java 7中这段代码会有编译错误，除非使用 TypeDeduce.<String>defaultValue()。
        String value = typeDeduce.getOrDefault("22", TypeDeduce.defaultValue());
        System.out.println("value=" + value);
    }

}

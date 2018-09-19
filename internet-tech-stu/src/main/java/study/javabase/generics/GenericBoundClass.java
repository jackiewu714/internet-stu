package study.javabase.generics;

/**
 * 泛型上下边界 - 类
 * @author WuLiangzhi  2018/09/19 14:01
 */
public class GenericBoundClass<T extends Number> {

    private T key;

    public GenericBoundClass(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        GenericBoundClass<Integer> integerBound = new GenericBoundClass<Integer>(1234);
        GenericBoundClass<Long> longBound = new GenericBoundClass<Long>(4321L);
        GenericBoundClass<Float> floatBound = new GenericBoundClass<Float>(561.125f);
        System.out.println("integerBound: " + integerBound.getKey());
        System.out.println("longBound: " + longBound.getKey());
        System.out.println("floatBound: " + floatBound.getKey());

        // 这一行代码也会报错，因为String不是Number的子类
//        GenericBoundClass<String> stringBound = new GenericBoundClass<String>("泛型上下边界 - 类");
    }

}

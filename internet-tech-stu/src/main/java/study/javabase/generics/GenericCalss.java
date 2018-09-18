package study.javabase.generics;

/**
 * 泛型类
 * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 * 在实例化泛型类时，必须指定T的具体类型
 *
 * 注意：
 * 1) 泛型的类型参数只能是类类型，不能是简单类型。
 * 2) 不能对确切的泛型类型使用instanceof操作
 * @author WuLiangzhi  2018/09/18 22:38
 */
public class GenericCalss<T> {

    /**
     * key这个成员变量的类型为T,T的类型由外部指定
     */
    private T key;


    /**
     * 构造方法
     * 泛型构造方法形参key的类型也为T，T的类型由外部指定
     * @param key
     */
    public GenericCalss(T key) {
        this.key = key;
    }

    /**
     * 获取Key
     * 泛型方法getKey的返回值类型为T，T的类型由外部指定
     * @return  T
     */
    public T getKey() {
        return key;
    }


}

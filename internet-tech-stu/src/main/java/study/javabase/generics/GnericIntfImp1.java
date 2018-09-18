package study.javabase.generics;

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class GnericIntfImp1<T> implements GenericIntf<T>{
 * 如果不声明泛型，如：class GnericIntfImp1 implements GenericIntf<T>，编译器会报错："Unknown class"
 *
 * @author WuLiangzhi  2018/09/18 22:59
 */
public class GnericIntfImp1<T> implements GenericIntf<T> {

    @Override
    public T next() {
        return null;
    }

}

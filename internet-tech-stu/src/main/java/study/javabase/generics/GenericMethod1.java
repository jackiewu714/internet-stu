package study.javabase.generics;

/**
 * 泛型方法类1（泛型方法的基本用法）
 * @author WuLiangzhi  2018/09/18 23:20
 */
public class GenericMethod1 {

    /**
     * 泛型类
     * @param <T>
     */
    public class Generic<T> {
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        /**
         * 我想说的其实是这个，虽然在方法中使用了泛型，但是这并不是一个泛型方法。
         * 这只是类中一个普通的成员方法，只不过他的返回值是在声明泛型类已经声明过的泛型。
         * 所以在这个方法中才可以继续使用 T 这个泛型。
         *
         * @return  T
         */
        public T getKey() {
            return key;
        }

        /**
         * 这个方法显然是有问题的，在编译器会给我们提示这样的错误信息"cannot reslove symbol E"
         * 因为在类的声明中并未声明泛型E，所以在使用E做形参和返回值类型时，编译器会无法识别。
         * @param key   E
         * @return  E
         */
        /*public E setKey(E key) {

        }*/
    }

    public <T> T showKeyName(Generic<T> generic) {
        System.out.println("generic key is: " + generic.getKey());

        //当然这个例子举的不太合适，只是为了说明泛型方法的特性。
        T test = generic.getKey();
        return test;
    }

    /**
     * 这也不是一个泛型方法，这就是一个普通的方法，只是使用了Generic<Number>这个泛型类做形参而已。
     * @param generic   Generic<Number>
     */
    public void showKeyValue1(Generic<Number> generic) {
        System.out.println("泛型测试 showKeyValue1 generic key is: " + generic.getKey());
    }

    /**
     * 这也不是一个泛型方法，这也是一个普通的方法，只不过使用了泛型通配符?
     * 同时这也印证了泛型通配符章节所描述的，?是一种类型实参，可以看做为Number等所有类的父类
     * @param generic   Generic<?>
     */
    public void showKeyValue2(Generic<?> generic) {
        System.out.println("泛型测试 showKeyValue2 generic key is: " + generic.getKey());
    }

    /**
     * 这个方法是有问题的，编译器会为我们提示错误信息："UnKnown class 'E' "
     * 虽然我们声明了<T>,也表明了这是一个可以处理泛型的类型的泛型方法。
     * 但是只声明了泛型类型T，并未声明泛型类型E，因此编译器并不知道该如何处理E这个类型。
     *
     * @param generic Generic<E>
     * @param <T>     <T>
     * @return T
     */
    /*public <T> T showKeyValue3(Generic<E> generic) {

    }*/

    /**
     * 这个方法也是有问题的，编译器会为我们提示错误信息："UnKnown class 'T' "
     * 对于编译器来说T这个类型并未项目中声明过，因此编译也不知道该如何编译这个类。
     * 所以这也不是一个正确的泛型方法声明。
     *
     * @param generic   T
     */
    /*public void showKeyValue4(T generic) {

    }*/


}

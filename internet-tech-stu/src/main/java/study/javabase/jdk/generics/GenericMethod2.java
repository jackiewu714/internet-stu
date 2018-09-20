package study.javabase.jdk.generics;


import org.junit.Test;

/**
 * 泛型方法类2（类中的泛型方法）
 * @author WuLiangzhi  2018/09/18 23:43
 */
public class GenericMethod2 {

    class Fruit {
        @Override
        public String toString() {
            return "fruit";
        }
    }

    class Apple extends Fruit {
        @Override
        public String toString() {
            return "apple";
        }
    }

    class Person {
        @Override
        public String toString() {
            return "Person";
        }
    }

    class GenerateTest<T> {
        public void show_1(T t) {
            System.out.println("show_1: " + t.toString());
        }

        /**
         * 在泛型类中声明了一个泛型方法，使用泛型T，注意这个T是一种全新的类型，可以与泛型类中声明的T不是同一种类型。
         * @param t    T
         * @param <T>  <T>
         */
        public <T> void show_2(T t) {
            System.out.println("show_2: " + t.toString());
        }

        /**
         * 在泛型类中声明了一个泛型方法，使用泛型A，这种泛型A可以为任意类型。可以类型与T相同，也可以不同。
         * 由于泛型方法在声明的时候会声明泛型<A>，因此即使在泛型类中并未声明泛型，编译器也能够正确识别泛型方法中识别的泛型。
         *
         * @param t     A
         * @param <A>   <A>
         */
        public <A> void show_3(A t) {
            System.out.println("show_3: " + t.toString());
        }
    }

    @Test
    public void test() {
        GenericMethod2 genericMethod2 = new GenericMethod2();
        Apple apple = genericMethod2.new Apple();
        Person person = genericMethod2.new Person();

        GenerateTest<GenericMethod2.Fruit> generateTest = new GenerateTest<GenericMethod2.Fruit>();

        //apple是Fruit的子类，所以这里可以
        generateTest.show_1(apple);
        //编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
//        generateTest.show_1(person);

        //使用这两个方法都可以成功
        generateTest.show_2(apple);
        generateTest.show_2(person);

        //使用这两个方法都可以成功
        generateTest.show_3(apple);
        generateTest.show_3(person);

    }



}

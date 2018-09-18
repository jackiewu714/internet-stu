package study.javabase.generics;

import org.junit.Test;

/**
 * 泛型方法类3（泛型方法与可变参数）
 * @author WuLiangzhi  2018/09/19 0:07
 */
public class GenericMethod3 {

    /**
     * 泛型方法与可变参数
     * @param args  T
     * @param <T>   <T>
     */
    public <T> void printMsg(T... args) {
        for (T t : args) {
            System.out.println("泛型测试 t is " + t);
        }
    }

    @Test
    public void test() {
        printMsg("111",222,"aaaa","2323.4",55.55);
    }

}

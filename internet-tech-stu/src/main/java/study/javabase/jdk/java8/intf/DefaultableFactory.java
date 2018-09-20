package study.javabase.jdk.java8.intf;

import java.util.function.Supplier;

/**
 * @author WuLiangzhi  2018/09/19 21:02
 */
public interface DefaultableFactory {

    /**
     * 接口中的静态方法
     * @param supplier  Supplier<Defaultable>
     * @return  Defaultable
     */
    static Defaultable create(Supplier<Defaultable> supplier) {
        return supplier.get();
    }

}

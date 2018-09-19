package study.javabase.java8.intf;

/**
 * @author WuLiangzhi  2018/09/19 20:57
 */
public interface Defaultable {

    /**
     * 接口默认方法
     * @return  String
     */
    default String notRequired() {
        return "Default implementation";
    }

}

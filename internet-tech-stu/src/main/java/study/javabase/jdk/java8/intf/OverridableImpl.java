package study.javabase.jdk.java8.intf;

/**
 * @author WuLiangzhi  2018/09/19 21:00
 */
public class OverridableImpl implements Defaultable {

    /**
     * 重写接口默认方法
     * @return  String
     */
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}

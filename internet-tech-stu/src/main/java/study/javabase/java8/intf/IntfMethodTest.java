package study.javabase.java8.intf;

import org.junit.Test;

/**
 * @author WuLiangzhi  2018/09/19 21:09
 */
public class IntfMethodTest {

    @Test
    public void test1() {
        Defaultable defaultable = DefaultableFactory.create(DefaultableImpl::new);
        System.out.println("defaultable: " + defaultable.notRequired());

        Defaultable overridable = DefaultableFactory.create(OverridableImpl::new);
        System.out.println("overridable: " + overridable.notRequired());
    }

}

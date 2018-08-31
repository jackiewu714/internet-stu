package study.javabase.math;

import org.junit.Test;

/**
 * @author WuLiangzhi  2018/08/31 19:10
 */
public class LongTest {

    @Test
    public void testEquals() {
        Long l1 = new Long(11);
        Long l2 = new Long(11);
        if (l1 == l2) {
            System.out.println("l1==l2");
        } else {
            System.out.println("l1!=l2");
        }

        if (l1.equals(l2)) {
            System.out.println("l1.equals(l2)");
        } else {
            System.out.println("!l1.equals(l2)");
        }

        if (l1.longValue() == l2.longValue()) {
            System.out.println("l1.longValue() == l2.longValue()");
        } else {
            System.out.println("l1.longValue() != l2.longValue()");
        }
    }

}

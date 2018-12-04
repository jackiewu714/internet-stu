package study.javabase.math;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WuLiangzhi  2018/08/31 19:10
 */
public class LongTest {

    @Test
    @Ignore
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

    @Test
    public void testContains() {
        List<Long> list = new ArrayList<Long>();
        list.add(2002L);
        list.add(2050L);

        Long l1 = 2050L;
//        Long l2 = 2050.5L;
        System.out.print("list.contains(l1)=" + list.contains(l1));
    }

}

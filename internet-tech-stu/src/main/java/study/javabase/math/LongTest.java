package study.javabase.math;

import com.cw.stu.internet.tech.platform.util.DateUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
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
    @Ignore
    public void testContains() {
        List<Long> list = new ArrayList<Long>();
        list.add(2002L);
        list.add(2050L);

        Long l1 = 2050L;
//        Long l2 = 2050.5L;
        System.out.print("list.contains(l1)=" + list.contains(l1));
    }

    @Test
    public void testConcate(){
        Long ll = new Long("100");
        String str = "123aaa";
        String key = ll + str;
        System.out.println("key=" + key);
    }

    @Test
    public void testDiv() {
        Long ms = 9090L;
//        Long dayMs = 24*60*60*1000;
        Long days1 = ms / (1000*60*60*24);
        System.out.println("days1=" + days1);

        Date start = DateUtils.stringToDate("2020-04-07 12:11:11", DateUtils.SHOWING_DATE_TIME_FORMAT);
        Date end = new Date();
        Long days2 = (end.getTime() - start.getTime()) / (1000*60*60*24);
        System.out.println("days2=" + days2);
    }

}

package study.javabase.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author WuLiangzhi  2018/12/24 11:30
 */
public class ListTest {

    @Test
    public void testRemove() {
        List<String> list = new ArrayList<String>();
        list.add("2600");
        list.add("2500");
        list.add("2710");
        list.add("2800");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next != null) {
                iterator.remove();
                System.out.println("remove next:" + next);
            }
        }
    }

}

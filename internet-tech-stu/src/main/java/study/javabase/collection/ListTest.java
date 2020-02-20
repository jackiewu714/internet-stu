package study.javabase.collection;

import org.junit.Test;
import study.designpattern.proxy.Student;

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

    @Test
    public void testIterator() {
        List<Student> studentList1 = new ArrayList<>();
        Student stu1 = new Student("Jackie");
        Student stu2 = new Student("Nicky");

        for (Student stu : studentList1) {
            System.out.println(String.format("studentList1 stu=%s", stu));
        }

        List<Student> studentList2 = null;
        for (Student stu : studentList2) {
            System.out.println(String.format("studentList2 stu=%s", stu));
        }
    }

}

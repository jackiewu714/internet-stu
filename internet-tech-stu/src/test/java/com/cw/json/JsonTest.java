package com.cw.json;

import org.junit.Test;

/**
 * @author wuliangzhi  2017/10/12 13:03
 **/
public class JsonTest
{
    @Test
    public void testStudent(){
        Student stu = new Student();
        stu.setId(1);
        stu.setName("jackie");
        stu.setAge(18);
        stu.setNo("02117313");

        System.out.println(stu);
    }

}

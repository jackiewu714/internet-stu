package com.cw.stu.internet.tech.json;

import com.alibaba.fastjson.JSON;

/**
 * @author wuliangzhi  2017/10/12 13:01
 **/
public class Student
{
    private Integer id;
    private String no;
    private String name;
    private int age;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNo()
    {
        return no;
    }

    public void setNo(String no)
    {
        this.no = no;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * 打印字符串.
     *
     * @return String   打印字符串
     */
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + ": " + JSON.toJSONString(this);
    }

}

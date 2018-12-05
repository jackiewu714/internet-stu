package com.cw.stu.java.agent.test.demo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author WuLiangzhi  2018/12/05 16:40
 */
public class CglibProxyAgentTest {

    //main方法中运行
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyTarget.class);
        enhancer.setCallback(new MyInterceptor());
        MyTarget myTarget = (MyTarget) enhancer.create();
        myTarget.printName();

        System.err.println("proxy name: " + myTarget.getClass().getName());
    }

}

package com.cw.stu.spring.aop.proxy;

import com.cw.stu.spring.aop.proxy.impl.UserManagerImpl;

/**
 * 代理测试类
 * @author WuLiangzhi  2018/09/17 13:08
 */
public class ProxyTest {

    public static void main(String[] args) {
        System.out.println("------ cglib proxy begin...-----------------");
        CglibProxy cglibProxy = new CglibProxy();
        IUserManager cglibUserManager = (IUserManager) cglibProxy.createProxyObject(new UserManagerImpl());
        cglibUserManager.addUser("tom", "123456");
        System.out.println("------ cglib proxy end-----------------\n");

        System.out.println("------ jdk dynamic proxy begin...-----------------");
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy();
        IUserManager jdkUserManager = (IUserManager) jdkDynamicProxy.newProxy(new UserManagerImpl());
        jdkUserManager.addUser("tom", "123456");
        System.out.println("------ jdk dynamic proxy end-----------------\n");
    }

}

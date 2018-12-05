package com.cw.stu.java.agent.test.demo.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author WuLiangzhi  2018/12/05 16:37
 */
public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("==== MyInterceptor->intercept() before ====");
        Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("==== MyInterceptor->intercept() end ====");
        return res;
    }
}

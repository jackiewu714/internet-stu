package com.cw.stu.spring.aop.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 * @author WuLiangzhi  2018/09/17 13:00
 */
public class CglibProxy implements MethodInterceptor {

    private Object targetObj; // cglib需要代理的目标对象

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object ret = null;
        if ("addUser".equals(method.getName())) { // 过滤方法
            checkPopedom(); // 检查权限
        }
        ret = method.invoke(targetObj, args);
        return ret;
    }

    /**
     * 创建代理对象
     * @param targetObj Object
     * @return  Object
     */
    public Object createProxyObject(Object targetObj) {
        this.targetObj = targetObj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObj.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return proxyObj; // 返回代理对象
    }

    /**
     * 检查权限
     */
    private void checkPopedom() {
        System.out.println(".:检查权限 checkPopedom()");
    }

}

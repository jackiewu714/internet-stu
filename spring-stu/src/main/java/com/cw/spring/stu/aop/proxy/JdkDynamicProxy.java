package com.cw.spring.stu.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author WuLiangzhi  2018/09/17 12:52
 */
public class JdkDynamicProxy implements InvocationHandler {

    private Object targetObj; //需要代理的目标对象

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        checkPopedom(); // 进行逻辑处理，比方说此处是模拟检查权限
        Object ret = method.invoke(targetObj, args);
        return ret;
    }

    /**
     * 将目标对象传入进行代理
     * @param targetObj Object
     * @return  Object
     */
    public Object newProxy(Object targetObj) {
        this.targetObj = targetObj;
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),
                targetObj.getClass().getInterfaces(), this);
    }

    /**
     * 检查权限
     */
    private void checkPopedom() {
        System.out.println(".:检查权限 checkPopedom()");
    }

}

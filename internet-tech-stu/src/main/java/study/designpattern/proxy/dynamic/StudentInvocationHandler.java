package study.designpattern.proxy.dynamic;

import org.springframework.util.StopWatch;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author WuLiangzhi  2018/12/04 17:22
 */
public class StudentInvocationHandler<T> implements InvocationHandler {

    T target;

    public StudentInvocationHandler(T target) {
        this.target = target;
    }

    /**
     *
     * @param proxy     Object  代表动态代理对象
     * @param method    Method  代表正在执行的方法
     * @param args      Object[]    代表调用目标方法时传入的实参
     * @return  Object
     * @throws Throwable    异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methondDesc = String.format("代理执行 %s 方法", method.getName());
        System.out.println(methondDesc);

        StopWatch stopWatch = new StopWatch();
        stopWatch.start(method.getName());
        Object result = method.invoke(target, args);
        stopWatch.stop();
        System.out.println(methondDesc + " 耗时: " + stopWatch.getLastTaskTimeMillis() + " ms");

        return result;
    }
}

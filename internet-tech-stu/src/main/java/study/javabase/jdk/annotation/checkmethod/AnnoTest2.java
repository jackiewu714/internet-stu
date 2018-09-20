package study.javabase.jdk.annotation.checkmethod;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 注解测试类2
 * @author WuLiangzhi  2018/09/20 22:05
 */
public class AnnoTest2 {

    private String newLine = "\n\r";

    @Test
    public void test1() {
        NoBug noBug = new NoBug();
        Class clazz = noBug.getClass();

        // 获取类中所有的方法
        Method[] methods = clazz.getMethods();

        // 记录异常次数
        int errorNum = 0;
        // 记录测试异常的log信息
        StringBuilder sb = new StringBuilder();

        for (Method method : methods) {
            // 只有被 @CheckMethod 标注过的方法才进行测试
            if (method.isAnnotationPresent(CheckMethod.class)) {
                try {
                    method.invoke(noBug, generateParams(method.getParameterTypes()));
                } catch (Exception e) {
                    e.printStackTrace();
                    errorNum++;

                    sb.append(method.getName()).append("  ").append("has error: ").append(newLine);
                    //记录测试过程中，发生的异常的名称
                    sb.append(" cause by ").append(e.getCause()).append(newLine);
                    //记录测试过程中，发生的异常的具体信息
                    sb.append(e.getMessage()).append(newLine);

                }
            }
        }

        sb.append(clazz.getSimpleName()).append(" has ").append(errorNum).append(" error.");
        // 生成测试报告
        System.out.println(sb);
    }

    /**
     * 生成参数数组
     * @param parameterTypes    Class<?>[]
     * @return  Object[]
     */
    private Object[] generateParams(Class<?>[] parameterTypes){
        if(parameterTypes == null || parameterTypes.length == 0) {
            return null;
        }

        List<Object> paramList = new ArrayList<Object>();
        for (Class clazz : parameterTypes) {
            try {
                Object obj = Class.forName(clazz.getName()).newInstance();
                paramList.add(obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
//            paramList.add(new Object());
        }

        return paramList.toArray();
    }

}

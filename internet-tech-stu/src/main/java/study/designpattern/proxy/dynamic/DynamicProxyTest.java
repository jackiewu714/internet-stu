package study.designpattern.proxy.dynamic;

import study.designpattern.proxy.Person;
import study.designpattern.proxy.Student;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理测试类
 * @author WuLiangzhi  2018/12/04 17:37
 */
public class DynamicProxyTest {

    /**
     * 创建动态代理了文件
     */
    private static void createDynamicProxyClassFile() {
        String fileName = "PersonProxy$Proxy0";
        byte[] proxyClassFileBytes = ProxyGenerator.generateProxyClass(fileName, new Class[]{Person.class});

        String path = "F:/study/github/java/internet-stu/internet-tech-stu/target/classes/study/designpattern/proxy/dynamic/" + fileName + ".class";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            fos.write(proxyClassFileBytes);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        //创建被代理对象
        Person zhangsan = new Student("张三");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StudentInvocationHandler<Person>(zhangsan);

        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, stuHandler);

        //代理执行上交班费的方法
        stuProxy.giveMoney();

        //创建动态代理了文件
        createDynamicProxyClassFile();
    }

}

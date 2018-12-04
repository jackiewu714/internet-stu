package study.designpattern.proxy.statics;

import study.designpattern.proxy.Person;
import study.designpattern.proxy.Student;

/**
 * 静态代理测试类
 * @author WuLiangzhi  2018/12/04 16:40
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        //被代理的学生张三，他的班费上交由班长(monitor)代理完成
        Person zhangsan = new Student("张三");

        //生成代理对象(班长)，并将张三传给代理对象
        Person monitor = new StudentProxy(zhangsan);

        //班长代理上交班费
        monitor.giveMoney();
    }

}

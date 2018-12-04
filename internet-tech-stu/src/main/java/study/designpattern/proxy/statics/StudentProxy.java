package study.designpattern.proxy.statics;

import study.designpattern.proxy.Person;
import study.designpattern.proxy.Student;

/**
 * 学生代理类，也实现了Person接口，保存一个学生实体，这样就可以代理学生的行为
 * @author WuLiangzhi  2018/12/04 16:28
 */
public class StudentProxy implements Person {

    /**
     * 被代理的学生
     */
    private Student student;

    public StudentProxy(Person person) {
        //只代理学生对象
        if (person instanceof Student) {
            this.student = (Student) person;
        } else {
            System.err.println("被委托的对象不是学生，person=" + person);
        }
    }

    /**
     * 上交班费，调用被代理学生的上交班费行为
     */
    @Override
    public void giveMoney() {
        if (this.student == null) {
            System.err.println("被委托的学生对象为空");
            return;
        }
        this.student.giveMoney();
    }

}

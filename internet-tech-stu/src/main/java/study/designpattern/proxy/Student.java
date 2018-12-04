package study.designpattern.proxy;

/**
 * @author WuLiangzhi  2018/12/04 16:20
 */
public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(String.format("%s 上交班费50元。", name));
    }

}

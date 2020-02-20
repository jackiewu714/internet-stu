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

    /**
     * 获取 name 属性
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 name 属性
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}

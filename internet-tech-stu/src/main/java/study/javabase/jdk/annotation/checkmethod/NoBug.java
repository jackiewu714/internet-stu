package study.javabase.jdk.annotation.checkmethod;

/**
 * @author WuLiangzhi  2018/09/20 21:58
 */
public class NoBug {

    @CheckMethod
    public void printMsg(String msg) {
        System.out.println("printMsg: " + msg);
    }

    @CheckMethod
    public void add() {
        System.out.println(String.format("add 1+1=%s", 1+1));
    }

    @CheckMethod
    public void subtract() {
        System.out.println(String.format("subtract 7-1=%s", 7-1));
    }

    @CheckMethod
    public void multiply() {
        System.out.println(String.format("multiply 3*5=%s", 3*5));
    }

    @CheckMethod
    public void divide() {
        System.out.println(String.format("divide 9/0=%s", 9/0));
    }

    public void introduce(String name) {
        System.out.println("大家好，我是 " + name);
    }

}

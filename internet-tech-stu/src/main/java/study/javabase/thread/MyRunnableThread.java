package study.javabase.thread;

/**
 * 实现 Runnable 接口
 * @author WuLiangzhi  2020/03/26 18:41
 */
public class MyRunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnableThread run");
    }

    public static void main(String[] args) {
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        myRunnableThread.run();
    }

}

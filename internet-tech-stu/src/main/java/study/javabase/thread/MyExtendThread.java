package study.javabase.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 继承 Thread 类
 * @author WuLiangzhi  2020/03/26 18:40
 */
public class MyExtendThread extends Thread{

    private int num;

    public MyExtendThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("MyExtendThread run, num=" + num);
    }

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();

        new MyExtendThread(atomicInteger.addAndGet(1)).start();
        new MyExtendThread(atomicInteger.addAndGet(1)).start();
        new MyExtendThread(atomicInteger.addAndGet(1)).start();
    }

}

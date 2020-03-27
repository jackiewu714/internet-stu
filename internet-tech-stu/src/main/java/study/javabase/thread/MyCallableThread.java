package study.javabase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 实现 Callable 接口
 * @author WuLiangzhi  2020/03/26 18:41
 */
public class MyCallableThread implements Callable<Integer> {

    private int num;

    public MyCallableThread(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        int addRet = ++num;
        System.out.println("MyCallableThread run, addRet=" + addRet);
        return addRet;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        MyCallableThread myCallableThread = new MyCallableThread(atomicInteger.getAndIncrement());

        FutureTask<Integer> task = new FutureTask<>(myCallableThread);
        task.run();
        Integer result = task.get();
        System.out.println("result = " + result);

    }

}

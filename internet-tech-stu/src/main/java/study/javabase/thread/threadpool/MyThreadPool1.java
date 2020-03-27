package study.javabase.thread.threadpool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author WuLiangzhi  2020/03/27 9:16
 */
public class MyThreadPool1 {

    public void testMultiThread() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 3000; i++) {
            Thread thread = new Thread(){
                @Override
                public void run() {
                    atomicInteger.incrementAndGet();
                }
            };
            thread.start();
            thread.join();
        }

        long end = System.currentTimeMillis();
        System.out.println(String.format("testMultiThread，atomicInteger=%s, cost %s millisecond.", atomicInteger.get(), (end-start)));
    }

    public void testThreadPool() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        long start = System.currentTimeMillis();
        ExecutorService executorService = new ThreadPoolExecutor(1,1,5, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1024));
        for (int i = 0; i < 3000; i++) {
            Thread thread = new Thread(){
                @Override
                public void run() {
                    atomicInteger.incrementAndGet();
                }
            };
            executorService.submit(thread);
        }

        executorService.shutdown();
        long end = System.currentTimeMillis();
        System.out.println(String.format("testThreadPool，atomicInteger=%s, cost %s millisecond.", atomicInteger.get(), (end-start)));
    }

    public static void main(String[] args) {
        MyThreadPool1 myThreadPool1 = new MyThreadPool1();
        try {
            myThreadPool1.testMultiThread();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            myThreadPool1.testThreadPool();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

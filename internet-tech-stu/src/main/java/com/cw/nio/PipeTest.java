package com.cw.nio;

import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.util.concurrent.*;

/**
 * Java NIO 管道是2个线程之间的单向数据连接。Pipe有一个source通道和一个sink通道。数据会被写到sink通道，从source通道读取。
 * @author WuLiangzhi  2018/09/13 12:45
 */
public class PipeTest {

    @Test
    public void testPipe() {
        Pipe pipe;
        ExecutorService exec = Executors.newFixedThreadPool(2);

        try {
            pipe = Pipe.open();
            final Pipe pipeTemp = pipe;
            exec.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    Pipe.SinkChannel sinkChannel = pipeTemp.sink(); //向通道中写数据
                    while (true) {
                        TimeUnit.SECONDS.sleep(1);
                        String sendMsg = "Pipe test at time " + System.currentTimeMillis();
                        System.out.println("SinkChannel sendMsg:" + sendMsg);

                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        buffer.clear();
                        buffer.put(sendMsg.getBytes("UTF-8"));
                        buffer.flip();

                        while (buffer.hasRemaining()) {
                            System.out.println(buffer);
                            sinkChannel.write(buffer);
                        }

                    }
                }
            });

            exec.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    Pipe.SourceChannel sourceChannel = pipeTemp.source(); //从通道中读数据
                    while (true) {
                        TimeUnit.SECONDS.sleep(1);
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        buffer.clear();
                        int bytesRead = sourceChannel.read(buffer);
                        System.out.println("bytesRead=" + bytesRead);
                        while (bytesRead > 0) {
                            buffer.flip();
                            byte[] data = new byte[bytesRead];
                            int i=0;
                            while (buffer.hasRemaining()) {
                                data[i] = buffer.get();
                                i++;
                            }

                            String receiveMsg = new String(data);
                            System.out.println("SourceChannel receiveMsg:" + receiveMsg);

                            bytesRead = sourceChannel.read(buffer);
                        }
                    }
                }
            });

            System.in.read(); //阻塞主线程
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            exec.shutdown();
        }
    }

}

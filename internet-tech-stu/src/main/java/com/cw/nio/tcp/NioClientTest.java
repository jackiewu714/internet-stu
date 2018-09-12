package com.cw.nio.tcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

/**
 * NIO 客户端
 * @author WuLiangzhi  2018/09/12 21:28
 */
public class NioClientTest {

    private static final Logger logger = LoggerFactory.getLogger(NioClientTest.class);

    public void client() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        SocketChannel socketChannel = null;
        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.connect(new InetSocketAddress("127.0.0.1", 8080));
            if (socketChannel.finishConnect()) {
                int i=0;
                while (true) {
                    TimeUnit.SECONDS.sleep(1);
                    String info = String.format("I'm %s-th information from client.", i++);
                    System.out.println("client: " + info);
                    buffer.clear();
                    buffer.put(info.getBytes());
                    buffer.flip();
                    while (buffer.hasRemaining()) {
                        System.out.println(buffer);
                        socketChannel.write(buffer);
                    }
                }
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (socketChannel != null) {
                try {
                    socketChannel.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }

    }

    public static void main(String[] args) {
        NioClientTest nioClientTest = new NioClientTest();
        nioClientTest.client();
    }

}

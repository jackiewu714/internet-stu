package com.cw.stu.internet.tech.nio.tcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * NIO 客户端
 *
 * @author WuLiangzhi  2018/09/12 21:28
 */
public class NioClientTest2 {

    private static final Logger logger = LoggerFactory.getLogger(NioClientTest2.class);

    private Selector selector;
    private final static int PORT = 8080;
    private final static int BUF_SIZE = 1024;
    private static final int TIMEOUT = 1000;
    private static ByteBuffer buffer = ByteBuffer.allocate(BUF_SIZE);

    private int count = 0;

    public void initClient() {
        SocketChannel clientChannel = null;
        try {
            selector = Selector.open();

            clientChannel = SocketChannel.open();
            clientChannel.configureBlocking(false);
            clientChannel.connect(new InetSocketAddress(8080));
            clientChannel.register(selector, SelectionKey.OP_CONNECT);

            while (true) {
//                selector.select();
                if (selector.select(TIMEOUT) == 0) {
                    System.out.println("client waiting =======================");
                    continue;
                }
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();
                    if (selectionKey.isConnectable()) {
                        doConnect(selectionKey);
                    } else if(selectionKey.isReadable()){
                        doRead(selectionKey);
                    }

                }
            }

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (clientChannel != null) {
                try {
                    clientChannel.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }

    }

    private void doConnect(SelectionKey selectionKey) throws IOException {
        SocketChannel clientChannel = (SocketChannel) selectionKey.channel();
        if (clientChannel.isConnectionPending()) {
            clientChannel.finishConnect();
        }

        clientChannel.configureBlocking(false);
//        String sendMsg = "服务端你好！";
        String sendMsg = String.format("I'm %s-th information from client.", count++);
        System.out.println("发送到服务端的消息: " + sendMsg);
        buffer.clear();
        buffer.put(sendMsg.getBytes("UTF-8"));
        buffer.flip();
        clientChannel.write(buffer);
        clientChannel.close();
    }

    private void doRead(SelectionKey selectionKey) throws IOException {
        SocketChannel clientChannel = (SocketChannel) selectionKey.channel();
        clientChannel.read(buffer);
        byte[] data = buffer.array();
        String receiveMsg = new String(data).trim();
        System.out.println("服务端发送消息: " + receiveMsg);

        clientChannel.close();
        selectionKey.selector().close();
    }

    public static void main(String[] args) {
        NioClientTest2 nioClientTest = new NioClientTest2();
        nioClientTest.initClient();
    }

}

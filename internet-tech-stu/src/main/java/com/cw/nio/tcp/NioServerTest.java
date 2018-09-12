package com.cw.nio.tcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * NIO 服务端
 *
 * @author WuLiangzhi  2018/09/12 22:20
 */
public class NioServerTest {

    private static final Logger logger = LoggerFactory.getLogger(NioServerTest.class);

    private static final int BUF_SIZE = 1024;
    private static final int PORT = 8080;
    private static final int TIMEOUT = 3000;

    private void handleAccept(SelectionKey selectionKey) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
        System.out.println("ServerSocketChannel 正在循环监听");
        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        socketChannel.register(selectionKey.selector(), SelectionKey.OP_READ);
    }

    private void handleRead(SelectionKey selectionKey) {
        SocketChannel socketChannel = null;
        ByteBuffer buffer = null;
        try {
            socketChannel = (SocketChannel) selectionKey.channel();
            buffer = ByteBuffer.allocate(BUF_SIZE);
            long bytesRead = socketChannel.read(buffer);
            while (bytesRead > 0) {
                buffer.flip();
                byte[] data = buffer.array();
                String info = new String(data).trim();
                System.out.println("从客户端发送过来的消息是: " + info);
                buffer.clear();
                bytesRead = socketChannel.read(buffer);
            }

            if (bytesRead == -1) {
                System.out.println("从客户端发送过来的消息读取完毕");
                selectionKey.cancel();
                socketChannel.close();
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
//            try {
//                if (socketChannel != null) {
//                    socketChannel.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }

    private void handleWrite(SelectionKey selectionKey) throws IOException {
        ByteBuffer buffer = (ByteBuffer) selectionKey.attachment();
        buffer.flip();
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        while (buffer.hasRemaining()) {
            socketChannel.write(buffer);
        }
        buffer.compact();
    }

    public void selector() {
        Selector selector = null;
        ServerSocketChannel serverSocketChannel = null;

        try {
            selector = Selector.open();

            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.socket().bind(new InetSocketAddress(PORT));
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {
                if (selector.select(TIMEOUT) == 0) {
                    System.out.println("server waiting =======================");
                    continue;
                }

                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    if (!selectionKey.isValid()) {
                        System.out.println("selectionKey 无效, selectionKey=" + selectionKey);
                        continue;
                    }
                    if (selectionKey.isAcceptable()) {
                        handleAccept(selectionKey);
                    }

                    if (selectionKey.isReadable()) {
                        handleRead(selectionKey);
                    }

                    if (selectionKey.isValid() && selectionKey.isWritable()) {
                        handleWrite(selectionKey);
                    }

                    if (selectionKey.isValid() && selectionKey.isConnectable()) {
                        System.out.println("连接成功");
                    }

                    iterator.remove();
                }
            }

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (selector != null) {
                    selector.close();
                }
                if (serverSocketChannel != null) {
                    serverSocketChannel.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }

    }

    public static void main(String[] args) {
        NioServerTest nioServerTest = new NioServerTest();
        nioServerTest.selector();
    }

}

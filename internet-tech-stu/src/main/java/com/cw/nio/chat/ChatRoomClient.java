package com.cw.nio.chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 网络多客户端聊天室 - 客户端
 * @author WuLiangzhi  2018/09/14 22:47
 */
public class ChatRoomClient {

    private Selector selector;
    private Charset charset = Charset.forName("UTF-8");
    private SocketChannel sc = null;
    private String name = "";

    public void init() {
        try {
            selector = Selector.open();

            //远程主机的IP和端口
            InetSocketAddress socketAddress = new InetSocketAddress(ChatConstant.HOST, ChatConstant.PORT);
            sc = SocketChannel.open(socketAddress);
            sc.configureBlocking(false);
            sc.register(selector, SelectionKey.OP_READ);

            // 开辟一个新线程来读取服务器端返回的数据
            new Thread(new ClientThread()).start();

            //在主线程中，从键盘读取数据输入到服务器端
            Scanner scan = new Scanner(System.in);

            System.out.println("客户端准备就绪，可以开始聊天了。");
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if ("".equals(line)) { //不允许发空消息
                    continue;
                }
                if ("".equals(name)) {
                    name = line;
                    line = name + ChatConstant.USER_CONTENT_SPLIT;
                } else {
                    line = name + ChatConstant.USER_CONTENT_SPLIT + line;
                }

                //sc既能写也能读，这边是写
                sc.write(charset.encode(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 客户端线程
     */
    private class ClientThread implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    int readChannel = selector.select();
                    if (readChannel == 0) {
                        continue;
                    }

                    Set<SelectionKey> set = selector.selectedKeys();
                    Iterator<SelectionKey> iterator = set.iterator();
                    while (iterator.hasNext()) {
                        SelectionKey selectionKey = iterator.next();
                        iterator.remove();

                        // 处理 SelectionKey 的各种事件
                        handleSelectionKey(selectionKey);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

        /**
         * 处理 SelectionKey 的各种事件
         * @param selectionKey  SelectionKey
         */
        private void handleSelectionKey(SelectionKey selectionKey) {
            if (selectionKey.isReadable()) {
                // 实用 NIO 读取 Channel 中的数据，这个和全局变量sc是一样的，因为只注册了一个 SocketChannel
                // sc既能读也能写，这里是读
                SocketChannel sc = (SocketChannel) selectionKey.channel();

                ByteBuffer buffer = ByteBuffer.allocate(1024);
                StringBuilder content = new StringBuilder();
                try {
                    while (sc.read(buffer) > 0) {
                        buffer.flip();
                        content.append(charset.decode(buffer));
                    }

                    // 若系统发送通知名字已经存在，则需要换个昵称
                    if (ChatConstant.USER_EXIST.equals(content)) {
                        name = "";
                    }
                    System.out.println(content);
                    selectionKey.interestOps(SelectionKey.OP_READ);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new ChatRoomClient().init();
    }

}

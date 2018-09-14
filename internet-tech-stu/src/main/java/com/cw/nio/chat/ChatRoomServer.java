package com.cw.nio.chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 网络多客户端聊天室 - 服务端
 * 功能1： 客户端通过Java NIO连接到服务端，支持多客户端的连接
 * 功能2：客户端初次连接时，服务端提示输入昵称，如果昵称已经有人使用，提示重新输入，如果昵称唯一，则登录成功，之后发送消息都需要按照规定格式带着昵称发送消息
 * 功能3：客户端登录后，发送已经设置好的欢迎信息和在线人数给客户端，并且通知其他客户端该客户端上线
 * 功能4：服务器收到已登录客户端输入内容，转发至其他登录客户端。
 * <p>
 * TODO 客户端下线检测
 *
 * @author WuLiangzhi  2018/09/14 21:35
 */
public class ChatRoomServer {

    private Selector selector = null;
    private Charset charset = Charset.forName("UTF-8");
    private static HashSet<String> users = new HashSet<String>(); //用来记录在线人数，以及昵称
    private static boolean flag = false;

    public void init() {
        try {
            selector = Selector.open();

            InetSocketAddress socketAddress = new InetSocketAddress(ChatConstant.HOST, ChatConstant.PORT);
            ServerSocketChannel server = ServerSocketChannel.open();
            server.bind(socketAddress);
            // 非阻塞的方式
            server.configureBlocking(false);
            // 注册到选择器上，设置为监听状态
            server.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("Server is listening now...");

            while (true) {
                int readyChannels = selector.select();
                if (readyChannels == 0) {
                    continue;
                }

                // 获取可用通道的集合
                Set<SelectionKey> set = selector.selectedKeys();
                Iterator<SelectionKey> iterator = set.iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    iterator.remove();
                    handleSelectionKey(server, selectionKey);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 处理 SelectionKey 的各种事件
     * @param server        ServerSocketChannel
     * @param selectionKey  SelectionKey
     */
    public void handleSelectionKey(ServerSocketChannel server, SelectionKey selectionKey) {
        // 处理来自客户端的接收请求
        if (selectionKey.isAcceptable()) {
            try {
                SocketChannel sc = server.accept();
                // 非阻塞模式
                sc.configureBlocking(false);
                // 注册选择器，并设置为读取模式，收到一个连接请求，然后起一个SocketChannel, 并注册到selector上，
                // 之后这个连接的数据，就由这个SocketChannel处理
                sc.register(selector, SelectionKey.OP_READ);

                // 将此对应的channel设置为准备接收其他客户端请求
                selectionKey.interestOps(SelectionKey.OP_ACCEPT);
                System.out.println("Server is listening from client: " + sc.getRemoteAddress());
                sc.write(charset.encode("Please input you name:"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 处理来自客户端的数据读取请求
        if (selectionKey.isReadable()) {
            // 返回该SelectionKey对应的Channel，其中有数据需要读取
            SocketChannel sc = (SocketChannel) selectionKey.channel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            StringBuilder content = new StringBuilder();

            try {
                while (sc.read(buffer) > 0) {
                    buffer.flip();
                    content.append(charset.decode(buffer));
                }
                System.out.println("Server is listening from client " + sc.getRemoteAddress() + ", data receive is:" + content);
                // 将此对应的channel设置为准备下一次接收数据
                selectionKey.interestOps(SelectionKey.OP_READ);
            } catch (IOException e) {
                e.printStackTrace();

                selectionKey.cancel();
                try {
                    if (selectionKey.channel() != null) {
                        selectionKey.channel().close();
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            if (content.length() > 0) {
                String[] strArr = content.toString().split(ChatConstant.USER_CONTENT_SPLIT);
                try {
                    // 注册用户
                    if (strArr != null && strArr.length == 1) {
                        String name = strArr[0];
                        if (users.contains(name)) {
                            sc.write(charset.encode(ChatConstant.USER_EXIST));
                        } else {
                            users.add(name);
                            int num = onlineNum(selector);
                            String msg = String.format("Welcome %s to chat room! Online number is %s", name, num);
                            broadCast(selector, null, msg);
                        }
                    }
                    // 注册完了，发送消息
                    else if (strArr != null && strArr.length > 1) {
                        String name = strArr[0];
                        String msg = content.toString().substring(name.length() + ChatConstant.USER_CONTENT_SPLIT.length());
                        msg = String.format("%s say: %s", name, msg);
                        if (users.contains(name)) {
                            // 不回发给发送此内容的客户端
                            broadCast(selector, sc, msg);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * TODO 要是能检测下线，就不用这么统计了
     * @param selector  Selector
     * @return  int 在线人数
     */
    public static int onlineNum(Selector selector) {
        int res = 0;
        for (SelectionKey key : selector.keys()) {
            Channel targetChannel = key.channel();
            if (targetChannel instanceof SocketChannel) {
                res++;
            }
        }
        return res;
    }

    /**
     * 广播数据到所有的SocketChannel中
     * @param selector  Selector
     * @param except    SocketChannel   需排除的通道
     * @param content   String          发送消息
     * @throws IOException  IO异常
     */
    private void broadCast(Selector selector, SocketChannel except, String content) throws IOException {
        // 广播数据到所有的SocketChannel中
        for (SelectionKey key : selector.keys()) {
            Channel targetChannel = key.channel();
            if (targetChannel instanceof SocketChannel && targetChannel != except) {
                SocketChannel destChannel = (SocketChannel) targetChannel;
                destChannel.write(charset.encode(content));
            }
        }
    }

    public static void main(String[] args) {
        new ChatRoomServer().init();
    }

}

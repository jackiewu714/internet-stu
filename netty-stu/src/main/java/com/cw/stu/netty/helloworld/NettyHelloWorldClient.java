package com.cw.stu.netty.helloworld;

import com.cw.stu.netty.common.Constants;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Netty Hello World Client
 *
 * @author WuLiangzhi  2019/07/14 10:54
 */
public class NettyHelloWorldClient {

    private static final Logger logger = LoggerFactory.getLogger(NettyHelloWorldClient.class);

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            MyThread myThread = new MyThread(Constants.HOST, Constants.PORT);

            executorService.submit(myThread);
        }

//        executorService.shutdownNow();
    }

    static class MyThread implements Runnable{

        private String host;
        private int port;

        public MyThread(String host, int port) {
            this.host = host;
            this.port = port;
        }

        @Override
        public void run() {
            connect(host, port);
        }

        private void connect(String host, int port) {
            //配置客户端 NIO 线程组/池
            EventLoopGroup group = new NioEventLoopGroup();

            // Bootstrap 与 ServerBootstrap 都继承(extends)于 AbstractBootstrap
            // 创建客户端辅助启动类,并对其配置,与服务器稍微不同，这里的 Channel 设置为 NioSocketChannel
            // 然后为其添加 Handler，这里直接使用匿名内部类，实现 initChannel 方法
            // 作用是当创建 NioSocketChannel 成功后，在进行初始化时,将它的ChannelHandler设置到ChannelPipeline中，用于处理网络I/O事件
            Bootstrap bootstrap = new Bootstrap();

            bootstrap.group(group).channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new NettyHelloWorldClientHandler());
                        }
                    });

            try {
                ChannelFuture channelFuture = bootstrap.connect(host, port).sync();
                logger.info("{} 客户端发起异步连接..........", Thread.currentThread().getName());

                // 等待客户端链路关闭
                channelFuture.channel().closeFuture().sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
                logger.error(e.getMessage(), e);
            } finally {
                // 优雅退出，释放NIO线程组
                group.shutdownGracefully();
            }
        }
    }

}

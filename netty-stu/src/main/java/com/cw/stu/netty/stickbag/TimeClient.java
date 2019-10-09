package com.cw.stu.netty.stickbag;

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

/**
 * @author WuLiangzhi  2019/10/09 10:11
 */
public class TimeClient {

    private static final Logger logger = LoggerFactory.getLogger(TimeClient.class);

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            new Thread(new MyThread()).start();
        }
    }

    private static class MyThread implements Runnable{

        @Override
        public void run() {
            connect(Constants.HOST, Constants.PORT);
        }

        private void connect(String host, int port) {
            //配置客户端 NIO 线程组/池
            EventLoopGroup group = new NioEventLoopGroup();

            /*
             * Bootstrap 与 ServerBootstrap 都继承(extends)于 AbstractBootstrap
             * 创建客户端辅助启动类,并对其配置,与服务器稍微不同，这里的 Channel 设置为 NioSocketChannel
             * 然后为其添加 Handler，这里直接使用匿名内部类，实现 initChannel 方法
             * 作用是当创建 NioSocketChannel 成功后，在进行初始化时,将它的ChannelHandler设置到ChannelPipeline中，用于处理网络I/O事件
             */
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ClientChildChannelHandler());

            try {
                //connect：发起异步连接操作，调用同步方法 sync 等待连接成功
                ChannelFuture future = bootstrap.connect(host, port).sync();
                System.out.println(Thread.currentThread().getName() + ", 客户端发起异步连接......");

                //等待客户端链路关闭
                future.channel().closeFuture().sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
                logger.error(e.getMessage(), e);
            } finally {
                //优雅退出，释放NIO线程组
                group.shutdownGracefully();
            }
        }

    }

    private static class ClientChildChannelHandler extends ChannelInitializer<SocketChannel> {

        @Override
        protected void initChannel(SocketChannel socketChannel) throws Exception {
            socketChannel.pipeline().addLast(new TimeClientHandler());
        }
    }

}

package com.cw.stu.netty.stickbag.fixedlength;

import com.cw.stu.netty.common.Constants;
import com.cw.stu.netty.stickbag.delimiterbased.DelimiterBasedTimeClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

/**
 * @author WuLiangzhi  2019/10/09 10:11
 */
public class FixedLengthTimeClient {

    private static final Logger logger = LoggerFactory.getLogger(FixedLengthTimeClient.class);

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
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
            /*
             * 与服务器同理
             * FixedLengthFrameDecoder(int frameLength)： frameLength：指定单条消息的长度
             * 为了测试结果明显，这里设置消息长度为 64 字节，实际应用中应该根据时间情况进行设置，比如 1024 字节
             */
            logger.info("{}, 客户端初始化通道...", Thread.currentThread().getName());

            socketChannel.pipeline().addLast(new FixedLengthFrameDecoder(64));
            socketChannel.pipeline().addLast(new StringDecoder(Constants.CHARSET));
            socketChannel.pipeline().addLast(new FixedLengthTimeClientHandler());
        }
    }

}

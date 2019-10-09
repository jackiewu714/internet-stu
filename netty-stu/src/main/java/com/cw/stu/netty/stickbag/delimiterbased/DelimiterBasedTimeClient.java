package com.cw.stu.netty.stickbag.delimiterbased;

import com.cw.stu.netty.common.Constants;
import com.cw.stu.netty.stickbag.linebased.LineBasedTimeClientHandler;
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
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WuLiangzhi  2019/10/09 10:11
 */
public class DelimiterBasedTimeClient {

    private static final Logger logger = LoggerFactory.getLogger(DelimiterBasedTimeClient.class);

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
             * 创建分隔符缓冲对象 ByteBuf，使用自定义的 "$_" 作为消息结束符，自己也可以定义为其它的字符作为结束符
             *
             * DelimiterBasedFrameDecoder(int maxFrameLength, ByteBuf delimiter)
             * DelimiterBasedFrameDecoder(int maxFrameLength, ByteBuf... delimiters)
             * 分隔符解码器重载了好几个构造器方法，其中常用的就是上面这两个
             *      maxFrameLength：单条消息的最大长度,当达到该长度后仍然没有查找到分隔符时，则抛出 TooLongFrameException 异常
             *      防止由于异常码流缺失分隔符导致内存溢出（亲测 Netty 4.1 版本，服务器并未抛出异常，而是客户端被强制断开连接了）
             *      delimiter：分隔符缓冲对象,第二个构造器可见可以指定多个结束符
             */
            logger.info("{}, 客户端初始化通道...", Thread.currentThread().getName());

            ByteBuf byteBuf = Unpooled.copiedBuffer(Constants.DELIMITER_SEPARATOR.getBytes());
            socketChannel.pipeline().addLast(new DelimiterBasedFrameDecoder(1024, byteBuf));
            socketChannel.pipeline().addLast(new StringDecoder());
            socketChannel.pipeline().addLast(new DelimiterBasedTimeClientHandler());
        }
    }

}

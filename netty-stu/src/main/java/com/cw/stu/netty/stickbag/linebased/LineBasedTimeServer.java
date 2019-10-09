package com.cw.stu.netty.stickbag.linebased;

import com.cw.stu.netty.common.Constants;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WuLiangzhi  2019/10/08 16:32
 */
public class LineBasedTimeServer {

    private static final Logger logger = LoggerFactory.getLogger(LineBasedTimeServer.class);

    public static void main(String[] args) {
        new LineBasedTimeServer().bind(Constants.PORT);
    }

    public void bind(int port) {
        /*
         * interface EventLoopGroup extends EventExecutorGroup extends ScheduledExecutorService extends ExecutorService
         * 配置服务端的 NIO 线程池,用于网络事件处理，实质上他们就是 Reactor 线程组
         * bossGroup 用于服务端接受客户端连接，workerGroup 用于进行 SocketChannel 网络读写
         */
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        //ServerBootstrap 是 Netty 用于启动 NIO 服务端的辅助启动类，用于降低开发难度
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024)
                .childHandler(new ServerChildChannelHandler());

        try {
            //服务器启动辅助类配置完成后，调用 bind 方法绑定监听端口，调用 sync 方法同步等待绑定操作完成
            ChannelFuture future = bootstrap.bind(port).sync();

            System.out.println(Thread.currentThread().getName() + ", 服务器开始监听端口，等待客户端连接.........");

            //下面会进行阻塞，等待服务器连接关闭之后 main 方法退出，程序结束
            future.channel().closeFuture().sync();

        } catch (InterruptedException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        } finally {
            //优雅退出，释放线程池资源
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }

    }

    private class ServerChildChannelHandler extends ChannelInitializer<SocketChannel> {

        @Override
        protected void initChannel(SocketChannel socketChannel) throws Exception {
            //添加 LineBasedFrameDecoder 与 StringDecoder解码器
            socketChannel.pipeline().addLast(new LineBasedFrameDecoder(1024));
            socketChannel.pipeline().addLast(new StringDecoder());
            socketChannel.pipeline().addLast(new LineBasedTimeServerHandler());
        }
    }

}

package com.cw.stu.netty.helloworld;

import com.cw.stu.netty.common.Constants;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Netty Hello World Client Handler
 *
 * @author WuLiangzhi  2019/07/14 10:54
 */
public class NettyHelloWorldClientHandler extends ChannelInboundHandlerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(NettyHelloWorldClientHandler.class);

    /**
     * 当客户端和服务端 TCP 链路建立成功之后，Netty 的 NIO 线程会调用 channelActive 方法
     * @param ctx   ChannelHandlerContext
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        String reqMsg = "我是客户端 " + Thread.currentThread().getName();
        byte[] byteArr = reqMsg.getBytes();
        ByteBuf reqByteBuf = Unpooled.buffer(byteArr.length);

        // writeBytes：将指定的源数组的数据传输到缓冲区
        // 调用 ChannelHandlerContext 的 writeAndFlush 方法将消息发送给服务器
        reqByteBuf.writeBytes(byteArr);

        ctx.writeAndFlush(reqByteBuf);
    }

    /**
     * 当服务端返回应答消息时，channelRead 方法被调用，从 Netty 的 ByteBuf 中读取并打印应答消息
     * @param ctx   ChannelHandlerContext
     * @param msg   Object
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        byte[] byteArr = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(byteArr);

        String body = new String(byteArr, Constants.ENCODING);
        logger.info("{}, Server return message: {}", Thread.currentThread().getName(), body);
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 当发生异常时，关闭 ChannelHandlerContext，释放和它相关联的句柄等资源
        logger.error("Unexcepted exception from downstream, 原因:", cause);
        super.exceptionCaught(ctx, cause);
    }
}

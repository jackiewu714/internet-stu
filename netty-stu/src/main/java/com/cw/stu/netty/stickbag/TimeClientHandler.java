package com.cw.stu.netty.stickbag;

import com.cw.stu.netty.common.Constants;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author WuLiangzhi  2019/10/09 11:22
 * 用于对网络事件进行读写操作
 */
public class TimeClientHandler extends ChannelInboundHandlerAdapter {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 因为 Netty 采用线程池，所以这里使用原子操作类来进行计数
     */
    private static AtomicInteger atomicInteger = new AtomicInteger();

    /**
     * 当客户端和服务端 TCP 链路建立成功之后，Netty 的 NIO 线程会调用 channelActive 方法
     *
     * @param ctx   ChannelHandlerContext
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for (int i = 0; i < 5; i++) {
            String respMsg = "我是客户端 " + Thread.currentThread().getName();
            byte[] respMsgBytes = respMsg.getBytes(Constants.ENCODING);
            ByteBuf respByteBuf = Unpooled.buffer(respMsgBytes.length);

            /*
             * writeBytes：将指定的源数组的数据传输到缓冲区
             * 调用 ChannelHandlerContext 的 writeAndFlush 方法将消息发送给服务器
             */
            respByteBuf.writeBytes(respMsgBytes);
            ctx.writeAndFlush(respByteBuf);
        }
    }

    /**
     * 当服务端返回应答消息时，channelRead 方法被调用，从 Netty 的 ByteBuf 中读取并打印应答消息
     *
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
//        System.out.println(atomicInteger.addAndGet(1) + "---" + Thread.currentThread().getName()
//                + ", server return message: " + body);
        logger.info("读取服务端消息: {}--->{}, server return message: {}", atomicInteger.addAndGet(1),
                Thread.currentThread().getName(), body);
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //释放资源
        ctx.close();
    }
}

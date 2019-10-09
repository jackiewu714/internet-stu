package com.cw.stu.netty.stickbag.linebased;

import com.cw.stu.netty.common.Constants;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author WuLiangzhi  2019/10/08 16:48
 *
 * ChannelInboundHandlerAdapter extends ChannelHandlerAdapter 用于对网络事件进行读写操作
 */
public class LineBasedTimeServerHandler extends ChannelInboundHandlerAdapter {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 因为多线程，所以使用原子操作类来进行计数
     */
    private static AtomicInteger atomicInteger = new AtomicInteger();

    /**
     * 收到客户端消息，自动触发
     * @param ctx   ChannelHandlerContext
     * @param msg   Object
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        /*
         * 这个 msg 已经是解码成功的消息，所以不再需要像以前一样使用 ByteBuf 进行编码
         * 直接转为 string 字符串即可
         */
        String body = (String) msg;
//        System.out.println(atomicInteger.addAndGet(1) + "--->" + Thread.currentThread().getName()
//                + ", The server receive order: " + body);

        logger.info("读取客户端消息：{}--->{}, the server receive msg from client: {}", atomicInteger.addAndGet(1),
                Thread.currentThread().getName(), body);

        /*
         * 回复消息
         * copiedBuffer：创建一个新的缓冲区，内容为里面的参数
         * 通过 ChannelHandlerContext 的 write 方法将消息异步发送给客户端
         *
         * 注意：解决 TCP 粘包的策略之一就是：在包尾增加回车换行符进行分割
         * System.getProperty("line.separator");屏蔽了 Windows和Linux的区别
         * windows 系统上回车换行符 "\n",Linux 系统上是 "/n"
         */
        String respMsg = "I'am server, 消息接收 success! " + Thread.currentThread().getName()
                + System.getProperty(Constants.LINE_SEPARATOR);
        ByteBuf respByteBuf = Unpooled.copiedBuffer(respMsg.getBytes());

        //每次写的时候，同时刷新，防止 TCP 粘包
        ctx.writeAndFlush(respByteBuf);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.info("-----客户端关闭:{}", ctx.channel().remoteAddress());
        //当发生异常时，关闭 ChannelHandlerContext，释放和它相关联的句柄等资源
        ctx.close();
    }
}

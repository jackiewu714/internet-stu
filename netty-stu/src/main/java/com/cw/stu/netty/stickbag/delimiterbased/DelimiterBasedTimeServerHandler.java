package com.cw.stu.netty.stickbag.delimiterbased;

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
public class DelimiterBasedTimeServerHandler extends ChannelInboundHandlerAdapter {

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
         * DelimiterBasedFrameDecoder 自动对发送来的消息进行了解码，后续的 ChannelHandler 接收到的 msg 对象是完整的消息包
         * 第二个 ChannelHandler 是 StringDecoder，它将 ByteBuf 解码成字符串对象
         * 第三个 EchoServerHandler 接收到的 msg 对象就是解码后的字符串对象
         */
        String body = (String) msg;
//        System.out.println(atomicInteger.addAndGet(1) + "--->" + Thread.currentThread().getName()
//                + ", The server receive order: " + body);

        logger.info("读取客户端消息：{}--->{}, the server receive msg from client: {}", atomicInteger.addAndGet(1),
                Thread.currentThread().getName(), body);

        /*
         * 回复消息
         * 由于创建的 DelimiterBasedFrameDecoder 解码器默认会自动去掉分隔符，所以返回给客户端时需要自己拼接分隔符
         * DelimiterBasedFrameDecoder(int maxFrameLength, boolean stripDelimiter, ByteBuf delimiter)
         *  这个构造器可以设置是否去除分隔符
         * 最后创建 ByteBuf 将原始的消息重新返回给客户端
         */
        String respMsg = body + Constants.DELIMITER_SEPARATOR;
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

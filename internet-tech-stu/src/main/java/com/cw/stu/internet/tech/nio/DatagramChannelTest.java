package com.cw.stu.internet.tech.nio;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

/**
 * Java NIO中的DatagramChannel是一个能收发UDP包的通道。
 * @author WuLiangzhi  2018/09/13 13:39
 */
public class DatagramChannelTest {

    /**
     * UDP 发送方
     * 2. 待接收方启动后，再启动发送方
     */
    @Test
    public void send() {
        DatagramChannel datagramChannel = null;

        try {
            datagramChannel = DatagramChannel.open();

            String sendMsg = "I'm the sender.";
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.clear();
            buffer.put(sendMsg.getBytes("UTF-8"));
            buffer.flip();

            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8888);
            int bytesSend = datagramChannel.send(buffer, inetSocketAddress);
            System.out.println("send, bytesSend=" + bytesSend);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * UDP 接收方
     * 1. 测试时先启动接收方
     */
    @Test
    public void receive() {
        DatagramChannel datagramChannel = null;
        try {
            datagramChannel = DatagramChannel.open();
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8888);
            datagramChannel.socket().bind(inetSocketAddress);

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.clear();
            datagramChannel.receive(buffer);
            buffer.flip();

//            while (buffer.hasRemaining()) {
//                System.out.println(buffer.get());
//            }
            byte[] data = buffer.array();
            String receiveMsg = new String(data);
            System.out.println("receive, receiveMsg: " + receiveMsg);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

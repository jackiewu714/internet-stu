package com.cw.stu.internet.tech.nio.tcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * BIO 服务端
 *
 * @author WuLiangzhi  2018/09/12 21:41
 */
public class BioServerTest {

    private static final Logger logger = LoggerFactory.getLogger(BioServerTest.class);

    public void server() {
        ServerSocket serverSocket = null;
        InputStream inputStream = null;

        try {
            serverSocket = new ServerSocket(8080);
            int recvMsgSize = 0;
            byte[] recvBuf = new byte[1024];
            while (true) {
                Socket clientSocket = serverSocket.accept();
                SocketAddress clientAddress = clientSocket.getRemoteSocketAddress();
                System.out.println("Handling client at " + clientAddress);

                inputStream = clientSocket.getInputStream();
                recvMsgSize = inputStream.read(recvBuf);
                while (recvMsgSize != -1) {
                    byte[] tmpBuf = new byte[recvMsgSize];
                    System.arraycopy(recvBuf, 0, tmpBuf, 0, recvMsgSize);
                    System.out.println("server: " + new String(tmpBuf));

                    recvMsgSize = inputStream.read(recvBuf);

                }
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        BioServerTest bioServerTest = new BioServerTest();
        bioServerTest.server();
    }

}

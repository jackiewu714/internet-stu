package com.cw.nio;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author WuLiangzhi  2018/09/04 22:34
 */
public class BufferTest {

    private static final Logger logger = LoggerFactory.getLogger(BufferTest.class);

    @Test
    public void readFile() {
        RandomAccessFile randomAccessFile = null;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile("D:/data/nio/nio-data.txt", "rw");
            fileChannel = randomAccessFile.getChannel();

            //create buffer with capacity of 48 bytes
            ByteBuffer buffer = ByteBuffer.allocate(48);

            int bytesRead = fileChannel.read(buffer);
            while(bytesRead != -1){
                buffer.flip();  //make buffer ready for read

                while (buffer.hasRemaining()) {
                    System.out.println(buffer.get()); //read 1 byte at a time
//                    System.out.println(buffer.getChar()); //read 1 byte at a time
                }

                buffer.clear(); //make buffer ready for writing
                bytesRead = fileChannel.read(buffer);
            }

        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

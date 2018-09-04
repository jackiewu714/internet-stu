package com.cw.nio;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * @author WuLiangzhi  2018/09/04 23:14
 */
public class ChannelTest {

    private static final Logger logger = LoggerFactory.getLogger(ChannelTest.class);

    @Test
    public void testTransferFrom() {
        RandomAccessFile fromFile = null;
        FileChannel fromChannel = null;

        RandomAccessFile toFile = null;
        FileChannel toChannel = null;
        try {
            fromFile = new RandomAccessFile("D:/data/nio/fromFile.txt", "rw");
            fromChannel = fromFile.getChannel();

            toFile = new RandomAccessFile("D:/data/nio/toFile.txt", "rw");
            toChannel = toFile.getChannel();

            long position = 0;
            long count = fromChannel.size();

            toChannel.transferFrom(fromChannel, position, count);
//            toChannel.force(true);
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (fromFile != null) {
                try {
                    fromFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (toFile != null) {
                try {
                    toFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void testTransferTo() {
        RandomAccessFile fromFile = null;
        FileChannel fromChannel = null;

        RandomAccessFile toFile = null;
        FileChannel toChannel = null;
        try {
            fromFile = new RandomAccessFile("D:/data/nio/fromFile.txt", "rw");
            fromChannel = fromFile.getChannel();

            toFile = new RandomAccessFile("D:/data/nio/toFile.txt", "rw");
            toChannel = toFile.getChannel();

            long position = 0;
            long count = fromChannel.size();

            fromChannel.transferTo(position, count, toChannel);

        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (fromFile != null) {
                try {
                    fromFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (toFile != null) {
                try {
                    toFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}

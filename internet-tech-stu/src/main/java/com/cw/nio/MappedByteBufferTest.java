package com.cw.nio;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.cxf.service.invoker.FactoryInvoker;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * MappedByteBuffer是NIO引入的文件内存映射方案，读写性能极高
 * @author WuLiangzhi  2018/09/13 9:01
 */
public class MappedByteBufferTest {

    /**
     * 使用 ByteBuffer 方式读取
     * @param filePath  String  文件路径
     */
    private void readFileByByteBuffer(String filePath) {
        RandomAccessFile randomAccessFile = null;
        FileChannel fileChannel = null;

        StopWatch stopWatch = new StopWatch();
        try {
            randomAccessFile = new RandomAccessFile(filePath, "r");
            fileChannel = randomAccessFile.getChannel();

            stopWatch.start();
            ByteBuffer buffer = ByteBuffer.allocate((int) randomAccessFile.length());
            buffer.clear();
            fileChannel.read(buffer);

            System.out.println("ByteBuffer read time: " + stopWatch.getTime() + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(randomAccessFile, fileChannel);
        }
    }

    /**
     * 使用 MappedByteBuffer 读取文件
     * @param filePath
     */
    private void readFileByMappedByteBuffer(String filePath) {
        RandomAccessFile randomAccessFile = null;
        FileChannel fileChannel = null;

        StopWatch stopWatch = new StopWatch();
        try {
            randomAccessFile = new RandomAccessFile(filePath, "r");
            fileChannel = randomAccessFile.getChannel();

            stopWatch.start();
            MappedByteBuffer mappedBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, randomAccessFile.length());
            stopWatch.stop();

            System.out.println("MappedByteBuffer read time: " + stopWatch.getTime() + "ms");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(randomAccessFile, fileChannel);
        }
    }

    /**
     * 关闭文件、通道
     * @param randomAccessFile  RandomAccessFile
     * @param fileChannel
     */
    private void close(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        try {
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadFile() {
        String filePath = "F:/Temp/项目资料/plugin.rar";    //21M   283ms VS 1ms
//        filePath = "G:/Movie/[电影天堂www.dy2018.com]变形金刚5：最后的骑士BD中英双字.rmvb";    //1.95G   34023ms VS  11ms
        readFileByByteBuffer(filePath);
        readFileByMappedByteBuffer(filePath);
    }


}

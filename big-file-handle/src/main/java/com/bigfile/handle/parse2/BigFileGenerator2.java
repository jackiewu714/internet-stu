package com.bigfile.handle.parse2;

import com.bigfile.handle.common.Constants;
import com.bigfile.handle.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.DecimalFormat;

/**
 * 大文件生成器
 *
 * @author WuLiangzhi  2019/06/17 20:21
 */
public class BigFileGenerator2 {

    private static final Logger logger = LoggerFactory.getLogger(BigFileGenerator2.class);

    private String firstRowData1 = "/MESSAGE/ time = %s post data:";
    private String secondRowData1 = "GAP REALSEASE in RING%s %s";

    private String firstRowData2 = "/MESSAGE/ time = %s post data:";
    private String secondRowData2 = "HSOFF HEAT in CELL%s %s Per";

    public void appendContent(String filePath, int lineNum) {
        logger.info("generateLine, filePath={}, lineNum={}", filePath, lineNum);

        //清空文件内容，如果文件不存在则新建一个空文件
        FileUtils.clearFileContent(filePath);

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream(filePath, true);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            for(int i=0; i<lineNum; i++) {
                String[] dataArr = null;
                if(i%2==0) {
                    dataArr = generateDataBlock1(i+1);
                } else {
                    dataArr = generateDataBlock2(i+1);
                }
                for (String line : dataArr) {
                    bw.write(line);
                    bw.newLine();
                }
                bw.newLine();
                if(i%100==0) {
                    bw.flush();
                }
            }
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if(bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

    private String[] generateDataBlock1(int row) {
        logger.info("generateDataBlock1, row={}", row);
        double start = 1.0D;
        double end = 100.0D;

        DecimalFormat df = new DecimalFormat("00.####");

        String time = df.format(Math.random()*(end-start) + start);
        String column2 = df.format(Math.random()*(end-start) + start);
        String column3 = df.format(Math.random()*(end-start) + start);

        String firstRowData = String.format(firstRowData1, time);
        String secondRowData = String.format(secondRowData1, column2, column3);

        return new String[]{firstRowData, secondRowData};
    }

    private String[] generateDataBlock2(int row) {
        logger.info("generateDataBlock2, row={}", row);
        double start = 1.0D;
        double end = 100.0D;

        DecimalFormat df = new DecimalFormat("00.####");

        String time = df.format(Math.random()*(end-start) + start);
        String column2 = df.format(Math.random()*(end-start) + start);
        String column3 = df.format(Math.random()*(end-start) + start);

        String firstRowData = String.format(firstRowData2, time);
        String secondRowData = String.format(secondRowData2, column2, column3);

        return new String[]{firstRowData, secondRowData};
    }

    public static void main(String[] args) {
        BigFileGenerator2 bigFileGenerator = new BigFileGenerator2();

        long startTime = System.currentTimeMillis();
        String filePath = Constants.FILE_PATH_2;
        bigFileGenerator.appendContent(filePath, 100);
//        bigFileGenerator.appendContent(filePath, 10000000);
        long endTime = System.currentTimeMillis();

        logger.info("BigFileGenerator1, appendContent 耗时 {} s", (endTime-startTime)/1000);

        //BigFileGenerator1, appendContent 耗时 195 s（写入3000万行数据，735 MB）
    }

}

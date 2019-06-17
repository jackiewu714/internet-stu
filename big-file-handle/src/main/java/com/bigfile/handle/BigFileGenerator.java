package com.bigfile.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.DecimalFormat;

/**
 * 大文件生成器
 *
 * @author WuLiangzhi  2019/06/17 20:21
 */
public class BigFileGenerator {

    private static final Logger logger = LoggerFactory.getLogger(BigFileGenerator.class);

    public void appendContent(String filePath, int lineNum) {
        logger.info("generateLine, filePath={}, lineNum={}", filePath, lineNum);

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream(filePath, true);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            for(int i=0; i<lineNum; i++) {
                bw.newLine();
                bw.write(generateLine());
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

    private String generateLine() {
        double start = 1.0D;
        double end = 100.0D;
//        double time = Math.nextAfter(start, end);
//        double column2 = Math.nextAfter(start, end);
//        double column3 = Math.nextAfter(start, end);

        DecimalFormat df = new DecimalFormat("00.####");

        String time = df.format(Math.random()*(end-start) + start);
        String column2 = df.format(Math.random()*(end-start) + start);
        String column3 = df.format(Math.random()*(end-start) + start);



        String[] rowData = new String[]{time,column2,column3,column3,column3,column3,column3,
                column3,column3,column3,column3,column3,column3,column3,column3,column3,column3,
                column3,column3,column3,column3,column3,column3,column3,column3,column3,column3,
                column3};

        StringBuilder sb = new StringBuilder();
        for(String str : rowData) {
            sb.append(str).append(" ");
        }

        String rowDataStr = sb.toString().substring(0, sb.toString().length()-1);
        logger.info("generateLine, rowDataStr={}", rowDataStr);
        return rowDataStr;
    }

    public static void main(String[] args) {
        BigFileGenerator bigFileGenerator = new BigFileGenerator();
//        bigFileGenerator.generateLine();

        long startTime = System.currentTimeMillis();
        String filePath = Constants.FILE_PATH_1;
        bigFileGenerator.appendContent(filePath, 1000000);
        long endTime = System.currentTimeMillis();

        logger.info("BigFileGenerator, appendContent 耗时 {} s", (endTime-startTime)/1000);
    }

}

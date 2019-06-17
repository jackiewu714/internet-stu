package com.bigfile.handle.parse1;

import com.bigfile.handle.common.Constants;
import com.bigfile.handle.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.DecimalFormat;

/**
 * 大文件生成器
 *
 * @author WuLiangzhi  2019/06/17 20:21
 */
public class BigFileGenerator1 {

    private static final Logger logger = LoggerFactory.getLogger(BigFileGenerator1.class);

    public void appendContent(String filePath, int lineNum) {
        logger.info("generateLine, filePath={}, lineNum={}", filePath, lineNum);

        //清空文件内容，如果文件不存在则新建一个空文件
        FileUtil.clearFileContent(filePath);

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream(filePath, true);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            for(int i=0; i<lineNum; i++) {
                bw.write(generateLine(i+1));
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

    private String generateLine(int row) {
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
        logger.info("generateLine, row={}", row);
        return rowDataStr;
    }

    public static void main(String[] args) {
        BigFileGenerator1 bigFileGenerator = new BigFileGenerator1();
//        bigFileGenerator.generateLine();

        long startTime = System.currentTimeMillis();
        String filePath = Constants.FILE_PATH_1;
        bigFileGenerator.appendContent(filePath, 100);
//        bigFileGenerator.appendContent(filePath, 5000000);
        long endTime = System.currentTimeMillis();

        logger.info("BigFileGenerator1, appendContent 耗时 {} s", (endTime-startTime)/1000);

        //BigFileGenerator1, appendContent 耗时 96 s（写入500万行数据）
    }

}

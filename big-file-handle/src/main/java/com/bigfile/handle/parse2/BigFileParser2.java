package com.bigfile.handle.parse2;

import com.alibaba.fastjson.JSON;
import com.bigfile.handle.common.Constants;
import com.bigfile.handle.parse1.ResultBean;
import com.bigfile.handle.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 大文件解析器
 *
 * @author WuLiangzhi  2019/06/17 20:21
 */
public class BigFileParser2 {

    private static final Logger logger = LoggerFactory.getLogger(BigFileParser2.class);

    /**
     * 查找符合条件的数据
     *
     * @param filePath      String  文件路径
     * @param searchStrList List<String>    搜索条件列表
     * @return
     */
    public String findMatchResult(String filePath, String resultFilePath, List<String> searchStrList) {
        logger.info("findMatchResult, filePath={}, searchStrList={}, resultFilePath={}", filePath, JSON.toJSON(searchStrList), resultFilePath);

        List<Double> searchDouList = new ArrayList<>();
        for (String str : searchStrList) {
            try {
                searchDouList.add(Double.valueOf(str));
            } catch (NumberFormatException e) {
                logger.error("条件字符串格式化为数字错误， columnData={}", str, e);
            }
        }

        if (searchStrList == null || searchStrList.isEmpty()) {
            return null;
        }

        //清空结果文件内容，如果文件不存在则新建一个空文件
        FileUtil.clearFileContent(resultFilePath);

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        List<ResultBean> resultBeanList = new ArrayList<>();
        try {
            fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            fos = new FileOutputStream(resultFilePath, true);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            int row = 1;
            String line;
            while ((line = br.readLine()) != null) {
//                resultBeanList.addAll(parseRowData(row, line, searchDouList));

                //将解析的结果写入到结果文件中
                List<ResultBean> list = parseRowData(row, line, searchDouList);
                if(!list.isEmpty() ) {
                    bw.write(JSON.toJSONString(list));
                    bw.newLine();
                    bw.flush();
                }
                row++;
            }
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }

            try {
                if (bw != null) {
                    bw.close();
                }
                if (osw != null) {
                    osw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }

//        Scanner scanner = null;
//        try {
//            fis = new FileInputStream(filePath);
//            scanner = new Scanner(fis);
//
//            int row = 1;
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                resultBeanList.addAll(parseRowData(row, line, searchDouList));
//                row++;
//            }
//        } catch (FileNotFoundException e) {
//            logger.error(e.getMessage(), e);
//        } catch (IOException e) {
//            logger.error(e.getMessage(), e);
//        } finally {
//            try {
//                if(fis != null) {
//                    fis.close();
//                }
//                if(scanner != null) {
//                    scanner.close();
//                }
//            } catch (IOException e) {
//                logger.error(e.getMessage(), e);
//            }
//        }

        String jsonStr = JSON.toJSONString(resultBeanList);
//        logger.info("findMatchResult, resultBeanList.size()={}, jsonStr={}", resultBeanList.size(), jsonStr);
        logger.info("findMatchResult, resultBeanList.size()={}", resultBeanList.size());
        return jsonStr;
    }

    private List<ResultBean> parseRowData(int row, String rowData, List<Double> searchList) {
        if (rowData == null || rowData.length() <= 0 || searchList == null || searchList.isEmpty()) {
            return Collections.emptyList();
        }

        String[] strArr = rowData.split(" ");
        if (strArr == null || strArr.length <= 1) {
            return Collections.emptyList();
        }

//        logger.info("parseRowData, row={}, rowData={}", row, rowData);

        List<ResultBean> resultBeanList = new ArrayList<>();
        for (int column = 1; column < strArr.length; column++) {
            try {
                Double columnData = Double.valueOf(strArr[column]);
                for (Double searchDou : searchList) {

                    if (columnData >= searchDou) {
                        ResultBean bean = new ResultBean();
                        bean.setRow(row);
                        bean.setColumn(column);
                        bean.setTime(strArr[0]);
                        bean.setValue(strArr[column]);

                        resultBeanList.add(bean);
                    }

                }
            } catch (NumberFormatException e) {
                logger.error("字符串格式化为数字错误， columnData={}", strArr[column], e);
            }
        }

        logger.info("parseRowData, row={}, resultBeanList.size()={}", row, resultBeanList.size());
        return resultBeanList;
    }

    public static void main(String[] args) {
        BigFileParser2 bigFileParser = new BigFileParser2();

        long startTime = System.currentTimeMillis();
        List<String> searchList = Arrays.asList(new String[]{"96.2569"});
        bigFileParser.findMatchResult(Constants.FILE_PATH_1, Constants.FILE_PATH_1_RESULT, searchList);
        long endTime = System.currentTimeMillis();

        logger.info("BigFileParser1, findMatchResult 耗时 {} s", (endTime - startTime) / 1000);

        //BigFileParser1, findMatchResult 耗时 110 s（读取并解析500万行数据）
    }

}

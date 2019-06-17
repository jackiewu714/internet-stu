package com.bigfile.handle;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;

/**
 * 大文件解析器
 *
 * @author WuLiangzhi  2019/06/17 20:21
 */
public class BigFileParser {

    private static final Logger logger = LoggerFactory.getLogger(BigFileParser.class);

    /**
     * 查找符合条件的数据
     *
     * @param filePath      String  文件路径
     * @param searchStrList List<String>    搜索条件列表
     * @return
     */
    public String findMatchResult(String filePath, List<String> searchStrList) {
        logger.info("findMatchResult, filePath={}, searchStrList={}", filePath, JSON.toJSON(searchStrList));

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

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        List<ResultBean> resultBeanList = new ArrayList<>();
        try {
            fis = new FileInputStream(filePath);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            int row = 1;
            String line = "";
            while ((line = br.readLine()) != null) {
                resultBeanList.addAll(parseRowData(row, line, searchDouList));
                row++;
            }
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                br.close();
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

    /**
     * 清空文件内容
     *
     * @param resultFilePath    String  结果文件路径
     */
    public static void clearResultFileContent(String resultFilePath) {
        File file = new File(resultFilePath);
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 追加结果到文件中
     * @param resultFilePath    String  结果文件路径
     * @param jsonStr           String  结果json字符串
     */
    public void appendResultFileContent(String resultFilePath, String jsonStr) {
        logger.info("generateLine, resultFilePath={}");

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try {
            fos = new FileOutputStream(resultFilePath, true);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            bw.write(jsonStr);
            bw.newLine();
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
    }

    public static void main(String[] args) {
        BigFileParser bigFileParser = new BigFileParser();

        long startTime = System.currentTimeMillis();
        String filePath = Constants.FILE_PATH_1;
        List<String> searchList = Arrays.asList(new String[]{"96.2569"});
        bigFileParser.findMatchResult(filePath, searchList);
        long endTime = System.currentTimeMillis();

        logger.info("BigFileParser, findMatchResult 耗时 {} s", (endTime - startTime) / 1000);
    }

}

package com.bigfile.handle.parse2;

import com.alibaba.fastjson.JSON;
import com.bigfile.handle.common.Constants;
import com.bigfile.handle.parse1.ResultBean1;
import com.bigfile.handle.util.CollectionUtils;
import com.bigfile.handle.util.FileUtils;
import com.bigfile.handle.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;

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
     * @param filePath       String  文件路径
     * @param searchBeanList List<ParamBean2>    搜索条件列表
     * @return
     */
    public String findMatchResult(String filePath, String resultFilePath, List<ParamBean2> searchBeanList) {
        logger.info("findMatchResult, filePath={}, searchBeanList={}, resultFilePath={}", filePath, JSON.toJSON(searchBeanList), resultFilePath);

        List<ParamBean2> conditionList = new ArrayList<>();
        for (ParamBean2 paramBean2 : searchBeanList) {
            if (StringUtils.isNotEmpty(paramBean2.getPrefix_key())
                    && StringUtils.isNotEmpty(paramBean2.getKey())
                    && StringUtils.isNotEmpty(paramBean2.getValue_key())
                    && StringUtils.isNotEmpty(paramBean2.getFormat_value())) {
                conditionList.add(paramBean2);
            }
        }

        if (CollectionUtils.isEmpty(conditionList)) {
            logger.error("查询条件列表不合法或者为空");
            return null;
        }

        //清空结果文件内容，如果文件不存在则新建一个空文件
        FileUtils.clearFileContent(resultFilePath);

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        Scanner scanner = null;
        try {
            fis = new FileInputStream(filePath);
            scanner = new Scanner(fis);

            fos = new FileOutputStream(resultFilePath, true);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            int row = 1;
            Stack<String> stack = new Stack<>();
            boolean readValueLine = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if(StringUtils.isEmpty(line)) {
                    continue;
                }

                if(readValueLine) {
                    stack.push(line);
                    readValueLine = false;

                    List<ResultBean2> resultBean2List = parseStackData(row, stack, conditionList);
                    if (!resultBean2List.isEmpty()) {
                        bw.write(JSON.toJSONString(resultBean2List));
                        bw.newLine();
                        bw.flush();
                    }
                }

                if (isMatchPrefixKey(line, conditionList)) {
                    stack.push(line);
                    readValueLine = true;
                }

                row++;
            }
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                if(fis != null) {
                    fis.close();
                }
                if(scanner != null) {
                    scanner.close();
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

        return null;
    }

    /**
     * 判断是否满足搜索条件前缀匹配
     * @param rowData           String  行数据
     * @param conditionList     List<ParamBean2>    搜索条件列表
     * @return  boolean true-满足  false-不满足
     */
    private boolean isMatchPrefixKey(String rowData, List<ParamBean2> conditionList) {
        if (StringUtils.isEmpty(rowData) || CollectionUtils.isEmpty(conditionList)) {
            return false;
        }

        boolean ret = false;
        for(ParamBean2 paramBean2 : conditionList) {
            if (rowData.startsWith(paramBean2.getPrefix_key())) {
                ret = true;
                break;
            }
        }
        return ret;
    }

    private List<ResultBean2> parseStackData(int row, Stack<String> stack, List<ParamBean2> conditionList) {
        if (CollectionUtils.isEmpty(stack) || CollectionUtils.isEmpty(conditionList)) {
            return Collections.emptyList();
        }

        String secondRowData = stack.pop();
        String firstRowData = stack.pop();

        List<ResultBean2> resultBeanList = new ArrayList<>();
        for (ParamBean2 paramBean2 : conditionList) {
            try {
                ResultBean2 resultBean2 = matchSingle(firstRowData, secondRowData, paramBean2);
                if (resultBean2 != null) {
                    resultBeanList.add(resultBean2);
                }

            } catch (Exception e) {
                logger.error("单个匹配错误，firstRowData={}，secondRowData={}，paramBean2={}",
                        firstRowData, secondRowData, JSON.toJSON(paramBean2), e);
            }
        }

        logger.info("parseRowData, row={}, resultBeanList.size()={}", row, resultBeanList.size());
        return resultBeanList;
    }

    /**
     * 匹配单个查询条件
     * @param firstRowData      String  第一行数据
     * @param secondRowData     String  第二行数据
     * @param paramBean2        ParamBean2
     * @return  ResultBean2
     */
    private ResultBean2 matchSingle(String firstRowData, String secondRowData, ParamBean2 paramBean2){
        if(StringUtils.isEmpty(firstRowData) || StringUtils.isEmpty(secondRowData) || paramBean2 == null) {
            return null;
        }

        if(secondRowData.contains(paramBean2.getKey())) {
            String newStr = secondRowData.replaceAll(paramBean2.getKey(), "");
            if(StringUtils.isEmpty(newStr)) {
                return null;
            }

            if(newStr.contains(paramBean2.getValue_key()+" ")) {
                String strArr[] = newStr.split(paramBean2.getValue_key());
                if(strArr == null || strArr.length < 2) {
                    return null;
                }

                String valueStr = strArr[1].trim();
                if(StringUtils.isEmpty(valueStr)) {
                    return null;
                }

                String[] valueStrArr = valueStr.split(" ");
                if(valueStrArr == null || valueStrArr.length < 1) {
                    return null;
                }

                String value = valueStrArr[0];
                String time = getTime(firstRowData);
                String format_value = String.format(paramBean2.getFormat_value(), value);

                ResultBean2 resultBean2 = new ResultBean2();
                resultBean2.setKey(paramBean2.getKey());
                resultBean2.setValue(value);
                resultBean2.setTime(time);
                resultBean2.setFormat_value(format_value);
                return resultBean2;
            }

        }
        return null;
    }

    private String getTime(String rowData) {
        if(StringUtils.isEmpty(rowData)){
            return null;
        }

        String[] strArr = rowData.split("=");
        if(strArr == null || strArr.length < 2) {
            return null;
        }

        String rightStr= strArr[1];
        if(StringUtils.isEmpty(rightStr)){
            return null;
        }

        String[] rightStrArr = rightStr.trim().split(" ");
        if(rightStrArr == null || rightStrArr.length < 1) {
            return null;
        }

        return rightStrArr[0];
    }

    public static void main(String[] args) {
        BigFileParser2 bigFileParser = new BigFileParser2();

        long startTime = System.currentTimeMillis();

        List<ParamBean2> searchBeanList = new ArrayList<>();
        ParamBean2 bean1 = new ParamBean2();
        bean1.setPrefix_key("/MESSAGE/");
        bean1.setKey("GAP REALSEASE");
        bean1.setValue_key("RING2");
        bean1.setFormat_value("XX数据第%s层失效");

        ParamBean2 bean2 = new ParamBean2();
        bean2.setPrefix_key("/MESSAGE/");
        bean2.setKey("HSOFF HEAT");
        bean2.setValue_key("CELL1");
        bean2.setValue_key("CELL33.9229");
        bean2.setFormat_value("XX数据第%s圈失效");

        searchBeanList.add(bean1);
        searchBeanList.add(bean2);

        bigFileParser.findMatchResult(Constants.FILE_PATH_2, Constants.FILE_PATH_2_RESULT, searchBeanList);
        long endTime = System.currentTimeMillis();

        logger.info("BigFileParser2, findMatchResult 耗时 {} s", (endTime - startTime) / 1000);

        //BigFileParser2, findMatchResult 耗时 154 s（读取并解析3000万行数据，735 MB）
    }

}

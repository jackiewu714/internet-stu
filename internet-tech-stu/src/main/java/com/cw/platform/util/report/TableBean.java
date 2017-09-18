/**
 * @Title: TableBean.java
 * @Package com.yy.zbase.common.util.report
 * @Description: 表格bean(Excel的一个sheet里面可以包含多个表格，一个表格对应一个TableBean)
 * Copyright: Copyright (c) 2011 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date Feb 24, 2014 8:30:38 AM
 * @version V1.0
 */

package com.cw.platform.util.report;

import java.util.List;

/**
 * @ClassName: TableBean
 * @Description: 表格bean(Excel的一个sheet里面可以包含多个表格，一个表格对应一个TableBean)
 * @author WuLiangzhi
 * @date Feb 24, 2014 8:30:38 AM
 *
 */

public class TableBean {

    private int startRow; //开始行
    private int startColumn; //开始列
    private List<List<String>> dataList; //数据列表(二维)
    private List<CellBean> replaceList;  //需替换值的单元格列表  
    
    public TableBean(int startRow, int startColumn, List<List<String>> dataList) {
	this.startRow = startRow;
	this.startColumn = startColumn;
	this.dataList = dataList;
    }
    
    public TableBean(int startRow, int startColumn, List<List<String>> dataList, List<CellBean> replaceList) {
	this.startRow = startRow;
	this.startColumn = startColumn;
	this.dataList = dataList;
	this.replaceList = replaceList;
    }
    
    public int getStartRow() {
        return startRow;
    }
    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }
    public int getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(int startColumn) {
        this.startColumn = startColumn;
    }

    public List<List<String>> getDataList() {
        return dataList;
    }
    public void setDataList(List<List<String>> dataList) {
        this.dataList = dataList;
    }

    public List<CellBean> getReplaceList() {
        return replaceList;
    }

    public void setReplaceList(List<CellBean> replaceList) {
        this.replaceList = replaceList;
    }
    
    
}

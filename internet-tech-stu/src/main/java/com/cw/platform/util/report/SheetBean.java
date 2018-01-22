/**
 * @Title: SheetBean.java
 * @Package com.yy.zbase.common.util.report
 * @Description: excel中的一个sheet
 * Copyright: Copyright (c) 2014
 * Company:YY
 * @author WuLiangzhi
 * @date Feb 26, 2014 1:26:38 PM
 * @version V1.0
 */

package com.cw.platform.util.report;

/**
 * @ClassName: SheetBean
 * @Description: excel中的一个sheet
 * @author WuLiangzhi
 * @date Feb 26, 2014 1:26:38 PM
 *
 */

public class SheetBean {

    private String sheetName; //sheet的名称
    private TableBean[] tableBeanArray; //一个sheet中可以有多个table

    public SheetBean() {
    }

    public SheetBean(String sheetName, TableBean[] tableBeanArray) {
        this.sheetName = sheetName;
        this.tableBeanArray = tableBeanArray;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public TableBean[] getTableBeanArray() {
        return tableBeanArray;
    }

    public void setTableBeanArray(TableBean[] tableBeanArray) {
        this.tableBeanArray = tableBeanArray;
    }

}

/**
 * @Title: CellBean.java
 * @Package com.yy.zbase.common.util.report
 * @Description: 单元格bean
 * Copyright: Copyright (c) 2011
 * Company:YY
 * @author WuLiangzhi
 * @date Feb 21, 2014 10:00:07 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.util.report;

/**
 * @ClassName: CellBean
 * @Description: 单元格bean
 * @author WuLiangzhi
 * @date Feb 21, 2014 10:00:07 PM
 *
 */

public class CellBean {

    private int row; //行
    private int column; //列
    private String value; //值

    public CellBean(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public CellBean(int row, int column, String value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}

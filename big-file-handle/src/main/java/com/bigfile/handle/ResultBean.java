package com.bigfile.handle;

/**
 * @author WuLiangzhi  2019/06/17 21:57
 */
public class ResultBean {

    private int row;
    private int column;
    private String time;
    private String value;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

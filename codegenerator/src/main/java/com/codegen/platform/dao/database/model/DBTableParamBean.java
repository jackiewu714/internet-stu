package com.codegen.platform.dao.database.model;

public class DBTableParamBean {

	// javaBean 数据库查询控制的扩展字段
	private long rownum;               //设置最大返回行数
	private String extraCondition;     //设置附加查询条件
	private String extraOrderColumns;  //设置排序的数据列
	private String extraHint;          //设置索引使用策略
	private int forUpdateFlag;         //设置是否锁定记录  0:不锁定;1:for update nowait
	private String extraUpdateColumns; //设置UPDATE语句的附加字段值
	
	/**
	 * 初始化javabean的字段
	 */
	public void clear() {
		rownum = 0;
		extraCondition = null;
		extraOrderColumns = null;
		extraHint = null;
		forUpdateFlag = 0;	
		extraUpdateColumns=null;
	}
	
	public String getExtraCondition() {
		return extraCondition;
	}
	public void setExtraCondition(String extraCondition) {
		this.extraCondition = extraCondition;
	}
	public String getExtraHint() {
		return extraHint;
	}
	public void setExtraHint(String extraHint) {
		this.extraHint = extraHint;
	}
	public String getExtraOrderColumns() {
		return extraOrderColumns;
	}
	public void setExtraOrderColumns(String extraOrderColumns) {
		this.extraOrderColumns = extraOrderColumns;
	}
	public int getForUpdateFlag() {
		return forUpdateFlag;
	}
	public void setForUpdateFlag(int forUpdateFlag) {
		this.forUpdateFlag = forUpdateFlag;
	}
	public long getRownum() {
		return rownum;
	}
	public void setRownum(long rownum) {
		this.rownum = rownum;
	}

	public String getExtraUpdateColumns() {
		return extraUpdateColumns;
	}

	public void setExtraUpdateColumns(String extraUpdateColumns) {
		this.extraUpdateColumns = extraUpdateColumns;
	}
	
	
}

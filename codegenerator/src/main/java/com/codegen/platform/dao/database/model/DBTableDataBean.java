package com.codegen.platform.dao.database.model;

import java.util.HashMap;
import java.util.Map;

import com.codegen.platform.dao.database.util.BeanHelper;

public class DBTableDataBean {

	private String extraColumn1;
	private String extraColumn2;
	private String extraColumn3;
	private String extraUpdateColumns; // 设置UPDATE语句的附加字段值

	public DBTableDataBean() {
		this.clear();
	}

	public void clear() {
		extraColumn1 = null;
		extraColumn2 = null;
		extraColumn3 = null;
		extraUpdateColumns = null;
	}

	private Class findTableDataBeanSubClass(Class sourceClass) {
		Class tmpClass = sourceClass;
		while (tmpClass != Object.class && tmpClass.getSuperclass() != DBTableDataBean.class) {
			tmpClass = tmpClass.getSuperclass();
		}
		return tmpClass;
	}

	/**
	 * @return 把 bean 的值组装成HashMap
	 * @throws Exception
	 */
	public HashMap toHashMap() {
		Class fieldClass = findTableDataBeanSubClass(this.getClass());
		return BeanHelper.toHashMap(this, fieldClass);
	}

	public void fromMap(Map mapBean) {
		BeanHelper.fromMap(this, mapBean);
	}

	public String toString() {
		return this.toHashMap().toString();
	}

	public String getExtraColumn1() {
		return extraColumn1;
	}

	public void setExtraColumn1(String extraColumn1) {
		this.extraColumn1 = extraColumn1;
	}

	public String getExtraColumn2() {
		return extraColumn2;
	}

	public void setExtraColumn2(String extraColumn2) {
		this.extraColumn2 = extraColumn2;
	}

	public String getExtraColumn3() {
		return extraColumn3;
	}

	public void setExtraColumn3(String extraColumn3) {
		this.extraColumn3 = extraColumn3;
	}

	public String getExtraUpdateColumns() {
		return extraUpdateColumns;
	}

	public void setExtraUpdateColumns(String extraUpdateColumns) {
		this.extraUpdateColumns = extraUpdateColumns;
	}

}

package com.cw.stu.internet.tech.platform.dao.mybatis.dialect;

public class Dialect {

	public static enum Type {
		MYSQL, ORACLE
	}

	public boolean supportsLimit() {
		return false;
	}

	public boolean supportsLimitOffset() {
		return supportsLimit();
	}

	public String getLimitString(String sql, int offset, int limit) {
		return getLimitString(sql, offset, Integer.toString(offset), limit, Integer.toString(limit));
	}

	public String getLimitString(String sql, int offset, String offsetPlaceholder, int limit, String limitPlaceholder) {
		throw new UnsupportedOperationException("paged queries not supported");
	}

	public String getCountString(String sql) {
		throw new UnsupportedOperationException("paged count not supported");
	}

	public String getTranslateString(String querySelect, String translateColumn) {
		return querySelect;
	}

	public String[] getSqlColumn(String querySelect) {
		return null;
	}

}

package com.cw.stu.internet.tech.platform.dao.mybatis.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class EncryptStringTypeHandler extends BaseTypeHandler<String> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
	    throws SQLException {
	ps.setString(i, parameter);
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
	String value = rs.getString(columnName);
	try {
	    while (StringUtils.isNotEmpty(value) && value.startsWith("{RSA}")) {
		value = DbEncryptUtil.getDecodeString(value);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return value;
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
	String value = rs.getString(columnIndex);
	try {
	    if (StringUtils.isNotEmpty(value) && value.startsWith("{RSA}")) {
		ResultSetMetaData resultSetMetaData = rs.getMetaData();
		String tableName = resultSetMetaData.getTableName(columnIndex);
		String key = tableName + "." + resultSetMetaData.getColumnName(columnIndex);
		key = key.toUpperCase();
		if (DbEncryptUtil.encryptTableColumn.contains(key)) {
		    value = DbEncryptUtil.getDecodeString(value);
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return value;
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
	String value = cs.getString(columnIndex);
	try {
	    if (StringUtils.isNotEmpty(value) && value.startsWith("{RSA}")) {
		ResultSetMetaData resultSetMetaData = cs.getMetaData();
		String tableName = resultSetMetaData.getTableName(columnIndex);
		String key = tableName + "." + resultSetMetaData.getColumnName(columnIndex);
		key = key.toUpperCase();
		if (DbEncryptUtil.encryptTableColumn.contains(key)) {
		    value = DbEncryptUtil.getDecodeString(value);
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return value;
    }
}

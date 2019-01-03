package com.codegen.platform.dao.database;

import static org.springframework.util.Assert.notNull;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.codegen.platform.util.SpringUtils;
import com.google.common.collect.Maps;

/**
 * 
 * @author Jackie
 * 
 */
public class PublicDAOService {

	protected SqlSession sqlSession;
	ThreadLocal<SqlSessionFactory> sqlSessionFactory = new ThreadLocal<SqlSessionFactory>();

	public SqlSession getSqlSession() {
		if (sqlSessionFactory.get() != null)
			return new SqlSessionTemplate(sqlSessionFactory.get());
		return sqlSession;
	}

	@Autowired(required = false)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSession = new SqlSessionTemplate(sqlSessionFactory);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void checkDaoConfig() {
		notNull(this.sqlSession, "Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required");
	}

	public void switchDataSource(String sqlSessionFactoryName) {
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) SpringUtils.getBean(sqlSessionFactoryName);
		this.sqlSessionFactory.set(sqlSessionFactory);
	}

	public void reverDataSource() {
		this.sqlSessionFactory.set(null);
	}

	/**
	 * 历史表用于取现表数据归档的专用函数 以现表的主键为条件，把现表对应记录的数据插入到历史表中
	 * 
	 * @param tableName
	 * @param objParam
	 *            可以使用 DBTableParamBean 或者 Map 类型 要求参数中必须包含现表的主键信息
	 *            对于只有一个主键的现表，可以直接使用主键对应的类型的参数（NUMBER=>Long,VARCHAR2=>String)
	 * @return 返回null
	 */
	public Object archInsert(String tableName, Object objParam) {
		return getSqlSession().insert(tableName + "_archInsert", objParam);
	}

	/**
	 * @return 数据库当前日期
	 */
	public Timestamp getSysDate() {
		return (Timestamp) getSqlSession().selectOne("getSysDate");
	}

	/**
	 * 添加记录
	 * 
	 * @param sqlMapId
	 * @param objParam
	 * @return 返回 sqlMap 配置的 insert 结点返回值
	 */
	public Object insertBySqlMapId(String sqlMapId, Object objParam) {
		return getSqlSession().insert(sqlMapId, objParam);
	}

	/**
	 * 根据给定条件查询记录，带翻译信息和翻页处理
	 * 
	 * @param sqlMapId
	 * @param objParam
	 * @param offset
	 *            前面跳过多少条记录
	 * @param limit
	 *            最多取出多少条记录，当limit为0时则offset参数无效并且不限制记录数
	 * @return 返回查询结果集
	 */
	public List selectBySqlMapId(String sqlMapId, Object objParam, int offset, int limit) {
		if (limit == 0)
			return (List) getSqlSession().selectList(sqlMapId, objParam);
		else
			return (List) getSqlSession().selectList(sqlMapId, objParam, new RowBounds(offset, limit));
	}

	@SuppressWarnings("rawtypes")
	public List selectBySqlMapId(String sqlMapId, Object objParam, RowBounds rowBounds) {
		return (List) getSqlSession().selectList(sqlMapId, objParam, rowBounds);
	}

	/**
	 * 根据给定条件查询记录，带翻译信息和翻页处理
	 * 
	 * @param sqlMapId
	 * @param objParam
	 * @return 返回查询结果集
	 */
	public List selectBySqlMapId(String sqlMapId, Object objParam) {
		return selectBySqlMapId(sqlMapId, objParam, 0, 0);
	}

	/**
	 * 根据给定条件查询记录，只返回第一条记录
	 * 
	 * @param sqlMapId
	 * @param objParam
	 * @return 返回查询结果集，没有记录则返回 null
	 */
	public Object selectFirstRowBySqlMapId(String sqlMapId, Object objParam) {
		List lstResult = selectBySqlMapId(sqlMapId, objParam, 0, 0);
		if (!CollectionUtils.isEmpty(lstResult))
			return lstResult.get(0);
		else
			return null;
	}

	/**
	 * 根据SqlMapId修改记录
	 * 
	 * @param sqlMapId
	 * @param objParam
	 * @return 返回 更改的行数
	 */
	public int updateBySqlMapId(String SqlMapId, Object objParam) {
		return getSqlSession().update(SqlMapId, objParam);
	}

	/**
	 * 根据SqlMapId删除记录
	 * 
	 * @param sqlMapId
	 * @param objParam
	 * @return 返回 删除的行数
	 */
	public int deleteBySqlMapId(String SqlMapId, Object objParam) {
		return getSqlSession().delete(SqlMapId, objParam);
	}

	/**
	 * 动态SQL查询，返回多条记录
	 * 
	 * @param sqlText
	 *            原则上要求传入返回VARCHAR或者NUMBER的 SQL语句
	 * @return 返回HashMap(记录)组成的的list(记录集)
	 */
	@SuppressWarnings("rawtypes")
	public List dynSqlQry(String sqlText) {
		Map param = new HashMap();
		List lst = dynSqlQry(sqlText, param, 0, 0);
		return lst;
	}

	/**
	 * 动态SQL查询，返回多条记录
	 * 
	 * @param sqlText
	 *            原则上要求传入返回VARCHAR或者NUMBER的 SQL语句
	 * @return 返回HashMap(记录)组成的的list(记录集)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List dynSqlQry(String sqlText, Map param, int offset, int limit) {
		if (limit != 0)
			param.put("rowBounds", new RowBounds(offset, limit));
		List lst = dynSqlQry(sqlText, param);
		return lst;
	}

	/**
	 * 动态SQL查询，返回多条记录
	 * 
	 * @param sqlText
	 *            原则上要求传入返回VARCHAR或者NUMBER的 SQL语句
	 * @return 返回HashMap(记录)组成的的list(记录集)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List dynSqlQry(String sqlText, Map param) {
		param.put("dynInfoSql", sqlText);
		List lst = getSqlSession().selectList("dynInfoSql", param);
		return lst;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int dynSqlUpdate(String sqlText) {
		return dynSqlUpdate(sqlText, null);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int dynSqlUpdate(String sqlText, Map param) {
		param.put("dynInfoSql", sqlText);
		int rs = getSqlSession().update("dynInfoSql", param);
		return rs;
	}

	/**
	 * 动态SQL查询，返回一行一列的记录
	 * 
	 * @param sqlText
	 *            原则上要求传入只返回一行一列返回值为VARCHAR或者NUMBER的SQL
	 * @return 获取单行单列字段值,如有多行多列时，只取第一行的hashmap中的某一列的值
	 */
	public String dynSingleInfoQry(String sqlText) {
		String strValue = null;
		Map param = Maps.newHashMap();
		param.put("dynSingleRowSql", sqlText);
		List lst = getSqlSession().selectList("dynSingleRowSql", param, new RowBounds(0, 1));
		if (lst.size() > 0) {
			HashMap hm = (HashMap) lst.get(0);// 只取第一行
			if (null != hm) {
				Iterator it = hm.entrySet().iterator();
				if (it.hasNext()) {
					Entry entry = (Entry) it.next();
					strValue = entry.getValue().toString();
				}
			}
		}
		return strValue;
	}

	/**
	 * 动态SQL查询，返回多行一列的记录，各个记录间用法","分隔
	 * 
	 * @param sqlText
	 *            原则上要求传入只返回一列返回值为VARCHAR或者NUMBER的SQL
	 * @return 获取多行单列字段值，以","分隔；如有返回多列则只取其中一列
	 */
	public String dynMultiInfoQry(String sqlText) {
		String strValue = null;

		List lst = getSqlSession().selectList("dynMultiRowSql", sqlText);
		for (int i = 0; i < lst.size(); i++) {
			HashMap hm = (HashMap) lst.get(i);
			Iterator it = hm.entrySet().iterator();

			if (it.hasNext()) {
				Entry entry = (Entry) it.next();
				if (strValue == null) {
					strValue = entry.getValue().toString();
				} else {
					strValue = strValue + "," + entry.getValue().toString();
				}
			}
		}
		return strValue;
	}

}

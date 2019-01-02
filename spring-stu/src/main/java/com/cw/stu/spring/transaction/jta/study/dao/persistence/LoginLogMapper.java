package com.cw.stu.spring.transaction.jta.study.dao.persistence;

import com.cw.stu.spring.transaction.jta.study.dao.domain.LoginLog;
import com.cw.stu.spring.transaction.jta.study.dao.domain.LoginLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LoginLogMapper {
    long countByExample(LoginLogCriteria example);

    int deleteByExample(LoginLogCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginLog record);

    int insertListSelective(@Param("record") LoginLog record, @Param("records") List<LoginLog> records);

    int replaceListSelective(@Param("record") LoginLog record, @Param("records") List<LoginLog> records);

    int replaceSelective(LoginLog record);

    int insertOnDuplicateKeySelective(LoginLog record);

    int insertListOnDuplicateKeySelective(@Param("record") LoginLog record, @Param("records") List<LoginLog> records);

    int insertSelective(LoginLog record);

    List<LoginLog> selectByExample(LoginLogCriteria example, RowBounds rowbounds);

    List<LoginLog> selectByExampleWithBLOBs(LoginLogCriteria example, RowBounds rowbounds);

    List<LoginLog> selectByExample(LoginLogCriteria example);

    LoginLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginLog record, @Param("example") LoginLogCriteria example);

    int updateByExample(@Param("record") LoginLog record, @Param("example") LoginLogCriteria example);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}
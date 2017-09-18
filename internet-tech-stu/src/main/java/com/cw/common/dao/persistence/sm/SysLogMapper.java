package com.cw.common.dao.persistence.sm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.cw.common.dao.domain.sm.SysLog;
import com.cw.common.dao.domain.sm.SysLogCriteria;

public interface SysLogMapper {
    int countByExample(SysLogCriteria example);

    int deleteByExample(SysLogCriteria example);

    int deleteByPrimaryKey(Integer logId);

    int insert(SysLog record);

    int insertListSelective(@Param("record") SysLog record, @Param("records") List<SysLog> records);

    int replaceListSelective(@Param("record") SysLog record, @Param("records") List<SysLog> records);

    int replaceSelective(SysLog record);

    int insertOnDuplicateKeySelective(SysLog record);

    int insertListOnDuplicateKeySelective(@Param("record") SysLog record, @Param("records") List<SysLog> records);

    int insertSelective(SysLog record);

    List<SysLog> selectByExampleWithBLOBs(SysLogCriteria example);

    List<SysLog> selectByExample(SysLogCriteria example, RowBounds rowbounds);

    List<SysLog> selectByExampleWithBLOBs(SysLogCriteria example, RowBounds rowbounds);

    List<Map> selectByExampleWithTranslation(SysLogCriteria example, RowBounds rowbounds);

    List<SysLog> selectByExample(SysLogCriteria example);

    SysLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogCriteria example);

    int updateByExampleWithBLOBs(@Param("record") SysLog record, @Param("example") SysLogCriteria example);

    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogCriteria example);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKeyWithBLOBs(SysLog record);

    int updateByPrimaryKey(SysLog record);
}
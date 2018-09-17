package com.cw.stu.internet.tech.common.dao.persistence.sm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.cw.stu.internet.tech.common.dao.domain.sm.Grant;
import com.cw.stu.internet.tech.common.dao.domain.sm.GrantCriteria;

public interface GrantMapper {
    int countByExample(GrantCriteria example);

    int deleteByExample(GrantCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grant record);

    int insertListSelective(@Param("record") Grant record, @Param("records") List<Grant> records);

    int replaceListSelective(@Param("record") Grant record, @Param("records") List<Grant> records);

    int replaceSelective(Grant record);

    int insertOnDuplicateKeySelective(Grant record);

    int insertListOnDuplicateKeySelective(@Param("record") Grant record, @Param("records") List<Grant> records);

    int insertSelective(Grant record);

    List<Grant> selectByExample(GrantCriteria example, RowBounds rowbounds);

    List<Grant> selectByExampleWithBLOBs(GrantCriteria example, RowBounds rowbounds);

    List<Map> selectByExampleWithTranslation(GrantCriteria example, RowBounds rowbounds);

    List<Grant> selectByExample(GrantCriteria example);

    Grant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grant record, @Param("example") GrantCriteria example);

    int updateByExample(@Param("record") Grant record, @Param("example") GrantCriteria example);

    int updateByPrimaryKeySelective(Grant record);

    int updateByPrimaryKey(Grant record);
}
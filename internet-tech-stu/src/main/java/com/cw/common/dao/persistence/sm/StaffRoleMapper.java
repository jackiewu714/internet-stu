package com.cw.common.dao.persistence.sm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.cw.common.dao.domain.sm.StaffRole;
import com.cw.common.dao.domain.sm.StaffRoleCriteria;

public interface StaffRoleMapper {
    int countByExample(StaffRoleCriteria example);

    int deleteByExample(StaffRoleCriteria example);

    int deleteByPrimaryKey(Integer staffRoleId);

    int insert(StaffRole record);

    int insertListSelective(@Param("record") StaffRole record, @Param("records") List<StaffRole> records);

    int replaceListSelective(@Param("record") StaffRole record, @Param("records") List<StaffRole> records);

    int replaceSelective(StaffRole record);

    int insertOnDuplicateKeySelective(StaffRole record);

    int insertListOnDuplicateKeySelective(@Param("record") StaffRole record, @Param("records") List<StaffRole> records);

    int insertSelective(StaffRole record);

    List<StaffRole> selectByExample(StaffRoleCriteria example, RowBounds rowbounds);

    List<StaffRole> selectByExampleWithBLOBs(StaffRoleCriteria example, RowBounds rowbounds);

    List<Map> selectByExampleWithTranslation(StaffRoleCriteria example, RowBounds rowbounds);

    List<StaffRole> selectByExample(StaffRoleCriteria example);

    StaffRole selectByPrimaryKey(Integer staffRoleId);

    int updateByExampleSelective(@Param("record") StaffRole record, @Param("example") StaffRoleCriteria example);

    int updateByExample(@Param("record") StaffRole record, @Param("example") StaffRoleCriteria example);

    int updateByPrimaryKeySelective(StaffRole record);

    int updateByPrimaryKey(StaffRole record);
}
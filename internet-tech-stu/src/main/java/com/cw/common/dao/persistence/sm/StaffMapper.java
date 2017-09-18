package com.cw.common.dao.persistence.sm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.cw.common.dao.domain.sm.Staff;
import com.cw.common.dao.domain.sm.StaffCriteria;

public interface StaffMapper {
    int countByExample(StaffCriteria example);

    int deleteByExample(StaffCriteria example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertListSelective(@Param("record") Staff record, @Param("records") List<Staff> records);

    int replaceListSelective(@Param("record") Staff record, @Param("records") List<Staff> records);

    int replaceSelective(Staff record);

    int insertOnDuplicateKeySelective(Staff record);

    int insertListOnDuplicateKeySelective(@Param("record") Staff record, @Param("records") List<Staff> records);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffCriteria example, RowBounds rowbounds);

    List<Staff> selectByExampleWithBLOBs(StaffCriteria example, RowBounds rowbounds);

    List<Map> selectByExampleWithTranslation(StaffCriteria example, RowBounds rowbounds);

    List<Staff> selectByExample(StaffCriteria example);

    Staff selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffCriteria example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffCriteria example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}
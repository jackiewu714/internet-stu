package com.cw.common.dao.persistence.sm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.cw.common.dao.domain.sm.Role;
import com.cw.common.dao.domain.sm.RoleCriteria;

public interface RoleMapper {
    int countByExample(RoleCriteria example);

    int deleteByExample(RoleCriteria example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertListSelective(@Param("record") Role record, @Param("records") List<Role> records);

    int replaceListSelective(@Param("record") Role record, @Param("records") List<Role> records);

    int replaceSelective(Role record);

    int insertOnDuplicateKeySelective(Role record);

    int insertListOnDuplicateKeySelective(@Param("record") Role record, @Param("records") List<Role> records);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleCriteria example, RowBounds rowbounds);

    List<Role> selectByExampleWithBLOBs(RoleCriteria example, RowBounds rowbounds);

    List<Map> selectByExampleWithTranslation(RoleCriteria example, RowBounds rowbounds);

    List<Role> selectByExample(RoleCriteria example);

    Role selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleCriteria example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleCriteria example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}
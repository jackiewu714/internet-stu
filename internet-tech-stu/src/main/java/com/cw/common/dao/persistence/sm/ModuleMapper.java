package com.cw.common.dao.persistence.sm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.cw.common.dao.domain.sm.Module;
import com.cw.common.dao.domain.sm.ModuleCriteria;

public interface ModuleMapper {
    int countByExample(ModuleCriteria example);

    int deleteByExample(ModuleCriteria example);

    int deleteByPrimaryKey(Integer modId);

    int insert(Module record);

    int insertListSelective(@Param("record") Module record, @Param("records") List<Module> records);

    int replaceListSelective(@Param("record") Module record, @Param("records") List<Module> records);

    int replaceSelective(Module record);

    int insertOnDuplicateKeySelective(Module record);

    int insertListOnDuplicateKeySelective(@Param("record") Module record, @Param("records") List<Module> records);

    int insertSelective(Module record);

    List<Module> selectByExample(ModuleCriteria example, RowBounds rowbounds);

    List<Module> selectByExampleWithBLOBs(ModuleCriteria example, RowBounds rowbounds);

    List<Map> selectByExampleWithTranslation(ModuleCriteria example, RowBounds rowbounds);

    List<Module> selectByExample(ModuleCriteria example);

    Module selectByPrimaryKey(Integer modId);

    int updateByExampleSelective(@Param("record") Module record, @Param("example") ModuleCriteria example);

    int updateByExample(@Param("record") Module record, @Param("example") ModuleCriteria example);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}
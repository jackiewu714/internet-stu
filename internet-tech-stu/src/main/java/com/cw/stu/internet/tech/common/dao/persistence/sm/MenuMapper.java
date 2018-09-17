package com.cw.stu.internet.tech.common.dao.persistence.sm;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.cw.stu.internet.tech.common.dao.domain.sm.Menu;
import com.cw.stu.internet.tech.common.dao.domain.sm.MenuCriteria;

public interface MenuMapper {
    int countByExample(MenuCriteria example);

    int deleteByExample(MenuCriteria example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(Menu record);

    int insertListSelective(@Param("record") Menu record, @Param("records") List<Menu> records);

    int replaceListSelective(@Param("record") Menu record, @Param("records") List<Menu> records);

    int replaceSelective(Menu record);

    int insertOnDuplicateKeySelective(Menu record);

    int insertListOnDuplicateKeySelective(@Param("record") Menu record, @Param("records") List<Menu> records);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuCriteria example, RowBounds rowbounds);

    List<Menu> selectByExampleWithBLOBs(MenuCriteria example, RowBounds rowbounds);

    List<Map> selectByExampleWithTranslation(MenuCriteria example, RowBounds rowbounds);

    List<Menu> selectByExample(MenuCriteria example);

    Menu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}
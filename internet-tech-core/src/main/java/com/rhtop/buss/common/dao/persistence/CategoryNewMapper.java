package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.CategoryNew;
import com.rhtop.buss.common.dao.domain.CategoryNewCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CategoryNewMapper {
    long countByExample(CategoryNewCriteria example);

    int deleteByExample(CategoryNewCriteria example);

    int deleteByPrimaryKey(String categoryId);

    int insert(CategoryNew record);

    int insertListSelective(@Param("record") CategoryNew record, @Param("records") List<CategoryNew> records);

    int replaceListSelective(@Param("record") CategoryNew record, @Param("records") List<CategoryNew> records);

    int replaceSelective(CategoryNew record);

    int insertOnDuplicateKeySelective(CategoryNew record);

    int insertListOnDuplicateKeySelective(@Param("record") CategoryNew record, @Param("records") List<CategoryNew> records);

    int insertSelective(CategoryNew record);

    List<CategoryNew> selectByExample(CategoryNewCriteria example, RowBounds rowbounds);

    List<CategoryNew> selectByExampleWithBLOBs(CategoryNewCriteria example, RowBounds rowbounds);

    List<CategoryNew> selectByExample(CategoryNewCriteria example);

    CategoryNew selectByPrimaryKey(String categoryId);

    int updateByExampleSelective(@Param("record") CategoryNew record, @Param("example") CategoryNewCriteria example);

    int updateByExample(@Param("record") CategoryNew record, @Param("example") CategoryNewCriteria example);

    int updateByPrimaryKeySelective(CategoryNew record);

    int updateByPrimaryKey(CategoryNew record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<CategoryNew> listPage(CategoryNewCriteria pagerData);
}
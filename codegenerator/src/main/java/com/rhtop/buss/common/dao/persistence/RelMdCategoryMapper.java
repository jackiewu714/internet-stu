package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.RelMdCategory;
import com.rhtop.buss.common.dao.domain.RelMdCategoryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RelMdCategoryMapper {
    long countByExample(RelMdCategoryCriteria example);

    int deleteByExample(RelMdCategoryCriteria example);

    int deleteByPrimaryKey(String relMdCategoryId);

    int insert(RelMdCategory record);

    int insertListSelective(@Param("record") RelMdCategory record, @Param("records") List<RelMdCategory> records);

    int replaceListSelective(@Param("record") RelMdCategory record, @Param("records") List<RelMdCategory> records);

    int replaceSelective(RelMdCategory record);

    int insertOnDuplicateKeySelective(RelMdCategory record);

    int insertListOnDuplicateKeySelective(@Param("record") RelMdCategory record, @Param("records") List<RelMdCategory> records);

    int insertSelective(RelMdCategory record);

    List<RelMdCategory> selectByExample(RelMdCategoryCriteria example, RowBounds rowbounds);

    List<RelMdCategory> selectByExampleWithBLOBs(RelMdCategoryCriteria example, RowBounds rowbounds);

    List<RelMdCategory> selectByExample(RelMdCategoryCriteria example);

    RelMdCategory selectByPrimaryKey(String relMdCategoryId);

    int updateByExampleSelective(@Param("record") RelMdCategory record, @Param("example") RelMdCategoryCriteria example);

    int updateByExample(@Param("record") RelMdCategory record, @Param("example") RelMdCategoryCriteria example);

    int updateByPrimaryKeySelective(RelMdCategory record);

    int updateByPrimaryKey(RelMdCategory record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<RelMdCategory> listPage(RelMdCategoryCriteria pagerData);
}
package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.Cold;
import com.rhtop.buss.common.dao.domain.ColdCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ColdMapper {
    long countByExample(ColdCriteria example);

    int deleteByExample(ColdCriteria example);

    int deleteByPrimaryKey(String coldId);

    int insert(Cold record);

    int insertListSelective(@Param("record") Cold record, @Param("records") List<Cold> records);

    int replaceListSelective(@Param("record") Cold record, @Param("records") List<Cold> records);

    int replaceSelective(Cold record);

    int insertOnDuplicateKeySelective(Cold record);

    int insertListOnDuplicateKeySelective(@Param("record") Cold record, @Param("records") List<Cold> records);

    int insertSelective(Cold record);

    List<Cold> selectByExample(ColdCriteria example, RowBounds rowbounds);

    List<Cold> selectByExampleWithBLOBs(ColdCriteria example, RowBounds rowbounds);

    List<Cold> selectByExample(ColdCriteria example);

    Cold selectByPrimaryKey(String coldId);

    int updateByExampleSelective(@Param("record") Cold record, @Param("example") ColdCriteria example);

    int updateByExample(@Param("record") Cold record, @Param("example") ColdCriteria example);

    int updateByPrimaryKeySelective(Cold record);

    int updateByPrimaryKey(Cold record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<Cold> listPage(ColdCriteria pagerData);
}
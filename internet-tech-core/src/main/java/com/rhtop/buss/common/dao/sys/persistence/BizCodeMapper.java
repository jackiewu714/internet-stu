package com.rhtop.buss.common.dao.sys.persistence;

import com.rhtop.buss.common.dao.sys.domain.BizCode;
import com.rhtop.buss.common.dao.sys.domain.BizCodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BizCodeMapper {
    long countByExample(BizCodeCriteria example);

    int deleteByExample(BizCodeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizCode record);

    int insertListSelective(@Param("record") BizCode record, @Param("records") List<BizCode> records);

    int replaceListSelective(@Param("record") BizCode record, @Param("records") List<BizCode> records);

    int replaceSelective(BizCode record);

    int insertOnDuplicateKeySelective(BizCode record);

    int insertListOnDuplicateKeySelective(@Param("record") BizCode record, @Param("records") List<BizCode> records);

    int insertSelective(BizCode record);

    List<BizCode> selectByExample(BizCodeCriteria example, RowBounds rowbounds);

    List<BizCode> selectByExampleWithBLOBs(BizCodeCriteria example, RowBounds rowbounds);

    List<BizCode> selectByExample(BizCodeCriteria example);

    BizCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizCode record, @Param("example") BizCodeCriteria example);

    int updateByExample(@Param("record") BizCode record, @Param("example") BizCodeCriteria example);

    int updateByPrimaryKeySelective(BizCode record);

    int updateByPrimaryKey(BizCode record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<BizCode> listPage(BizCodeCriteria pagerData);
}
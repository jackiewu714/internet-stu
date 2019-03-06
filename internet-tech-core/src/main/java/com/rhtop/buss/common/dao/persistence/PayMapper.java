package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.Pay;
import com.rhtop.buss.common.dao.domain.PayCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PayMapper {
    long countByExample(PayCriteria example);

    int deleteByExample(PayCriteria example);

    int deleteByPrimaryKey(String payInfoId);

    int insert(Pay record);

    int insertListSelective(@Param("record") Pay record, @Param("records") List<Pay> records);

    int replaceListSelective(@Param("record") Pay record, @Param("records") List<Pay> records);

    int replaceSelective(Pay record);

    int insertOnDuplicateKeySelective(Pay record);

    int insertListOnDuplicateKeySelective(@Param("record") Pay record, @Param("records") List<Pay> records);

    int insertSelective(Pay record);

    List<Pay> selectByExample(PayCriteria example, RowBounds rowbounds);

    List<Pay> selectByExampleWithBLOBs(PayCriteria example, RowBounds rowbounds);

    List<Pay> selectByExample(PayCriteria example);

    Pay selectByPrimaryKey(String payInfoId);

    int updateByExampleSelective(@Param("record") Pay record, @Param("example") PayCriteria example);

    int updateByExample(@Param("record") Pay record, @Param("example") PayCriteria example);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<Pay> listPage(PayCriteria pagerData);
}
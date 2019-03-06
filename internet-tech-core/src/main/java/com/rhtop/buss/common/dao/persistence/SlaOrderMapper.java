package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.SlaOrder;
import com.rhtop.buss.common.dao.domain.SlaOrderCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SlaOrderMapper {
    long countByExample(SlaOrderCriteria example);

    int deleteByExample(SlaOrderCriteria example);

    int deleteByPrimaryKey(String slaOrderId);

    int insert(SlaOrder record);

    int insertListSelective(@Param("record") SlaOrder record, @Param("records") List<SlaOrder> records);

    int replaceListSelective(@Param("record") SlaOrder record, @Param("records") List<SlaOrder> records);

    int replaceSelective(SlaOrder record);

    int insertOnDuplicateKeySelective(SlaOrder record);

    int insertListOnDuplicateKeySelective(@Param("record") SlaOrder record, @Param("records") List<SlaOrder> records);

    int insertSelective(SlaOrder record);

    List<SlaOrder> selectByExample(SlaOrderCriteria example, RowBounds rowbounds);

    List<SlaOrder> selectByExampleWithBLOBs(SlaOrderCriteria example, RowBounds rowbounds);

    List<SlaOrder> selectByExample(SlaOrderCriteria example);

    SlaOrder selectByPrimaryKey(String slaOrderId);

    int updateByExampleSelective(@Param("record") SlaOrder record, @Param("example") SlaOrderCriteria example);

    int updateByExample(@Param("record") SlaOrder record, @Param("example") SlaOrderCriteria example);

    int updateByPrimaryKeySelective(SlaOrder record);

    int updateByPrimaryKey(SlaOrder record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<SlaOrder> listPage(SlaOrderCriteria pagerData);
}
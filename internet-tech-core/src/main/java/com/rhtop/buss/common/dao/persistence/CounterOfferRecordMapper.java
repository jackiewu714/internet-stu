package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.CounterOfferRecord;
import com.rhtop.buss.common.dao.domain.CounterOfferRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CounterOfferRecordMapper {
    long countByExample(CounterOfferRecordCriteria example);

    int deleteByExample(CounterOfferRecordCriteria example);

    int deleteByPrimaryKey(String slaCounterofferRecordId);

    int insert(CounterOfferRecord record);

    int insertListSelective(@Param("record") CounterOfferRecord record, @Param("records") List<CounterOfferRecord> records);

    int replaceListSelective(@Param("record") CounterOfferRecord record, @Param("records") List<CounterOfferRecord> records);

    int replaceSelective(CounterOfferRecord record);

    int insertOnDuplicateKeySelective(CounterOfferRecord record);

    int insertListOnDuplicateKeySelective(@Param("record") CounterOfferRecord record, @Param("records") List<CounterOfferRecord> records);

    int insertSelective(CounterOfferRecord record);

    List<CounterOfferRecord> selectByExample(CounterOfferRecordCriteria example, RowBounds rowbounds);

    List<CounterOfferRecord> selectByExampleWithBLOBs(CounterOfferRecordCriteria example, RowBounds rowbounds);

    List<CounterOfferRecord> selectByExample(CounterOfferRecordCriteria example);

    CounterOfferRecord selectByPrimaryKey(String slaCounterofferRecordId);

    int updateByExampleSelective(@Param("record") CounterOfferRecord record, @Param("example") CounterOfferRecordCriteria example);

    int updateByExample(@Param("record") CounterOfferRecord record, @Param("example") CounterOfferRecordCriteria example);

    int updateByPrimaryKeySelective(CounterOfferRecord record);

    int updateByPrimaryKey(CounterOfferRecord record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<CounterOfferRecord> listPage(CounterOfferRecordCriteria pagerData);
}
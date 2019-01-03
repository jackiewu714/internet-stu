package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.CounterOffer;
import com.rhtop.buss.common.dao.domain.CounterOfferCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CounterOfferMapper {
    long countByExample(CounterOfferCriteria example);

    int deleteByExample(CounterOfferCriteria example);

    int deleteByPrimaryKey(String counterofferId);

    int insert(CounterOffer record);

    int insertListSelective(@Param("record") CounterOffer record, @Param("records") List<CounterOffer> records);

    int replaceListSelective(@Param("record") CounterOffer record, @Param("records") List<CounterOffer> records);

    int replaceSelective(CounterOffer record);

    int insertOnDuplicateKeySelective(CounterOffer record);

    int insertListOnDuplicateKeySelective(@Param("record") CounterOffer record, @Param("records") List<CounterOffer> records);

    int insertSelective(CounterOffer record);

    List<CounterOffer> selectByExample(CounterOfferCriteria example, RowBounds rowbounds);

    List<CounterOffer> selectByExampleWithBLOBs(CounterOfferCriteria example, RowBounds rowbounds);

    List<CounterOffer> selectByExample(CounterOfferCriteria example);

    CounterOffer selectByPrimaryKey(String counterofferId);

    int updateByExampleSelective(@Param("record") CounterOffer record, @Param("example") CounterOfferCriteria example);

    int updateByExample(@Param("record") CounterOffer record, @Param("example") CounterOfferCriteria example);

    int updateByPrimaryKeySelective(CounterOffer record);

    int updateByPrimaryKey(CounterOffer record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<CounterOffer> listPage(CounterOfferCriteria pagerData);
}
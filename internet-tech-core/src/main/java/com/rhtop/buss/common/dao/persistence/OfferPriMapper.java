package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.OfferPri;
import com.rhtop.buss.common.dao.domain.OfferPriCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OfferPriMapper {
    long countByExample(OfferPriCriteria example);

    int deleteByExample(OfferPriCriteria example);

    int deleteByPrimaryKey(String offerPriId);

    int insert(OfferPri record);

    int insertListSelective(@Param("record") OfferPri record, @Param("records") List<OfferPri> records);

    int replaceListSelective(@Param("record") OfferPri record, @Param("records") List<OfferPri> records);

    int replaceSelective(OfferPri record);

    int insertOnDuplicateKeySelective(OfferPri record);

    int insertListOnDuplicateKeySelective(@Param("record") OfferPri record, @Param("records") List<OfferPri> records);

    int insertSelective(OfferPri record);

    List<OfferPri> selectByExample(OfferPriCriteria example, RowBounds rowbounds);

    List<OfferPri> selectByExampleWithBLOBs(OfferPriCriteria example, RowBounds rowbounds);

    List<OfferPri> selectByExample(OfferPriCriteria example);

    OfferPri selectByPrimaryKey(String offerPriId);

    int updateByExampleSelective(@Param("record") OfferPri record, @Param("example") OfferPriCriteria example);

    int updateByExample(@Param("record") OfferPri record, @Param("example") OfferPriCriteria example);

    int updateByPrimaryKeySelective(OfferPri record);

    int updateByPrimaryKey(OfferPri record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<OfferPri> listPage(OfferPriCriteria pagerData);
}
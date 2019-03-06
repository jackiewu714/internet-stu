package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.Distributor;
import com.rhtop.buss.common.dao.domain.DistributorCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorMapper {
    long countByExample(DistributorCriteria example);

    int deleteByExample(DistributorCriteria example);

    int deleteByPrimaryKey(String disId);

    int insert(Distributor record);

    int insertListSelective(@Param("record") Distributor record, @Param("records") List<Distributor> records);

    int replaceListSelective(@Param("record") Distributor record, @Param("records") List<Distributor> records);

    int replaceSelective(Distributor record);

    int insertOnDuplicateKeySelective(Distributor record);

    int insertListOnDuplicateKeySelective(@Param("record") Distributor record, @Param("records") List<Distributor> records);

    int insertSelective(Distributor record);

    List<Distributor> selectByExample(DistributorCriteria example, RowBounds rowbounds);

    List<Distributor> selectByExampleWithBLOBs(DistributorCriteria example, RowBounds rowbounds);

    List<Distributor> selectByExample(DistributorCriteria example);

    Distributor selectByPrimaryKey(String disId);

    int updateByExampleSelective(@Param("record") Distributor record, @Param("example") DistributorCriteria example);

    int updateByExample(@Param("record") Distributor record, @Param("example") DistributorCriteria example);

    int updateByPrimaryKeySelective(Distributor record);

    int updateByPrimaryKey(Distributor record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<Distributor> listPage(DistributorCriteria pagerData);
}
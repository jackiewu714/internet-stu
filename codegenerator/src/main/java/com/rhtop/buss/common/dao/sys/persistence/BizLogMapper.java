package com.rhtop.buss.common.dao.sys.persistence;

import com.rhtop.buss.common.dao.sys.domain.BizLog;
import com.rhtop.buss.common.dao.sys.domain.BizLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BizLogMapper {
    long countByExample(BizLogCriteria example);

    int deleteByExample(BizLogCriteria example);

    int deleteByPrimaryKey(Long logId);

    int insert(BizLog record);

    int insertListSelective(@Param("record") BizLog record, @Param("records") List<BizLog> records);

    int replaceListSelective(@Param("record") BizLog record, @Param("records") List<BizLog> records);

    int replaceSelective(BizLog record);

    int insertOnDuplicateKeySelective(BizLog record);

    int insertListOnDuplicateKeySelective(@Param("record") BizLog record, @Param("records") List<BizLog> records);

    int insertSelective(BizLog record);

    List<BizLog> selectByExampleWithBLOBs(BizLogCriteria example);

    List<BizLog> selectByExample(BizLogCriteria example, RowBounds rowbounds);

    List<BizLog> selectByExampleWithBLOBs(BizLogCriteria example, RowBounds rowbounds);

    List<BizLog> selectByExample(BizLogCriteria example);

    BizLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") BizLog record, @Param("example") BizLogCriteria example);

    int updateByExampleWithBLOBs(@Param("record") BizLog record, @Param("example") BizLogCriteria example);

    int updateByExample(@Param("record") BizLog record, @Param("example") BizLogCriteria example);

    int updateByPrimaryKeySelective(BizLog record);

    int updateByPrimaryKeyWithBLOBs(BizLog record);

    int updateByPrimaryKey(BizLog record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<BizLog> listPage(BizLogCriteria pagerData);
}
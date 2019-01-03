package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.DailyBackFundReport;
import com.rhtop.buss.common.dao.domain.DailyBackFundReportCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DailyBackFundReportMapper {
    long countByExample(DailyBackFundReportCriteria example);

    int deleteByExample(DailyBackFundReportCriteria example);

    int deleteByPrimaryKey(String reportId);

    int insert(DailyBackFundReport record);

    int insertListSelective(@Param("record") DailyBackFundReport record, @Param("records") List<DailyBackFundReport> records);

    int replaceListSelective(@Param("record") DailyBackFundReport record, @Param("records") List<DailyBackFundReport> records);

    int replaceSelective(DailyBackFundReport record);

    int insertOnDuplicateKeySelective(DailyBackFundReport record);

    int insertListOnDuplicateKeySelective(@Param("record") DailyBackFundReport record, @Param("records") List<DailyBackFundReport> records);

    int insertSelective(DailyBackFundReport record);

    List<DailyBackFundReport> selectByExample(DailyBackFundReportCriteria example, RowBounds rowbounds);

    List<DailyBackFundReport> selectByExampleWithBLOBs(DailyBackFundReportCriteria example, RowBounds rowbounds);

    List<DailyBackFundReport> selectByExample(DailyBackFundReportCriteria example);

    DailyBackFundReport selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") DailyBackFundReport record, @Param("example") DailyBackFundReportCriteria example);

    int updateByExample(@Param("record") DailyBackFundReport record, @Param("example") DailyBackFundReportCriteria example);

    int updateByPrimaryKeySelective(DailyBackFundReport record);

    int updateByPrimaryKey(DailyBackFundReport record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<DailyBackFundReport> listPage(DailyBackFundReportCriteria pagerData);
}
package com.rhtop.buss.common.dao.persistence;

import com.rhtop.buss.common.dao.domain.DailySaleReport;
import com.rhtop.buss.common.dao.domain.DailySaleReportCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DailySaleReportMapper {
    long countByExample(DailySaleReportCriteria example);

    int deleteByExample(DailySaleReportCriteria example);

    int deleteByPrimaryKey(String reportId);

    int insert(DailySaleReport record);

    int insertListSelective(@Param("record") DailySaleReport record, @Param("records") List<DailySaleReport> records);

    int replaceListSelective(@Param("record") DailySaleReport record, @Param("records") List<DailySaleReport> records);

    int replaceSelective(DailySaleReport record);

    int insertOnDuplicateKeySelective(DailySaleReport record);

    int insertListOnDuplicateKeySelective(@Param("record") DailySaleReport record, @Param("records") List<DailySaleReport> records);

    int insertSelective(DailySaleReport record);

    List<DailySaleReport> selectByExample(DailySaleReportCriteria example, RowBounds rowbounds);

    List<DailySaleReport> selectByExampleWithBLOBs(DailySaleReportCriteria example, RowBounds rowbounds);

    List<DailySaleReport> selectByExample(DailySaleReportCriteria example);

    DailySaleReport selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") DailySaleReport record, @Param("example") DailySaleReportCriteria example);

    int updateByExample(@Param("record") DailySaleReport record, @Param("example") DailySaleReportCriteria example);

    int updateByPrimaryKeySelective(DailySaleReport record);

    int updateByPrimaryKey(DailySaleReport record);

    /**
     * 分页方法，方法名后缀必须以listPage结尾
     * 分页使用拦截器方式实现，具体配置详见MapperConfig.xml 
     */
    List<DailySaleReport> listPage(DailySaleReportCriteria pagerData);
}
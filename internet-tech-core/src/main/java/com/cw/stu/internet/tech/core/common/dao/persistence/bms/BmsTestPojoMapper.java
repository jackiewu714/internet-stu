package com.cw.stu.internet.tech.core.common.dao.persistence.bms;

import com.cw.stu.internet.tech.core.common.dao.domain.bms.BmsTestPojo;
import com.cw.stu.internet.tech.core.common.dao.domain.bms.BmsTestPojoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BmsTestPojoMapper {
    long countByExample(BmsTestPojoCriteria example);

    int deleteByExample(BmsTestPojoCriteria example);

    int insert(BmsTestPojo record);

    int insertListSelective(@Param("records") List<BmsTestPojo> records);

    int insertListSelectiveByUnion(@Param("record") BmsTestPojo record, @Param("records") List<BmsTestPojo> records);

    int insertSelective(BmsTestPojo record);

    List<BmsTestPojo> selectByExample(BmsTestPojoCriteria example);

    int updateByExampleSelective(@Param("record") BmsTestPojo record, @Param("example") BmsTestPojoCriteria example);

    int updateByExample(@Param("record") BmsTestPojo record, @Param("example") BmsTestPojoCriteria example);
}
package com.cw.stu.his.common.dao.persistence.bms;

import com.cw.stu.his.common.dao.domain.bms.BmsTestPojo;
import com.cw.stu.his.common.dao.domain.bms.BmsTestPojoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BmsTestPojoMapper {
    long countByExample(BmsTestPojoCriteria example);

    int deleteByExample(BmsTestPojoCriteria example);

    int insert(BmsTestPojo record);

    int insertListSelective(@Param("records") List<BmsTestPojo> records);

    int insertSelective(BmsTestPojo record);

    List<BmsTestPojo> selectByExample(BmsTestPojoCriteria example, RowBounds rowbounds);

    List<BmsTestPojo> selectByExampleWithBLOBs(BmsTestPojoCriteria example, RowBounds rowbounds);

    List<BmsTestPojo> selectByExample(BmsTestPojoCriteria example);

    int updateByExampleSelective(@Param("record") BmsTestPojo record, @Param("example") BmsTestPojoCriteria example);

    int updateByExample(@Param("record") BmsTestPojo record, @Param("example") BmsTestPojoCriteria example);
}
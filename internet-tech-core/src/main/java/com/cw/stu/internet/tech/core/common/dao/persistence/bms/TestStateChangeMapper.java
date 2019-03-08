package com.cw.stu.internet.tech.core.common.dao.persistence.bms;

import com.cw.stu.internet.tech.core.common.dao.domain.bms.TestStateChange;
import com.cw.stu.internet.tech.core.common.dao.domain.bms.TestStateChangeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestStateChangeMapper {
    long countByExample(TestStateChangeCriteria example);

    int deleteByExample(TestStateChangeCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TestStateChange record);

    int insertListSelective(@Param("records") List<TestStateChange> records);

    int insertListSelectiveByUnion(@Param("record") TestStateChange record, @Param("records") List<TestStateChange> records);

    int insertSelective(TestStateChange record);

    List<TestStateChange> selectByExampleWithBLOBs(TestStateChangeCriteria example);

    List<TestStateChange> selectByExample(TestStateChangeCriteria example, RowBounds rowbounds);

    List<TestStateChange> selectByExampleWithBLOBs(TestStateChangeCriteria example, RowBounds rowbounds);

    List<TestStateChange> selectByExample(TestStateChangeCriteria example);

    TestStateChange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TestStateChange record, @Param("example") TestStateChangeCriteria example);

    int updateByExampleWithBLOBs(@Param("record") TestStateChange record, @Param("example") TestStateChangeCriteria example);

    int updateByExample(@Param("record") TestStateChange record, @Param("example") TestStateChangeCriteria example);

    int updateByPrimaryKeySelective(TestStateChange record);

    int updateByPrimaryKeyWithBLOBs(TestStateChange record);

    int updateByPrimaryKey(TestStateChange record);
}
package com.cw.stu;

import com.cw.stu.internet.tech.core.common.dao.domain.bms.TestStateChange;
import com.cw.stu.internet.tech.core.common.dao.persistence.bms.TestStateChangeMapper;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.util.StopWatch;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * TestStateChangeMapper 测试用例
 * @author WuLiangzhi  2019/03/07 10:47
 */
public class TestStateChangeMapperTest {

    @Test
    public void testBatchInsert() {
        String resource = "configs/mybatis/mybatis-config.xml";
        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();

            //获取到mapper，通过mapper进行操作
            TestStateChangeMapper mapper = sqlSession.getMapper(TestStateChangeMapper.class);
            long count = mapper.countByExample(null);
            System.out.println("testBatchInsert（insert操作前）, count: " + count);

            //测试单个插入 insertSelective
//            testInsertSelective(mapper);

            //测试批量插入 insertListSelective
//            testInsertListSelective(mapper);

            //测试批量插入 insertListSelectiveByUnion
            testInsertListSelectiveByUnion(mapper);

            sqlSession.commit();

            count = mapper.countByExample(null);
            System.out.println("testBatchInsert（insert操作后）, count: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 测试单个插入 insertSelective
     *
     * @param mapper    BmsTestPojoMapper
     */
    private void testInsertSelective(TestStateChangeMapper mapper){
        String name1 = "insertSelective";
        List<TestStateChange> list = generateList(10, name1);

        StopWatch stopWatch = new StopWatch(name1);
        stopWatch.start(name1);
        int iRet = mapper.insertSelective(list.get(0));
        System.out.println("testInsertSelective iRet=" + iRet);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    /**
     * 测试批量插入 insertListSelective（效率较低，速度约为union方式的1/4）
     * 模拟结果:
     * 插入2000条数据，耗时 8155 ms
     * @param mapper    BmsTestPojoMapper
     */
    private void testInsertListSelective(TestStateChangeMapper mapper){
        String name1 = "insertListSelective";
        List<TestStateChange> list = generateList(10, name1);

        StopWatch stopWatch = new StopWatch(name1);
        stopWatch.start(name1);
        int iRet = mapper.insertListSelective(list);
        System.out.println("testInsertListSelective iRet=" + iRet);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    /**
     * 测试批量插入 insertListSelectiveByUnion（效率较低，速度约为insert all方式的4倍）【推荐使用此方式】
     * 模拟结果:
     * 插入2000条数据，耗时 2405 ms
     * 插入8000条数据，耗时 73031 ms
     * @param mapper    BmsTestPojoMapper
     */
    private void testInsertListSelectiveByUnion(TestStateChangeMapper mapper){
        String name1 = "insertListSelectiveByUnion";
        List<TestStateChange> list = generateList(8000, name1);

        TestStateChange record = new TestStateChange();
        record.setId(11L);
        record.setOrderNo("11");
        record.setCurState("111");
        record.setTargetState("1111");
        record.setExtraInfo("11111");
        record.setRemark("111111");
        record.setModStaff("1111");
        record.setModTime(new Date());
        StopWatch stopWatch = new StopWatch(name1);
        stopWatch.start(name1);
        int iRet = mapper.insertListSelectiveByUnion(record, list);
        System.out.println("testInsertListSelectiveByUnion iRet=" + iRet);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    /**
     * 生成bean列表
     * @param size  int
     * @param name1 String
     * @return  List<BmsTestPojo>
     */
    private List<TestStateChange> generateList(int size, String name1) {
        List<TestStateChange> list = new ArrayList<>();
        Date now = new Date();
        for (int i = 0; i < size; i++) {
            TestStateChange bean = new TestStateChange();
            bean.setOrderNo(RandomStringUtils.random(6,true,true));
            bean.setCurState(RandomStringUtils.random(3,true,true));
            bean.setTargetState(RandomStringUtils.random(3,true,true));
            bean.setExtraInfo(RandomStringUtils.random(20,true,true));
            bean.setRemark(name1);
            bean.setModStaff(RandomStringUtils.random(6,true,true));
            bean.setModTime(now);

            list.add(bean);
        }

        return list;
    }

}

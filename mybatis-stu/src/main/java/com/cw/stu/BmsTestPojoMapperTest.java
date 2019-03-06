package com.cw.stu;

import com.cw.stu.internet.tech.core.common.dao.domain.bms.BmsTestPojo;
import com.cw.stu.internet.tech.core.common.dao.persistence.bms.BmsTestPojoMapper;
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
import java.util.List;

/**
 * @author WuLiangzhi  2019/03/06 16:19
 */
public class BmsTestPojoMapperTest {

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
            BmsTestPojoMapper mapper = sqlSession.getMapper(BmsTestPojoMapper.class);
            long count = mapper.countByExample(null);
            System.out.println("testBatchInsert（insert操作前）, count: " + count);

            //测试批量插入 insertListSelective
            testInsertListSelective(mapper);

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
     * 测试批量插入 insertListSelective（效率较低，速度约为union方式的1/4）
     * 模拟结果:
     * 插入2000条数据，耗时 8155 ms
     * @param mapper    BmsTestPojoMapper
     */
    private void testInsertListSelective(BmsTestPojoMapper mapper){
        String name1 = "insertListSelective";
        List<BmsTestPojo> list = generateList(name1);

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
     * @param mapper    BmsTestPojoMapper
     */
    private void testInsertListSelectiveByUnion(BmsTestPojoMapper mapper){
        String name1 = "insertListSelectiveByUnion";
        List<BmsTestPojo> list = generateList(name1);

        BmsTestPojo record = new BmsTestPojo();
        record.setName1("11");
        record.setName2("111");
        record.setName3("1111");
        record.setName4("11111");
        record.setName5("111111");
        StopWatch stopWatch = new StopWatch(name1);
        stopWatch.start(name1);
        int iRet = mapper.insertListSelectiveByUnion(record, list);
        System.out.println("testInsertListSelectiveByUnion iRet=" + iRet);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    /**
     * 生成bean列表
     * @return  List<BmsTestPojo>
     */
    private List<BmsTestPojo> generateList(String name1) {
        List<BmsTestPojo> list = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            BmsTestPojo bean = new BmsTestPojo();
            bean.setName1(name1);
            bean.setName2(RandomStringUtils.random(3,true,true));
            bean.setName3(RandomStringUtils.random(4,true,true));
            bean.setName4(RandomStringUtils.random(5,true,true));
            bean.setName5(RandomStringUtils.random(6,true,true));

            list.add(bean);
        }

        return list;
    }

}

package com.cw.stu.spring.transaction.jta.service.impl;

import com.cw.stu.spring.transaction.jta.service.JtaTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author WuLiangzhi  2018/12/29 22:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:configs/spring/applicationContext.xml"})
public class JtaTestServiceImplTest {

    @Autowired
    JtaTestService jtaTestService;

    @Test
    public void testJtaUpdateTransaction() {
        jtaTestService.jtaUpdateTransaction(1, 1L);
    }
}

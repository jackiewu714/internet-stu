package com.cw.stu.spring.transaction.jta.service.impl;

import com.cw.stu.spring.junit.BaseTestCase;
import com.cw.stu.spring.transaction.jta.service.JtaTestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author WuLiangzhi  2018/12/29 22:07
 */
public class JtaTestServiceImplTest extends BaseTestCase {

    @Autowired
    JtaTestService jtaTestService;

    @Test
    public void testJtaUpdateTransaction() {
        jtaTestService.jtaUpdateTransaction(1, 1L);
    }
}

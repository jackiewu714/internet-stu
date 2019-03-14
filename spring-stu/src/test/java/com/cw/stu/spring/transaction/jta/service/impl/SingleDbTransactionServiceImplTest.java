package com.cw.stu.spring.transaction.jta.service.impl;

import com.cw.stu.spring.junit.BaseTestCase;
import com.cw.stu.spring.transaction.jta.service.SingleDbTransactionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @author WuLiangzhi  2019/03/14 10:25
 */
public class SingleDbTransactionServiceImplTest extends BaseTestCase {

    @Autowired
    SingleDbTransactionService singleDbTransactionService;

    @Test
    public void testTransacionWithThread() {
        singleDbTransactionService.transacionWithThread(1L);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

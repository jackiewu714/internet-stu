package com.cw.stu.spring.transaction.jta.service;

/**
 * 单个数据库事务服务
 * @author WuLiangzhi  2019/03/14 10:16
 */
public interface SingleDbTransactionService {

    /**
     * 事务里面启动线程
     * @param productId Long
     */
    void transacionWithThread(Long productId);

}

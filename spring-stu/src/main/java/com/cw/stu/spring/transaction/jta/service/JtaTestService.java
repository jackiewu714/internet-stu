package com.cw.stu.spring.transaction.jta.service;

/**
 * 分布式事务测试服务
 * @author WuLiangzhi  2018/12/29 21:54
 */
public interface JtaTestService {

    /**
     * jta更新事务测试
     * @param loginLogId
     * @param productId
     */
    void jtaUpdateTransaction(Integer loginLogId, Long productId);

}

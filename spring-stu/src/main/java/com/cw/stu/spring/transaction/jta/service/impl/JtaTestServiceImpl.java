package com.cw.stu.spring.transaction.jta.service.impl;

import com.alibaba.fastjson.JSON;
import com.cw.stu.spring.transaction.jta.service.JtaTestService;
import com.cw.stu.spring.transaction.jta.test.dao.domain.Product;
import com.cw.stu.spring.transaction.jta.test.dao.domain.ProductCriteria;
import com.cw.stu.spring.transaction.jta.test.dao.persistence.ProductMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 分布式事务测试服务实现类
 * @author WuLiangzhi  2018/12/29 21:59
 */
public class JtaTestServiceImpl implements JtaTestService {

    private static final Logger logger = LoggerFactory.getLogger(JtaTestServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void jtaUpdateTransaction(Integer loginLogId, Long productId) {
        logger.info("jtaUpdateTransaction begin, loginLogId={}, productId={}", loginLogId, productId);
        List<Product> productList = productMapper.selectByExample(new ProductCriteria());
        logger.info("jtaUpdateTransaction productList={}", JSON.toJSONString(productList));
        logger.info("jtaUpdateTransaction end, loginLogId={}, productId={}", loginLogId, productId);
    }

}

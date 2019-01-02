package com.cw.stu.spring.transaction.jta.service.impl;

import com.alibaba.fastjson.JSON;
import com.cw.stu.spring.transaction.jta.service.JtaTestService;
import com.cw.stu.spring.transaction.jta.study.dao.domain.LoginLog;
import com.cw.stu.spring.transaction.jta.study.dao.persistence.LoginLogMapper;
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
    private LoginLogMapper loginLogMapper;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void jtaUpdateTransaction(Integer loginLogId, Long productId) {
        logger.info("jtaUpdateTransaction begin, loginLogId={}, productId={}", loginLogId, productId);
        List<Product> productList = productMapper.selectByExample(new ProductCriteria());
        logger.info("jtaUpdateTransaction productList={}", JSON.toJSONString(productList));

        doUpdate(loginLogId, productId);
        logger.info("jtaUpdateTransaction end, loginLogId={}, productId={}", loginLogId, productId);
    }

    private void doUpdate(Integer loginLogId, Long productId) {
        updateLoginLog(loginLogId);

//        int i = 10/0; //抛出异常，事务回滚
        updateProduct(productId);
    }

    private void updateLoginLog(Integer loginLogId) {
        LoginLog loginLog = loginLogMapper.selectByPrimaryKey(loginLogId);
        loginLog.setSys("bole");
        int uRet = loginLogMapper.updateByPrimaryKey(loginLog);
        logger.info("updateLoginLog uRet={}", uRet);
    }

    private void updateProduct(Long productId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        product.setProductContent("牙刷是用来刷牙的");
        int uRet = productMapper.updateByPrimaryKey(product);
        logger.info("updateProduct uRet={}", uRet);
    }

}

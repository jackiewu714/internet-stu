package com.cw.stu.spring.transaction.jta.service.impl;

import com.alibaba.fastjson.JSON;
import com.cw.stu.spring.transaction.jta.service.SingleDbTransactionService;
import com.cw.stu.spring.transaction.jta.test.dao.domain.Product;
import com.cw.stu.spring.transaction.jta.test.dao.domain.ProductCriteria;
import com.cw.stu.spring.transaction.jta.test.dao.persistence.ProductMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 单个数据库事务服务实现类
 * @author WuLiangzhi  2019/03/14 10:18
 */
public class SingleDbTransactionServiceImpl implements SingleDbTransactionService {

    private static final Logger logger = LoggerFactory.getLogger(SingleDbTransactionServiceImpl.class);

    @Autowired
    private ProductMapper productMapper;

    /**
     * 事务里面启动线程
     * @param productId Long
     */
    @Override
    public void transacionWithThread(Long productId) {
        logger.info("transacionWithThread begin, productId={}", productId);
        List<Product> productList = productMapper.selectByExample(new ProductCriteria());
        logger.info("transacionWithThread productList={}", JSON.toJSONString(productList));

        doUpdate(productId);
        logger.info("transacionWithThread end, productId={}", productId);

        Thread thread = new Thread(){
            @Override
            public void run() {
                logger.info("thread begin to run...");
                for(int i=0; i<50; i++) {
                    try {
                        Thread.sleep(1000);
                        logger.info("thread sleep 1 second, i={}", i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                logger.info("thread end to run");
            }
        };

        thread.start();
    }

    private void doUpdate(Long productId) {
//        int i = 10/0; //抛出异常，事务回滚
        updateProduct(productId);
    }

    private void updateProduct(Long productId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        product.setProductContent("111牙刷不是用来刷牙的，那是拿来干嘛的？");
        int uRet = productMapper.updateByPrimaryKey(product);
        logger.info("updateProduct uRet={}", uRet);
    }


}

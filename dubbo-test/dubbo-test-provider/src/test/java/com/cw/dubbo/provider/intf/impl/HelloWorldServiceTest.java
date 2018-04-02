package com.cw.dubbo.provider.intf.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description:
 * Author: WuLiangzhi
 * Date: 2017/1/11 10:36
 */
public class HelloWorldServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceTest.class);

    public static void main(String[] args) {
        logger.info("dubbo provider ++++++++++++++++++++++++++++++++++");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configs/spring/applicationContext.xml");
        context.start();
        System.out.println("提供者服务已注册成功");
        try {
            System.in.read(); //让程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

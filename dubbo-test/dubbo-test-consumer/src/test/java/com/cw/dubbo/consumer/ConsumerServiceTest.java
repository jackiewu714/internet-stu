package com.cw.dubbo.consumer;

import com.cw.dubbo.api.intf.IHelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description:
 * Author: WuLiangzhi
 * Date: 2017/1/11 11:10
 */
public class ConsumerServiceTest {

    private static Logger logger = LoggerFactory.getLogger(ConsumerServiceTest.class);

    public static void main(String[] args) {
        logger.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configs/spring/applicationContext.xml");
        context.start();
        IHelloWorldService helloWorldService = (IHelloWorldService) context.getBean("helloWorldService");
        String sayWhat = helloWorldService.sayHello("Jackie");
        System.out.println(sayWhat);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.cw.stu.internet.tech.dubbo.provider.intf.impl;

import com.cw.stu.internet.tech.dubbo.api.intf.IHelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 * Author: WuLiangzhi
 * Date: 2017/1/11 9:55
 */
public class HelloWorldServiceImpl implements IHelloWorldService {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    public String sayHello(String name) {
        String str = "Hello " + name;
        System.out.println(str);
        logger.info("str={}", str);
        return str;
    }
}

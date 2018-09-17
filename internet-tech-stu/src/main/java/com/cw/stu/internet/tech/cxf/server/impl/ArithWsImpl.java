package com.cw.stu.internet.tech.cxf.server.impl;

import com.cw.stu.internet.tech.cxf.server.ArithWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;

/**
 * @author wuliangzhi  2017/10/15 15:28
 **/
@WebService(endpointInterface = "com.cw.stu.internet.tech.cxf.server.ArithWs")
public class ArithWsImpl implements ArithWs
{
    private static final Logger logger = LoggerFactory.getLogger(ArithWsImpl.class);

    @Override
    public int add(int a, int b)
    {
        int result = a + b;
        logger.info("add result={}, a={}, b={}", result, a, b);
        return result;
    }

    @Override
    public int minus(int a, int b)
    {
        int result = a - b;
        logger.info("minus result={}, a={}, b={}", result, a, b);
        return 0;
    }
}

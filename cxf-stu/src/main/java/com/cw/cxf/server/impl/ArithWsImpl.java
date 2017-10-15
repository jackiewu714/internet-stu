package com.cw.cxf.server.impl;

import com.cw.cxf.server.IArithWs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;

/**
 * @author wuliangzhi  2017/10/15 15:28
 **/
@WebService(endpointInterface = "com.cw.cxf.server.IArithWs")
public class ArithWsImpl implements IArithWs
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
        return result;
    }
}

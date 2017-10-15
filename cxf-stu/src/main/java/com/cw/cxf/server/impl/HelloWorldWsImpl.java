package com.cw.cxf.server.impl;

import com.cw.cxf.server.IHelloWorldWs;

/**
 * @author wuliangzhi  2017/10/15 19:19
 **/
public class HelloWorldWsImpl implements IHelloWorldWs
{
    @Override
    public String sayHello(String name)
    {
        return "Hello " + name + "!";
    }
}

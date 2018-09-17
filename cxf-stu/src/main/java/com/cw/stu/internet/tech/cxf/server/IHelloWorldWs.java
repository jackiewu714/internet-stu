package com.cw.stu.internet.tech.cxf.server;

import javax.jws.WebService;

/**
 * @author wuliangzhi  2017/10/15 19:18
 **/
@WebService
public interface IHelloWorldWs
{
    String sayHello(String name);
}

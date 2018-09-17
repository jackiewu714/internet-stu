package com.cw.stu.internet.tech.cxf.server;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author wuliangzhi  2017/10/15 15:27
 **/
@WebService
public interface ArithWs
{
    int add(@WebParam(name = "firstA") int a, @WebParam(name = "firstB") int b);

    int minus(@WebParam(name = "secondA") int a, @WebParam(name = "secondB") int b);
}

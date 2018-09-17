package com.cw.stu.internet.tech.cxf.server.impl;

import com.cw.stu.internet.tech.cxf.server.HelloWS;

import javax.jws.WebService;

@WebService(
        endpointInterface = "com.cw.stu.internet.tech.cxf.server.HelloWS",
        portName = "HelloWSPort",
        serviceName = "HelloWSService"
//        targetNamespace = "http://www.tmp.com/services/hello"
)
public class HelloWSImpl implements HelloWS {

    @Override
    public String welcome(String name) {
        return "Welcome " + name;
    }
}

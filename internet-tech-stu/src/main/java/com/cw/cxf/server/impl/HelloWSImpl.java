package com.cw.cxf.server.impl;

import com.cw.cxf.server.HelloWS;

import javax.jws.WebService;

@WebService(
        endpointInterface = "com.cw.cxf.server.HelloWS",
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

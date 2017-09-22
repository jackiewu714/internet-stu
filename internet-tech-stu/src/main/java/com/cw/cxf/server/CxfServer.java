package com.cw.cxf.server;

import com.cw.cxf.server.impl.HelloWSImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CxfServer {

    public static void main(String[] args) {
        System.out.println("CxfServer begin to deploy webservice...");
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setServiceClass(HelloWS.class);
        //服务发布的地址
        factoryBean.setAddress("http://localhost:8999/services/hello");
        factoryBean.setServiceBean(new HelloWSImpl());
        factoryBean.create();
        System.out.println("CxfServer begin to deploy end...");
     }

}

package com.cw.stu.internet.tech.cxf.server;

import com.cw.stu.internet.tech.cxf.server.impl.ArithWsImpl;
import com.cw.stu.internet.tech.cxf.server.impl.HelloWSImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

public class CxfServer {

    private static void publisHelloWs()
    {
        System.out.println("CxfServer begin to deploy webservice...");
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setServiceClass(HelloWS.class);
        //服务发布的地址
        factoryBean.setAddress("http://localhost:8999/services/hello");
        factoryBean.setServiceBean(new HelloWSImpl());
        factoryBean.create();
        System.out.println("CxfServer begin to deploy end...");
    }

    private static void publishArithWs()
    {
        String address = "http://localhost:8999/services/arith";
        Endpoint.publish(address, new ArithWsImpl());
    }

    public static void main(String[] args) {
        publisHelloWs();
        publishArithWs();
     }

}

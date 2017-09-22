package com.cw.cxf.client;

import com.cw.cxf.client.wsdl.wsimport.hello.HelloWS;
import com.cw.cxf.client.wsdl.wsimport.hello.HelloWSService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class CxfClient {

    static {
        Properties props = System.getProperties();
        props.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");
        props.setProperty("UseSunHttpHandler", "true");
    }

    public void callByJaxws(String name) {
        try {
            URL wsdlUrl = new URL("http://localhost:8999/services/hello?wsdl");
            HelloWSService helloWSService = new HelloWSService(wsdlUrl);
            HelloWS helloWS = helloWSService.getHelloWSPort();
            String welcome = helloWS.welcome(name);
            System.out.println("callByJaxws: " + welcome);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void callByCxf(String name) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(HelloWS.class);
        factoryBean.setAddress("http://localhost:8999/services/hello");
        HelloWS helloWS = factoryBean.create(HelloWS.class);
        String welcome = helloWS.welcome(name);
        System.out.println("callByCxf: " + welcome);
    }

    public static void main(String[] args) {
        CxfClient cxfClient = new CxfClient();
//        cxfClient.callByJaxws("call by jaxws");
        cxfClient.callByCxf("call by cxf");
    }

}

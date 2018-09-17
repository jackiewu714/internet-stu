package com.cw.stu.internet.tech.cxf.client;

import com.cw.stu.internet.tech.cxf.client.wsdl.wsimport.hello.HelloWS;
import com.cw.stu.internet.tech.cxf.client.wsdl.wsimport.hello.HelloWSService;
import com.cw.stu.internet.tech.cxf.server.ArithWs;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class CxfClient
{

    static
    {
        Properties props = System.getProperties();
        props.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");
        props.setProperty("UseSunHttpHandler", "true");
    }

    private void callHelloByJaxws(String name)
    {
        try
        {
            URL wsdlUrl = new URL("http://localhost:8999/services/hello?wsdl");
            HelloWSService helloWSService = new HelloWSService(wsdlUrl);
            HelloWS helloWS = helloWSService.getHelloWSPort();
            String welcome = helloWS.welcome(name);
            System.out.println("callByJaxws: " + welcome);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    private void callHelloByCxf(String name)
    {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(HelloWS.class);
        factoryBean.setAddress("http://localhost:8999/services/hello");
        HelloWS helloWS = factoryBean.create(HelloWS.class);
        String welcome = helloWS.welcome(name);
        System.out.println("callByCxf: " + welcome);
    }

    private void callArith()
    {
        try
        {
            String address = "http://localhost:8999/services/arith?wsdl";
            address = "http://localhost:8088/server/arith?wsdl";
            URL url = new URL(address);
            //命名空间和名称
            QName qName = new QName("http://impl.server.cxf.cw.com/", "ArithWsImplService");
            Service service = Service.create(url, qName);
            ArithWs arithWs = service.getPort(ArithWs.class);
            System.out.println(arithWs.add(2, 3));
            System.out.println(arithWs.minus(2, 3));
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        CxfClient cxfClient = new CxfClient();
//        cxfClient.callHelloByJaxws("call by jaxws");
//        cxfClient.callHelloByCxf("call by cxf");
        cxfClient.callArith();
    }

}

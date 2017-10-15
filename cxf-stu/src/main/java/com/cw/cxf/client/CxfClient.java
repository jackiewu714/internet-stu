package com.cw.cxf.client;

import com.cw.cxf.server.IArithWs;
import com.cw.cxf.server.IHelloWorldWs;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class CxfClient
{
    private static final Logger logger = LoggerFactory.getLogger(CxfClient.class);

    static
    {
        Properties props = System.getProperties();
        props.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");
        props.setProperty("UseSunHttpHandler", "true");
    }

    private void callHelloByJaxws(String name)
    {
//        try
//        {
//            URL wsdlUrl = new URL("http://localhost:8999/services/hello?wsdl");
//            HelloWSService helloWSService = new HelloWSService(wsdlUrl);
//            HelloWS helloWS = helloWSService.getHelloWSPort();
//            String welcome = helloWS.welcome(name);
//            System.out.println("callByJaxws: " + welcome);
//        }
//        catch (MalformedURLException e)
//        {
//            e.printStackTrace();
//        }
    }

    private void callHelloByCxf(String name)
    {
        String address = "http://localhost:8999/services/hello";
        address = "http://localhost:8088/HelloWorld";
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(IHelloWorldWs.class);
        factoryBean.setAddress(address);
        IHelloWorldWs helloWS = factoryBean.create(IHelloWorldWs.class);
        String welcome = helloWS.sayHello("Jackie");
        logger.info("callHelloByCxf welcome={}", welcome);
    }

    private void callArith()
    {
        try
        {
            String address = "http://localhost:8999/services/arith?wsdl";
            address = "http://localhost:8088/Arith?wsdl";
            URL url = new URL(address);
            //命名空间和名称
            QName qName = new QName("http://impl.server.cxf.cw.com/", "ArithWsImplService");
            Service service = Service.create(url, qName);
            IArithWs arithWs = service.getPort(IArithWs.class);
            logger.info("callArith arithWs.add(2, 3)={}", arithWs.add(2, 3));
            logger.info("callArith arithWs.minus(2, 3)={}", arithWs.minus(2, 3));
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
        cxfClient.callHelloByCxf("call by cxf");
        cxfClient.callArith();
    }

}

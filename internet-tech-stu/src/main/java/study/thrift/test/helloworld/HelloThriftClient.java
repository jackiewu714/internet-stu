/**
 * @Title: HelloWorldClient.java
 * @Package com.thrift.test.helloworld
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Dec 14, 2013 9:51:01 AM
 * @version V1.0
 */

package study.thrift.test.helloworld;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import study.thrift.test.helloworld.gen.IHelloThriftService;


/**
 * @ClassName: HelloWorldClient
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 14, 2013 9:51:01 AM
 *
 */

public class HelloThriftClient {
	
	public static final String SERVER_IP = "localhost";
	public static final int SERVER_PORT = 8090;
	public static final int TIMEOUT = 30000;

	/**
	 * 简单的单线程服务模型，一般用于测试(客户端)
	  * @Title: startSimpleClient
	  * @Description: 简单的单线程服务模型，一般用于测试(客户端)
	  * @param userName
	 */
	public void startTSimpleClient(String userName) {
		TTransport transport = null;
		try {
			transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
			//协议要和服务端一致
			TProtocol protocol = new TBinaryProtocol(transport);
			IHelloThriftService.Client client = new IHelloThriftService.Client(protocol);
			transport.open();
			String result = client.sayHello(userName);
			System.out.println("HelloWorldClient->startSimpleClient result: " + result);
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		} finally {
			if(null != transport) {
				transport.close();
			}
		}
	}

	/**
	 * 线程池服务模型，使用标准的阻塞式IO
	  * @Title: startTThreadPoolClient
	  * @Description: 线程池服务模型，使用标准的阻塞式IO
	  * @param userName
	 */
	public void startTThreadPoolClient(String userName) {
		TTransport transport = null;
		try {
			transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
			TProtocol protocol = new TBinaryProtocol(transport);
			IHelloThriftService.Client client = new IHelloThriftService.Client(protocol);
			transport.open();
			String result = client.sayHello(userName);
			System.out.println("HelloWorldClient->startTThreadPoolClient result: " + result);
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		} finally {
			if(transport != null) {
				transport.close();
			}
		}
	}
	
	/**
	 * 使用非阻塞式IO，服务端和客户端需要指定 TFramedTransport 数据传输的方式
	  * @Title: startTNonblockingClient
	  * @Description: 使用非阻塞式IO，服务端和客户端需要指定 TFramedTransport 数据传输的方式
	  * @param userName
	 */
	public void startTNonblockingClient(String userName) {
		TTransport transport = null;
		try {
			transport = new TFramedTransport(new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT));
			TProtocol protocol = new TBinaryProtocol(transport);
			IHelloThriftService.Client client = new IHelloThriftService.Client(protocol);
			transport.open();
			String result = client.sayHello(userName);
			System.out.println("HelloWorldClient->startTNonblockingClient result: " + result);
		}  catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		} finally {
			if(transport != null) {
				transport.close();
			}
		}
	}
	
	public static void main(String[] args) {
		HelloThriftClient client = new HelloThriftClient();
		//client.startTSimpleClient("Nicky");
		//client.startTThreadPoolClient("John");
		client.startTNonblockingClient("Json");
	}

}


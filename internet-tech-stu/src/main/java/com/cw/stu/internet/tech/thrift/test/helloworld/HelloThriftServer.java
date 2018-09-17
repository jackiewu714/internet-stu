/**
 * @Title: HelloWorldServer.java
 * @Package com.thrift.test.helloworld
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Dec 14, 2013 9:32:40 AM
 * @version V1.0
 */

package com.cw.stu.internet.tech.thrift.test.helloworld;

import com.cw.stu.internet.tech.thrift.test.helloworld.gen.HelloThriftServiceImpl;
import com.cw.stu.internet.tech.thrift.test.helloworld.gen.IHelloThriftService;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;


/**
 * @ClassName: HelloWorldServer
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 14, 2013 9:32:40 AM
 *
 */

public class HelloThriftServer {

	public static final int SERVER_PORT = 8090;
	
	/**
	 * 简单的单线程服务模型，一般用于测试(服务端)
	  * @Title: startServer
	  * @Description: 简单的单线程服务模型，一般用于测试
	 */
	public void startTSimpleServer() {
		try {
			System.out.println("HelloWorld TSimpleServer start...");
			TProcessor tprocessor = new IHelloThriftService.Processor(new HelloThriftServiceImpl());
			 
			TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
			//简单的单线程服务模型，一般用于测试
			TServer.Args tArgs = new TServer.Args(serverTransport);
			tArgs.processor(tprocessor);
			tArgs.protocolFactory(new TBinaryProtocol.Factory());
			TServer server = new TSimpleServer(tArgs);
			server.serve();
		} catch (TTransportException e) {
			System.err.println("Server start error!!");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 线程池服务模型，使用标准的阻塞式IO
	  * @Title: startTThreadPoolServer
	  * @Description: 线程池服务模型，使用标准的阻塞式IO
	 */
	public void startTThreadPoolServer() {
		try {
			System.out.println("HelloWorld TThreadPoolServer start...");
			TProcessor tprocessor = new IHelloThriftService.Processor(new HelloThriftServiceImpl());
			
			TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
			
			//线程池服务模型，使用标准的阻塞式IO
			TThreadPoolServer.Args ttpsArgs = new TThreadPoolServer.Args(serverTransport);
			ttpsArgs.processor(tprocessor);
			ttpsArgs.protocolFactory(new TBinaryProtocol.Factory());
			
			TServer server = new TThreadPoolServer(ttpsArgs);
			server.serve();
		} catch (TTransportException e) {
			System.err.println("Server start error!!");
			e.printStackTrace();
		}
	}
	
	/**
	 * 使用非阻塞式IO，服务端和客户端需要指定 TFramedTransport 数据传输的方式
	  * @Title: startTNonblockingServer
	  * @Description: 使用非阻塞式IO，服务端和客户端需要指定 TFramedTransport 数据传输的方式
	 */
	public void startTNonblockingServer () {
		try {
			System.out.println("HelloWorld startTNonblockingServer start...");
			TProcessor tprocessor = new IHelloThriftService.Processor(new HelloThriftServiceImpl());
			
			TNonblockingServerSocket tnbSocketTransport = new TNonblockingServerSocket(SERVER_PORT);
			
			//使用非阻塞式IO，服务端和客户端需要指定 TFramedTransport 数据传输的方式
			TNonblockingServer.Args tnbsArgs = new TNonblockingServer.Args(tnbSocketTransport);
			tnbsArgs.processor(tprocessor);
			tnbsArgs.transportFactory(new TFramedTransport.Factory());
			tnbsArgs.protocolFactory(new TBinaryProtocol.Factory());
			
			TServer server = new TNonblockingServer(tnbsArgs);
			server.serve();
		} catch (TTransportException e) {
			System.err.println("Server start error!!");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		HelloThriftServer server = new HelloThriftServer();
		//server.startTSimpleServer();
		//server.startTThreadPoolServer();
		server.startTNonblockingServer();
	}
	
}

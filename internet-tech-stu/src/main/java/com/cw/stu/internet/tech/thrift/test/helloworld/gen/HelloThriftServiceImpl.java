/**
 * @Title: HelloWorldServiceImpl.java
 * @Package com.thrift.test.helloworld.gen
 * @Description: TODO
 * Copyright: Copyright (c) 2011 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Dec 14, 2013 9:30:33 AM
 * @version V1.0
 */

package com.cw.stu.internet.tech.thrift.test.helloworld.gen;

import org.apache.thrift.TException;

/**
 * @ClassName: HelloWorldServiceImpl
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 14, 2013 9:30:33 AM
 *
 */

public class HelloThriftServiceImpl implements IHelloThriftService.Iface{

	@Override
	public String sayHello(String username) throws TException {
		return "Hi " + username + ", welcome to thrift.";
	}

}

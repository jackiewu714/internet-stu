/**
 * @Title: HelloWordService.java
 * @Package com.cw.spring.test
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 22, 2014 8:37:20 PM
 * @version V1.0
 */

package study.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: HelloWordService
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 22, 2014 8:37:20 PM
 *
 */

public class HelloSpringService {
	
	public String sayHello(String userName) {
		return "Hello, " + userName;
	}
	
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		HelloSpringService hws = (HelloSpringService)ac.getBean("helloSpringService");
		System.out.println(hws.sayHello("Jackie"));
	}

}

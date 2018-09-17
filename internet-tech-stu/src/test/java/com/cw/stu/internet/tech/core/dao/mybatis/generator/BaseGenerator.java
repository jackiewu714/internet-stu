package com.cw.stu.internet.tech.core.dao.mybatis.generator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseGenerator {
    private static ApplicationContext ctxload = new ClassPathXmlApplicationContext();
    static {
	try {
	    Properties properties = getFileProperties("com/cw/stu/internet/tech/core/dao/mybatis/generator/generator.properties");
	    if (properties != null) {
		Set<Object> keySet = properties.keySet();
		for (Object key : keySet) {
		    System.setProperty(key.toString(), properties.getProperty(key.toString()).toString());
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static Properties getFileProperties(String location) {
	Properties properties = new Properties();
	try {
	    InputStream in = ctxload.getResource(location).getInputStream();
	    if (null != in) {
		properties.load(in);
		in.close();
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return properties;
    }

}

package com.codegen.platform.dao.mybatis.generator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseGenerator {
	private static ApplicationContext ctxload = new ClassPathXmlApplicationContext();
	private static Properties properties;
	public static void init() {
		try {
			properties = getFileProperties(
					"com/codegen/platform/dao/mybatis/generator/generator.properties");
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
	
	public static String getProperty(String key) {
		if(properties == null) {
			init();
		}
		return properties.getProperty(key);
	}

}

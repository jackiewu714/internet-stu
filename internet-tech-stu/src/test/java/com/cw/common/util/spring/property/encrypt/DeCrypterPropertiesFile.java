package com.cw.common.util.spring.property.encrypt;

import java.util.Iterator;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.cw.platform.spring.property.encrypt.EncryptWorker;

public class DeCrypterPropertiesFile {

    private static byte[] mainKey = { -46, -38, -47, -72, 53, 48, 53, -71, -85, -71, -78, -80, -4, 53, 48, 53, -57,
	    -21, -50, -16, -73, -76, -79, -32, -46, -21 };

    /**
     * @param args
     */
    public static void main(String[] args) {

//	String url = "E:/study/workspace_clw/yy-study/src/main/resources/test.properties";
	String url = "F:/study/github/java/internet-stu/internet-tech-stu/src/main/resources/test.properties";
	PropertiesConfiguration config = null;
	try {
	    config = new PropertiesConfiguration(url);
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
	Iterator<String> it = config.getKeys();
	while (it.hasNext()) {
	    String key = it.next();
	    String value = config.getString(key);
	    if (value.startsWith("{RSA}")) {
		value = value.replace("{RSA}", "");
		String mingValue = EncryptWorker.getDecodeString(value, mainKey);
		config.setProperty(key, mingValue);
	    }
	}
	try {
	    config.save();
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
    }
}

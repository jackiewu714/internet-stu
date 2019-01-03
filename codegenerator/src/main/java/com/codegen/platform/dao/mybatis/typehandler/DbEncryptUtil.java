package com.codegen.platform.dao.mybatis.typehandler;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.configuration.HierarchicalConfiguration;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.util.SystemPropertyUtils;

import com.codegen.platform.util.AESCription;

/**
 * 
 * @author Jackie
 * 
 */
public final class DbEncryptUtil {
	public static Set<String> encryptTableColumn = new HashSet<String>();
	public static Set<String> encryptTable = new HashSet<String>();
	private static final Log log = LogFactory.getLog(DbEncryptUtil.class);

	static {
		init();
	}

	private static void init() {
		try {
			String resolvedLocation = SystemPropertyUtils.resolvePlaceholders("classpath:db_encrypt.xml");
			URL url = ResourceUtils.getURL(resolvedLocation);
			XMLConfiguration config = new XMLConfiguration(url);
			List tables = config.getList("tables.table[@name]");
			for (int i = 0; i < tables.size(); i++) {
				HierarchicalConfiguration sub = config.configurationAt("tables.table(" + i + ")");
				String tableName = sub.getString("[@name]");
				encryptTable.add(tableName.toUpperCase());
				List cols = sub.getList("cols.col");
				for (Object col : cols) {
					String key = tableName + "." + col.toString();
					key = key.toUpperCase().trim();
					encryptTableColumn.add(key);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static final String strKey = "111222333444";

	public static String getEncodeString(String strMi) {
		return getEncodeString(strMi, strKey);
	}

	private static String getEncodeString(String strMing, String key) {
		return "{RSA}" + AESCription.encrypt(strMing, strKey);
	}

	public static String getDecodeString(String strMi) {
		return getDecodeString(strMi, strKey);
	}

	private static String getDecodeString(String strMi, String strKey) {
		strMi = strMi.replace("{RSA}", "");
		return AESCription.decrypt(strMi, strKey);
	}

	private DbEncryptUtil() {
		throw new RuntimeException("This class is not allowed to be instantialize.");
	}

	public static void main(String[] args) {
		String min = "?????";
		System.out.println("string decoded: " + min);
		String mi = DbEncryptUtil.getEncodeString(min);
		System.out.println("string encoded: " + mi);
		String t = DbEncryptUtil.getDecodeString("{RSA}4524A32CBC8961C82C1C18BE97BD137A");
		System.out.println("string decoded: " + DbEncryptUtil.getDecodeString("{RSA}4524A32CBC8961C82C1C18BE97BD137A"));
	}
}

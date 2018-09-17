/**
 * @Title: RopAppSecretManager.java
 * @Package com.cw.rop.util
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 18, 2014 12:01:46 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.rop.util;

import java.util.HashMap;
import java.util.Map;

import com.rop.security.AppSecretManager;

/**
 * @ClassName: RopAppSecretManager
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 18, 2014 12:01:46 PM
 *
 */

public class RopAppSecretManager implements AppSecretManager{
	
	/**
	 * appkey 和 secret map
	 */
	private static Map<String, String> appKeySecretMap = new HashMap<String, String>();
	
	static {
		appKeySecretMap.put("00001", "abcdeabcdeabcdeabcdeabcde");
		appKeySecretMap.put("00002", "abcdeabcdeabcdeabcdeabcdf");
		appKeySecretMap.put("00003", "abcdeabcdeabcdeabcdeabcdg");
	}

	@Override
	public String getSecret(String appKey) {
		return appKeySecretMap.get(appKey);
	}

	@Override
	public boolean isValidAppKey(String appKey) {
		return getSecret(appKey)!=null;
	}

}

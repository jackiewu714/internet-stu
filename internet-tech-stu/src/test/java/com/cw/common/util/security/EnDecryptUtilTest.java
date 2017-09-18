/**
 * @Title: EnDecryptUtilTest.java
 * @Package com.yy.rp.common.util.security
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date May 16, 2014 8:15:59 PM
 * @version V1.0
 */

package com.cw.common.util.security;

import org.junit.Test;

import com.cw.platform.util.security.MD5Util;
import com.cw.platform.util.security.SHAUtil;

/**
 * @ClassName: EnDecryptUtilTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date May 16, 2014 8:15:59 PM
 *
 */

public class EnDecryptUtilTest {

    @Test
    public void encrypt() {
	String srcStr = "IM_AUTO_UNLOCK";
	String md5Str = MD5Util.MD5(srcStr);
	System.out.println("md5Str=" + md5Str);
	
	String sha1Str = SHAUtil.SHA1(srcStr);
	System.out.println("sha1Str=" + sha1Str);
	
	String str = md5Str + srcStr + sha1Str;
	System.out.println("str=" + str);
	String miStr = MD5Util.MD5(str);
	System.out.println("miStr=" + miStr);
	
    }
    
}

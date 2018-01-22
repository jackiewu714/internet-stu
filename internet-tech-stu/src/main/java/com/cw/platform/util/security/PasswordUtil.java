/**
 * @Title: PasswordUtil.java
 * @Package com.yy.rp.common.util.security
 * @Description: 密码加密工具类
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date May 16, 2014 8:30:04 PM
 * @version V1.0
 */

package com.cw.platform.util.security;

/**
 * @ClassName: PasswordUtil
 * @Description: 密码加密工具类
 * @author WuLiangzhi
 * @date May 16, 2014 8:30:04 PM
 *
 */

public class PasswordUtil {

    /**
     * 加密密码
     * @Title: encryptPassword
     * @Description: 加密密码
     * @param password    密码明文
     * @return 密文
     */
    public static String encryptPassword(String password) {
        //先对密码做MD5加密，生成密文
        String md5Str = MD5Util.MD5(password);

        //再对密码生成SHA消息摘要
        String sha1Str = SHAUtil.SHA1(password);

        //MD5密文+明文+SHA1摘要，作为明文再做MD5加密，得到最终密码
        String str = md5Str + password + sha1Str;
        return MD5Util.MD5(str);
    }

    public static void main(String[] args) {
        //String password = "123456";
        //String password = "majie123456";
        String password = "hF18620889420";
        String miStr = PasswordUtil.encryptPassword(password);
        System.out.println("密码" + password + " 加密结果 miStr=" + miStr);
    }

}

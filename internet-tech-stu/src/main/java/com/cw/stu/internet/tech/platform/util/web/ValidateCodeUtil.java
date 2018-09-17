/**
 * @Title: ValidateCodeUtil.java
 * @Package com.yy.rp.common.util.web
 * @Description: 验证码工具类
 * Copyright: Copyright (c) 2014
 * Company:YY
 * @author WuLiangzhi
 * @date May 12, 2014 2:03:55 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform.util.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: ValidateCodeUtil
 * @Description: 验证码工具类
 * @author WuLiangzhi
 * @date May 12, 2014 2:03:55 PM
 *
 */

public class ValidateCodeUtil {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(ValidateCodeUtil.class);

    /**
     * 验证码校验
     * @Title: checkCode
     * @Description: 验证码校验
     * @param type    对应字典 DictConstant.VALIDATE_CODE_TYPE
     * @param inputCode    用户输入的验证码
     * @param request        HttpServletRequest
     * @return true-通过    false-不通过
     */
    public static boolean checkCode(String type, String inputCode, HttpServletRequest request) {
        if ((inputCode == null || "".equals(inputCode)) || (type == null || "".equals(type))) {
            return false;
        }
        String sessionCode = (String) request.getSession().getAttribute(type);
        boolean checkRet = inputCode.equalsIgnoreCase(sessionCode);

        logger.info("ValidateCodeUtil->checkCode, inputCode={}, sessionCode={}, checkRet={}",
                new Object[]{inputCode, sessionCode, checkRet});

        if (checkRet) {//从session中移除
            request.getSession().removeAttribute(type);
        }
        return checkRet;

    }

}

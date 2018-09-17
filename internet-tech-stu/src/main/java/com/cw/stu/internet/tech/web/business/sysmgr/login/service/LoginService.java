/**
 * @Title: LoginService.java
 * @Package com.yy.rp.business.sysmgr.login.service
 * @Description: 登录services
 * Copyright: Copyright (c) 2014
 * Company:YY
 * @author WuLiangzhi
 * @date May 7, 2014 10:44:24 AM
 * @version V1.0
 */

package com.cw.stu.internet.tech.web.business.sysmgr.login.service;

import java.util.List;

import com.cw.stu.internet.tech.common.dao.domain.sm.Staff;
import com.cw.stu.internet.tech.common.dao.domain.sm.StaffCriteria;
import com.cw.stu.internet.tech.common.dao.persistence.sm.StaffMapper;
import com.cw.stu.internet.tech.platform.util.Result;
import com.cw.stu.internet.tech.platform.util.security.PasswordUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: LoginService
 * @Description: 登录services
 * @author WuLiangzhi
 * @date May 7, 2014 10:44:24 AM
 *
 */

public class LoginService {

    /**
     * log printer
     */
    private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    private StaffMapper staffMapper;

    public Result checkAccount(String staffName, String password, boolean doEncrypt) {
        Result result = new Result();
        StaffCriteria sc = new StaffCriteria();
        sc.setStaffName(staffName);
        if (doEncrypt) {
            sc.setPassword(PasswordUtil.encryptPassword(password));
        } else {
            sc.setPassword(password);
        }

        List<Staff> staffList = staffMapper.selectByExample(sc);
        if (staffList != null && staffList.size() > 0) {
            result.setSuccess(true);
            result.setMessage("账号验证通过");
            result.setResult(staffList.get(0)); //取出用户信息
        } else {
            result.setSuccess(false);
            result.setMessage("登录失败，可能用户名或密码不正确，请重新输入！");
        }

        logger.info("staff={} checkAccount result={}", staffName, result);
        return result;
    }

}

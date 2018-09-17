/**
 * @Title: DateSourceTest.java
 * @Package com.yy.zbase.platform
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Jul 21, 2015 5:16:44 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.platform;

import com.cw.stu.internet.tech.platform.util.Result;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description: TODO
 * @author WuLiangzhi
 * @date Jul 21, 2015 5:16:44 PM
 *
 */

public class DateSourceTest extends BaseSpringTest {

    private static final Logger LOG = LoggerFactory.getLogger(DateSourceTest.class);

    @Autowired
    private DataSource dataSource;

    @Autowired
//    private UserInfoMapper userInfoMapper;

    @Test
    public void testConn() {
        connectToDB(dataSource, "dataSource");
    }

    private Result connectToDB(DataSource dataSource, String dataSourceName) {
        Result result = new Result();
        Connection conn = null;
        PreparedStatement psta = null;
        ResultSet rs = null;
        String now = "";
        String sql = "select sysdate() as now_time from dual";
        try {
            conn = dataSource.getConnection();
            psta = conn.prepareStatement(sql);
            rs = psta.executeQuery();
            while (rs.next()) {
                now = rs.getString("now_time");
            }
            result.setResult(now);
            LOG.error("dataSourceName={}, now={}", dataSourceName, now);
            result.setSuccess(true);
            result.setMessage("连接成功");
        } catch (Exception e) {
            LOG.error("dataSourceName={} error, reason: ", dataSourceName);
            LOG.error(e.getMessage(), e);
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (psta != null)
                    psta.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                LOG.error(e.getMessage(), e);
            }
        }
        return result;
    }

    @Test
    public void testUserInfo() {
//	UserInfo userInfo = new UserInfo();
//	userInfo.setCreateTime(new Date());
//	userInfo.setEmail("zbase@yy.com");
//	userInfo.setLogo("http://image.yy.com/yyfandomimage/92255eccbcdff253b3eda50bee43508b226c53a8");
//	userInfo.setMobile("13300001111");
//	userInfo.setNick("野驴");
//	userInfo.setSex("male");
//	userInfo.setSign("没有个性，所以没有签名");
//	userInfo.setStatus("S0A");
//	userInfo.setAccType(100);
//	userInfo.setUsername("wlz001");
//
//	int iRet = userInfoMapper.insertSelective(userInfo);
//	LOG.info("testUserInfo iRet={}", iRet);
    }

}

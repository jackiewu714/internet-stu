/**
 * @Title: Slf4jTest.java
 * @Package com.clw.llww.slf4j
 * @Description: TODO
 * Copyright: Copyright (c) 2011
 * Company:LLWW
 * @author WuLiangzhi
 * @date Nov 8, 2013 10:22:47 AM
 * @version V1.0
 */

package com.cw.stu.internet.tech.sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Slf4jTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Nov 8, 2013 10:22:47 AM
 *
 */

public class Slf4jTest {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    public static void testException() {
        String cardType = "1";
        String trackData = "2501302016=99015014754";
        String patientId = "2501302016";
        try {
            int i = 100 / 0;
        } catch (Exception e) {
//			logger.error (String.format ("findPatientInfoByTrackData 获取患者基本信息失败 cardType=%s, trackData=%s", cardType, trackData), e);
//			logger.error(e.getMessage(), e);
            logger.error("findPatientInfoByCardNo 获取患者基本信息失败 patientId={}", patientId, e);
        }
    }

    public static void main(String[] args) {
        logger.debug("This is {} first {} class. 23333333333", new Object[]{"my", "slf4j"});
        testException();
    }

}

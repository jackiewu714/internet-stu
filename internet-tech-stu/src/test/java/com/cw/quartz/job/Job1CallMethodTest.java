/**
 * @Title: CallMethodJobTest.java
 * @Package com.cw.quartz.job
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Dec 29, 2016 1:13:09 PM
 * @version V1.0
 */

package com.cw.quartz.job;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.cw.platform.BaseSpringTest;

/**
 * @ClassName: CallMethodJobTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 29, 2016 1:13:09 PM
 * 
 */

public class Job1CallMethodTest extends BaseSpringTest {

	@Test
	public void exeJob() {
		while (true) {
//			logger.info("CallMethodJobTest->exeJob");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

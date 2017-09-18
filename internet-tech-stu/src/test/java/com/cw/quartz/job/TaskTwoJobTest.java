/**
 * @Title: TaskOneJobTest.java
 * @Package com.cw.quartz.job
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Dec 28, 2016 7:53:09 PM
 * @version V1.0
 */

package com.cw.quartz.job;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cw.platform.BaseSpringTest;

/**
 * @ClassName: TaskOneJobTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 28, 2016 7:53:09 PM
 * 
 */

public class TaskTwoJobTest extends BaseSpringTest {

	@Autowired
	private TaskTwoJob taskTwoJob;

	@Test
	public void exeJob() {
		while (true) {
			logger.info("TaskTwoJobTest222->exeJob");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

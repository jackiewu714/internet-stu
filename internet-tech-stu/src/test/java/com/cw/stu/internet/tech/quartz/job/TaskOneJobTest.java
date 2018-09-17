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

package com.cw.stu.internet.tech.quartz.job;

import java.util.concurrent.TimeUnit;

import com.cw.stu.internet.tech.platform.BaseSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName: TaskOneJobTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 28, 2016 7:53:09 PM
 * 
 */

public class TaskOneJobTest extends BaseSpringTest {

	@Autowired
	private TaskOneJob taskOneJob;

	@Test
	public void exeJob() {
		while (true) {
//			logger.info("TaskOneJobTest111->exeJob");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

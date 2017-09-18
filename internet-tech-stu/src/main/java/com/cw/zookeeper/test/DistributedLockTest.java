/**
 * @Title: DistributedLockTest.java
 * @Package com.cw.zookeeper.test
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Jan 18, 2017 3:33:09 PM
 * @version V1.0
 */

package com.cw.zookeeper.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cw.zookeeper.lock.DistributedLock;

/**
 * @ClassName: DistributedLockTest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Jan 18, 2017 3:33:09 PM
 *
 */

public class DistributedLockTest {
	
	private static final Logger logger = LoggerFactory.getLogger(DistributedLockTest.class);

	@Ignore
	@Test
	public void testLock() {
		System.out.println("testLock begin...");
		String lockName = "statPicBizAuditDataByMinute";
		DistributedLock lock = new DistributedLock(lockName);
		lock.lock();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
		
		lock.unlock();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
		System.out.println("testLock end.");
	}
	
	@Test
	public void testMultiThreadLock() {
		int threadSize = 5;
		ExecutorService executorService = Executors.newFixedThreadPool(threadSize);
		for(int i=0; i<threadSize; i++) {
			//在未来某个时间执行给定的命令。该命令可能在新的线程、已入池的线程或者正调用的线程中执行，这由 Executor 实现决定。
			executorService.execute(new Worker());
		}
		
		//启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
		executorService.shutdown();
		
		try {
			//请求关闭、发生超时或者当前线程中断，无论哪一个首先发生之后，都将导致阻塞，直到所有任务完成执行。 
			//如果此执行程序终止，则返回 true；如果终止前超时期满，则返回 false
			while(!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
				logger.info("testMultiThreadLock, 线程池没有关闭");
			}
			logger.info("testMultiThreadLock, 线程池关闭");
		} catch (InterruptedException e) {
			logger.error(e.getMessage(), e);
		}
	}
	
}

class Worker implements Runnable{

	private static final Logger logger = LoggerFactory.getLogger(Worker.class);
	
	private String lockName = "statPicBizAuditDataByMinute";
	
	@Override
	public void run() {
		logger.info("Worker->run, begin...");
		DistributedLock lock = new DistributedLock(lockName);
		lock.lock();
		
		logger.info("Worker->run, end");
	}
	
}

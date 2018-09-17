package com.cw.stu.internet.tech.quartz.job;

import java.util.concurrent.TimeUnit;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
@DisallowConcurrentExecution
public class Job1CallMethod {

    private static final Logger logger = LoggerFactory.getLogger(Job1CallMethod.class);

    /**
     * @param context JobExecutionContext	要使MyDetailQuartzJobBean中的executeInternal方法中利用反射机制调用到相应的方法
     * @Title: method1
     * @Description: TODO
     */
    public void method1(JobExecutionContext context) {
        logger.info("[1111]Job1CallMethod->method1, 11111111111111111");
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;
    }

    /**
     * @param context JobExecutionContext	要使MyDetailQuartzJobBean中的executeInternal方法中利用反射机制调用到相应的方法
     * @Title: method2
     * @Description: TODO
     */
    public void method2(JobExecutionContext context) {
        logger.info("[1111]Job1CallMethod->method2, 22222222222222222");
    }

    /**
     * @param context JobExecutionContext	要使MyDetailQuartzJobBean中的executeInternal方法中利用反射机制调用到相应的方法
     * @Title: method3
     * @Description: TODO
     */
    public void method3(JobExecutionContext context) {
        logger.info("[1111]Job1CallMethod->method3, 33333333333333333");
    }


}

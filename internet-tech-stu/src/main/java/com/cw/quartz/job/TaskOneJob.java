package com.cw.quartz.job;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Repository;

@Repository
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class TaskOneJob extends QuartzJobBean {

    private Logger logger = LoggerFactory.getLogger(TaskOneJob.class);

    protected void executeInternal(JobExecutionContext jobExecutionContext)
            throws JobExecutionException {

//		logger.info("-- TaskOneJob111 -->>>>" + Calendar.getInstance().getTimeInMillis());
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;

    }

    protected void executeTaskOne() {

        logger.info("-- TaskOneJob111 executeTaskOne -->>>>"
                + Calendar.getInstance().getTimeInMillis());

    }

}

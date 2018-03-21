package com.cw.quartz.job;

import java.util.Calendar;

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
public class TaskTwoJob extends QuartzJobBean {

    private Logger logger = LoggerFactory.getLogger(TaskTwoJob.class);

    protected void executeInternal(JobExecutionContext jobExecutionContext)
            throws JobExecutionException {
        logger.info("-- TaskTwoJob222 -->>>>" + Calendar.getInstance().getTimeInMillis());
    }

}

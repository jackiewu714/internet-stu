/**
 * @Title: MyDetailQuartzJobBean.java
 * @Package com.cw.quartz.support
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Dec 29, 2016 12:17:43 PM
 * @version V1.0
 */

package com.cw.quartz.support;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @ClassName: MyDetailQuartzJobBean
 * @Description: TODO
 * @author WuLiangzhi
 * @date Dec 29, 2016 12:17:43 PM
 *
 */
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class MyDetailQuartzJobBean extends QuartzJobBean {

    private String targetObject;
    private String targetMethod;
    private ApplicationContext applicationContext;

    @Override
    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        try {
            Object otargetObj = applicationContext.getBean(targetObject);
            Method m = null;
            try {
                m = otargetObj.getClass().getMethod(targetMethod,
                        new Class[]{JobExecutionContext.class}); // 方法中的参数是JobExecutionContext类型
                m.invoke(otargetObj, new Object[]{context});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTargetObject(String targetObject) {
        this.targetObject = targetObject;
    }

    public void setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


}

package com.cw.platform;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

import com.alibaba.fastjson.JSON;
import com.cw.platform.util.SpringUtils;

/**
 * Junit 测试 抽象基类
 *
 * @author Administrator
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:/configs/spring/applicationContext.xml"})
// @ContextConfiguration(value = {"classpath*:applicationContext*.xml",
// "/datasource.xml"})
public abstract class BaseSpringTest implements InitializingBean {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ApplicationContext context;

    public BaseSpringTest() {
        super();
        SpringUtils.setContext(context);
        initSlf4jConfig();
    }

    public void print2JSONString(Object o) {
        // if(null != o)
        {
            String json = JSON.toJSONString(o);
            System.out.println(json);
        }
    }

    public void print(Object o) {
        String json = JSON.toJSONString(o);
        System.out.println(json);
    }

    /**
     * 初始化logback配置文件
     *
     * @Title: initSlf4jConfig
     * @Description: 初始化logback配置文件
     */
    protected void initSlf4jConfig() {
        String logbackCfgPath = "src/test/resources/logback-test.xml";
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        try {
            loggerContext.reset();
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            joranConfigurator.doConfigure(logbackCfgPath);
        } catch (JoranException e) {
            e.printStackTrace();
        }
        StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContext);
        System.out.println("==============================");
        logger.info("Hello, logback config filepath={}", logbackCfgPath);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        SpringUtils.setContext(context);
    }

}

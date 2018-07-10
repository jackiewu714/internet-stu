package org.apache.commons.lang.time;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WuLiangzhi  2018/07/10 11:10
 */
public class StopWatchTest {

    private static Logger s_logger = LoggerFactory.getLogger(StopWatchTest.class);

    @Test
    public void testStopWatch1() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        //统计计时点
        Thread.sleep(1000);
        stopWatch.split();
//        s_logger.info("step1, stopWatch.getTime()={}", stopWatch.getTime());
        s_logger.info("step1, stopWatch.getSplitTime()={}", stopWatch.getSplitTime());

        //统计计时点
        Thread.sleep(1000);
        stopWatch.split();
        s_logger.info("step2, stopWatch.getSplitTime()={}", stopWatch.getSplitTime());

        //复位后, 重新计时
        stopWatch.reset();
        stopWatch.start();
        Thread.sleep(1000);
        s_logger.info("step3, stopWatch.getTime()={}", stopWatch.getTime());

        //暂停 与 恢复
        stopWatch.suspend(); //暂停
        s_logger.info("暂停2秒钟");
        Thread.sleep(2000);
        s_logger.info("step4, stopWatch.getTime()={}", stopWatch.getTime()); //暂停期间停止计时

        stopWatch.resume(); //恢复
        Thread.sleep(1000);
        stopWatch.stop();
        s_logger.info("step5, stopWatch.getTime()={}", stopWatch.getTime());
    }

}

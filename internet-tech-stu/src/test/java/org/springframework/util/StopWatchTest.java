package org.springframework.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WuLiangzhi  2018/07/10 11:23
 */
public class StopWatchTest {

    private static Logger s_logger = LoggerFactory.getLogger(StopWatchTest.class);

    @Test
    public void testStopWatch1() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("起床");
        Thread.sleep(1000);
        stopWatch.stop();

        stopWatch.start("洗漱");
        Thread.sleep(2000);
        stopWatch.stop();

        stopWatch.start("锁门");
        Thread.sleep(500);
        stopWatch.stop();

        s_logger.info(stopWatch.prettyPrint());
        System.out.println(stopWatch.prettyPrint());
    }

}

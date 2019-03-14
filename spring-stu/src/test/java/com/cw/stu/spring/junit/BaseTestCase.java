package com.cw.stu.spring.junit;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author WuLiangzhi  2019/03/14 10:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:configs/spring/applicationContext.xml"})
public class BaseTestCase {
}

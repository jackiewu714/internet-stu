/**
 * @Title: RedisTest.java
 * @Package com.clw.redis
 * @Description: Jedis测试
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Mar 14, 2014 4:43:25 PM
 * @version V1.0
 */

package com.cw.stu.internet.tech.redis;

import java.util.List;

import redis.clients.jedis.Jedis;


/**
 * @ClassName: RedisTest
 * @Description: Jedis测试
 * @author WuLiangzhi
 * @date Mar 14, 2014 4:43:25 PM
 *
 */

public class RedisTest {

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */

    public static void main(String[] args) {
        Jedis redis = new Jedis("localhost", 6379);
        redis.hset("yyzbase", "music", "music.yy.com");
        redis.hset("yyzbase", "mall", "mall.yy.com");
        redis.hset("yyzbase", "admin", "admin.yy.com");
        redis.hset("yyzbase", "kfapp", "kfapp.yy.com");

        System.out.println("put done 1...");

        List list = redis.hmget("yyzbase", "music", "mall", "admin");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("value[" + i + "]=" + list.get(i));
        }

    }

}

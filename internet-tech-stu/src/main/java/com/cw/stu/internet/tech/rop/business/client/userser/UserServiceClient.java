/**
 * @Title: UserServiceClient.java
 * @Package com.cw.rop.client.userser
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Apr 18, 2014 9:53:04 AM
 * @version V1.0
 */

package com.cw.stu.internet.tech.rop.business.client.userser;

import com.alibaba.fastjson.JSON;
import com.cw.stu.internet.tech.rop.business.server.userser.LogonRequest;
import com.cw.stu.internet.tech.rop.business.server.userser.LogonResponse;
import com.rop.client.CompositeResponse;
import com.rop.client.DefaultRopClient;
import com.rop.client.RopClient;

/**
 * @ClassName: UserServiceClient
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 18, 2014 9:53:04 AM
 *
 */

public class UserServiceClient {

    public static final String SERVER_URL = "http://localhost:8088/router";
    public static final String APP_KEY = "00001";
    public static final String APP_SECRET = "abcdeabcdeabcdeabcdeabcde";

    private RopClient ropClient = new DefaultRopClient(SERVER_URL, APP_KEY, APP_SECRET);

    public void createSession() {
        LogonRequest ropRequest = new LogonRequest();
        ropRequest.setUserName("Jackie");
        ropRequest.setPassword("123456");

        CompositeResponse response = ropClient.buildClientRequest().get(ropRequest, LogonResponse.class,
                "user.getSession", "1.0");
        System.out.println("response=" + JSON.toJSONString(response));
    }

    /**
     * @Title: main
     * @Description: TODO
     * @param args
     */

    public static void main(String[] args) {
        UserServiceClient usc = new UserServiceClient();
        usc.createSession();
    }

}

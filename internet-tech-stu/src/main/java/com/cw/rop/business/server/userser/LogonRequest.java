/**
 * @Title: LogonRequest.java
 * @Package com.cw.rop.userser
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Apr 17, 2014 8:23:19 PM
 * @version V1.0
 */

package com.cw.rop.business.server.userser;

import javax.validation.constraints.Pattern;

import com.rop.AbstractRopRequest;


/**
 * @ClassName: LogonRequest
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 17, 2014 8:23:19 PM
 *
 */

public class LogonRequest extends AbstractRopRequest {

    @Pattern(regexp = "\\w{4,30}")
    private String userName;

    @Pattern(regexp = "\\w{6,30}")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

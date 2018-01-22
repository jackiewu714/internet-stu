/**
 * @Title: UserRopService.java
 * @Package com.cw.rop.userser
 * @Description: TODO
 * Copyright: Copyright (c) 2014
 * Company:YY Inc
 * @author WuLiangzhi
 * @date Apr 17, 2014 8:21:34 PM
 * @version V1.0
 */

package com.cw.rop.business.server.userser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rop.annotation.IgnoreSignType;
import com.rop.annotation.NeedInSessionType;
import com.rop.annotation.ServiceMethod;
import com.rop.annotation.ServiceMethodBean;
import com.rop.session.SimpleSession;

/**
 * @ClassName: UserRopService
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 17, 2014 8:21:34 PM
 *
 */
@ServiceMethodBean(version = "1.0")
public class UserRopServiceBean {

    /**
     * log printer
     */
    private static Logger logger = LoggerFactory.getLogger(UserRopServiceBean.class);

    @ServiceMethod(method = "user.getSession", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.NO)
    public Object getSession(LogonRequest request) {
        logger = LoggerFactory.getLogger(UserRopServiceBean.class);
        logger.debug("UserRopService->getSession, request=" + request);
        logger.error("UserRopService->getSession, request=" + request);

        // 创建一个session
        SimpleSession session = new SimpleSession();
        session.setAttribute("", request.getUserName());
        request.getRopRequestContext().addSession("mockSession1", session);

        // 返回响应
        LogonResponse logonResponse = new LogonResponse();
        logonResponse.setSessionId("mockSession1");

        logger.info("UserRopService->getSession, response=" + logonResponse);
        return logonResponse;
    }

}

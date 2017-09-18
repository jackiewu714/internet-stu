/**
 * @Title: LogonResponse.java
 * @Package com.cw.rop.userser
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY Inc
 * 
 * @author WuLiangzhi
 * @date Apr 17, 2014 8:25:33 PM
 * @version V1.0
 */

package com.cw.rop.business.server.userser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: LogonResponse
 * @Description: TODO
 * @author WuLiangzhi
 * @date Apr 17, 2014 8:25:34 PM
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="logonResponse")
public class LogonResponse {

	private String sessionId;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	
}

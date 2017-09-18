/**
 * @Title: MenuExtend.java
 * @Package com.yy.rp.business.sysmgr.grant.domain
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date May 7, 2014 4:54:45 PM
 * @version V1.0
 */

package com.cw.web.business.sysmgr.grant.domain;

import com.cw.common.dao.domain.sm.Menu;

/**
 * @ClassName: MenuExtend
 * @Description: 菜单扩展bean
 * @author WuLiangzhi
 * @date May 7, 2014 4:54:45 PM
 *
 */

public class MenuExtend extends Menu {

    /**
      * @Fields serialVersionUID : 序列号
      */
    
    private static final long serialVersionUID = -3932419752468990044L;

    private String modUrl; //对应的模块url

    public String getModUrl() {
        return modUrl;
    }

    public void setModUrl(String modUrl) {
        this.modUrl = modUrl;
    }
    
    
    
}

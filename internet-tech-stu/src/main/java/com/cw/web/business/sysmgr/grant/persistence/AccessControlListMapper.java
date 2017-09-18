package com.cw.web.business.sysmgr.grant.persistence;

import java.util.List;
import java.util.Map;

import com.cw.web.business.sysmgr.grant.domain.MenuExtend;

public interface AccessControlListMapper {

    /**
     * 加载用户可访问url
     * 
     * @param param
     * @return
     */
    public List<String> getAccessUrlList(Map<String, Integer> param);
    
    /**
     * 加载用户可访问url
     * 
     * @param param
     * @return
     */
    public List<MenuExtend> getAccessMenuList(Map<String, Integer> param);
}

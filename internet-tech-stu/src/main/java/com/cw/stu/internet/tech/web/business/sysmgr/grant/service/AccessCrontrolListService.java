package com.cw.stu.internet.tech.web.business.sysmgr.grant.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cw.stu.internet.tech.web.business.sysmgr.grant.domain.MenuExtend;
import com.cw.stu.internet.tech.web.business.sysmgr.grant.persistence.AccessControlListMapper;

/**
 * 权限控制service
 *
 * @author WuLiangzhi
 * @ClassName: AccessCrontrolListService
 * @Description: 权限控制service
 * @date May 7, 2014 11:49:41 AM
 */
@Service
public class AccessCrontrolListService {

    @Autowired
    AccessControlListMapper accessControlListMapper;

    public boolean isAccessUrl(String url) {

        return false;
    }

    /**
     * 查询有权限访问的菜单或者按钮url列表
     *
     * @param staffId 工号ID
     * @Title: getAllowAccesUrl
     * @Description: 查询有权限访问的菜单或者按钮url列表
     * @return url列表 List<String>
     */
    public List<String> getAllowAccesUrlList(Integer staffId) {
        Map<String, Integer> param = new HashMap<String, Integer>();
        param.put("staffId", staffId);
        List<String> list = accessControlListMapper.getAccessUrlList(param);
        return list;
    }

    /**
     * 查询有权限访问的菜单列表
     *
     * @param staffId 工号ID
     * @Title: getAllowAccessMenuList
     * @Description: 查询有权限访问的菜单列表
     * @return 菜单列表 List<Menu>
     */
    public List<MenuExtend> getAllowAccessMenuList(Integer staffId) {
        Map<String, Integer> param = new HashMap<String, Integer>();
        param.put("staffId", staffId);
        List<MenuExtend> list = accessControlListMapper.getAccessMenuList(param);
        return list;
    }

}

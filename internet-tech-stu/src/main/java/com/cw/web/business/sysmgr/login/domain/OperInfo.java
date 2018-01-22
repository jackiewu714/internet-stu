package com.cw.web.business.sysmgr.login.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.cw.web.business.sysmgr.grant.domain.MenuExtend;

public class OperInfo implements Serializable {
    /**
     * @Fields serialVersionUID : 序列号
     */

    private static final long serialVersionUID = -5543798774408473322L;

    private Integer operId;// 操作工号
    private String operName;// 操作员名称
    private String loginIp;// 登陆ip
    private String roleId;//角色ID
    private Date lastTime;// 上一次登陆时间

    private List<MenuExtend> menuList; //有权限访问的菜单列表
    private List<String> urls; //有权限访问的菜单或者按钮url列表

    public Integer getOperId() {
        return operId;
    }

    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<MenuExtend> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuExtend> menuList) {
        this.menuList = menuList;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }


}

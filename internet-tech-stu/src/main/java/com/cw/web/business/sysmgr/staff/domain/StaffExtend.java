/**
 * @Title: StaffExtend.java
 * @Package com.yy.rp.business.sysmgr.staff.domain
 * @Description: TODO
 * Copyright: Copyright (c) 2014 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date May 8, 2014 1:08:01 PM
 * @version V1.0
 */

package com.cw.web.business.sysmgr.staff.domain;

import com.cw.common.dao.domain.sm.Staff;

/**
 * @ClassName: StaffExtend
 * @Description: 工号信息扩展bean(包含角色信息)
 * @author WuLiangzhi
 * @date May 8, 2014 1:08:01 PM
 *
 */

public class StaffExtend extends Staff{

    /**
      * @Fields serialVersionUID : 序列号
      */
    
    private static final long serialVersionUID = -395930607770359120L;
    
    private String nameOfStatus; //状态名称
    
    private String nameOfModStaff; //修改人名称
    
    private int roleId; //角色ID
    
    private String roleName; //角色名称

    public String getNameOfStatus() {
        return nameOfStatus;
    }

    public void setNameOfStatus(String nameOfStatus) {
        this.nameOfStatus = nameOfStatus;
    }

    public String getNameOfModStaff() {
        return nameOfModStaff;
    }

    public void setNameOfModStaff(String nameOfModStaff) {
        this.nameOfModStaff = nameOfModStaff;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    

}

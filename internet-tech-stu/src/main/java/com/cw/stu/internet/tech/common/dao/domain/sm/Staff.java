package com.cw.stu.internet.tech.common.dao.domain.sm;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable {
    private Integer staffId;

    private String staffName;

    private String linkPhone;

    private String status;

    private Date lastLogintime;

    private String lastLoginip;

    private String staffNick;

    private Date effStartdate;

    private Date effEnddate;

    private String password;

    private Integer loginLimit;

    private Date modDate;

    private Integer modStaff;

    private static final long serialVersionUID = 1L;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Date lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public String getLastLoginip() {
        return lastLoginip;
    }

    public void setLastLoginip(String lastLoginip) {
        this.lastLoginip = lastLoginip == null ? null : lastLoginip.trim();
    }

    public String getStaffNick() {
        return staffNick;
    }

    public void setStaffNick(String staffNick) {
        this.staffNick = staffNick == null ? null : staffNick.trim();
    }

    public Date getEffStartdate() {
        return effStartdate;
    }

    public void setEffStartdate(Date effStartdate) {
        this.effStartdate = effStartdate;
    }

    public Date getEffEnddate() {
        return effEnddate;
    }

    public void setEffEnddate(Date effEnddate) {
        this.effEnddate = effEnddate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getLoginLimit() {
        return loginLimit;
    }

    public void setLoginLimit(Integer loginLimit) {
        this.loginLimit = loginLimit;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public Integer getModStaff() {
        return modStaff;
    }

    public void setModStaff(Integer modStaff) {
        this.modStaff = modStaff;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Staff other = (Staff) that;
        return (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getStaffName() == null ? other.getStaffName() == null : this.getStaffName().equals(other.getStaffName()))
            && (this.getLinkPhone() == null ? other.getLinkPhone() == null : this.getLinkPhone().equals(other.getLinkPhone()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastLogintime() == null ? other.getLastLogintime() == null : this.getLastLogintime().equals(other.getLastLogintime()))
            && (this.getLastLoginip() == null ? other.getLastLoginip() == null : this.getLastLoginip().equals(other.getLastLoginip()))
            && (this.getStaffNick() == null ? other.getStaffNick() == null : this.getStaffNick().equals(other.getStaffNick()))
            && (this.getEffStartdate() == null ? other.getEffStartdate() == null : this.getEffStartdate().equals(other.getEffStartdate()))
            && (this.getEffEnddate() == null ? other.getEffEnddate() == null : this.getEffEnddate().equals(other.getEffEnddate()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLoginLimit() == null ? other.getLoginLimit() == null : this.getLoginLimit().equals(other.getLoginLimit()))
            && (this.getModDate() == null ? other.getModDate() == null : this.getModDate().equals(other.getModDate()))
            && (this.getModStaff() == null ? other.getModStaff() == null : this.getModStaff().equals(other.getModStaff()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getStaffName() == null) ? 0 : getStaffName().hashCode());
        result = prime * result + ((getLinkPhone() == null) ? 0 : getLinkPhone().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastLogintime() == null) ? 0 : getLastLogintime().hashCode());
        result = prime * result + ((getLastLoginip() == null) ? 0 : getLastLoginip().hashCode());
        result = prime * result + ((getStaffNick() == null) ? 0 : getStaffNick().hashCode());
        result = prime * result + ((getEffStartdate() == null) ? 0 : getEffStartdate().hashCode());
        result = prime * result + ((getEffEnddate() == null) ? 0 : getEffEnddate().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLoginLimit() == null) ? 0 : getLoginLimit().hashCode());
        result = prime * result + ((getModDate() == null) ? 0 : getModDate().hashCode());
        result = prime * result + ((getModStaff() == null) ? 0 : getModStaff().hashCode());
        return result;
    }
}
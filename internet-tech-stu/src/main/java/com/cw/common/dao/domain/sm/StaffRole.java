package com.cw.common.dao.domain.sm;

import java.io.Serializable;
import java.util.Date;

public class StaffRole implements Serializable {
    private Integer staffRoleId;

    private Integer staffId;

    private Integer roleId;

    private String status;

    private Date modDate;

    private Integer modStaff;

    private static final long serialVersionUID = 1L;

    public Integer getStaffRoleId() {
        return staffRoleId;
    }

    public void setStaffRoleId(Integer staffRoleId) {
        this.staffRoleId = staffRoleId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        StaffRole other = (StaffRole) that;
        return (this.getStaffRoleId() == null ? other.getStaffRoleId() == null : this.getStaffRoleId().equals(other.getStaffRoleId()))
            && (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getModDate() == null ? other.getModDate() == null : this.getModDate().equals(other.getModDate()))
            && (this.getModStaff() == null ? other.getModStaff() == null : this.getModStaff().equals(other.getModStaff()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStaffRoleId() == null) ? 0 : getStaffRoleId().hashCode());
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getModDate() == null) ? 0 : getModDate().hashCode());
        result = prime * result + ((getModStaff() == null) ? 0 : getModStaff().hashCode());
        return result;
    }
}
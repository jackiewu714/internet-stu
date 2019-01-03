package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class Cold implements Serializable {
    private String coldId;

    private String coldName;

    private String coldAddress;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    /** 冷库所在地区（城市） */
    private String coldLocation;

    private static final long serialVersionUID = 1L;

    public String getColdId() {
        return coldId;
    }

    public void setColdId(String coldId) {
        this.coldId = coldId == null ? null : coldId.trim();
    }

    public String getColdName() {
        return coldName;
    }

    public void setColdName(String coldName) {
        this.coldName = coldName == null ? null : coldName.trim();
    }

    public String getColdAddress() {
        return coldAddress;
    }

    public void setColdAddress(String coldAddress) {
        this.coldAddress = coldAddress == null ? null : coldAddress.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getColdLocation() {
        return coldLocation;
    }

    public void setColdLocation(String coldLocation) {
        this.coldLocation = coldLocation == null ? null : coldLocation.trim();
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
        Cold other = (Cold) that;
        return (this.getColdId() == null ? other.getColdId() == null : this.getColdId().equals(other.getColdId()))
            && (this.getColdName() == null ? other.getColdName() == null : this.getColdName().equals(other.getColdName()))
            && (this.getColdAddress() == null ? other.getColdAddress() == null : this.getColdAddress().equals(other.getColdAddress()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getColdLocation() == null ? other.getColdLocation() == null : this.getColdLocation().equals(other.getColdLocation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getColdId() == null) ? 0 : getColdId().hashCode());
        result = prime * result + ((getColdName() == null) ? 0 : getColdName().hashCode());
        result = prime * result + ((getColdAddress() == null) ? 0 : getColdAddress().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getColdLocation() == null) ? 0 : getColdLocation().hashCode());
        return result;
    }
}
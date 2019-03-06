package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class Distributor implements Serializable {
    /** 渠道商UUID */
    private String disId;

    /** 渠道商名称 */
    private String disName;

    /** 市场总监UUID */
    private String mdId;

    /** 市场总监名称 */
    private String mdName;

    private String disAddress;

    private String disPhone;

    private String disRemark;

    /** 地区 */
    private String area;

    /** 类型 */
    private String type;

    /** 渠道 */
    private String channel;

    /** 创建人 */
    private String createUser;

    /** 创建时间 */
    private Date createTime;

    /** 修改人 */
    private String updateUser;

    /** 修改时间 */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getDisId() {
        return disId;
    }

    public void setDisId(String disId) {
        this.disId = disId == null ? null : disId.trim();
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName == null ? null : disName.trim();
    }

    public String getMdId() {
        return mdId;
    }

    public void setMdId(String mdId) {
        this.mdId = mdId == null ? null : mdId.trim();
    }

    public String getMdName() {
        return mdName;
    }

    public void setMdName(String mdName) {
        this.mdName = mdName == null ? null : mdName.trim();
    }

    public String getDisAddress() {
        return disAddress;
    }

    public void setDisAddress(String disAddress) {
        this.disAddress = disAddress == null ? null : disAddress.trim();
    }

    public String getDisPhone() {
        return disPhone;
    }

    public void setDisPhone(String disPhone) {
        this.disPhone = disPhone == null ? null : disPhone.trim();
    }

    public String getDisRemark() {
        return disRemark;
    }

    public void setDisRemark(String disRemark) {
        this.disRemark = disRemark == null ? null : disRemark.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
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
        Distributor other = (Distributor) that;
        return (this.getDisId() == null ? other.getDisId() == null : this.getDisId().equals(other.getDisId()))
            && (this.getDisName() == null ? other.getDisName() == null : this.getDisName().equals(other.getDisName()))
            && (this.getMdId() == null ? other.getMdId() == null : this.getMdId().equals(other.getMdId()))
            && (this.getMdName() == null ? other.getMdName() == null : this.getMdName().equals(other.getMdName()))
            && (this.getDisAddress() == null ? other.getDisAddress() == null : this.getDisAddress().equals(other.getDisAddress()))
            && (this.getDisPhone() == null ? other.getDisPhone() == null : this.getDisPhone().equals(other.getDisPhone()))
            && (this.getDisRemark() == null ? other.getDisRemark() == null : this.getDisRemark().equals(other.getDisRemark()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDisId() == null) ? 0 : getDisId().hashCode());
        result = prime * result + ((getDisName() == null) ? 0 : getDisName().hashCode());
        result = prime * result + ((getMdId() == null) ? 0 : getMdId().hashCode());
        result = prime * result + ((getMdName() == null) ? 0 : getMdName().hashCode());
        result = prime * result + ((getDisAddress() == null) ? 0 : getDisAddress().hashCode());
        result = prime * result + ((getDisPhone() == null) ? 0 : getDisPhone().hashCode());
        result = prime * result + ((getDisRemark() == null) ? 0 : getDisRemark().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
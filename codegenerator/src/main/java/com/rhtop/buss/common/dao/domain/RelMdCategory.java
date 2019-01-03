package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class RelMdCategory implements Serializable {
    /** 市场总监与品类关系ID */
    private String relMdCategoryId;

    /** 市场总监UUID */
    private String mdId;

    /** 市场总监名称 */
    private String mdName;

    /** 品类ID */
    private String categoryId;

    private String mdPhone;

    private String mdEmail;

    /** 创建人 */
    private String createUser;

    /** 创建时间 */
    private Date createTime;

    /** 修改人 */
    private String updateUser;

    /** 修改时间 */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getRelMdCategoryId() {
        return relMdCategoryId;
    }

    public void setRelMdCategoryId(String relMdCategoryId) {
        this.relMdCategoryId = relMdCategoryId == null ? null : relMdCategoryId.trim();
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getMdPhone() {
        return mdPhone;
    }

    public void setMdPhone(String mdPhone) {
        this.mdPhone = mdPhone == null ? null : mdPhone.trim();
    }

    public String getMdEmail() {
        return mdEmail;
    }

    public void setMdEmail(String mdEmail) {
        this.mdEmail = mdEmail == null ? null : mdEmail.trim();
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
        RelMdCategory other = (RelMdCategory) that;
        return (this.getRelMdCategoryId() == null ? other.getRelMdCategoryId() == null : this.getRelMdCategoryId().equals(other.getRelMdCategoryId()))
            && (this.getMdId() == null ? other.getMdId() == null : this.getMdId().equals(other.getMdId()))
            && (this.getMdName() == null ? other.getMdName() == null : this.getMdName().equals(other.getMdName()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getMdPhone() == null ? other.getMdPhone() == null : this.getMdPhone().equals(other.getMdPhone()))
            && (this.getMdEmail() == null ? other.getMdEmail() == null : this.getMdEmail().equals(other.getMdEmail()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRelMdCategoryId() == null) ? 0 : getRelMdCategoryId().hashCode());
        result = prime * result + ((getMdId() == null) ? 0 : getMdId().hashCode());
        result = prime * result + ((getMdName() == null) ? 0 : getMdName().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getMdPhone() == null) ? 0 : getMdPhone().hashCode());
        result = prime * result + ((getMdEmail() == null) ? 0 : getMdEmail().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
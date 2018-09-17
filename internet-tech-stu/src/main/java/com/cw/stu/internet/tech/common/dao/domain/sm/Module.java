package com.cw.stu.internet.tech.common.dao.domain.sm;

import java.io.Serializable;
import java.util.Date;

public class Module implements Serializable {
    private Integer modId;

    private String modName;

    private String modType;

    private Integer parentId;

    private String pkgName;

    private String status;

    private String feature;

    private Date modDate;

    private Integer modStaff;

    private String url;

    private static final long serialVersionUID = 1L;

    public Integer getModId() {
        return modId;
    }

    public void setModId(Integer modId) {
        this.modId = modId;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName == null ? null : modName.trim();
    }

    public String getModType() {
        return modType;
    }

    public void setModType(String modType) {
        this.modType = modType == null ? null : modType.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName == null ? null : pkgName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
        Module other = (Module) that;
        return (this.getModId() == null ? other.getModId() == null : this.getModId().equals(other.getModId()))
            && (this.getModName() == null ? other.getModName() == null : this.getModName().equals(other.getModName()))
            && (this.getModType() == null ? other.getModType() == null : this.getModType().equals(other.getModType()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getPkgName() == null ? other.getPkgName() == null : this.getPkgName().equals(other.getPkgName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFeature() == null ? other.getFeature() == null : this.getFeature().equals(other.getFeature()))
            && (this.getModDate() == null ? other.getModDate() == null : this.getModDate().equals(other.getModDate()))
            && (this.getModStaff() == null ? other.getModStaff() == null : this.getModStaff().equals(other.getModStaff()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getModId() == null) ? 0 : getModId().hashCode());
        result = prime * result + ((getModName() == null) ? 0 : getModName().hashCode());
        result = prime * result + ((getModType() == null) ? 0 : getModType().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getPkgName() == null) ? 0 : getPkgName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFeature() == null) ? 0 : getFeature().hashCode());
        result = prime * result + ((getModDate() == null) ? 0 : getModDate().hashCode());
        result = prime * result + ((getModStaff() == null) ? 0 : getModStaff().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }
}
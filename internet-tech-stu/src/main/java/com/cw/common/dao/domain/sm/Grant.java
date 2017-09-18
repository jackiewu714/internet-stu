package com.cw.common.dao.domain.sm;

import java.io.Serializable;
import java.util.Date;

public class Grant implements Serializable {
    private Integer id;

    private String factType;

    private String factId;

    private String entType;

    private String entId;

    private String status;

    private Integer modStaff;

    private Date modDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFactType() {
        return factType;
    }

    public void setFactType(String factType) {
        this.factType = factType == null ? null : factType.trim();
    }

    public String getFactId() {
        return factId;
    }

    public void setFactId(String factId) {
        this.factId = factId == null ? null : factId.trim();
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType == null ? null : entType.trim();
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getModStaff() {
        return modStaff;
    }

    public void setModStaff(Integer modStaff) {
        this.modStaff = modStaff;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
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
        Grant other = (Grant) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFactType() == null ? other.getFactType() == null : this.getFactType().equals(other.getFactType()))
            && (this.getFactId() == null ? other.getFactId() == null : this.getFactId().equals(other.getFactId()))
            && (this.getEntType() == null ? other.getEntType() == null : this.getEntType().equals(other.getEntType()))
            && (this.getEntId() == null ? other.getEntId() == null : this.getEntId().equals(other.getEntId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getModStaff() == null ? other.getModStaff() == null : this.getModStaff().equals(other.getModStaff()))
            && (this.getModDate() == null ? other.getModDate() == null : this.getModDate().equals(other.getModDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFactType() == null) ? 0 : getFactType().hashCode());
        result = prime * result + ((getFactId() == null) ? 0 : getFactId().hashCode());
        result = prime * result + ((getEntType() == null) ? 0 : getEntType().hashCode());
        result = prime * result + ((getEntId() == null) ? 0 : getEntId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getModStaff() == null) ? 0 : getModStaff().hashCode());
        result = prime * result + ((getModDate() == null) ? 0 : getModDate().hashCode());
        return result;
    }
}
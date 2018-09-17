package com.cw.stu.internet.tech.common.dao.domain.sm;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    private Integer logId;

    private String logType;

    private String logSerial;

    private String operStaffName;

    private Date operDate;

    private String ipAddress;

    private String macAddress;

    private Integer createStaff;

    private Date createDate;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getLogSerial() {
        return logSerial;
    }

    public void setLogSerial(String logSerial) {
        this.logSerial = logSerial == null ? null : logSerial.trim();
    }

    public String getOperStaffName() {
        return operStaffName;
    }

    public void setOperStaffName(String operStaffName) {
        this.operStaffName = operStaffName == null ? null : operStaffName.trim();
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    public Integer getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Integer createStaff) {
        this.createStaff = createStaff;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        SysLog other = (SysLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getLogSerial() == null ? other.getLogSerial() == null : this.getLogSerial().equals(other.getLogSerial()))
            && (this.getOperStaffName() == null ? other.getOperStaffName() == null : this.getOperStaffName().equals(other.getOperStaffName()))
            && (this.getOperDate() == null ? other.getOperDate() == null : this.getOperDate().equals(other.getOperDate()))
            && (this.getIpAddress() == null ? other.getIpAddress() == null : this.getIpAddress().equals(other.getIpAddress()))
            && (this.getMacAddress() == null ? other.getMacAddress() == null : this.getMacAddress().equals(other.getMacAddress()))
            && (this.getCreateStaff() == null ? other.getCreateStaff() == null : this.getCreateStaff().equals(other.getCreateStaff()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogType() == null) ? 0 : getLogType().hashCode());
        result = prime * result + ((getLogSerial() == null) ? 0 : getLogSerial().hashCode());
        result = prime * result + ((getOperStaffName() == null) ? 0 : getOperStaffName().hashCode());
        result = prime * result + ((getOperDate() == null) ? 0 : getOperDate().hashCode());
        result = prime * result + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        result = prime * result + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        result = prime * result + ((getCreateStaff() == null) ? 0 : getCreateStaff().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}
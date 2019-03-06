package com.rhtop.buss.common.dao.sys.domain;

import java.io.Serializable;
import java.util.Date;

public class BizLog implements Serializable {
    /** 操作流水号 */
    private Long logId;

    /** 业务操作编码 */
    private String bizCode;

    /** 操作工号 */
    private String operUser;

    /** 操作时间 */
    private Date operTime;

    /** 客户端ip */
    private String ip;

    /** 客户端mac地址 */
    private String mac;

    /** 日志内容 */
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public String getOperUser() {
        return operUser;
    }

    public void setOperUser(String operUser) {
        this.operUser = operUser == null ? null : operUser.trim();
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
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
        BizLog other = (BizLog) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getBizCode() == null ? other.getBizCode() == null : this.getBizCode().equals(other.getBizCode()))
            && (this.getOperUser() == null ? other.getOperUser() == null : this.getOperUser().equals(other.getOperUser()))
            && (this.getOperTime() == null ? other.getOperTime() == null : this.getOperTime().equals(other.getOperTime()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getMac() == null ? other.getMac() == null : this.getMac().equals(other.getMac()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getBizCode() == null) ? 0 : getBizCode().hashCode());
        result = prime * result + ((getOperUser() == null) ? 0 : getOperUser().hashCode());
        result = prime * result + ((getOperTime() == null) ? 0 : getOperTime().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getMac() == null) ? 0 : getMac().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}
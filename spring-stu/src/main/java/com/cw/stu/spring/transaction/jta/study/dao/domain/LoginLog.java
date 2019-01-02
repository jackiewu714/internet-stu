package com.cw.stu.spring.transaction.jta.study.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private Integer id;

    private String userName;

    private Long yyuid;

    private String yyid;

    private Integer staffId;

    private String sys;

    private String ip;

    private String mac;

    private Date creDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getYyuid() {
        return yyuid;
    }

    public void setYyuid(Long yyuid) {
        this.yyuid = yyuid;
    }

    public String getYyid() {
        return yyid;
    }

    public void setYyid(String yyid) {
        this.yyid = yyid == null ? null : yyid.trim();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys == null ? null : sys.trim();
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

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
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
        LoginLog other = (LoginLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getYyuid() == null ? other.getYyuid() == null : this.getYyuid().equals(other.getYyuid()))
            && (this.getYyid() == null ? other.getYyid() == null : this.getYyid().equals(other.getYyid()))
            && (this.getStaffId() == null ? other.getStaffId() == null : this.getStaffId().equals(other.getStaffId()))
            && (this.getSys() == null ? other.getSys() == null : this.getSys().equals(other.getSys()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getMac() == null ? other.getMac() == null : this.getMac().equals(other.getMac()))
            && (this.getCreDate() == null ? other.getCreDate() == null : this.getCreDate().equals(other.getCreDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getYyuid() == null) ? 0 : getYyuid().hashCode());
        result = prime * result + ((getYyid() == null) ? 0 : getYyid().hashCode());
        result = prime * result + ((getStaffId() == null) ? 0 : getStaffId().hashCode());
        result = prime * result + ((getSys() == null) ? 0 : getSys().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getMac() == null) ? 0 : getMac().hashCode());
        result = prime * result + ((getCreDate() == null) ? 0 : getCreDate().hashCode());
        return result;
    }
}
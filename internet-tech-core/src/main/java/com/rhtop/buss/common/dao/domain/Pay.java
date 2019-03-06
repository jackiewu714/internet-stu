package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class Pay implements Serializable {
    private String payInfoId;

    private String cardNum;

    private String cardName;

    private String alias;

    private String bankName;

    private String bankTel;

    private String bankAddr;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getPayInfoId() {
        return payInfoId;
    }

    public void setPayInfoId(String payInfoId) {
        this.payInfoId = payInfoId == null ? null : payInfoId.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankTel() {
        return bankTel;
    }

    public void setBankTel(String bankTel) {
        this.bankTel = bankTel == null ? null : bankTel.trim();
    }

    public String getBankAddr() {
        return bankAddr;
    }

    public void setBankAddr(String bankAddr) {
        this.bankAddr = bankAddr == null ? null : bankAddr.trim();
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
        Pay other = (Pay) that;
        return (this.getPayInfoId() == null ? other.getPayInfoId() == null : this.getPayInfoId().equals(other.getPayInfoId()))
            && (this.getCardNum() == null ? other.getCardNum() == null : this.getCardNum().equals(other.getCardNum()))
            && (this.getCardName() == null ? other.getCardName() == null : this.getCardName().equals(other.getCardName()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankTel() == null ? other.getBankTel() == null : this.getBankTel().equals(other.getBankTel()))
            && (this.getBankAddr() == null ? other.getBankAddr() == null : this.getBankAddr().equals(other.getBankAddr()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayInfoId() == null) ? 0 : getPayInfoId().hashCode());
        result = prime * result + ((getCardNum() == null) ? 0 : getCardNum().hashCode());
        result = prime * result + ((getCardName() == null) ? 0 : getCardName().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankTel() == null) ? 0 : getBankTel().hashCode());
        result = prime * result + ((getBankAddr() == null) ? 0 : getBankAddr().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
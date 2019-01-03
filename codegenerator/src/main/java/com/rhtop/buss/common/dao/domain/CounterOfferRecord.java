package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CounterOfferRecord implements Serializable {
    /** 询盘ID */
    private String slaCounterofferRecordId;

    /** 回盘ID */
    private String counterofferId;

    /** 交易数量 */
    private String txAmo;

    /** 客户价 */
    private BigDecimal pcasPri;

    /** 报价时间 */
    private Date pcasTime;

    /** 回盘价 */
    private BigDecimal ctofPri;

    /** 回盘时间 */
    private Date ctofTime;

    /** 创建人 */
    private String createUser;

    /** 创建时间 */
    private Date createTime;

    /** 修改人 */
    private String updateUser;

    /** 修改时间 */
    private Date updateTime;

    /** 销售员报价 */
    private BigDecimal salesOffer;

    /** 销售员报价备注 */
    private String salesRemark;

    /** 销售员报价时间 */
    private Date salesOfferTime;

    /** 销售总监报价备注 */
    private String offerRemark;

    private static final long serialVersionUID = 1L;

    public String getSlaCounterofferRecordId() {
        return slaCounterofferRecordId;
    }

    public void setSlaCounterofferRecordId(String slaCounterofferRecordId) {
        this.slaCounterofferRecordId = slaCounterofferRecordId == null ? null : slaCounterofferRecordId.trim();
    }

    public String getCounterofferId() {
        return counterofferId;
    }

    public void setCounterofferId(String counterofferId) {
        this.counterofferId = counterofferId == null ? null : counterofferId.trim();
    }

    public String getTxAmo() {
        return txAmo;
    }

    public void setTxAmo(String txAmo) {
        this.txAmo = txAmo == null ? null : txAmo.trim();
    }

    public BigDecimal getPcasPri() {
        return pcasPri;
    }

    public void setPcasPri(BigDecimal pcasPri) {
        this.pcasPri = pcasPri;
    }

    public Date getPcasTime() {
        return pcasTime;
    }

    public void setPcasTime(Date pcasTime) {
        this.pcasTime = pcasTime;
    }

    public BigDecimal getCtofPri() {
        return ctofPri;
    }

    public void setCtofPri(BigDecimal ctofPri) {
        this.ctofPri = ctofPri;
    }

    public Date getCtofTime() {
        return ctofTime;
    }

    public void setCtofTime(Date ctofTime) {
        this.ctofTime = ctofTime;
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

    public BigDecimal getSalesOffer() {
        return salesOffer;
    }

    public void setSalesOffer(BigDecimal salesOffer) {
        this.salesOffer = salesOffer;
    }

    public String getSalesRemark() {
        return salesRemark;
    }

    public void setSalesRemark(String salesRemark) {
        this.salesRemark = salesRemark == null ? null : salesRemark.trim();
    }

    public Date getSalesOfferTime() {
        return salesOfferTime;
    }

    public void setSalesOfferTime(Date salesOfferTime) {
        this.salesOfferTime = salesOfferTime;
    }

    public String getOfferRemark() {
        return offerRemark;
    }

    public void setOfferRemark(String offerRemark) {
        this.offerRemark = offerRemark == null ? null : offerRemark.trim();
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
        CounterOfferRecord other = (CounterOfferRecord) that;
        return (this.getSlaCounterofferRecordId() == null ? other.getSlaCounterofferRecordId() == null : this.getSlaCounterofferRecordId().equals(other.getSlaCounterofferRecordId()))
            && (this.getCounterofferId() == null ? other.getCounterofferId() == null : this.getCounterofferId().equals(other.getCounterofferId()))
            && (this.getTxAmo() == null ? other.getTxAmo() == null : this.getTxAmo().equals(other.getTxAmo()))
            && (this.getPcasPri() == null ? other.getPcasPri() == null : this.getPcasPri().equals(other.getPcasPri()))
            && (this.getPcasTime() == null ? other.getPcasTime() == null : this.getPcasTime().equals(other.getPcasTime()))
            && (this.getCtofPri() == null ? other.getCtofPri() == null : this.getCtofPri().equals(other.getCtofPri()))
            && (this.getCtofTime() == null ? other.getCtofTime() == null : this.getCtofTime().equals(other.getCtofTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getSalesOffer() == null ? other.getSalesOffer() == null : this.getSalesOffer().equals(other.getSalesOffer()))
            && (this.getSalesRemark() == null ? other.getSalesRemark() == null : this.getSalesRemark().equals(other.getSalesRemark()))
            && (this.getSalesOfferTime() == null ? other.getSalesOfferTime() == null : this.getSalesOfferTime().equals(other.getSalesOfferTime()))
            && (this.getOfferRemark() == null ? other.getOfferRemark() == null : this.getOfferRemark().equals(other.getOfferRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSlaCounterofferRecordId() == null) ? 0 : getSlaCounterofferRecordId().hashCode());
        result = prime * result + ((getCounterofferId() == null) ? 0 : getCounterofferId().hashCode());
        result = prime * result + ((getTxAmo() == null) ? 0 : getTxAmo().hashCode());
        result = prime * result + ((getPcasPri() == null) ? 0 : getPcasPri().hashCode());
        result = prime * result + ((getPcasTime() == null) ? 0 : getPcasTime().hashCode());
        result = prime * result + ((getCtofPri() == null) ? 0 : getCtofPri().hashCode());
        result = prime * result + ((getCtofTime() == null) ? 0 : getCtofTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getSalesOffer() == null) ? 0 : getSalesOffer().hashCode());
        result = prime * result + ((getSalesRemark() == null) ? 0 : getSalesRemark().hashCode());
        result = prime * result + ((getSalesOfferTime() == null) ? 0 : getSalesOfferTime().hashCode());
        result = prime * result + ((getOfferRemark() == null) ? 0 : getOfferRemark().hashCode());
        return result;
    }
}
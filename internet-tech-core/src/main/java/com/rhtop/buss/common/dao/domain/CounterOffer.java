package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CounterOffer implements Serializable {
    /** 回盘ID */
    private String counterofferId;

    /** 市场总监UUID */
    private String mdId;

    /** 市场总监名称 */
    private String mdName;

    /** 交易日期 */
    private String dealTime;

    /** 品类ID */
    private String categoryId;

    /** 交易状态：10渠道商发起交易，15销售人员报价，20市场总监回价，21渠道商回价，22渠道商确定订单，30渠道商取消交易，60市场总监定盘 */
    private String txStatus;

    /** 交易时效 */
    private String timingSta;

    /** 交易数量 */
    private String txAmo;

    /** 客户价 */
    private BigDecimal pcasPri;

    /** 报价时间 */
    private Date pcasTime;

    /** 交易价 */
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

    /** 报盘均码(KG/件) */
    private BigDecimal offerAvgWeight;

    /** 抄码价格单位：元/KG */
    private BigDecimal catchweightPri;

    /** 报盘价（标码报价）单位：元/件 */
    private BigDecimal offerPri;

    /** 抄码与标码标识，对应字典CategoryScCodeFlag:S00-标码，S01-抄码 */
    private String standardCatch;

    /** 销售员报价 */
    private BigDecimal salesOffer;

    /** 销售员报价备注 */
    private String salesRemark;

    /** 销售人员ID */
    private String salesId;

    /** 销售员姓名 */
    private String salesName;

    /** 销售员报价时间 */
    private Date salesOfferTime;

    /** 销售总监报价备注 */
    private String offerRemark;

    /** 审核人ID */
    private String auditorId;

    /** 审核人姓名 */
    private String auditorName;

    /** 审核原因 */
    private String auditorRemark;

    /** 审核时间 */
    private Date auditTime;

    /** 审核状态00初始值，10定盘，20审核通过，30审核失败 */
    private String auditorStatus;

    private static final long serialVersionUID = 1L;

    public String getCounterofferId() {
        return counterofferId;
    }

    public void setCounterofferId(String counterofferId) {
        this.counterofferId = counterofferId == null ? null : counterofferId.trim();
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

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime == null ? null : dealTime.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getTxStatus() {
        return txStatus;
    }

    public void setTxStatus(String txStatus) {
        this.txStatus = txStatus == null ? null : txStatus.trim();
    }

    public String getTimingSta() {
        return timingSta;
    }

    public void setTimingSta(String timingSta) {
        this.timingSta = timingSta == null ? null : timingSta.trim();
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

    public BigDecimal getOfferAvgWeight() {
        return offerAvgWeight;
    }

    public void setOfferAvgWeight(BigDecimal offerAvgWeight) {
        this.offerAvgWeight = offerAvgWeight;
    }

    public BigDecimal getCatchweightPri() {
        return catchweightPri;
    }

    public void setCatchweightPri(BigDecimal catchweightPri) {
        this.catchweightPri = catchweightPri;
    }

    public BigDecimal getOfferPri() {
        return offerPri;
    }

    public void setOfferPri(BigDecimal offerPri) {
        this.offerPri = offerPri;
    }

    public String getStandardCatch() {
        return standardCatch;
    }

    public void setStandardCatch(String standardCatch) {
        this.standardCatch = standardCatch == null ? null : standardCatch.trim();
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

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId == null ? null : salesId.trim();
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName == null ? null : salesName.trim();
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

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public String getAuditorRemark() {
        return auditorRemark;
    }

    public void setAuditorRemark(String auditorRemark) {
        this.auditorRemark = auditorRemark == null ? null : auditorRemark.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditorStatus() {
        return auditorStatus;
    }

    public void setAuditorStatus(String auditorStatus) {
        this.auditorStatus = auditorStatus == null ? null : auditorStatus.trim();
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
        CounterOffer other = (CounterOffer) that;
        return (this.getCounterofferId() == null ? other.getCounterofferId() == null : this.getCounterofferId().equals(other.getCounterofferId()))
            && (this.getMdId() == null ? other.getMdId() == null : this.getMdId().equals(other.getMdId()))
            && (this.getMdName() == null ? other.getMdName() == null : this.getMdName().equals(other.getMdName()))
            && (this.getDealTime() == null ? other.getDealTime() == null : this.getDealTime().equals(other.getDealTime()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getTxStatus() == null ? other.getTxStatus() == null : this.getTxStatus().equals(other.getTxStatus()))
            && (this.getTimingSta() == null ? other.getTimingSta() == null : this.getTimingSta().equals(other.getTimingSta()))
            && (this.getTxAmo() == null ? other.getTxAmo() == null : this.getTxAmo().equals(other.getTxAmo()))
            && (this.getPcasPri() == null ? other.getPcasPri() == null : this.getPcasPri().equals(other.getPcasPri()))
            && (this.getPcasTime() == null ? other.getPcasTime() == null : this.getPcasTime().equals(other.getPcasTime()))
            && (this.getCtofPri() == null ? other.getCtofPri() == null : this.getCtofPri().equals(other.getCtofPri()))
            && (this.getCtofTime() == null ? other.getCtofTime() == null : this.getCtofTime().equals(other.getCtofTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOfferAvgWeight() == null ? other.getOfferAvgWeight() == null : this.getOfferAvgWeight().equals(other.getOfferAvgWeight()))
            && (this.getCatchweightPri() == null ? other.getCatchweightPri() == null : this.getCatchweightPri().equals(other.getCatchweightPri()))
            && (this.getOfferPri() == null ? other.getOfferPri() == null : this.getOfferPri().equals(other.getOfferPri()))
            && (this.getStandardCatch() == null ? other.getStandardCatch() == null : this.getStandardCatch().equals(other.getStandardCatch()))
            && (this.getSalesOffer() == null ? other.getSalesOffer() == null : this.getSalesOffer().equals(other.getSalesOffer()))
            && (this.getSalesRemark() == null ? other.getSalesRemark() == null : this.getSalesRemark().equals(other.getSalesRemark()))
            && (this.getSalesId() == null ? other.getSalesId() == null : this.getSalesId().equals(other.getSalesId()))
            && (this.getSalesName() == null ? other.getSalesName() == null : this.getSalesName().equals(other.getSalesName()))
            && (this.getSalesOfferTime() == null ? other.getSalesOfferTime() == null : this.getSalesOfferTime().equals(other.getSalesOfferTime()))
            && (this.getOfferRemark() == null ? other.getOfferRemark() == null : this.getOfferRemark().equals(other.getOfferRemark()))
            && (this.getAuditorId() == null ? other.getAuditorId() == null : this.getAuditorId().equals(other.getAuditorId()))
            && (this.getAuditorName() == null ? other.getAuditorName() == null : this.getAuditorName().equals(other.getAuditorName()))
            && (this.getAuditorRemark() == null ? other.getAuditorRemark() == null : this.getAuditorRemark().equals(other.getAuditorRemark()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditorStatus() == null ? other.getAuditorStatus() == null : this.getAuditorStatus().equals(other.getAuditorStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCounterofferId() == null) ? 0 : getCounterofferId().hashCode());
        result = prime * result + ((getMdId() == null) ? 0 : getMdId().hashCode());
        result = prime * result + ((getMdName() == null) ? 0 : getMdName().hashCode());
        result = prime * result + ((getDealTime() == null) ? 0 : getDealTime().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getTxStatus() == null) ? 0 : getTxStatus().hashCode());
        result = prime * result + ((getTimingSta() == null) ? 0 : getTimingSta().hashCode());
        result = prime * result + ((getTxAmo() == null) ? 0 : getTxAmo().hashCode());
        result = prime * result + ((getPcasPri() == null) ? 0 : getPcasPri().hashCode());
        result = prime * result + ((getPcasTime() == null) ? 0 : getPcasTime().hashCode());
        result = prime * result + ((getCtofPri() == null) ? 0 : getCtofPri().hashCode());
        result = prime * result + ((getCtofTime() == null) ? 0 : getCtofTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOfferAvgWeight() == null) ? 0 : getOfferAvgWeight().hashCode());
        result = prime * result + ((getCatchweightPri() == null) ? 0 : getCatchweightPri().hashCode());
        result = prime * result + ((getOfferPri() == null) ? 0 : getOfferPri().hashCode());
        result = prime * result + ((getStandardCatch() == null) ? 0 : getStandardCatch().hashCode());
        result = prime * result + ((getSalesOffer() == null) ? 0 : getSalesOffer().hashCode());
        result = prime * result + ((getSalesRemark() == null) ? 0 : getSalesRemark().hashCode());
        result = prime * result + ((getSalesId() == null) ? 0 : getSalesId().hashCode());
        result = prime * result + ((getSalesName() == null) ? 0 : getSalesName().hashCode());
        result = prime * result + ((getSalesOfferTime() == null) ? 0 : getSalesOfferTime().hashCode());
        result = prime * result + ((getOfferRemark() == null) ? 0 : getOfferRemark().hashCode());
        result = prime * result + ((getAuditorId() == null) ? 0 : getAuditorId().hashCode());
        result = prime * result + ((getAuditorName() == null) ? 0 : getAuditorName().hashCode());
        result = prime * result + ((getAuditorRemark() == null) ? 0 : getAuditorRemark().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditorStatus() == null) ? 0 : getAuditorStatus().hashCode());
        return result;
    }
}
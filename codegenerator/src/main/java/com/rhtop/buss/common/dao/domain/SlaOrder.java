package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SlaOrder implements Serializable {
    /** 子订单编号格式：B_年月日时Random6位 */
    private String slaOrderId;

    private String orderId;

    /** 订单类型：  10：app创建  20：pc制作订单 */
    private String slaOrderType;

    /** 市场总监UUID */
    private String mdId;

    private String mdName;

    /** 创建人姓名  即可客户的名称 */
    private String bussName;

    /** 客户Id */
    private String bussId;

    /** 品类ID */
    private String categoryId;

    /** 回盘ID */
    private String counterofferId;

    /** 交易数量 */
    private String txAmo;

    /** 交易价 */
    private BigDecimal ctofPri;

    /** 总价 */
    private BigDecimal totPri;

    /** 子订单状态,对应字典Constants.SlaOrderStatus：S0A：有效,S0B：用户撤单 */
    private String soStatus;

    /** 付款状态  00：未付款  10：已付款未确认20：已付款已确认 */
    private String contStatus;

    /** 发货状态  00:未发货  10：已发货 */
    private String sendStatus;

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

    private static final long serialVersionUID = 1L;

    public String getSlaOrderId() {
        return slaOrderId;
    }

    public void setSlaOrderId(String slaOrderId) {
        this.slaOrderId = slaOrderId == null ? null : slaOrderId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getSlaOrderType() {
        return slaOrderType;
    }

    public void setSlaOrderType(String slaOrderType) {
        this.slaOrderType = slaOrderType == null ? null : slaOrderType.trim();
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

    public String getBussName() {
        return bussName;
    }

    public void setBussName(String bussName) {
        this.bussName = bussName == null ? null : bussName.trim();
    }

    public String getBussId() {
        return bussId;
    }

    public void setBussId(String bussId) {
        this.bussId = bussId == null ? null : bussId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
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

    public BigDecimal getCtofPri() {
        return ctofPri;
    }

    public void setCtofPri(BigDecimal ctofPri) {
        this.ctofPri = ctofPri;
    }

    public BigDecimal getTotPri() {
        return totPri;
    }

    public void setTotPri(BigDecimal totPri) {
        this.totPri = totPri;
    }

    public String getSoStatus() {
        return soStatus;
    }

    public void setSoStatus(String soStatus) {
        this.soStatus = soStatus == null ? null : soStatus.trim();
    }

    public String getContStatus() {
        return contStatus;
    }

    public void setContStatus(String contStatus) {
        this.contStatus = contStatus == null ? null : contStatus.trim();
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
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
        SlaOrder other = (SlaOrder) that;
        return (this.getSlaOrderId() == null ? other.getSlaOrderId() == null : this.getSlaOrderId().equals(other.getSlaOrderId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getSlaOrderType() == null ? other.getSlaOrderType() == null : this.getSlaOrderType().equals(other.getSlaOrderType()))
            && (this.getMdId() == null ? other.getMdId() == null : this.getMdId().equals(other.getMdId()))
            && (this.getMdName() == null ? other.getMdName() == null : this.getMdName().equals(other.getMdName()))
            && (this.getBussName() == null ? other.getBussName() == null : this.getBussName().equals(other.getBussName()))
            && (this.getBussId() == null ? other.getBussId() == null : this.getBussId().equals(other.getBussId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCounterofferId() == null ? other.getCounterofferId() == null : this.getCounterofferId().equals(other.getCounterofferId()))
            && (this.getTxAmo() == null ? other.getTxAmo() == null : this.getTxAmo().equals(other.getTxAmo()))
            && (this.getCtofPri() == null ? other.getCtofPri() == null : this.getCtofPri().equals(other.getCtofPri()))
            && (this.getTotPri() == null ? other.getTotPri() == null : this.getTotPri().equals(other.getTotPri()))
            && (this.getSoStatus() == null ? other.getSoStatus() == null : this.getSoStatus().equals(other.getSoStatus()))
            && (this.getContStatus() == null ? other.getContStatus() == null : this.getContStatus().equals(other.getContStatus()))
            && (this.getSendStatus() == null ? other.getSendStatus() == null : this.getSendStatus().equals(other.getSendStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOfferAvgWeight() == null ? other.getOfferAvgWeight() == null : this.getOfferAvgWeight().equals(other.getOfferAvgWeight()))
            && (this.getCatchweightPri() == null ? other.getCatchweightPri() == null : this.getCatchweightPri().equals(other.getCatchweightPri()))
            && (this.getOfferPri() == null ? other.getOfferPri() == null : this.getOfferPri().equals(other.getOfferPri()))
            && (this.getStandardCatch() == null ? other.getStandardCatch() == null : this.getStandardCatch().equals(other.getStandardCatch()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSlaOrderId() == null) ? 0 : getSlaOrderId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getSlaOrderType() == null) ? 0 : getSlaOrderType().hashCode());
        result = prime * result + ((getMdId() == null) ? 0 : getMdId().hashCode());
        result = prime * result + ((getMdName() == null) ? 0 : getMdName().hashCode());
        result = prime * result + ((getBussName() == null) ? 0 : getBussName().hashCode());
        result = prime * result + ((getBussId() == null) ? 0 : getBussId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCounterofferId() == null) ? 0 : getCounterofferId().hashCode());
        result = prime * result + ((getTxAmo() == null) ? 0 : getTxAmo().hashCode());
        result = prime * result + ((getCtofPri() == null) ? 0 : getCtofPri().hashCode());
        result = prime * result + ((getTotPri() == null) ? 0 : getTotPri().hashCode());
        result = prime * result + ((getSoStatus() == null) ? 0 : getSoStatus().hashCode());
        result = prime * result + ((getContStatus() == null) ? 0 : getContStatus().hashCode());
        result = prime * result + ((getSendStatus() == null) ? 0 : getSendStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOfferAvgWeight() == null) ? 0 : getOfferAvgWeight().hashCode());
        result = prime * result + ((getCatchweightPri() == null) ? 0 : getCatchweightPri().hashCode());
        result = prime * result + ((getOfferPri() == null) ? 0 : getOfferPri().hashCode());
        result = prime * result + ((getStandardCatch() == null) ? 0 : getStandardCatch().hashCode());
        return result;
    }
}
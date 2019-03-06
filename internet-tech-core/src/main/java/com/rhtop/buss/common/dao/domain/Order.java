package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private String orderId;

    private BigDecimal totalAmount;

    private String orderNum;

    /** 付款方式:  10:先货后款  20:先款后货 */
    private String payMod;

    private String coldId;

    /** 提货号 */
    private String pickUpNo;

    /** 配送方式选择 */
    private String delvOpt;

    private String courierComp;

    /** 收货人姓名 */
    private String csgName;

    /** 收货人联系方式 */
    private String csgTel;

    /** 收货人详细地址 */
    private String csgAddr;

    /** 收货人身份证号 */
    private String csgId;

    /** 提货车牌号码 */
    private String carNum;

    /** 司机驾驶证号 */
    private String driNum;

    /** 司机电话 */
    private String driTel;

    private String payInfoId;

    private String cardNum;

    private String cardName;

    private String bankName;

    /** 订单推送状态 */
    private String orderPushStatus;

    /** 付款状态  00：未付款  10：已付款 */
    private String contStatus;

    /** 到款确认时间 */
    private Date contCheckTime;

    /** 发货状态  00:未发货  10：已发货 */
    private String sendStatus;

    /** 发货推送状态 */
    private String sendPushStatus;

    /** 发货确认时间 */
    private Date sendCheckTime;

    /** 市场总监名称 */
    private String mdName;

    /** 市场总监ID */
    private String mdId;

    /** 客户Id */
    private String bussId;

    /** 客户名称  若订单是APP创建生成，客户名称为子订单创建人名称  若订单是pc端制作订单生成，则客户名称是“制作订单”。 */
    private String bussName;

    /** 创建人 */
    private String createUser;

    /** 创建时间 */
    private Date createTime;

    /** 修改人 */
    private String updateUser;

    /** 修改时间 */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getPayMod() {
        return payMod;
    }

    public void setPayMod(String payMod) {
        this.payMod = payMod == null ? null : payMod.trim();
    }

    public String getColdId() {
        return coldId;
    }

    public void setColdId(String coldId) {
        this.coldId = coldId == null ? null : coldId.trim();
    }

    public String getPickUpNo() {
        return pickUpNo;
    }

    public void setPickUpNo(String pickUpNo) {
        this.pickUpNo = pickUpNo == null ? null : pickUpNo.trim();
    }

    public String getDelvOpt() {
        return delvOpt;
    }

    public void setDelvOpt(String delvOpt) {
        this.delvOpt = delvOpt == null ? null : delvOpt.trim();
    }

    public String getCourierComp() {
        return courierComp;
    }

    public void setCourierComp(String courierComp) {
        this.courierComp = courierComp == null ? null : courierComp.trim();
    }

    public String getCsgName() {
        return csgName;
    }

    public void setCsgName(String csgName) {
        this.csgName = csgName == null ? null : csgName.trim();
    }

    public String getCsgTel() {
        return csgTel;
    }

    public void setCsgTel(String csgTel) {
        this.csgTel = csgTel == null ? null : csgTel.trim();
    }

    public String getCsgAddr() {
        return csgAddr;
    }

    public void setCsgAddr(String csgAddr) {
        this.csgAddr = csgAddr == null ? null : csgAddr.trim();
    }

    public String getCsgId() {
        return csgId;
    }

    public void setCsgId(String csgId) {
        this.csgId = csgId == null ? null : csgId.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getDriNum() {
        return driNum;
    }

    public void setDriNum(String driNum) {
        this.driNum = driNum == null ? null : driNum.trim();
    }

    public String getDriTel() {
        return driTel;
    }

    public void setDriTel(String driTel) {
        this.driTel = driTel == null ? null : driTel.trim();
    }

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getOrderPushStatus() {
        return orderPushStatus;
    }

    public void setOrderPushStatus(String orderPushStatus) {
        this.orderPushStatus = orderPushStatus == null ? null : orderPushStatus.trim();
    }

    public String getContStatus() {
        return contStatus;
    }

    public void setContStatus(String contStatus) {
        this.contStatus = contStatus == null ? null : contStatus.trim();
    }

    public Date getContCheckTime() {
        return contCheckTime;
    }

    public void setContCheckTime(Date contCheckTime) {
        this.contCheckTime = contCheckTime;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getSendPushStatus() {
        return sendPushStatus;
    }

    public void setSendPushStatus(String sendPushStatus) {
        this.sendPushStatus = sendPushStatus == null ? null : sendPushStatus.trim();
    }

    public Date getSendCheckTime() {
        return sendCheckTime;
    }

    public void setSendCheckTime(Date sendCheckTime) {
        this.sendCheckTime = sendCheckTime;
    }

    public String getMdName() {
        return mdName;
    }

    public void setMdName(String mdName) {
        this.mdName = mdName == null ? null : mdName.trim();
    }

    public String getMdId() {
        return mdId;
    }

    public void setMdId(String mdId) {
        this.mdId = mdId == null ? null : mdId.trim();
    }

    public String getBussId() {
        return bussId;
    }

    public void setBussId(String bussId) {
        this.bussId = bussId == null ? null : bussId.trim();
    }

    public String getBussName() {
        return bussName;
    }

    public void setBussName(String bussName) {
        this.bussName = bussName == null ? null : bussName.trim();
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
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getTotalAmount() == null ? other.getTotalAmount() == null : this.getTotalAmount().equals(other.getTotalAmount()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getPayMod() == null ? other.getPayMod() == null : this.getPayMod().equals(other.getPayMod()))
            && (this.getColdId() == null ? other.getColdId() == null : this.getColdId().equals(other.getColdId()))
            && (this.getPickUpNo() == null ? other.getPickUpNo() == null : this.getPickUpNo().equals(other.getPickUpNo()))
            && (this.getDelvOpt() == null ? other.getDelvOpt() == null : this.getDelvOpt().equals(other.getDelvOpt()))
            && (this.getCourierComp() == null ? other.getCourierComp() == null : this.getCourierComp().equals(other.getCourierComp()))
            && (this.getCsgName() == null ? other.getCsgName() == null : this.getCsgName().equals(other.getCsgName()))
            && (this.getCsgTel() == null ? other.getCsgTel() == null : this.getCsgTel().equals(other.getCsgTel()))
            && (this.getCsgAddr() == null ? other.getCsgAddr() == null : this.getCsgAddr().equals(other.getCsgAddr()))
            && (this.getCsgId() == null ? other.getCsgId() == null : this.getCsgId().equals(other.getCsgId()))
            && (this.getCarNum() == null ? other.getCarNum() == null : this.getCarNum().equals(other.getCarNum()))
            && (this.getDriNum() == null ? other.getDriNum() == null : this.getDriNum().equals(other.getDriNum()))
            && (this.getDriTel() == null ? other.getDriTel() == null : this.getDriTel().equals(other.getDriTel()))
            && (this.getPayInfoId() == null ? other.getPayInfoId() == null : this.getPayInfoId().equals(other.getPayInfoId()))
            && (this.getCardNum() == null ? other.getCardNum() == null : this.getCardNum().equals(other.getCardNum()))
            && (this.getCardName() == null ? other.getCardName() == null : this.getCardName().equals(other.getCardName()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getOrderPushStatus() == null ? other.getOrderPushStatus() == null : this.getOrderPushStatus().equals(other.getOrderPushStatus()))
            && (this.getContStatus() == null ? other.getContStatus() == null : this.getContStatus().equals(other.getContStatus()))
            && (this.getContCheckTime() == null ? other.getContCheckTime() == null : this.getContCheckTime().equals(other.getContCheckTime()))
            && (this.getSendStatus() == null ? other.getSendStatus() == null : this.getSendStatus().equals(other.getSendStatus()))
            && (this.getSendPushStatus() == null ? other.getSendPushStatus() == null : this.getSendPushStatus().equals(other.getSendPushStatus()))
            && (this.getSendCheckTime() == null ? other.getSendCheckTime() == null : this.getSendCheckTime().equals(other.getSendCheckTime()))
            && (this.getMdName() == null ? other.getMdName() == null : this.getMdName().equals(other.getMdName()))
            && (this.getMdId() == null ? other.getMdId() == null : this.getMdId().equals(other.getMdId()))
            && (this.getBussId() == null ? other.getBussId() == null : this.getBussId().equals(other.getBussId()))
            && (this.getBussName() == null ? other.getBussName() == null : this.getBussName().equals(other.getBussName()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getTotalAmount() == null) ? 0 : getTotalAmount().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getPayMod() == null) ? 0 : getPayMod().hashCode());
        result = prime * result + ((getColdId() == null) ? 0 : getColdId().hashCode());
        result = prime * result + ((getPickUpNo() == null) ? 0 : getPickUpNo().hashCode());
        result = prime * result + ((getDelvOpt() == null) ? 0 : getDelvOpt().hashCode());
        result = prime * result + ((getCourierComp() == null) ? 0 : getCourierComp().hashCode());
        result = prime * result + ((getCsgName() == null) ? 0 : getCsgName().hashCode());
        result = prime * result + ((getCsgTel() == null) ? 0 : getCsgTel().hashCode());
        result = prime * result + ((getCsgAddr() == null) ? 0 : getCsgAddr().hashCode());
        result = prime * result + ((getCsgId() == null) ? 0 : getCsgId().hashCode());
        result = prime * result + ((getCarNum() == null) ? 0 : getCarNum().hashCode());
        result = prime * result + ((getDriNum() == null) ? 0 : getDriNum().hashCode());
        result = prime * result + ((getDriTel() == null) ? 0 : getDriTel().hashCode());
        result = prime * result + ((getPayInfoId() == null) ? 0 : getPayInfoId().hashCode());
        result = prime * result + ((getCardNum() == null) ? 0 : getCardNum().hashCode());
        result = prime * result + ((getCardName() == null) ? 0 : getCardName().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getOrderPushStatus() == null) ? 0 : getOrderPushStatus().hashCode());
        result = prime * result + ((getContStatus() == null) ? 0 : getContStatus().hashCode());
        result = prime * result + ((getContCheckTime() == null) ? 0 : getContCheckTime().hashCode());
        result = prime * result + ((getSendStatus() == null) ? 0 : getSendStatus().hashCode());
        result = prime * result + ((getSendPushStatus() == null) ? 0 : getSendPushStatus().hashCode());
        result = prime * result + ((getSendCheckTime() == null) ? 0 : getSendCheckTime().hashCode());
        result = prime * result + ((getMdName() == null) ? 0 : getMdName().hashCode());
        result = prime * result + ((getMdId() == null) ? 0 : getMdId().hashCode());
        result = prime * result + ((getBussId() == null) ? 0 : getBussId().hashCode());
        result = prime * result + ((getBussName() == null) ? 0 : getBussName().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}
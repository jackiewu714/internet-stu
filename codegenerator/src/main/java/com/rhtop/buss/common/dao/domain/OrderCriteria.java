package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String orderId;

    private String orderIdRange;

    private BigDecimal totalAmount;

    private String orderNum;

    private String orderNumRange;

    /** 付款方式:  10:先货后款  20:先款后货 */
    private String payMod;

    private String payModRange;

    private String coldId;

    private String coldIdRange;

    /** 提货号 */
    private String pickUpNo;

    private String pickUpNoRange;

    /** 配送方式选择 */
    private String delvOpt;

    private String delvOptRange;

    private String courierComp;

    private String courierCompRange;

    /** 收货人姓名 */
    private String csgName;

    private String csgNameRange;

    /** 收货人联系方式 */
    private String csgTel;

    private String csgTelRange;

    /** 收货人详细地址 */
    private String csgAddr;

    private String csgAddrRange;

    /** 收货人身份证号 */
    private String csgId;

    private String csgIdRange;

    /** 提货车牌号码 */
    private String carNum;

    private String carNumRange;

    /** 司机驾驶证号 */
    private String driNum;

    private String driNumRange;

    /** 司机电话 */
    private String driTel;

    private String driTelRange;

    private String payInfoId;

    private String payInfoIdRange;

    private String cardNum;

    private String cardNumRange;

    private String cardName;

    private String cardNameRange;

    private String bankName;

    private String bankNameRange;

    /** 订单推送状态 */
    private String orderPushStatus;

    private String orderPushStatusRange;

    /** 付款状态  00：未付款  10：已付款 */
    private String contStatus;

    private String contStatusRange;

    /** 到款确认时间 */
    private Date contCheckTime;

    private Date contCheckTimeRange1;

    private Date contCheckTimeRange2;

    /** 发货状态  00:未发货  10：已发货 */
    private String sendStatus;

    private String sendStatusRange;

    /** 发货推送状态 */
    private String sendPushStatus;

    private String sendPushStatusRange;

    /** 发货确认时间 */
    private Date sendCheckTime;

    private Date sendCheckTimeRange1;

    private Date sendCheckTimeRange2;

    /** 市场总监名称 */
    private String mdName;

    private String mdNameRange;

    /** 市场总监ID */
    private String mdId;

    private String mdIdRange;

    /** 客户Id */
    private String bussId;

    private String bussIdRange;

    /** 客户名称  若订单是APP创建生成，客户名称为子订单创建人名称  若订单是pc端制作订单生成，则客户名称是“制作订单”。 */
    private String bussName;

    private String bussNameRange;

    /** 创建人 */
    private String createUser;

    private String createUserRange;

    /** 创建时间 */
    private Date createTime;

    private Date createTimeRange1;

    private Date createTimeRange2;

    /** 修改人 */
    private String updateUser;

    private String updateUserRange;

    /** 修改时间 */
    private Date updateTime;

    private Date updateTimeRange1;

    private Date updateTimeRange2;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public OrderCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderIdRange() {
        return orderIdRange;
    }

    public void setOrderIdRange(String orderIdRange) {
        this.orderIdRange = orderIdRange == null ? null : orderIdRange.trim();
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

    public String getOrderNumRange() {
        return orderNumRange;
    }

    public void setOrderNumRange(String orderNumRange) {
        this.orderNumRange = orderNumRange == null ? null : orderNumRange.trim();
    }

    public String getPayMod() {
        return payMod;
    }

    public void setPayMod(String payMod) {
        this.payMod = payMod == null ? null : payMod.trim();
    }

    public String getPayModRange() {
        return payModRange;
    }

    public void setPayModRange(String payModRange) {
        this.payModRange = payModRange == null ? null : payModRange.trim();
    }

    public String getColdId() {
        return coldId;
    }

    public void setColdId(String coldId) {
        this.coldId = coldId == null ? null : coldId.trim();
    }

    public String getColdIdRange() {
        return coldIdRange;
    }

    public void setColdIdRange(String coldIdRange) {
        this.coldIdRange = coldIdRange == null ? null : coldIdRange.trim();
    }

    public String getPickUpNo() {
        return pickUpNo;
    }

    public void setPickUpNo(String pickUpNo) {
        this.pickUpNo = pickUpNo == null ? null : pickUpNo.trim();
    }

    public String getPickUpNoRange() {
        return pickUpNoRange;
    }

    public void setPickUpNoRange(String pickUpNoRange) {
        this.pickUpNoRange = pickUpNoRange == null ? null : pickUpNoRange.trim();
    }

    public String getDelvOpt() {
        return delvOpt;
    }

    public void setDelvOpt(String delvOpt) {
        this.delvOpt = delvOpt == null ? null : delvOpt.trim();
    }

    public String getDelvOptRange() {
        return delvOptRange;
    }

    public void setDelvOptRange(String delvOptRange) {
        this.delvOptRange = delvOptRange == null ? null : delvOptRange.trim();
    }

    public String getCourierComp() {
        return courierComp;
    }

    public void setCourierComp(String courierComp) {
        this.courierComp = courierComp == null ? null : courierComp.trim();
    }

    public String getCourierCompRange() {
        return courierCompRange;
    }

    public void setCourierCompRange(String courierCompRange) {
        this.courierCompRange = courierCompRange == null ? null : courierCompRange.trim();
    }

    public String getCsgName() {
        return csgName;
    }

    public void setCsgName(String csgName) {
        this.csgName = csgName == null ? null : csgName.trim();
    }

    public String getCsgNameRange() {
        return csgNameRange;
    }

    public void setCsgNameRange(String csgNameRange) {
        this.csgNameRange = csgNameRange == null ? null : csgNameRange.trim();
    }

    public String getCsgTel() {
        return csgTel;
    }

    public void setCsgTel(String csgTel) {
        this.csgTel = csgTel == null ? null : csgTel.trim();
    }

    public String getCsgTelRange() {
        return csgTelRange;
    }

    public void setCsgTelRange(String csgTelRange) {
        this.csgTelRange = csgTelRange == null ? null : csgTelRange.trim();
    }

    public String getCsgAddr() {
        return csgAddr;
    }

    public void setCsgAddr(String csgAddr) {
        this.csgAddr = csgAddr == null ? null : csgAddr.trim();
    }

    public String getCsgAddrRange() {
        return csgAddrRange;
    }

    public void setCsgAddrRange(String csgAddrRange) {
        this.csgAddrRange = csgAddrRange == null ? null : csgAddrRange.trim();
    }

    public String getCsgId() {
        return csgId;
    }

    public void setCsgId(String csgId) {
        this.csgId = csgId == null ? null : csgId.trim();
    }

    public String getCsgIdRange() {
        return csgIdRange;
    }

    public void setCsgIdRange(String csgIdRange) {
        this.csgIdRange = csgIdRange == null ? null : csgIdRange.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getCarNumRange() {
        return carNumRange;
    }

    public void setCarNumRange(String carNumRange) {
        this.carNumRange = carNumRange == null ? null : carNumRange.trim();
    }

    public String getDriNum() {
        return driNum;
    }

    public void setDriNum(String driNum) {
        this.driNum = driNum == null ? null : driNum.trim();
    }

    public String getDriNumRange() {
        return driNumRange;
    }

    public void setDriNumRange(String driNumRange) {
        this.driNumRange = driNumRange == null ? null : driNumRange.trim();
    }

    public String getDriTel() {
        return driTel;
    }

    public void setDriTel(String driTel) {
        this.driTel = driTel == null ? null : driTel.trim();
    }

    public String getDriTelRange() {
        return driTelRange;
    }

    public void setDriTelRange(String driTelRange) {
        this.driTelRange = driTelRange == null ? null : driTelRange.trim();
    }

    public String getPayInfoId() {
        return payInfoId;
    }

    public void setPayInfoId(String payInfoId) {
        this.payInfoId = payInfoId == null ? null : payInfoId.trim();
    }

    public String getPayInfoIdRange() {
        return payInfoIdRange;
    }

    public void setPayInfoIdRange(String payInfoIdRange) {
        this.payInfoIdRange = payInfoIdRange == null ? null : payInfoIdRange.trim();
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    public String getCardNumRange() {
        return cardNumRange;
    }

    public void setCardNumRange(String cardNumRange) {
        this.cardNumRange = cardNumRange == null ? null : cardNumRange.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardNameRange() {
        return cardNameRange;
    }

    public void setCardNameRange(String cardNameRange) {
        this.cardNameRange = cardNameRange == null ? null : cardNameRange.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankNameRange() {
        return bankNameRange;
    }

    public void setBankNameRange(String bankNameRange) {
        this.bankNameRange = bankNameRange == null ? null : bankNameRange.trim();
    }

    public String getOrderPushStatus() {
        return orderPushStatus;
    }

    public void setOrderPushStatus(String orderPushStatus) {
        this.orderPushStatus = orderPushStatus == null ? null : orderPushStatus.trim();
    }

    public String getOrderPushStatusRange() {
        return orderPushStatusRange;
    }

    public void setOrderPushStatusRange(String orderPushStatusRange) {
        this.orderPushStatusRange = orderPushStatusRange == null ? null : orderPushStatusRange.trim();
    }

    public String getContStatus() {
        return contStatus;
    }

    public void setContStatus(String contStatus) {
        this.contStatus = contStatus == null ? null : contStatus.trim();
    }

    public String getContStatusRange() {
        return contStatusRange;
    }

    public void setContStatusRange(String contStatusRange) {
        this.contStatusRange = contStatusRange == null ? null : contStatusRange.trim();
    }

    public Date getContCheckTime() {
        return contCheckTime;
    }

    public void setContCheckTime(Date contCheckTime) {
        this.contCheckTime = contCheckTime;
    }

    public Date getContCheckTimeRange1() {
        return contCheckTimeRange1;
    }

    public void setContCheckTimeRange1(Date contCheckTimeRange1) {
        this.contCheckTimeRange1 = contCheckTimeRange1;
    }

    public Date getContCheckTimeRange2() {
        return contCheckTimeRange2;
    }

    public void setContCheckTimeRange2(Date contCheckTimeRange2) {
        this.contCheckTimeRange2 = contCheckTimeRange2;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getSendStatusRange() {
        return sendStatusRange;
    }

    public void setSendStatusRange(String sendStatusRange) {
        this.sendStatusRange = sendStatusRange == null ? null : sendStatusRange.trim();
    }

    public String getSendPushStatus() {
        return sendPushStatus;
    }

    public void setSendPushStatus(String sendPushStatus) {
        this.sendPushStatus = sendPushStatus == null ? null : sendPushStatus.trim();
    }

    public String getSendPushStatusRange() {
        return sendPushStatusRange;
    }

    public void setSendPushStatusRange(String sendPushStatusRange) {
        this.sendPushStatusRange = sendPushStatusRange == null ? null : sendPushStatusRange.trim();
    }

    public Date getSendCheckTime() {
        return sendCheckTime;
    }

    public void setSendCheckTime(Date sendCheckTime) {
        this.sendCheckTime = sendCheckTime;
    }

    public Date getSendCheckTimeRange1() {
        return sendCheckTimeRange1;
    }

    public void setSendCheckTimeRange1(Date sendCheckTimeRange1) {
        this.sendCheckTimeRange1 = sendCheckTimeRange1;
    }

    public Date getSendCheckTimeRange2() {
        return sendCheckTimeRange2;
    }

    public void setSendCheckTimeRange2(Date sendCheckTimeRange2) {
        this.sendCheckTimeRange2 = sendCheckTimeRange2;
    }

    public String getMdName() {
        return mdName;
    }

    public void setMdName(String mdName) {
        this.mdName = mdName == null ? null : mdName.trim();
    }

    public String getMdNameRange() {
        return mdNameRange;
    }

    public void setMdNameRange(String mdNameRange) {
        this.mdNameRange = mdNameRange == null ? null : mdNameRange.trim();
    }

    public String getMdId() {
        return mdId;
    }

    public void setMdId(String mdId) {
        this.mdId = mdId == null ? null : mdId.trim();
    }

    public String getMdIdRange() {
        return mdIdRange;
    }

    public void setMdIdRange(String mdIdRange) {
        this.mdIdRange = mdIdRange == null ? null : mdIdRange.trim();
    }

    public String getBussId() {
        return bussId;
    }

    public void setBussId(String bussId) {
        this.bussId = bussId == null ? null : bussId.trim();
    }

    public String getBussIdRange() {
        return bussIdRange;
    }

    public void setBussIdRange(String bussIdRange) {
        this.bussIdRange = bussIdRange == null ? null : bussIdRange.trim();
    }

    public String getBussName() {
        return bussName;
    }

    public void setBussName(String bussName) {
        this.bussName = bussName == null ? null : bussName.trim();
    }

    public String getBussNameRange() {
        return bussNameRange;
    }

    public void setBussNameRange(String bussNameRange) {
        this.bussNameRange = bussNameRange == null ? null : bussNameRange.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateUserRange() {
        return createUserRange;
    }

    public void setCreateUserRange(String createUserRange) {
        this.createUserRange = createUserRange == null ? null : createUserRange.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTimeRange1() {
        return createTimeRange1;
    }

    public void setCreateTimeRange1(Date createTimeRange1) {
        this.createTimeRange1 = createTimeRange1;
    }

    public Date getCreateTimeRange2() {
        return createTimeRange2;
    }

    public void setCreateTimeRange2(Date createTimeRange2) {
        this.createTimeRange2 = createTimeRange2;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getUpdateUserRange() {
        return updateUserRange;
    }

    public void setUpdateUserRange(String updateUserRange) {
        this.updateUserRange = updateUserRange == null ? null : updateUserRange.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTimeRange1() {
        return updateTimeRange1;
    }

    public void setUpdateTimeRange1(Date updateTimeRange1) {
        this.updateTimeRange1 = updateTimeRange1;
    }

    public Date getUpdateTimeRange2() {
        return updateTimeRange2;
    }

    public void setUpdateTimeRange2(Date updateTimeRange2) {
        this.updateTimeRange2 = updateTimeRange2;
    }

    public String getExtracClause() {
        return extracClause;
    }

    public void setExtracClause(String extracClause) {
        this.extracClause = extracClause == null ? null : extracClause.trim();
    }

    public String getExtracSelectColunm() {
        return extracSelectColunm;
    }

    public void setExtracSelectColunm(String extracSelectColunm) {
        this.extracSelectColunm = extracSelectColunm == null ? null : extracSelectColunm.trim();
    }

    public String getExtracTable() {
        return extracTable;
    }

    public void setExtracTable(String extracTable) {
        this.extracTable = extracTable == null ? null : extracTable.trim();
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Page getPage() {
        return this.page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andPayModIsNull() {
            addCriterion("pay_mod is null");
            return (Criteria) this;
        }

        public Criteria andPayModIsNotNull() {
            addCriterion("pay_mod is not null");
            return (Criteria) this;
        }

        public Criteria andPayModEqualTo(String value) {
            addCriterion("pay_mod =", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotEqualTo(String value) {
            addCriterion("pay_mod <>", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModGreaterThan(String value) {
            addCriterion("pay_mod >", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModGreaterThanOrEqualTo(String value) {
            addCriterion("pay_mod >=", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModLessThan(String value) {
            addCriterion("pay_mod <", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModLessThanOrEqualTo(String value) {
            addCriterion("pay_mod <=", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModLike(String value) {
            addCriterion("pay_mod like", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotLike(String value) {
            addCriterion("pay_mod not like", value, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModIn(List<String> values) {
            addCriterion("pay_mod in", values, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotIn(List<String> values) {
            addCriterion("pay_mod not in", values, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModBetween(String value1, String value2) {
            addCriterion("pay_mod between", value1, value2, "payMod");
            return (Criteria) this;
        }

        public Criteria andPayModNotBetween(String value1, String value2) {
            addCriterion("pay_mod not between", value1, value2, "payMod");
            return (Criteria) this;
        }

        public Criteria andColdIdIsNull() {
            addCriterion("cold_id is null");
            return (Criteria) this;
        }

        public Criteria andColdIdIsNotNull() {
            addCriterion("cold_id is not null");
            return (Criteria) this;
        }

        public Criteria andColdIdEqualTo(String value) {
            addCriterion("cold_id =", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdNotEqualTo(String value) {
            addCriterion("cold_id <>", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdGreaterThan(String value) {
            addCriterion("cold_id >", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdGreaterThanOrEqualTo(String value) {
            addCriterion("cold_id >=", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdLessThan(String value) {
            addCriterion("cold_id <", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdLessThanOrEqualTo(String value) {
            addCriterion("cold_id <=", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdLike(String value) {
            addCriterion("cold_id like", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdNotLike(String value) {
            addCriterion("cold_id not like", value, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdIn(List<String> values) {
            addCriterion("cold_id in", values, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdNotIn(List<String> values) {
            addCriterion("cold_id not in", values, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdBetween(String value1, String value2) {
            addCriterion("cold_id between", value1, value2, "coldId");
            return (Criteria) this;
        }

        public Criteria andColdIdNotBetween(String value1, String value2) {
            addCriterion("cold_id not between", value1, value2, "coldId");
            return (Criteria) this;
        }

        public Criteria andPickUpNoIsNull() {
            addCriterion("pick_up_no is null");
            return (Criteria) this;
        }

        public Criteria andPickUpNoIsNotNull() {
            addCriterion("pick_up_no is not null");
            return (Criteria) this;
        }

        public Criteria andPickUpNoEqualTo(String value) {
            addCriterion("pick_up_no =", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoNotEqualTo(String value) {
            addCriterion("pick_up_no <>", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoGreaterThan(String value) {
            addCriterion("pick_up_no >", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoGreaterThanOrEqualTo(String value) {
            addCriterion("pick_up_no >=", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoLessThan(String value) {
            addCriterion("pick_up_no <", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoLessThanOrEqualTo(String value) {
            addCriterion("pick_up_no <=", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoLike(String value) {
            addCriterion("pick_up_no like", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoNotLike(String value) {
            addCriterion("pick_up_no not like", value, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoIn(List<String> values) {
            addCriterion("pick_up_no in", values, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoNotIn(List<String> values) {
            addCriterion("pick_up_no not in", values, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoBetween(String value1, String value2) {
            addCriterion("pick_up_no between", value1, value2, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andPickUpNoNotBetween(String value1, String value2) {
            addCriterion("pick_up_no not between", value1, value2, "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andDelvOptIsNull() {
            addCriterion("delv_opt is null");
            return (Criteria) this;
        }

        public Criteria andDelvOptIsNotNull() {
            addCriterion("delv_opt is not null");
            return (Criteria) this;
        }

        public Criteria andDelvOptEqualTo(String value) {
            addCriterion("delv_opt =", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptNotEqualTo(String value) {
            addCriterion("delv_opt <>", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptGreaterThan(String value) {
            addCriterion("delv_opt >", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptGreaterThanOrEqualTo(String value) {
            addCriterion("delv_opt >=", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptLessThan(String value) {
            addCriterion("delv_opt <", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptLessThanOrEqualTo(String value) {
            addCriterion("delv_opt <=", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptLike(String value) {
            addCriterion("delv_opt like", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptNotLike(String value) {
            addCriterion("delv_opt not like", value, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptIn(List<String> values) {
            addCriterion("delv_opt in", values, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptNotIn(List<String> values) {
            addCriterion("delv_opt not in", values, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptBetween(String value1, String value2) {
            addCriterion("delv_opt between", value1, value2, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andDelvOptNotBetween(String value1, String value2) {
            addCriterion("delv_opt not between", value1, value2, "delvOpt");
            return (Criteria) this;
        }

        public Criteria andCourierCompIsNull() {
            addCriterion("courier_comp is null");
            return (Criteria) this;
        }

        public Criteria andCourierCompIsNotNull() {
            addCriterion("courier_comp is not null");
            return (Criteria) this;
        }

        public Criteria andCourierCompEqualTo(String value) {
            addCriterion("courier_comp =", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompNotEqualTo(String value) {
            addCriterion("courier_comp <>", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompGreaterThan(String value) {
            addCriterion("courier_comp >", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompGreaterThanOrEqualTo(String value) {
            addCriterion("courier_comp >=", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompLessThan(String value) {
            addCriterion("courier_comp <", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompLessThanOrEqualTo(String value) {
            addCriterion("courier_comp <=", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompLike(String value) {
            addCriterion("courier_comp like", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompNotLike(String value) {
            addCriterion("courier_comp not like", value, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompIn(List<String> values) {
            addCriterion("courier_comp in", values, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompNotIn(List<String> values) {
            addCriterion("courier_comp not in", values, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompBetween(String value1, String value2) {
            addCriterion("courier_comp between", value1, value2, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCourierCompNotBetween(String value1, String value2) {
            addCriterion("courier_comp not between", value1, value2, "courierComp");
            return (Criteria) this;
        }

        public Criteria andCsgNameIsNull() {
            addCriterion("csg_name is null");
            return (Criteria) this;
        }

        public Criteria andCsgNameIsNotNull() {
            addCriterion("csg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCsgNameEqualTo(String value) {
            addCriterion("csg_name =", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameNotEqualTo(String value) {
            addCriterion("csg_name <>", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameGreaterThan(String value) {
            addCriterion("csg_name >", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameGreaterThanOrEqualTo(String value) {
            addCriterion("csg_name >=", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameLessThan(String value) {
            addCriterion("csg_name <", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameLessThanOrEqualTo(String value) {
            addCriterion("csg_name <=", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameLike(String value) {
            addCriterion("csg_name like", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameNotLike(String value) {
            addCriterion("csg_name not like", value, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameIn(List<String> values) {
            addCriterion("csg_name in", values, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameNotIn(List<String> values) {
            addCriterion("csg_name not in", values, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameBetween(String value1, String value2) {
            addCriterion("csg_name between", value1, value2, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgNameNotBetween(String value1, String value2) {
            addCriterion("csg_name not between", value1, value2, "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgTelIsNull() {
            addCriterion("csg_tel is null");
            return (Criteria) this;
        }

        public Criteria andCsgTelIsNotNull() {
            addCriterion("csg_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCsgTelEqualTo(String value) {
            addCriterion("csg_tel =", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelNotEqualTo(String value) {
            addCriterion("csg_tel <>", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelGreaterThan(String value) {
            addCriterion("csg_tel >", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelGreaterThanOrEqualTo(String value) {
            addCriterion("csg_tel >=", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelLessThan(String value) {
            addCriterion("csg_tel <", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelLessThanOrEqualTo(String value) {
            addCriterion("csg_tel <=", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelLike(String value) {
            addCriterion("csg_tel like", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelNotLike(String value) {
            addCriterion("csg_tel not like", value, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelIn(List<String> values) {
            addCriterion("csg_tel in", values, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelNotIn(List<String> values) {
            addCriterion("csg_tel not in", values, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelBetween(String value1, String value2) {
            addCriterion("csg_tel between", value1, value2, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgTelNotBetween(String value1, String value2) {
            addCriterion("csg_tel not between", value1, value2, "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgAddrIsNull() {
            addCriterion("csg_addr is null");
            return (Criteria) this;
        }

        public Criteria andCsgAddrIsNotNull() {
            addCriterion("csg_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCsgAddrEqualTo(String value) {
            addCriterion("csg_addr =", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrNotEqualTo(String value) {
            addCriterion("csg_addr <>", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrGreaterThan(String value) {
            addCriterion("csg_addr >", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrGreaterThanOrEqualTo(String value) {
            addCriterion("csg_addr >=", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrLessThan(String value) {
            addCriterion("csg_addr <", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrLessThanOrEqualTo(String value) {
            addCriterion("csg_addr <=", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrLike(String value) {
            addCriterion("csg_addr like", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrNotLike(String value) {
            addCriterion("csg_addr not like", value, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrIn(List<String> values) {
            addCriterion("csg_addr in", values, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrNotIn(List<String> values) {
            addCriterion("csg_addr not in", values, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrBetween(String value1, String value2) {
            addCriterion("csg_addr between", value1, value2, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgAddrNotBetween(String value1, String value2) {
            addCriterion("csg_addr not between", value1, value2, "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgIdIsNull() {
            addCriterion("csg_id is null");
            return (Criteria) this;
        }

        public Criteria andCsgIdIsNotNull() {
            addCriterion("csg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCsgIdEqualTo(String value) {
            addCriterion("csg_id =", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdNotEqualTo(String value) {
            addCriterion("csg_id <>", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdGreaterThan(String value) {
            addCriterion("csg_id >", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("csg_id >=", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdLessThan(String value) {
            addCriterion("csg_id <", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdLessThanOrEqualTo(String value) {
            addCriterion("csg_id <=", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdLike(String value) {
            addCriterion("csg_id like", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdNotLike(String value) {
            addCriterion("csg_id not like", value, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdIn(List<String> values) {
            addCriterion("csg_id in", values, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdNotIn(List<String> values) {
            addCriterion("csg_id not in", values, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdBetween(String value1, String value2) {
            addCriterion("csg_id between", value1, value2, "csgId");
            return (Criteria) this;
        }

        public Criteria andCsgIdNotBetween(String value1, String value2) {
            addCriterion("csg_id not between", value1, value2, "csgId");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("car_num like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("car_num not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andDriNumIsNull() {
            addCriterion("dri_num is null");
            return (Criteria) this;
        }

        public Criteria andDriNumIsNotNull() {
            addCriterion("dri_num is not null");
            return (Criteria) this;
        }

        public Criteria andDriNumEqualTo(String value) {
            addCriterion("dri_num =", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumNotEqualTo(String value) {
            addCriterion("dri_num <>", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumGreaterThan(String value) {
            addCriterion("dri_num >", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumGreaterThanOrEqualTo(String value) {
            addCriterion("dri_num >=", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumLessThan(String value) {
            addCriterion("dri_num <", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumLessThanOrEqualTo(String value) {
            addCriterion("dri_num <=", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumLike(String value) {
            addCriterion("dri_num like", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumNotLike(String value) {
            addCriterion("dri_num not like", value, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumIn(List<String> values) {
            addCriterion("dri_num in", values, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumNotIn(List<String> values) {
            addCriterion("dri_num not in", values, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumBetween(String value1, String value2) {
            addCriterion("dri_num between", value1, value2, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriNumNotBetween(String value1, String value2) {
            addCriterion("dri_num not between", value1, value2, "driNum");
            return (Criteria) this;
        }

        public Criteria andDriTelIsNull() {
            addCriterion("dri_tel is null");
            return (Criteria) this;
        }

        public Criteria andDriTelIsNotNull() {
            addCriterion("dri_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDriTelEqualTo(String value) {
            addCriterion("dri_tel =", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelNotEqualTo(String value) {
            addCriterion("dri_tel <>", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelGreaterThan(String value) {
            addCriterion("dri_tel >", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelGreaterThanOrEqualTo(String value) {
            addCriterion("dri_tel >=", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelLessThan(String value) {
            addCriterion("dri_tel <", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelLessThanOrEqualTo(String value) {
            addCriterion("dri_tel <=", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelLike(String value) {
            addCriterion("dri_tel like", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelNotLike(String value) {
            addCriterion("dri_tel not like", value, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelIn(List<String> values) {
            addCriterion("dri_tel in", values, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelNotIn(List<String> values) {
            addCriterion("dri_tel not in", values, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelBetween(String value1, String value2) {
            addCriterion("dri_tel between", value1, value2, "driTel");
            return (Criteria) this;
        }

        public Criteria andDriTelNotBetween(String value1, String value2) {
            addCriterion("dri_tel not between", value1, value2, "driTel");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdIsNull() {
            addCriterion("pay_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdIsNotNull() {
            addCriterion("pay_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdEqualTo(String value) {
            addCriterion("pay_info_id =", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotEqualTo(String value) {
            addCriterion("pay_info_id <>", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdGreaterThan(String value) {
            addCriterion("pay_info_id >", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_info_id >=", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLessThan(String value) {
            addCriterion("pay_info_id <", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLessThanOrEqualTo(String value) {
            addCriterion("pay_info_id <=", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLike(String value) {
            addCriterion("pay_info_id like", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotLike(String value) {
            addCriterion("pay_info_id not like", value, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdIn(List<String> values) {
            addCriterion("pay_info_id in", values, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotIn(List<String> values) {
            addCriterion("pay_info_id not in", values, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdBetween(String value1, String value2) {
            addCriterion("pay_info_id between", value1, value2, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdNotBetween(String value1, String value2) {
            addCriterion("pay_info_id not between", value1, value2, "payInfoId");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNull() {
            addCriterion("card_num is null");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNotNull() {
            addCriterion("card_num is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumEqualTo(String value) {
            addCriterion("card_num =", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotEqualTo(String value) {
            addCriterion("card_num <>", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThan(String value) {
            addCriterion("card_num >", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("card_num >=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThan(String value) {
            addCriterion("card_num <", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThanOrEqualTo(String value) {
            addCriterion("card_num <=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLike(String value) {
            addCriterion("card_num like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotLike(String value) {
            addCriterion("card_num not like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumIn(List<String> values) {
            addCriterion("card_num in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotIn(List<String> values) {
            addCriterion("card_num not in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumBetween(String value1, String value2) {
            addCriterion("card_num between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotBetween(String value1, String value2) {
            addCriterion("card_num not between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusIsNull() {
            addCriterion("order_push_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusIsNotNull() {
            addCriterion("order_push_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusEqualTo(String value) {
            addCriterion("order_push_status =", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusNotEqualTo(String value) {
            addCriterion("order_push_status <>", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusGreaterThan(String value) {
            addCriterion("order_push_status >", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_push_status >=", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusLessThan(String value) {
            addCriterion("order_push_status <", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusLessThanOrEqualTo(String value) {
            addCriterion("order_push_status <=", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusLike(String value) {
            addCriterion("order_push_status like", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusNotLike(String value) {
            addCriterion("order_push_status not like", value, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusIn(List<String> values) {
            addCriterion("order_push_status in", values, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusNotIn(List<String> values) {
            addCriterion("order_push_status not in", values, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusBetween(String value1, String value2) {
            addCriterion("order_push_status between", value1, value2, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusNotBetween(String value1, String value2) {
            addCriterion("order_push_status not between", value1, value2, "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusIsNull() {
            addCriterion("cont_status is null");
            return (Criteria) this;
        }

        public Criteria andContStatusIsNotNull() {
            addCriterion("cont_status is not null");
            return (Criteria) this;
        }

        public Criteria andContStatusEqualTo(String value) {
            addCriterion("cont_status =", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotEqualTo(String value) {
            addCriterion("cont_status <>", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusGreaterThan(String value) {
            addCriterion("cont_status >", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cont_status >=", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusLessThan(String value) {
            addCriterion("cont_status <", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusLessThanOrEqualTo(String value) {
            addCriterion("cont_status <=", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusLike(String value) {
            addCriterion("cont_status like", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotLike(String value) {
            addCriterion("cont_status not like", value, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusIn(List<String> values) {
            addCriterion("cont_status in", values, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotIn(List<String> values) {
            addCriterion("cont_status not in", values, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusBetween(String value1, String value2) {
            addCriterion("cont_status between", value1, value2, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusNotBetween(String value1, String value2) {
            addCriterion("cont_status not between", value1, value2, "contStatus");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeIsNull() {
            addCriterion("cont_check_time is null");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeIsNotNull() {
            addCriterion("cont_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeEqualTo(Date value) {
            addCriterion("cont_check_time =", value, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeNotEqualTo(Date value) {
            addCriterion("cont_check_time <>", value, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeGreaterThan(Date value) {
            addCriterion("cont_check_time >", value, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cont_check_time >=", value, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeLessThan(Date value) {
            addCriterion("cont_check_time <", value, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("cont_check_time <=", value, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeIn(List<Date> values) {
            addCriterion("cont_check_time in", values, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeNotIn(List<Date> values) {
            addCriterion("cont_check_time not in", values, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeBetween(Date value1, Date value2) {
            addCriterion("cont_check_time between", value1, value2, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andContCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("cont_check_time not between", value1, value2, "contCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(String value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(String value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(String value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(String value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(String value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLike(String value) {
            addCriterion("send_status like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotLike(String value) {
            addCriterion("send_status not like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<String> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<String> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(String value1, String value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(String value1, String value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusIsNull() {
            addCriterion("send_push_status is null");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusIsNotNull() {
            addCriterion("send_push_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusEqualTo(String value) {
            addCriterion("send_push_status =", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusNotEqualTo(String value) {
            addCriterion("send_push_status <>", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusGreaterThan(String value) {
            addCriterion("send_push_status >", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusGreaterThanOrEqualTo(String value) {
            addCriterion("send_push_status >=", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusLessThan(String value) {
            addCriterion("send_push_status <", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusLessThanOrEqualTo(String value) {
            addCriterion("send_push_status <=", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusLike(String value) {
            addCriterion("send_push_status like", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusNotLike(String value) {
            addCriterion("send_push_status not like", value, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusIn(List<String> values) {
            addCriterion("send_push_status in", values, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusNotIn(List<String> values) {
            addCriterion("send_push_status not in", values, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusBetween(String value1, String value2) {
            addCriterion("send_push_status between", value1, value2, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusNotBetween(String value1, String value2) {
            addCriterion("send_push_status not between", value1, value2, "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeIsNull() {
            addCriterion("send_check_time is null");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeIsNotNull() {
            addCriterion("send_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeEqualTo(Date value) {
            addCriterion("send_check_time =", value, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeNotEqualTo(Date value) {
            addCriterion("send_check_time <>", value, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeGreaterThan(Date value) {
            addCriterion("send_check_time >", value, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_check_time >=", value, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeLessThan(Date value) {
            addCriterion("send_check_time <", value, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_check_time <=", value, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeIn(List<Date> values) {
            addCriterion("send_check_time in", values, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeNotIn(List<Date> values) {
            addCriterion("send_check_time not in", values, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeBetween(Date value1, Date value2) {
            addCriterion("send_check_time between", value1, value2, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andSendCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_check_time not between", value1, value2, "sendCheckTime");
            return (Criteria) this;
        }

        public Criteria andMdNameIsNull() {
            addCriterion("md_name is null");
            return (Criteria) this;
        }

        public Criteria andMdNameIsNotNull() {
            addCriterion("md_name is not null");
            return (Criteria) this;
        }

        public Criteria andMdNameEqualTo(String value) {
            addCriterion("md_name =", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameNotEqualTo(String value) {
            addCriterion("md_name <>", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameGreaterThan(String value) {
            addCriterion("md_name >", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameGreaterThanOrEqualTo(String value) {
            addCriterion("md_name >=", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameLessThan(String value) {
            addCriterion("md_name <", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameLessThanOrEqualTo(String value) {
            addCriterion("md_name <=", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameLike(String value) {
            addCriterion("md_name like", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameNotLike(String value) {
            addCriterion("md_name not like", value, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameIn(List<String> values) {
            addCriterion("md_name in", values, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameNotIn(List<String> values) {
            addCriterion("md_name not in", values, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameBetween(String value1, String value2) {
            addCriterion("md_name between", value1, value2, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdNameNotBetween(String value1, String value2) {
            addCriterion("md_name not between", value1, value2, "mdName");
            return (Criteria) this;
        }

        public Criteria andMdIdIsNull() {
            addCriterion("md_id is null");
            return (Criteria) this;
        }

        public Criteria andMdIdIsNotNull() {
            addCriterion("md_id is not null");
            return (Criteria) this;
        }

        public Criteria andMdIdEqualTo(String value) {
            addCriterion("md_id =", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdNotEqualTo(String value) {
            addCriterion("md_id <>", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdGreaterThan(String value) {
            addCriterion("md_id >", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdGreaterThanOrEqualTo(String value) {
            addCriterion("md_id >=", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdLessThan(String value) {
            addCriterion("md_id <", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdLessThanOrEqualTo(String value) {
            addCriterion("md_id <=", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdLike(String value) {
            addCriterion("md_id like", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdNotLike(String value) {
            addCriterion("md_id not like", value, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdIn(List<String> values) {
            addCriterion("md_id in", values, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdNotIn(List<String> values) {
            addCriterion("md_id not in", values, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdBetween(String value1, String value2) {
            addCriterion("md_id between", value1, value2, "mdId");
            return (Criteria) this;
        }

        public Criteria andMdIdNotBetween(String value1, String value2) {
            addCriterion("md_id not between", value1, value2, "mdId");
            return (Criteria) this;
        }

        public Criteria andBussIdIsNull() {
            addCriterion("buss_id is null");
            return (Criteria) this;
        }

        public Criteria andBussIdIsNotNull() {
            addCriterion("buss_id is not null");
            return (Criteria) this;
        }

        public Criteria andBussIdEqualTo(String value) {
            addCriterion("buss_id =", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdNotEqualTo(String value) {
            addCriterion("buss_id <>", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdGreaterThan(String value) {
            addCriterion("buss_id >", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdGreaterThanOrEqualTo(String value) {
            addCriterion("buss_id >=", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdLessThan(String value) {
            addCriterion("buss_id <", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdLessThanOrEqualTo(String value) {
            addCriterion("buss_id <=", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdLike(String value) {
            addCriterion("buss_id like", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdNotLike(String value) {
            addCriterion("buss_id not like", value, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdIn(List<String> values) {
            addCriterion("buss_id in", values, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdNotIn(List<String> values) {
            addCriterion("buss_id not in", values, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdBetween(String value1, String value2) {
            addCriterion("buss_id between", value1, value2, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussIdNotBetween(String value1, String value2) {
            addCriterion("buss_id not between", value1, value2, "bussId");
            return (Criteria) this;
        }

        public Criteria andBussNameIsNull() {
            addCriterion("buss_name is null");
            return (Criteria) this;
        }

        public Criteria andBussNameIsNotNull() {
            addCriterion("buss_name is not null");
            return (Criteria) this;
        }

        public Criteria andBussNameEqualTo(String value) {
            addCriterion("buss_name =", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameNotEqualTo(String value) {
            addCriterion("buss_name <>", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameGreaterThan(String value) {
            addCriterion("buss_name >", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameGreaterThanOrEqualTo(String value) {
            addCriterion("buss_name >=", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameLessThan(String value) {
            addCriterion("buss_name <", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameLessThanOrEqualTo(String value) {
            addCriterion("buss_name <=", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameLike(String value) {
            addCriterion("buss_name like", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameNotLike(String value) {
            addCriterion("buss_name not like", value, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameIn(List<String> values) {
            addCriterion("buss_name in", values, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameNotIn(List<String> values) {
            addCriterion("buss_name not in", values, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameBetween(String value1, String value2) {
            addCriterion("buss_name between", value1, value2, "bussName");
            return (Criteria) this;
        }

        public Criteria andBussNameNotBetween(String value1, String value2) {
            addCriterion("buss_name not between", value1, value2, "bussName");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOrderIdLikeInsensitive(String value) {
            addCriterion("upper(order_id) like", value.toUpperCase(), "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNumLikeInsensitive(String value) {
            addCriterion("upper(order_num) like", value.toUpperCase(), "orderNum");
            return (Criteria) this;
        }

        public Criteria andPayModLikeInsensitive(String value) {
            addCriterion("upper(pay_mod) like", value.toUpperCase(), "payMod");
            return (Criteria) this;
        }

        public Criteria andColdIdLikeInsensitive(String value) {
            addCriterion("upper(cold_id) like", value.toUpperCase(), "coldId");
            return (Criteria) this;
        }

        public Criteria andPickUpNoLikeInsensitive(String value) {
            addCriterion("upper(pick_up_no) like", value.toUpperCase(), "pickUpNo");
            return (Criteria) this;
        }

        public Criteria andDelvOptLikeInsensitive(String value) {
            addCriterion("upper(delv_opt) like", value.toUpperCase(), "delvOpt");
            return (Criteria) this;
        }

        public Criteria andCourierCompLikeInsensitive(String value) {
            addCriterion("upper(courier_comp) like", value.toUpperCase(), "courierComp");
            return (Criteria) this;
        }

        public Criteria andCsgNameLikeInsensitive(String value) {
            addCriterion("upper(csg_name) like", value.toUpperCase(), "csgName");
            return (Criteria) this;
        }

        public Criteria andCsgTelLikeInsensitive(String value) {
            addCriterion("upper(csg_tel) like", value.toUpperCase(), "csgTel");
            return (Criteria) this;
        }

        public Criteria andCsgAddrLikeInsensitive(String value) {
            addCriterion("upper(csg_addr) like", value.toUpperCase(), "csgAddr");
            return (Criteria) this;
        }

        public Criteria andCsgIdLikeInsensitive(String value) {
            addCriterion("upper(csg_id) like", value.toUpperCase(), "csgId");
            return (Criteria) this;
        }

        public Criteria andCarNumLikeInsensitive(String value) {
            addCriterion("upper(car_num) like", value.toUpperCase(), "carNum");
            return (Criteria) this;
        }

        public Criteria andDriNumLikeInsensitive(String value) {
            addCriterion("upper(dri_num) like", value.toUpperCase(), "driNum");
            return (Criteria) this;
        }

        public Criteria andDriTelLikeInsensitive(String value) {
            addCriterion("upper(dri_tel) like", value.toUpperCase(), "driTel");
            return (Criteria) this;
        }

        public Criteria andPayInfoIdLikeInsensitive(String value) {
            addCriterion("upper(pay_info_id) like", value.toUpperCase(), "payInfoId");
            return (Criteria) this;
        }

        public Criteria andCardNumLikeInsensitive(String value) {
            addCriterion("upper(card_num) like", value.toUpperCase(), "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNameLikeInsensitive(String value) {
            addCriterion("upper(card_name) like", value.toUpperCase(), "cardName");
            return (Criteria) this;
        }

        public Criteria andBankNameLikeInsensitive(String value) {
            addCriterion("upper(bank_name) like", value.toUpperCase(), "bankName");
            return (Criteria) this;
        }

        public Criteria andOrderPushStatusLikeInsensitive(String value) {
            addCriterion("upper(order_push_status) like", value.toUpperCase(), "orderPushStatus");
            return (Criteria) this;
        }

        public Criteria andContStatusLikeInsensitive(String value) {
            addCriterion("upper(cont_status) like", value.toUpperCase(), "contStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLikeInsensitive(String value) {
            addCriterion("upper(send_status) like", value.toUpperCase(), "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendPushStatusLikeInsensitive(String value) {
            addCriterion("upper(send_push_status) like", value.toUpperCase(), "sendPushStatus");
            return (Criteria) this;
        }

        public Criteria andMdNameLikeInsensitive(String value) {
            addCriterion("upper(md_name) like", value.toUpperCase(), "mdName");
            return (Criteria) this;
        }

        public Criteria andMdIdLikeInsensitive(String value) {
            addCriterion("upper(md_id) like", value.toUpperCase(), "mdId");
            return (Criteria) this;
        }

        public Criteria andBussIdLikeInsensitive(String value) {
            addCriterion("upper(buss_id) like", value.toUpperCase(), "bussId");
            return (Criteria) this;
        }

        public Criteria andBussNameLikeInsensitive(String value) {
            addCriterion("upper(buss_name) like", value.toUpperCase(), "bussName");
            return (Criteria) this;
        }

        public Criteria andCreateUserLikeInsensitive(String value) {
            addCriterion("upper(create_user) like", value.toUpperCase(), "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLikeInsensitive(String value) {
            addCriterion("upper(update_user) like", value.toUpperCase(), "updateUser");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
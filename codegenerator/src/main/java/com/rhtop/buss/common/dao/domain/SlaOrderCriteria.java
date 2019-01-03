package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SlaOrderCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 子订单编号格式：B_年月日时Random6位 */
    private String slaOrderId;

    private String slaOrderIdRange;

    private String orderId;

    private String orderIdRange;

    /** 订单类型：  10：app创建  20：pc制作订单 */
    private String slaOrderType;

    private String slaOrderTypeRange;

    /** 市场总监UUID */
    private String mdId;

    private String mdIdRange;

    private String mdName;

    private String mdNameRange;

    /** 创建人姓名  即可客户的名称 */
    private String bussName;

    private String bussNameRange;

    /** 客户Id */
    private String bussId;

    private String bussIdRange;

    /** 品类ID */
    private String categoryId;

    private String categoryIdRange;

    /** 回盘ID */
    private String counterofferId;

    private String counterofferIdRange;

    /** 交易数量 */
    private String txAmo;

    private String txAmoRange;

    /** 交易价 */
    private BigDecimal ctofPri;

    /** 总价 */
    private BigDecimal totPri;

    /** 子订单状态,对应字典Constants.SlaOrderStatus：S0A：有效,S0B：用户撤单 */
    private String soStatus;

    private String soStatusRange;

    /** 付款状态  00：未付款  10：已付款未确认20：已付款已确认 */
    private String contStatus;

    private String contStatusRange;

    /** 发货状态  00:未发货  10：已发货 */
    private String sendStatus;

    private String sendStatusRange;

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

    /** 报盘均码(KG/件) */
    private BigDecimal offerAvgWeight;

    /** 抄码价格单位：元/KG */
    private BigDecimal catchweightPri;

    /** 报盘价（标码报价）单位：元/件 */
    private BigDecimal offerPri;

    /** 抄码与标码标识，对应字典CategoryScCodeFlag:S00-标码，S01-抄码 */
    private String standardCatch;

    private String standardCatchRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public SlaOrderCriteria() {
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

    public String getSlaOrderId() {
        return slaOrderId;
    }

    public void setSlaOrderId(String slaOrderId) {
        this.slaOrderId = slaOrderId == null ? null : slaOrderId.trim();
    }

    public String getSlaOrderIdRange() {
        return slaOrderIdRange;
    }

    public void setSlaOrderIdRange(String slaOrderIdRange) {
        this.slaOrderIdRange = slaOrderIdRange == null ? null : slaOrderIdRange.trim();
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

    public String getSlaOrderType() {
        return slaOrderType;
    }

    public void setSlaOrderType(String slaOrderType) {
        this.slaOrderType = slaOrderType == null ? null : slaOrderType.trim();
    }

    public String getSlaOrderTypeRange() {
        return slaOrderTypeRange;
    }

    public void setSlaOrderTypeRange(String slaOrderTypeRange) {
        this.slaOrderTypeRange = slaOrderTypeRange == null ? null : slaOrderTypeRange.trim();
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getCategoryIdRange() {
        return categoryIdRange;
    }

    public void setCategoryIdRange(String categoryIdRange) {
        this.categoryIdRange = categoryIdRange == null ? null : categoryIdRange.trim();
    }

    public String getCounterofferId() {
        return counterofferId;
    }

    public void setCounterofferId(String counterofferId) {
        this.counterofferId = counterofferId == null ? null : counterofferId.trim();
    }

    public String getCounterofferIdRange() {
        return counterofferIdRange;
    }

    public void setCounterofferIdRange(String counterofferIdRange) {
        this.counterofferIdRange = counterofferIdRange == null ? null : counterofferIdRange.trim();
    }

    public String getTxAmo() {
        return txAmo;
    }

    public void setTxAmo(String txAmo) {
        this.txAmo = txAmo == null ? null : txAmo.trim();
    }

    public String getTxAmoRange() {
        return txAmoRange;
    }

    public void setTxAmoRange(String txAmoRange) {
        this.txAmoRange = txAmoRange == null ? null : txAmoRange.trim();
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

    public String getSoStatusRange() {
        return soStatusRange;
    }

    public void setSoStatusRange(String soStatusRange) {
        this.soStatusRange = soStatusRange == null ? null : soStatusRange.trim();
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

    public String getStandardCatchRange() {
        return standardCatchRange;
    }

    public void setStandardCatchRange(String standardCatchRange) {
        this.standardCatchRange = standardCatchRange == null ? null : standardCatchRange.trim();
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

        public Criteria andSlaOrderIdIsNull() {
            addCriterion("sla_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdIsNotNull() {
            addCriterion("sla_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdEqualTo(String value) {
            addCriterion("sla_order_id =", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdNotEqualTo(String value) {
            addCriterion("sla_order_id <>", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdGreaterThan(String value) {
            addCriterion("sla_order_id >", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sla_order_id >=", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdLessThan(String value) {
            addCriterion("sla_order_id <", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sla_order_id <=", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdLike(String value) {
            addCriterion("sla_order_id like", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdNotLike(String value) {
            addCriterion("sla_order_id not like", value, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdIn(List<String> values) {
            addCriterion("sla_order_id in", values, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdNotIn(List<String> values) {
            addCriterion("sla_order_id not in", values, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdBetween(String value1, String value2) {
            addCriterion("sla_order_id between", value1, value2, "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdNotBetween(String value1, String value2) {
            addCriterion("sla_order_id not between", value1, value2, "slaOrderId");
            return (Criteria) this;
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

        public Criteria andSlaOrderTypeIsNull() {
            addCriterion("sla_order_type is null");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeIsNotNull() {
            addCriterion("sla_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeEqualTo(String value) {
            addCriterion("sla_order_type =", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeNotEqualTo(String value) {
            addCriterion("sla_order_type <>", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeGreaterThan(String value) {
            addCriterion("sla_order_type >", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sla_order_type >=", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeLessThan(String value) {
            addCriterion("sla_order_type <", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("sla_order_type <=", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeLike(String value) {
            addCriterion("sla_order_type like", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeNotLike(String value) {
            addCriterion("sla_order_type not like", value, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeIn(List<String> values) {
            addCriterion("sla_order_type in", values, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeNotIn(List<String> values) {
            addCriterion("sla_order_type not in", values, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeBetween(String value1, String value2) {
            addCriterion("sla_order_type between", value1, value2, "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeNotBetween(String value1, String value2) {
            addCriterion("sla_order_type not between", value1, value2, "slaOrderType");
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdIsNull() {
            addCriterion("counteroffer_id is null");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdIsNotNull() {
            addCriterion("counteroffer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdEqualTo(String value) {
            addCriterion("counteroffer_id =", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdNotEqualTo(String value) {
            addCriterion("counteroffer_id <>", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdGreaterThan(String value) {
            addCriterion("counteroffer_id >", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdGreaterThanOrEqualTo(String value) {
            addCriterion("counteroffer_id >=", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdLessThan(String value) {
            addCriterion("counteroffer_id <", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdLessThanOrEqualTo(String value) {
            addCriterion("counteroffer_id <=", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdLike(String value) {
            addCriterion("counteroffer_id like", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdNotLike(String value) {
            addCriterion("counteroffer_id not like", value, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdIn(List<String> values) {
            addCriterion("counteroffer_id in", values, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdNotIn(List<String> values) {
            addCriterion("counteroffer_id not in", values, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdBetween(String value1, String value2) {
            addCriterion("counteroffer_id between", value1, value2, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdNotBetween(String value1, String value2) {
            addCriterion("counteroffer_id not between", value1, value2, "counterofferId");
            return (Criteria) this;
        }

        public Criteria andTxAmoIsNull() {
            addCriterion("tx_amo is null");
            return (Criteria) this;
        }

        public Criteria andTxAmoIsNotNull() {
            addCriterion("tx_amo is not null");
            return (Criteria) this;
        }

        public Criteria andTxAmoEqualTo(String value) {
            addCriterion("tx_amo =", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoNotEqualTo(String value) {
            addCriterion("tx_amo <>", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoGreaterThan(String value) {
            addCriterion("tx_amo >", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoGreaterThanOrEqualTo(String value) {
            addCriterion("tx_amo >=", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoLessThan(String value) {
            addCriterion("tx_amo <", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoLessThanOrEqualTo(String value) {
            addCriterion("tx_amo <=", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoLike(String value) {
            addCriterion("tx_amo like", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoNotLike(String value) {
            addCriterion("tx_amo not like", value, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoIn(List<String> values) {
            addCriterion("tx_amo in", values, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoNotIn(List<String> values) {
            addCriterion("tx_amo not in", values, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoBetween(String value1, String value2) {
            addCriterion("tx_amo between", value1, value2, "txAmo");
            return (Criteria) this;
        }

        public Criteria andTxAmoNotBetween(String value1, String value2) {
            addCriterion("tx_amo not between", value1, value2, "txAmo");
            return (Criteria) this;
        }

        public Criteria andCtofPriIsNull() {
            addCriterion("ctof_pri is null");
            return (Criteria) this;
        }

        public Criteria andCtofPriIsNotNull() {
            addCriterion("ctof_pri is not null");
            return (Criteria) this;
        }

        public Criteria andCtofPriEqualTo(BigDecimal value) {
            addCriterion("ctof_pri =", value, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriNotEqualTo(BigDecimal value) {
            addCriterion("ctof_pri <>", value, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriGreaterThan(BigDecimal value) {
            addCriterion("ctof_pri >", value, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ctof_pri >=", value, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriLessThan(BigDecimal value) {
            addCriterion("ctof_pri <", value, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ctof_pri <=", value, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriIn(List<BigDecimal> values) {
            addCriterion("ctof_pri in", values, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriNotIn(List<BigDecimal> values) {
            addCriterion("ctof_pri not in", values, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ctof_pri between", value1, value2, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andCtofPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ctof_pri not between", value1, value2, "ctofPri");
            return (Criteria) this;
        }

        public Criteria andTotPriIsNull() {
            addCriterion("tot_pri is null");
            return (Criteria) this;
        }

        public Criteria andTotPriIsNotNull() {
            addCriterion("tot_pri is not null");
            return (Criteria) this;
        }

        public Criteria andTotPriEqualTo(BigDecimal value) {
            addCriterion("tot_pri =", value, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriNotEqualTo(BigDecimal value) {
            addCriterion("tot_pri <>", value, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriGreaterThan(BigDecimal value) {
            addCriterion("tot_pri >", value, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_pri >=", value, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriLessThan(BigDecimal value) {
            addCriterion("tot_pri <", value, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tot_pri <=", value, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriIn(List<BigDecimal> values) {
            addCriterion("tot_pri in", values, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriNotIn(List<BigDecimal> values) {
            addCriterion("tot_pri not in", values, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_pri between", value1, value2, "totPri");
            return (Criteria) this;
        }

        public Criteria andTotPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tot_pri not between", value1, value2, "totPri");
            return (Criteria) this;
        }

        public Criteria andSoStatusIsNull() {
            addCriterion("so_status is null");
            return (Criteria) this;
        }

        public Criteria andSoStatusIsNotNull() {
            addCriterion("so_status is not null");
            return (Criteria) this;
        }

        public Criteria andSoStatusEqualTo(String value) {
            addCriterion("so_status =", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusNotEqualTo(String value) {
            addCriterion("so_status <>", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusGreaterThan(String value) {
            addCriterion("so_status >", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("so_status >=", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusLessThan(String value) {
            addCriterion("so_status <", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusLessThanOrEqualTo(String value) {
            addCriterion("so_status <=", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusLike(String value) {
            addCriterion("so_status like", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusNotLike(String value) {
            addCriterion("so_status not like", value, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusIn(List<String> values) {
            addCriterion("so_status in", values, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusNotIn(List<String> values) {
            addCriterion("so_status not in", values, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusBetween(String value1, String value2) {
            addCriterion("so_status between", value1, value2, "soStatus");
            return (Criteria) this;
        }

        public Criteria andSoStatusNotBetween(String value1, String value2) {
            addCriterion("so_status not between", value1, value2, "soStatus");
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

        public Criteria andOfferAvgWeightIsNull() {
            addCriterion("offer_avg_weight is null");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightIsNotNull() {
            addCriterion("offer_avg_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight =", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightNotEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight <>", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightGreaterThan(BigDecimal value) {
            addCriterion("offer_avg_weight >", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight >=", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightLessThan(BigDecimal value) {
            addCriterion("offer_avg_weight <", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight <=", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightIn(List<BigDecimal> values) {
            addCriterion("offer_avg_weight in", values, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightNotIn(List<BigDecimal> values) {
            addCriterion("offer_avg_weight not in", values, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_avg_weight between", value1, value2, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_avg_weight not between", value1, value2, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriIsNull() {
            addCriterion("catchweight_pri is null");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriIsNotNull() {
            addCriterion("catchweight_pri is not null");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri =", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriNotEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri <>", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriGreaterThan(BigDecimal value) {
            addCriterion("catchweight_pri >", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri >=", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriLessThan(BigDecimal value) {
            addCriterion("catchweight_pri <", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri <=", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriIn(List<BigDecimal> values) {
            addCriterion("catchweight_pri in", values, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriNotIn(List<BigDecimal> values) {
            addCriterion("catchweight_pri not in", values, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("catchweight_pri between", value1, value2, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("catchweight_pri not between", value1, value2, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriIsNull() {
            addCriterion("offer_pri is null");
            return (Criteria) this;
        }

        public Criteria andOfferPriIsNotNull() {
            addCriterion("offer_pri is not null");
            return (Criteria) this;
        }

        public Criteria andOfferPriEqualTo(BigDecimal value) {
            addCriterion("offer_pri =", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriNotEqualTo(BigDecimal value) {
            addCriterion("offer_pri <>", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriGreaterThan(BigDecimal value) {
            addCriterion("offer_pri >", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_pri >=", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriLessThan(BigDecimal value) {
            addCriterion("offer_pri <", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_pri <=", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriIn(List<BigDecimal> values) {
            addCriterion("offer_pri in", values, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriNotIn(List<BigDecimal> values) {
            addCriterion("offer_pri not in", values, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_pri between", value1, value2, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_pri not between", value1, value2, "offerPri");
            return (Criteria) this;
        }

        public Criteria andStandardCatchIsNull() {
            addCriterion("standard_catch is null");
            return (Criteria) this;
        }

        public Criteria andStandardCatchIsNotNull() {
            addCriterion("standard_catch is not null");
            return (Criteria) this;
        }

        public Criteria andStandardCatchEqualTo(String value) {
            addCriterion("standard_catch =", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotEqualTo(String value) {
            addCriterion("standard_catch <>", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchGreaterThan(String value) {
            addCriterion("standard_catch >", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchGreaterThanOrEqualTo(String value) {
            addCriterion("standard_catch >=", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchLessThan(String value) {
            addCriterion("standard_catch <", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchLessThanOrEqualTo(String value) {
            addCriterion("standard_catch <=", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchLike(String value) {
            addCriterion("standard_catch like", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotLike(String value) {
            addCriterion("standard_catch not like", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchIn(List<String> values) {
            addCriterion("standard_catch in", values, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotIn(List<String> values) {
            addCriterion("standard_catch not in", values, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchBetween(String value1, String value2) {
            addCriterion("standard_catch between", value1, value2, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotBetween(String value1, String value2) {
            addCriterion("standard_catch not between", value1, value2, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andSlaOrderIdLikeInsensitive(String value) {
            addCriterion("upper(sla_order_id) like", value.toUpperCase(), "slaOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLikeInsensitive(String value) {
            addCriterion("upper(order_id) like", value.toUpperCase(), "orderId");
            return (Criteria) this;
        }

        public Criteria andSlaOrderTypeLikeInsensitive(String value) {
            addCriterion("upper(sla_order_type) like", value.toUpperCase(), "slaOrderType");
            return (Criteria) this;
        }

        public Criteria andMdIdLikeInsensitive(String value) {
            addCriterion("upper(md_id) like", value.toUpperCase(), "mdId");
            return (Criteria) this;
        }

        public Criteria andMdNameLikeInsensitive(String value) {
            addCriterion("upper(md_name) like", value.toUpperCase(), "mdName");
            return (Criteria) this;
        }

        public Criteria andBussNameLikeInsensitive(String value) {
            addCriterion("upper(buss_name) like", value.toUpperCase(), "bussName");
            return (Criteria) this;
        }

        public Criteria andBussIdLikeInsensitive(String value) {
            addCriterion("upper(buss_id) like", value.toUpperCase(), "bussId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLikeInsensitive(String value) {
            addCriterion("upper(category_id) like", value.toUpperCase(), "categoryId");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdLikeInsensitive(String value) {
            addCriterion("upper(counteroffer_id) like", value.toUpperCase(), "counterofferId");
            return (Criteria) this;
        }

        public Criteria andTxAmoLikeInsensitive(String value) {
            addCriterion("upper(tx_amo) like", value.toUpperCase(), "txAmo");
            return (Criteria) this;
        }

        public Criteria andSoStatusLikeInsensitive(String value) {
            addCriterion("upper(so_status) like", value.toUpperCase(), "soStatus");
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

        public Criteria andCreateUserLikeInsensitive(String value) {
            addCriterion("upper(create_user) like", value.toUpperCase(), "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLikeInsensitive(String value) {
            addCriterion("upper(update_user) like", value.toUpperCase(), "updateUser");
            return (Criteria) this;
        }

        public Criteria andStandardCatchLikeInsensitive(String value) {
            addCriterion("upper(standard_catch) like", value.toUpperCase(), "standardCatch");
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
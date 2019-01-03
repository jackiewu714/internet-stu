package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CounterOfferCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 回盘ID */
    private String counterofferId;

    private String counterofferIdRange;

    /** 市场总监UUID */
    private String mdId;

    private String mdIdRange;

    /** 市场总监名称 */
    private String mdName;

    private String mdNameRange;

    /** 交易日期 */
    private String dealTime;

    private String dealTimeRange;

    /** 品类ID */
    private String categoryId;

    private String categoryIdRange;

    /** 交易状态：10渠道商发起交易，15销售人员报价，20市场总监回价，21渠道商回价，22渠道商确定订单，30渠道商取消交易，60市场总监定盘 */
    private String txStatus;

    private String txStatusRange;

    /** 交易时效 */
    private String timingSta;

    private String timingStaRange;

    /** 交易数量 */
    private String txAmo;

    private String txAmoRange;

    /** 客户价 */
    private BigDecimal pcasPri;

    /** 报价时间 */
    private Date pcasTime;

    private Date pcasTimeRange1;

    private Date pcasTimeRange2;

    /** 交易价 */
    private BigDecimal ctofPri;

    /** 回盘时间 */
    private Date ctofTime;

    private Date ctofTimeRange1;

    private Date ctofTimeRange2;

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

    /** 销售员报价 */
    private BigDecimal salesOffer;

    /** 销售员报价备注 */
    private String salesRemark;

    private String salesRemarkRange;

    /** 销售人员ID */
    private String salesId;

    private String salesIdRange;

    /** 销售员姓名 */
    private String salesName;

    private String salesNameRange;

    /** 销售员报价时间 */
    private Date salesOfferTime;

    private Date salesOfferTimeRange1;

    private Date salesOfferTimeRange2;

    /** 销售总监报价备注 */
    private String offerRemark;

    private String offerRemarkRange;

    /** 审核人ID */
    private String auditorId;

    private String auditorIdRange;

    /** 审核人姓名 */
    private String auditorName;

    private String auditorNameRange;

    /** 审核原因 */
    private String auditorRemark;

    private String auditorRemarkRange;

    /** 审核时间 */
    private Date auditTime;

    private Date auditTimeRange1;

    private Date auditTimeRange2;

    /** 审核状态00初始值，10定盘，20审核通过，30审核失败 */
    private String auditorStatus;

    private String auditorStatusRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public CounterOfferCriteria() {
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

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime == null ? null : dealTime.trim();
    }

    public String getDealTimeRange() {
        return dealTimeRange;
    }

    public void setDealTimeRange(String dealTimeRange) {
        this.dealTimeRange = dealTimeRange == null ? null : dealTimeRange.trim();
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

    public String getTxStatus() {
        return txStatus;
    }

    public void setTxStatus(String txStatus) {
        this.txStatus = txStatus == null ? null : txStatus.trim();
    }

    public String getTxStatusRange() {
        return txStatusRange;
    }

    public void setTxStatusRange(String txStatusRange) {
        this.txStatusRange = txStatusRange == null ? null : txStatusRange.trim();
    }

    public String getTimingSta() {
        return timingSta;
    }

    public void setTimingSta(String timingSta) {
        this.timingSta = timingSta == null ? null : timingSta.trim();
    }

    public String getTimingStaRange() {
        return timingStaRange;
    }

    public void setTimingStaRange(String timingStaRange) {
        this.timingStaRange = timingStaRange == null ? null : timingStaRange.trim();
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

    public Date getPcasTimeRange1() {
        return pcasTimeRange1;
    }

    public void setPcasTimeRange1(Date pcasTimeRange1) {
        this.pcasTimeRange1 = pcasTimeRange1;
    }

    public Date getPcasTimeRange2() {
        return pcasTimeRange2;
    }

    public void setPcasTimeRange2(Date pcasTimeRange2) {
        this.pcasTimeRange2 = pcasTimeRange2;
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

    public Date getCtofTimeRange1() {
        return ctofTimeRange1;
    }

    public void setCtofTimeRange1(Date ctofTimeRange1) {
        this.ctofTimeRange1 = ctofTimeRange1;
    }

    public Date getCtofTimeRange2() {
        return ctofTimeRange2;
    }

    public void setCtofTimeRange2(Date ctofTimeRange2) {
        this.ctofTimeRange2 = ctofTimeRange2;
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

    public String getSalesRemarkRange() {
        return salesRemarkRange;
    }

    public void setSalesRemarkRange(String salesRemarkRange) {
        this.salesRemarkRange = salesRemarkRange == null ? null : salesRemarkRange.trim();
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId == null ? null : salesId.trim();
    }

    public String getSalesIdRange() {
        return salesIdRange;
    }

    public void setSalesIdRange(String salesIdRange) {
        this.salesIdRange = salesIdRange == null ? null : salesIdRange.trim();
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName == null ? null : salesName.trim();
    }

    public String getSalesNameRange() {
        return salesNameRange;
    }

    public void setSalesNameRange(String salesNameRange) {
        this.salesNameRange = salesNameRange == null ? null : salesNameRange.trim();
    }

    public Date getSalesOfferTime() {
        return salesOfferTime;
    }

    public void setSalesOfferTime(Date salesOfferTime) {
        this.salesOfferTime = salesOfferTime;
    }

    public Date getSalesOfferTimeRange1() {
        return salesOfferTimeRange1;
    }

    public void setSalesOfferTimeRange1(Date salesOfferTimeRange1) {
        this.salesOfferTimeRange1 = salesOfferTimeRange1;
    }

    public Date getSalesOfferTimeRange2() {
        return salesOfferTimeRange2;
    }

    public void setSalesOfferTimeRange2(Date salesOfferTimeRange2) {
        this.salesOfferTimeRange2 = salesOfferTimeRange2;
    }

    public String getOfferRemark() {
        return offerRemark;
    }

    public void setOfferRemark(String offerRemark) {
        this.offerRemark = offerRemark == null ? null : offerRemark.trim();
    }

    public String getOfferRemarkRange() {
        return offerRemarkRange;
    }

    public void setOfferRemarkRange(String offerRemarkRange) {
        this.offerRemarkRange = offerRemarkRange == null ? null : offerRemarkRange.trim();
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    public String getAuditorIdRange() {
        return auditorIdRange;
    }

    public void setAuditorIdRange(String auditorIdRange) {
        this.auditorIdRange = auditorIdRange == null ? null : auditorIdRange.trim();
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public String getAuditorNameRange() {
        return auditorNameRange;
    }

    public void setAuditorNameRange(String auditorNameRange) {
        this.auditorNameRange = auditorNameRange == null ? null : auditorNameRange.trim();
    }

    public String getAuditorRemark() {
        return auditorRemark;
    }

    public void setAuditorRemark(String auditorRemark) {
        this.auditorRemark = auditorRemark == null ? null : auditorRemark.trim();
    }

    public String getAuditorRemarkRange() {
        return auditorRemarkRange;
    }

    public void setAuditorRemarkRange(String auditorRemarkRange) {
        this.auditorRemarkRange = auditorRemarkRange == null ? null : auditorRemarkRange.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getAuditTimeRange1() {
        return auditTimeRange1;
    }

    public void setAuditTimeRange1(Date auditTimeRange1) {
        this.auditTimeRange1 = auditTimeRange1;
    }

    public Date getAuditTimeRange2() {
        return auditTimeRange2;
    }

    public void setAuditTimeRange2(Date auditTimeRange2) {
        this.auditTimeRange2 = auditTimeRange2;
    }

    public String getAuditorStatus() {
        return auditorStatus;
    }

    public void setAuditorStatus(String auditorStatus) {
        this.auditorStatus = auditorStatus == null ? null : auditorStatus.trim();
    }

    public String getAuditorStatusRange() {
        return auditorStatusRange;
    }

    public void setAuditorStatusRange(String auditorStatusRange) {
        this.auditorStatusRange = auditorStatusRange == null ? null : auditorStatusRange.trim();
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

        public Criteria andDealTimeIsNull() {
            addCriterion("deal_time is null");
            return (Criteria) this;
        }

        public Criteria andDealTimeIsNotNull() {
            addCriterion("deal_time is not null");
            return (Criteria) this;
        }

        public Criteria andDealTimeEqualTo(String value) {
            addCriterion("deal_time =", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotEqualTo(String value) {
            addCriterion("deal_time <>", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThan(String value) {
            addCriterion("deal_time >", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeGreaterThanOrEqualTo(String value) {
            addCriterion("deal_time >=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThan(String value) {
            addCriterion("deal_time <", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLessThanOrEqualTo(String value) {
            addCriterion("deal_time <=", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeLike(String value) {
            addCriterion("deal_time like", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotLike(String value) {
            addCriterion("deal_time not like", value, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeIn(List<String> values) {
            addCriterion("deal_time in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotIn(List<String> values) {
            addCriterion("deal_time not in", values, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeBetween(String value1, String value2) {
            addCriterion("deal_time between", value1, value2, "dealTime");
            return (Criteria) this;
        }

        public Criteria andDealTimeNotBetween(String value1, String value2) {
            addCriterion("deal_time not between", value1, value2, "dealTime");
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

        public Criteria andTxStatusIsNull() {
            addCriterion("tx_status is null");
            return (Criteria) this;
        }

        public Criteria andTxStatusIsNotNull() {
            addCriterion("tx_status is not null");
            return (Criteria) this;
        }

        public Criteria andTxStatusEqualTo(String value) {
            addCriterion("tx_status =", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotEqualTo(String value) {
            addCriterion("tx_status <>", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusGreaterThan(String value) {
            addCriterion("tx_status >", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusGreaterThanOrEqualTo(String value) {
            addCriterion("tx_status >=", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusLessThan(String value) {
            addCriterion("tx_status <", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusLessThanOrEqualTo(String value) {
            addCriterion("tx_status <=", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusLike(String value) {
            addCriterion("tx_status like", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotLike(String value) {
            addCriterion("tx_status not like", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusIn(List<String> values) {
            addCriterion("tx_status in", values, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotIn(List<String> values) {
            addCriterion("tx_status not in", values, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusBetween(String value1, String value2) {
            addCriterion("tx_status between", value1, value2, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotBetween(String value1, String value2) {
            addCriterion("tx_status not between", value1, value2, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTimingStaIsNull() {
            addCriterion("timing_sta is null");
            return (Criteria) this;
        }

        public Criteria andTimingStaIsNotNull() {
            addCriterion("timing_sta is not null");
            return (Criteria) this;
        }

        public Criteria andTimingStaEqualTo(String value) {
            addCriterion("timing_sta =", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaNotEqualTo(String value) {
            addCriterion("timing_sta <>", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaGreaterThan(String value) {
            addCriterion("timing_sta >", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaGreaterThanOrEqualTo(String value) {
            addCriterion("timing_sta >=", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaLessThan(String value) {
            addCriterion("timing_sta <", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaLessThanOrEqualTo(String value) {
            addCriterion("timing_sta <=", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaLike(String value) {
            addCriterion("timing_sta like", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaNotLike(String value) {
            addCriterion("timing_sta not like", value, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaIn(List<String> values) {
            addCriterion("timing_sta in", values, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaNotIn(List<String> values) {
            addCriterion("timing_sta not in", values, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaBetween(String value1, String value2) {
            addCriterion("timing_sta between", value1, value2, "timingSta");
            return (Criteria) this;
        }

        public Criteria andTimingStaNotBetween(String value1, String value2) {
            addCriterion("timing_sta not between", value1, value2, "timingSta");
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

        public Criteria andPcasPriIsNull() {
            addCriterion("pcas_pri is null");
            return (Criteria) this;
        }

        public Criteria andPcasPriIsNotNull() {
            addCriterion("pcas_pri is not null");
            return (Criteria) this;
        }

        public Criteria andPcasPriEqualTo(BigDecimal value) {
            addCriterion("pcas_pri =", value, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriNotEqualTo(BigDecimal value) {
            addCriterion("pcas_pri <>", value, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriGreaterThan(BigDecimal value) {
            addCriterion("pcas_pri >", value, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pcas_pri >=", value, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriLessThan(BigDecimal value) {
            addCriterion("pcas_pri <", value, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pcas_pri <=", value, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriIn(List<BigDecimal> values) {
            addCriterion("pcas_pri in", values, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriNotIn(List<BigDecimal> values) {
            addCriterion("pcas_pri not in", values, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pcas_pri between", value1, value2, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pcas_pri not between", value1, value2, "pcasPri");
            return (Criteria) this;
        }

        public Criteria andPcasTimeIsNull() {
            addCriterion("pcas_time is null");
            return (Criteria) this;
        }

        public Criteria andPcasTimeIsNotNull() {
            addCriterion("pcas_time is not null");
            return (Criteria) this;
        }

        public Criteria andPcasTimeEqualTo(Date value) {
            addCriterion("pcas_time =", value, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeNotEqualTo(Date value) {
            addCriterion("pcas_time <>", value, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeGreaterThan(Date value) {
            addCriterion("pcas_time >", value, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pcas_time >=", value, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeLessThan(Date value) {
            addCriterion("pcas_time <", value, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeLessThanOrEqualTo(Date value) {
            addCriterion("pcas_time <=", value, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeIn(List<Date> values) {
            addCriterion("pcas_time in", values, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeNotIn(List<Date> values) {
            addCriterion("pcas_time not in", values, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeBetween(Date value1, Date value2) {
            addCriterion("pcas_time between", value1, value2, "pcasTime");
            return (Criteria) this;
        }

        public Criteria andPcasTimeNotBetween(Date value1, Date value2) {
            addCriterion("pcas_time not between", value1, value2, "pcasTime");
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

        public Criteria andCtofTimeIsNull() {
            addCriterion("ctof_time_ is null");
            return (Criteria) this;
        }

        public Criteria andCtofTimeIsNotNull() {
            addCriterion("ctof_time_ is not null");
            return (Criteria) this;
        }

        public Criteria andCtofTimeEqualTo(Date value) {
            addCriterion("ctof_time_ =", value, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeNotEqualTo(Date value) {
            addCriterion("ctof_time_ <>", value, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeGreaterThan(Date value) {
            addCriterion("ctof_time_ >", value, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctof_time_ >=", value, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeLessThan(Date value) {
            addCriterion("ctof_time_ <", value, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeLessThanOrEqualTo(Date value) {
            addCriterion("ctof_time_ <=", value, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeIn(List<Date> values) {
            addCriterion("ctof_time_ in", values, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeNotIn(List<Date> values) {
            addCriterion("ctof_time_ not in", values, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeBetween(Date value1, Date value2) {
            addCriterion("ctof_time_ between", value1, value2, "ctofTime");
            return (Criteria) this;
        }

        public Criteria andCtofTimeNotBetween(Date value1, Date value2) {
            addCriterion("ctof_time_ not between", value1, value2, "ctofTime");
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

        public Criteria andSalesOfferIsNull() {
            addCriterion("sales_offer is null");
            return (Criteria) this;
        }

        public Criteria andSalesOfferIsNotNull() {
            addCriterion("sales_offer is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOfferEqualTo(BigDecimal value) {
            addCriterion("sales_offer =", value, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferNotEqualTo(BigDecimal value) {
            addCriterion("sales_offer <>", value, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferGreaterThan(BigDecimal value) {
            addCriterion("sales_offer >", value, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sales_offer >=", value, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferLessThan(BigDecimal value) {
            addCriterion("sales_offer <", value, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sales_offer <=", value, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferIn(List<BigDecimal> values) {
            addCriterion("sales_offer in", values, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferNotIn(List<BigDecimal> values) {
            addCriterion("sales_offer not in", values, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sales_offer between", value1, value2, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesOfferNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sales_offer not between", value1, value2, "salesOffer");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkIsNull() {
            addCriterion("sales_remark is null");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkIsNotNull() {
            addCriterion("sales_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkEqualTo(String value) {
            addCriterion("sales_remark =", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkNotEqualTo(String value) {
            addCriterion("sales_remark <>", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkGreaterThan(String value) {
            addCriterion("sales_remark >", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sales_remark >=", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkLessThan(String value) {
            addCriterion("sales_remark <", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkLessThanOrEqualTo(String value) {
            addCriterion("sales_remark <=", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkLike(String value) {
            addCriterion("sales_remark like", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkNotLike(String value) {
            addCriterion("sales_remark not like", value, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkIn(List<String> values) {
            addCriterion("sales_remark in", values, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkNotIn(List<String> values) {
            addCriterion("sales_remark not in", values, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkBetween(String value1, String value2) {
            addCriterion("sales_remark between", value1, value2, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkNotBetween(String value1, String value2) {
            addCriterion("sales_remark not between", value1, value2, "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNull() {
            addCriterion("sales_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesIdIsNotNull() {
            addCriterion("sales_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesIdEqualTo(String value) {
            addCriterion("sales_id =", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotEqualTo(String value) {
            addCriterion("sales_id <>", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThan(String value) {
            addCriterion("sales_id >", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdGreaterThanOrEqualTo(String value) {
            addCriterion("sales_id >=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThan(String value) {
            addCriterion("sales_id <", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLessThanOrEqualTo(String value) {
            addCriterion("sales_id <=", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdLike(String value) {
            addCriterion("sales_id like", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotLike(String value) {
            addCriterion("sales_id not like", value, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdIn(List<String> values) {
            addCriterion("sales_id in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotIn(List<String> values) {
            addCriterion("sales_id not in", values, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdBetween(String value1, String value2) {
            addCriterion("sales_id between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesIdNotBetween(String value1, String value2) {
            addCriterion("sales_id not between", value1, value2, "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesNameIsNull() {
            addCriterion("sales_name is null");
            return (Criteria) this;
        }

        public Criteria andSalesNameIsNotNull() {
            addCriterion("sales_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNameEqualTo(String value) {
            addCriterion("sales_name =", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotEqualTo(String value) {
            addCriterion("sales_name <>", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThan(String value) {
            addCriterion("sales_name >", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThanOrEqualTo(String value) {
            addCriterion("sales_name >=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThan(String value) {
            addCriterion("sales_name <", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThanOrEqualTo(String value) {
            addCriterion("sales_name <=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLike(String value) {
            addCriterion("sales_name like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotLike(String value) {
            addCriterion("sales_name not like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameIn(List<String> values) {
            addCriterion("sales_name in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotIn(List<String> values) {
            addCriterion("sales_name not in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameBetween(String value1, String value2) {
            addCriterion("sales_name between", value1, value2, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotBetween(String value1, String value2) {
            addCriterion("sales_name not between", value1, value2, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeIsNull() {
            addCriterion("sales_offer_time is null");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeIsNotNull() {
            addCriterion("sales_offer_time is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeEqualTo(Date value) {
            addCriterion("sales_offer_time =", value, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeNotEqualTo(Date value) {
            addCriterion("sales_offer_time <>", value, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeGreaterThan(Date value) {
            addCriterion("sales_offer_time >", value, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sales_offer_time >=", value, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeLessThan(Date value) {
            addCriterion("sales_offer_time <", value, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeLessThanOrEqualTo(Date value) {
            addCriterion("sales_offer_time <=", value, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeIn(List<Date> values) {
            addCriterion("sales_offer_time in", values, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeNotIn(List<Date> values) {
            addCriterion("sales_offer_time not in", values, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeBetween(Date value1, Date value2) {
            addCriterion("sales_offer_time between", value1, value2, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andSalesOfferTimeNotBetween(Date value1, Date value2) {
            addCriterion("sales_offer_time not between", value1, value2, "salesOfferTime");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkIsNull() {
            addCriterion("offer_remark is null");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkIsNotNull() {
            addCriterion("offer_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkEqualTo(String value) {
            addCriterion("offer_remark =", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkNotEqualTo(String value) {
            addCriterion("offer_remark <>", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkGreaterThan(String value) {
            addCriterion("offer_remark >", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("offer_remark >=", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkLessThan(String value) {
            addCriterion("offer_remark <", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkLessThanOrEqualTo(String value) {
            addCriterion("offer_remark <=", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkLike(String value) {
            addCriterion("offer_remark like", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkNotLike(String value) {
            addCriterion("offer_remark not like", value, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkIn(List<String> values) {
            addCriterion("offer_remark in", values, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkNotIn(List<String> values) {
            addCriterion("offer_remark not in", values, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkBetween(String value1, String value2) {
            addCriterion("offer_remark between", value1, value2, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkNotBetween(String value1, String value2) {
            addCriterion("offer_remark not between", value1, value2, "offerRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNull() {
            addCriterion("auditor_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIsNotNull() {
            addCriterion("auditor_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorIdEqualTo(String value) {
            addCriterion("auditor_id =", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotEqualTo(String value) {
            addCriterion("auditor_id <>", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThan(String value) {
            addCriterion("auditor_id >", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_id >=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThan(String value) {
            addCriterion("auditor_id <", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLessThanOrEqualTo(String value) {
            addCriterion("auditor_id <=", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLike(String value) {
            addCriterion("auditor_id like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotLike(String value) {
            addCriterion("auditor_id not like", value, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdIn(List<String> values) {
            addCriterion("auditor_id in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotIn(List<String> values) {
            addCriterion("auditor_id not in", values, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdBetween(String value1, String value2) {
            addCriterion("auditor_id between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorIdNotBetween(String value1, String value2) {
            addCriterion("auditor_id not between", value1, value2, "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIsNull() {
            addCriterion("auditor_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIsNotNull() {
            addCriterion("auditor_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorNameEqualTo(String value) {
            addCriterion("auditor_name =", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotEqualTo(String value) {
            addCriterion("auditor_name <>", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameGreaterThan(String value) {
            addCriterion("auditor_name >", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_name >=", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLessThan(String value) {
            addCriterion("auditor_name <", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLessThanOrEqualTo(String value) {
            addCriterion("auditor_name <=", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLike(String value) {
            addCriterion("auditor_name like", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotLike(String value) {
            addCriterion("auditor_name not like", value, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameIn(List<String> values) {
            addCriterion("auditor_name in", values, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotIn(List<String> values) {
            addCriterion("auditor_name not in", values, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameBetween(String value1, String value2) {
            addCriterion("auditor_name between", value1, value2, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorNameNotBetween(String value1, String value2) {
            addCriterion("auditor_name not between", value1, value2, "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkIsNull() {
            addCriterion("auditor_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkIsNotNull() {
            addCriterion("auditor_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkEqualTo(String value) {
            addCriterion("auditor_remark =", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkNotEqualTo(String value) {
            addCriterion("auditor_remark <>", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkGreaterThan(String value) {
            addCriterion("auditor_remark >", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_remark >=", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkLessThan(String value) {
            addCriterion("auditor_remark <", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkLessThanOrEqualTo(String value) {
            addCriterion("auditor_remark <=", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkLike(String value) {
            addCriterion("auditor_remark like", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkNotLike(String value) {
            addCriterion("auditor_remark not like", value, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkIn(List<String> values) {
            addCriterion("auditor_remark in", values, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkNotIn(List<String> values) {
            addCriterion("auditor_remark not in", values, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkBetween(String value1, String value2) {
            addCriterion("auditor_remark between", value1, value2, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkNotBetween(String value1, String value2) {
            addCriterion("auditor_remark not between", value1, value2, "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusIsNull() {
            addCriterion("auditor_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusIsNotNull() {
            addCriterion("auditor_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusEqualTo(String value) {
            addCriterion("auditor_status =", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusNotEqualTo(String value) {
            addCriterion("auditor_status <>", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusGreaterThan(String value) {
            addCriterion("auditor_status >", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_status >=", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusLessThan(String value) {
            addCriterion("auditor_status <", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusLessThanOrEqualTo(String value) {
            addCriterion("auditor_status <=", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusLike(String value) {
            addCriterion("auditor_status like", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusNotLike(String value) {
            addCriterion("auditor_status not like", value, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusIn(List<String> values) {
            addCriterion("auditor_status in", values, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusNotIn(List<String> values) {
            addCriterion("auditor_status not in", values, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusBetween(String value1, String value2) {
            addCriterion("auditor_status between", value1, value2, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusNotBetween(String value1, String value2) {
            addCriterion("auditor_status not between", value1, value2, "auditorStatus");
            return (Criteria) this;
        }

        public Criteria andCounterofferIdLikeInsensitive(String value) {
            addCriterion("upper(counteroffer_id) like", value.toUpperCase(), "counterofferId");
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

        public Criteria andDealTimeLikeInsensitive(String value) {
            addCriterion("upper(deal_time) like", value.toUpperCase(), "dealTime");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLikeInsensitive(String value) {
            addCriterion("upper(category_id) like", value.toUpperCase(), "categoryId");
            return (Criteria) this;
        }

        public Criteria andTxStatusLikeInsensitive(String value) {
            addCriterion("upper(tx_status) like", value.toUpperCase(), "txStatus");
            return (Criteria) this;
        }

        public Criteria andTimingStaLikeInsensitive(String value) {
            addCriterion("upper(timing_sta) like", value.toUpperCase(), "timingSta");
            return (Criteria) this;
        }

        public Criteria andTxAmoLikeInsensitive(String value) {
            addCriterion("upper(tx_amo) like", value.toUpperCase(), "txAmo");
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

        public Criteria andSalesRemarkLikeInsensitive(String value) {
            addCriterion("upper(sales_remark) like", value.toUpperCase(), "salesRemark");
            return (Criteria) this;
        }

        public Criteria andSalesIdLikeInsensitive(String value) {
            addCriterion("upper(sales_id) like", value.toUpperCase(), "salesId");
            return (Criteria) this;
        }

        public Criteria andSalesNameLikeInsensitive(String value) {
            addCriterion("upper(sales_name) like", value.toUpperCase(), "salesName");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkLikeInsensitive(String value) {
            addCriterion("upper(offer_remark) like", value.toUpperCase(), "offerRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorIdLikeInsensitive(String value) {
            addCriterion("upper(auditor_id) like", value.toUpperCase(), "auditorId");
            return (Criteria) this;
        }

        public Criteria andAuditorNameLikeInsensitive(String value) {
            addCriterion("upper(auditor_name) like", value.toUpperCase(), "auditorName");
            return (Criteria) this;
        }

        public Criteria andAuditorRemarkLikeInsensitive(String value) {
            addCriterion("upper(auditor_remark) like", value.toUpperCase(), "auditorRemark");
            return (Criteria) this;
        }

        public Criteria andAuditorStatusLikeInsensitive(String value) {
            addCriterion("upper(auditor_status) like", value.toUpperCase(), "auditorStatus");
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
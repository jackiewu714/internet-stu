package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CounterOfferRecordCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 询盘ID */
    private String slaCounterofferRecordId;

    private String slaCounterofferRecordIdRange;

    /** 回盘ID */
    private String counterofferId;

    private String counterofferIdRange;

    /** 交易数量 */
    private String txAmo;

    private String txAmoRange;

    /** 客户价 */
    private BigDecimal pcasPri;

    /** 报价时间 */
    private Date pcasTime;

    private Date pcasTimeRange1;

    private Date pcasTimeRange2;

    /** 回盘价 */
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

    /** 销售员报价 */
    private BigDecimal salesOffer;

    /** 销售员报价备注 */
    private String salesRemark;

    private String salesRemarkRange;

    /** 销售员报价时间 */
    private Date salesOfferTime;

    private Date salesOfferTimeRange1;

    private Date salesOfferTimeRange2;

    /** 销售总监报价备注 */
    private String offerRemark;

    private String offerRemarkRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public CounterOfferRecordCriteria() {
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

    public String getSlaCounterofferRecordId() {
        return slaCounterofferRecordId;
    }

    public void setSlaCounterofferRecordId(String slaCounterofferRecordId) {
        this.slaCounterofferRecordId = slaCounterofferRecordId == null ? null : slaCounterofferRecordId.trim();
    }

    public String getSlaCounterofferRecordIdRange() {
        return slaCounterofferRecordIdRange;
    }

    public void setSlaCounterofferRecordIdRange(String slaCounterofferRecordIdRange) {
        this.slaCounterofferRecordIdRange = slaCounterofferRecordIdRange == null ? null : slaCounterofferRecordIdRange.trim();
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

        public Criteria andSlaCounterofferRecordIdIsNull() {
            addCriterion("sla_counteroffer_record_id is null");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdIsNotNull() {
            addCriterion("sla_counteroffer_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdEqualTo(String value) {
            addCriterion("sla_counteroffer_record_id =", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdNotEqualTo(String value) {
            addCriterion("sla_counteroffer_record_id <>", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdGreaterThan(String value) {
            addCriterion("sla_counteroffer_record_id >", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("sla_counteroffer_record_id >=", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdLessThan(String value) {
            addCriterion("sla_counteroffer_record_id <", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdLessThanOrEqualTo(String value) {
            addCriterion("sla_counteroffer_record_id <=", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdLike(String value) {
            addCriterion("sla_counteroffer_record_id like", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdNotLike(String value) {
            addCriterion("sla_counteroffer_record_id not like", value, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdIn(List<String> values) {
            addCriterion("sla_counteroffer_record_id in", values, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdNotIn(List<String> values) {
            addCriterion("sla_counteroffer_record_id not in", values, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdBetween(String value1, String value2) {
            addCriterion("sla_counteroffer_record_id between", value1, value2, "slaCounterofferRecordId");
            return (Criteria) this;
        }

        public Criteria andSlaCounterofferRecordIdNotBetween(String value1, String value2) {
            addCriterion("sla_counteroffer_record_id not between", value1, value2, "slaCounterofferRecordId");
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

        public Criteria andSlaCounterofferRecordIdLikeInsensitive(String value) {
            addCriterion("upper(sla_counteroffer_record_id) like", value.toUpperCase(), "slaCounterofferRecordId");
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

        public Criteria andCreateUserLikeInsensitive(String value) {
            addCriterion("upper(create_user) like", value.toUpperCase(), "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLikeInsensitive(String value) {
            addCriterion("upper(update_user) like", value.toUpperCase(), "updateUser");
            return (Criteria) this;
        }

        public Criteria andSalesRemarkLikeInsensitive(String value) {
            addCriterion("upper(sales_remark) like", value.toUpperCase(), "salesRemark");
            return (Criteria) this;
        }

        public Criteria andOfferRemarkLikeInsensitive(String value) {
            addCriterion("upper(offer_remark) like", value.toUpperCase(), "offerRemark");
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
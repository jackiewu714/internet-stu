package com.cw.stu.internet.tech.core.common.dao.domain.bms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestStateChangeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Long id;

    private String orderNo;

    private String orderNoRange;

    private String curState;

    private String curStateRange;

    private String targetState;

    private String targetStateRange;

    private String remark;

    private String remarkRange;

    private String modStaff;

    private String modStaffRange;

    private Date modTime;

    private Date modTimeRange1;

    private Date modTimeRange2;

    private String extraInfo;

    private String extraInfoRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    public TestStateChangeCriteria() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderNoRange() {
        return orderNoRange;
    }

    public void setOrderNoRange(String orderNoRange) {
        this.orderNoRange = orderNoRange == null ? null : orderNoRange.trim();
    }

    public String getCurState() {
        return curState;
    }

    public void setCurState(String curState) {
        this.curState = curState == null ? null : curState.trim();
    }

    public String getCurStateRange() {
        return curStateRange;
    }

    public void setCurStateRange(String curStateRange) {
        this.curStateRange = curStateRange == null ? null : curStateRange.trim();
    }

    public String getTargetState() {
        return targetState;
    }

    public void setTargetState(String targetState) {
        this.targetState = targetState == null ? null : targetState.trim();
    }

    public String getTargetStateRange() {
        return targetStateRange;
    }

    public void setTargetStateRange(String targetStateRange) {
        this.targetStateRange = targetStateRange == null ? null : targetStateRange.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemarkRange() {
        return remarkRange;
    }

    public void setRemarkRange(String remarkRange) {
        this.remarkRange = remarkRange == null ? null : remarkRange.trim();
    }

    public String getModStaff() {
        return modStaff;
    }

    public void setModStaff(String modStaff) {
        this.modStaff = modStaff == null ? null : modStaff.trim();
    }

    public String getModStaffRange() {
        return modStaffRange;
    }

    public void setModStaffRange(String modStaffRange) {
        this.modStaffRange = modStaffRange == null ? null : modStaffRange.trim();
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public Date getModTimeRange1() {
        return modTimeRange1;
    }

    public void setModTimeRange1(Date modTimeRange1) {
        this.modTimeRange1 = modTimeRange1;
    }

    public Date getModTimeRange2() {
        return modTimeRange2;
    }

    public void setModTimeRange2(Date modTimeRange2) {
        this.modTimeRange2 = modTimeRange2;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo == null ? null : extraInfo.trim();
    }

    public String getExtraInfoRange() {
        return extraInfoRange;
    }

    public void setExtraInfoRange(String extraInfoRange) {
        this.extraInfoRange = extraInfoRange == null ? null : extraInfoRange.trim();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andCurStateIsNull() {
            addCriterion("CUR_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCurStateIsNotNull() {
            addCriterion("CUR_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCurStateEqualTo(String value) {
            addCriterion("CUR_STATE =", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateNotEqualTo(String value) {
            addCriterion("CUR_STATE <>", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateGreaterThan(String value) {
            addCriterion("CUR_STATE >", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_STATE >=", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateLessThan(String value) {
            addCriterion("CUR_STATE <", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateLessThanOrEqualTo(String value) {
            addCriterion("CUR_STATE <=", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateLike(String value) {
            addCriterion("CUR_STATE like", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateNotLike(String value) {
            addCriterion("CUR_STATE not like", value, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateIn(List<String> values) {
            addCriterion("CUR_STATE in", values, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateNotIn(List<String> values) {
            addCriterion("CUR_STATE not in", values, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateBetween(String value1, String value2) {
            addCriterion("CUR_STATE between", value1, value2, "curState");
            return (Criteria) this;
        }

        public Criteria andCurStateNotBetween(String value1, String value2) {
            addCriterion("CUR_STATE not between", value1, value2, "curState");
            return (Criteria) this;
        }

        public Criteria andTargetStateIsNull() {
            addCriterion("TARGET_STATE is null");
            return (Criteria) this;
        }

        public Criteria andTargetStateIsNotNull() {
            addCriterion("TARGET_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andTargetStateEqualTo(String value) {
            addCriterion("TARGET_STATE =", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateNotEqualTo(String value) {
            addCriterion("TARGET_STATE <>", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateGreaterThan(String value) {
            addCriterion("TARGET_STATE >", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_STATE >=", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateLessThan(String value) {
            addCriterion("TARGET_STATE <", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateLessThanOrEqualTo(String value) {
            addCriterion("TARGET_STATE <=", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateLike(String value) {
            addCriterion("TARGET_STATE like", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateNotLike(String value) {
            addCriterion("TARGET_STATE not like", value, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateIn(List<String> values) {
            addCriterion("TARGET_STATE in", values, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateNotIn(List<String> values) {
            addCriterion("TARGET_STATE not in", values, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateBetween(String value1, String value2) {
            addCriterion("TARGET_STATE between", value1, value2, "targetState");
            return (Criteria) this;
        }

        public Criteria andTargetStateNotBetween(String value1, String value2) {
            addCriterion("TARGET_STATE not between", value1, value2, "targetState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andModStaffIsNull() {
            addCriterion("MOD_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andModStaffIsNotNull() {
            addCriterion("MOD_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andModStaffEqualTo(String value) {
            addCriterion("MOD_STAFF =", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffNotEqualTo(String value) {
            addCriterion("MOD_STAFF <>", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffGreaterThan(String value) {
            addCriterion("MOD_STAFF >", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_STAFF >=", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffLessThan(String value) {
            addCriterion("MOD_STAFF <", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffLessThanOrEqualTo(String value) {
            addCriterion("MOD_STAFF <=", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffLike(String value) {
            addCriterion("MOD_STAFF like", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffNotLike(String value) {
            addCriterion("MOD_STAFF not like", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffIn(List<String> values) {
            addCriterion("MOD_STAFF in", values, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffNotIn(List<String> values) {
            addCriterion("MOD_STAFF not in", values, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffBetween(String value1, String value2) {
            addCriterion("MOD_STAFF between", value1, value2, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffNotBetween(String value1, String value2) {
            addCriterion("MOD_STAFF not between", value1, value2, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNull() {
            addCriterion("MOD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModTimeIsNotNull() {
            addCriterion("MOD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModTimeEqualTo(Date value) {
            addCriterion("MOD_TIME =", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotEqualTo(Date value) {
            addCriterion("MOD_TIME <>", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThan(Date value) {
            addCriterion("MOD_TIME >", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME >=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThan(Date value) {
            addCriterion("MOD_TIME <", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeLessThanOrEqualTo(Date value) {
            addCriterion("MOD_TIME <=", value, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeIn(List<Date> values) {
            addCriterion("MOD_TIME in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotIn(List<Date> values) {
            addCriterion("MOD_TIME not in", values, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andModTimeNotBetween(Date value1, Date value2) {
            addCriterion("MOD_TIME not between", value1, value2, "modTime");
            return (Criteria) this;
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(ORDER_NO) like", value.toUpperCase(), "orderNo");
            return (Criteria) this;
        }

        public Criteria andCurStateLikeInsensitive(String value) {
            addCriterion("upper(CUR_STATE) like", value.toUpperCase(), "curState");
            return (Criteria) this;
        }

        public Criteria andTargetStateLikeInsensitive(String value) {
            addCriterion("upper(TARGET_STATE) like", value.toUpperCase(), "targetState");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andModStaffLikeInsensitive(String value) {
            addCriterion("upper(MOD_STAFF) like", value.toUpperCase(), "modStaff");
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
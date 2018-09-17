package com.cw.stu.internet.tech.common.dao.domain.sm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrantCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer id;

    private String factType;

    private String factTypeRange;

    private String factId;

    private String factIdRange;

    private String entType;

    private String entTypeRange;

    private String entId;

    private String entIdRange;

    private String status;

    private String statusRange;

    private Integer modStaff;

    private Date modDate;

    private Date modDateRange1;

    private Date modDateRange2;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    public GrantCriteria() {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFactType() {
        return factType;
    }

    public void setFactType(String factType) {
        this.factType = factType == null ? null : factType.trim();
    }

    public String getFactTypeRange() {
        return factTypeRange;
    }

    public void setFactTypeRange(String factTypeRange) {
        this.factTypeRange = factTypeRange == null ? null : factTypeRange.trim();
    }

    public String getFactId() {
        return factId;
    }

    public void setFactId(String factId) {
        this.factId = factId == null ? null : factId.trim();
    }

    public String getFactIdRange() {
        return factIdRange;
    }

    public void setFactIdRange(String factIdRange) {
        this.factIdRange = factIdRange == null ? null : factIdRange.trim();
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType == null ? null : entType.trim();
    }

    public String getEntTypeRange() {
        return entTypeRange;
    }

    public void setEntTypeRange(String entTypeRange) {
        this.entTypeRange = entTypeRange == null ? null : entTypeRange.trim();
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }

    public String getEntIdRange() {
        return entIdRange;
    }

    public void setEntIdRange(String entIdRange) {
        this.entIdRange = entIdRange == null ? null : entIdRange.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStatusRange() {
        return statusRange;
    }

    public void setStatusRange(String statusRange) {
        this.statusRange = statusRange == null ? null : statusRange.trim();
    }

    public Integer getModStaff() {
        return modStaff;
    }

    public void setModStaff(Integer modStaff) {
        this.modStaff = modStaff;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public Date getModDateRange1() {
        return modDateRange1;
    }

    public void setModDateRange1(Date modDateRange1) {
        this.modDateRange1 = modDateRange1;
    }

    public Date getModDateRange2() {
        return modDateRange2;
    }

    public void setModDateRange2(Date modDateRange2) {
        this.modDateRange2 = modDateRange2;
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFactTypeIsNull() {
            addCriterion("fact_type is null");
            return (Criteria) this;
        }

        public Criteria andFactTypeIsNotNull() {
            addCriterion("fact_type is not null");
            return (Criteria) this;
        }

        public Criteria andFactTypeEqualTo(String value) {
            addCriterion("fact_type =", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeNotEqualTo(String value) {
            addCriterion("fact_type <>", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeGreaterThan(String value) {
            addCriterion("fact_type >", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fact_type >=", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeLessThan(String value) {
            addCriterion("fact_type <", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeLessThanOrEqualTo(String value) {
            addCriterion("fact_type <=", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeLike(String value) {
            addCriterion("fact_type like", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeNotLike(String value) {
            addCriterion("fact_type not like", value, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeIn(List<String> values) {
            addCriterion("fact_type in", values, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeNotIn(List<String> values) {
            addCriterion("fact_type not in", values, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeBetween(String value1, String value2) {
            addCriterion("fact_type between", value1, value2, "factType");
            return (Criteria) this;
        }

        public Criteria andFactTypeNotBetween(String value1, String value2) {
            addCriterion("fact_type not between", value1, value2, "factType");
            return (Criteria) this;
        }

        public Criteria andFactIdIsNull() {
            addCriterion("fact_id is null");
            return (Criteria) this;
        }

        public Criteria andFactIdIsNotNull() {
            addCriterion("fact_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactIdEqualTo(String value) {
            addCriterion("fact_id =", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdNotEqualTo(String value) {
            addCriterion("fact_id <>", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdGreaterThan(String value) {
            addCriterion("fact_id >", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdGreaterThanOrEqualTo(String value) {
            addCriterion("fact_id >=", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdLessThan(String value) {
            addCriterion("fact_id <", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdLessThanOrEqualTo(String value) {
            addCriterion("fact_id <=", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdLike(String value) {
            addCriterion("fact_id like", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdNotLike(String value) {
            addCriterion("fact_id not like", value, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdIn(List<String> values) {
            addCriterion("fact_id in", values, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdNotIn(List<String> values) {
            addCriterion("fact_id not in", values, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdBetween(String value1, String value2) {
            addCriterion("fact_id between", value1, value2, "factId");
            return (Criteria) this;
        }

        public Criteria andFactIdNotBetween(String value1, String value2) {
            addCriterion("fact_id not between", value1, value2, "factId");
            return (Criteria) this;
        }

        public Criteria andEntTypeIsNull() {
            addCriterion("ent_type is null");
            return (Criteria) this;
        }

        public Criteria andEntTypeIsNotNull() {
            addCriterion("ent_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntTypeEqualTo(String value) {
            addCriterion("ent_type =", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeNotEqualTo(String value) {
            addCriterion("ent_type <>", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeGreaterThan(String value) {
            addCriterion("ent_type >", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ent_type >=", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeLessThan(String value) {
            addCriterion("ent_type <", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeLessThanOrEqualTo(String value) {
            addCriterion("ent_type <=", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeLike(String value) {
            addCriterion("ent_type like", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeNotLike(String value) {
            addCriterion("ent_type not like", value, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeIn(List<String> values) {
            addCriterion("ent_type in", values, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeNotIn(List<String> values) {
            addCriterion("ent_type not in", values, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeBetween(String value1, String value2) {
            addCriterion("ent_type between", value1, value2, "entType");
            return (Criteria) this;
        }

        public Criteria andEntTypeNotBetween(String value1, String value2) {
            addCriterion("ent_type not between", value1, value2, "entType");
            return (Criteria) this;
        }

        public Criteria andEntIdIsNull() {
            addCriterion("ent_id is null");
            return (Criteria) this;
        }

        public Criteria andEntIdIsNotNull() {
            addCriterion("ent_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntIdEqualTo(String value) {
            addCriterion("ent_id =", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotEqualTo(String value) {
            addCriterion("ent_id <>", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThan(String value) {
            addCriterion("ent_id >", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdGreaterThanOrEqualTo(String value) {
            addCriterion("ent_id >=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThan(String value) {
            addCriterion("ent_id <", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLessThanOrEqualTo(String value) {
            addCriterion("ent_id <=", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdLike(String value) {
            addCriterion("ent_id like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotLike(String value) {
            addCriterion("ent_id not like", value, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdIn(List<String> values) {
            addCriterion("ent_id in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotIn(List<String> values) {
            addCriterion("ent_id not in", values, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdBetween(String value1, String value2) {
            addCriterion("ent_id between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andEntIdNotBetween(String value1, String value2) {
            addCriterion("ent_id not between", value1, value2, "entId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andModStaffIsNull() {
            addCriterion("mod_staff is null");
            return (Criteria) this;
        }

        public Criteria andModStaffIsNotNull() {
            addCriterion("mod_staff is not null");
            return (Criteria) this;
        }

        public Criteria andModStaffEqualTo(Integer value) {
            addCriterion("mod_staff =", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffNotEqualTo(Integer value) {
            addCriterion("mod_staff <>", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffGreaterThan(Integer value) {
            addCriterion("mod_staff >", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("mod_staff >=", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffLessThan(Integer value) {
            addCriterion("mod_staff <", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffLessThanOrEqualTo(Integer value) {
            addCriterion("mod_staff <=", value, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffIn(List<Integer> values) {
            addCriterion("mod_staff in", values, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffNotIn(List<Integer> values) {
            addCriterion("mod_staff not in", values, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffBetween(Integer value1, Integer value2) {
            addCriterion("mod_staff between", value1, value2, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModStaffNotBetween(Integer value1, Integer value2) {
            addCriterion("mod_staff not between", value1, value2, "modStaff");
            return (Criteria) this;
        }

        public Criteria andModDateIsNull() {
            addCriterion("mod_date is null");
            return (Criteria) this;
        }

        public Criteria andModDateIsNotNull() {
            addCriterion("mod_date is not null");
            return (Criteria) this;
        }

        public Criteria andModDateEqualTo(Date value) {
            addCriterion("mod_date =", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateNotEqualTo(Date value) {
            addCriterion("mod_date <>", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateGreaterThan(Date value) {
            addCriterion("mod_date >", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mod_date >=", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateLessThan(Date value) {
            addCriterion("mod_date <", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateLessThanOrEqualTo(Date value) {
            addCriterion("mod_date <=", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateIn(List<Date> values) {
            addCriterion("mod_date in", values, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateNotIn(List<Date> values) {
            addCriterion("mod_date not in", values, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateBetween(Date value1, Date value2) {
            addCriterion("mod_date between", value1, value2, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateNotBetween(Date value1, Date value2) {
            addCriterion("mod_date not between", value1, value2, "modDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andFactTypeLikeInsensitive(String value) {
            addCriterion("upper(fact_type) like", value.toUpperCase(), "factType");
            return this;
        }

        public Criteria andFactIdLikeInsensitive(String value) {
            addCriterion("upper(fact_id) like", value.toUpperCase(), "factId");
            return this;
        }

        public Criteria andEntTypeLikeInsensitive(String value) {
            addCriterion("upper(ent_type) like", value.toUpperCase(), "entType");
            return this;
        }

        public Criteria andEntIdLikeInsensitive(String value) {
            addCriterion("upper(ent_id) like", value.toUpperCase(), "entId");
            return this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return this;
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
package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColdCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String coldId;

    private String coldIdRange;

    private String coldName;

    private String coldNameRange;

    private String coldAddress;

    private String coldAddressRange;

    private String createUser;

    private String createUserRange;

    private Date createTime;

    private Date createTimeRange1;

    private Date createTimeRange2;

    private String updateUser;

    private String updateUserRange;

    private Date updateTime;

    private Date updateTimeRange1;

    private Date updateTimeRange2;

    /** 冷库所在地区（城市） */
    private String coldLocation;

    private String coldLocationRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public ColdCriteria() {
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

    public String getColdName() {
        return coldName;
    }

    public void setColdName(String coldName) {
        this.coldName = coldName == null ? null : coldName.trim();
    }

    public String getColdNameRange() {
        return coldNameRange;
    }

    public void setColdNameRange(String coldNameRange) {
        this.coldNameRange = coldNameRange == null ? null : coldNameRange.trim();
    }

    public String getColdAddress() {
        return coldAddress;
    }

    public void setColdAddress(String coldAddress) {
        this.coldAddress = coldAddress == null ? null : coldAddress.trim();
    }

    public String getColdAddressRange() {
        return coldAddressRange;
    }

    public void setColdAddressRange(String coldAddressRange) {
        this.coldAddressRange = coldAddressRange == null ? null : coldAddressRange.trim();
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

    public String getColdLocation() {
        return coldLocation;
    }

    public void setColdLocation(String coldLocation) {
        this.coldLocation = coldLocation == null ? null : coldLocation.trim();
    }

    public String getColdLocationRange() {
        return coldLocationRange;
    }

    public void setColdLocationRange(String coldLocationRange) {
        this.coldLocationRange = coldLocationRange == null ? null : coldLocationRange.trim();
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

        public Criteria andColdNameIsNull() {
            addCriterion("cold_name is null");
            return (Criteria) this;
        }

        public Criteria andColdNameIsNotNull() {
            addCriterion("cold_name is not null");
            return (Criteria) this;
        }

        public Criteria andColdNameEqualTo(String value) {
            addCriterion("cold_name =", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameNotEqualTo(String value) {
            addCriterion("cold_name <>", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameGreaterThan(String value) {
            addCriterion("cold_name >", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameGreaterThanOrEqualTo(String value) {
            addCriterion("cold_name >=", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameLessThan(String value) {
            addCriterion("cold_name <", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameLessThanOrEqualTo(String value) {
            addCriterion("cold_name <=", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameLike(String value) {
            addCriterion("cold_name like", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameNotLike(String value) {
            addCriterion("cold_name not like", value, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameIn(List<String> values) {
            addCriterion("cold_name in", values, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameNotIn(List<String> values) {
            addCriterion("cold_name not in", values, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameBetween(String value1, String value2) {
            addCriterion("cold_name between", value1, value2, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdNameNotBetween(String value1, String value2) {
            addCriterion("cold_name not between", value1, value2, "coldName");
            return (Criteria) this;
        }

        public Criteria andColdAddressIsNull() {
            addCriterion("cold_address is null");
            return (Criteria) this;
        }

        public Criteria andColdAddressIsNotNull() {
            addCriterion("cold_address is not null");
            return (Criteria) this;
        }

        public Criteria andColdAddressEqualTo(String value) {
            addCriterion("cold_address =", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressNotEqualTo(String value) {
            addCriterion("cold_address <>", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressGreaterThan(String value) {
            addCriterion("cold_address >", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cold_address >=", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressLessThan(String value) {
            addCriterion("cold_address <", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressLessThanOrEqualTo(String value) {
            addCriterion("cold_address <=", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressLike(String value) {
            addCriterion("cold_address like", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressNotLike(String value) {
            addCriterion("cold_address not like", value, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressIn(List<String> values) {
            addCriterion("cold_address in", values, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressNotIn(List<String> values) {
            addCriterion("cold_address not in", values, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressBetween(String value1, String value2) {
            addCriterion("cold_address between", value1, value2, "coldAddress");
            return (Criteria) this;
        }

        public Criteria andColdAddressNotBetween(String value1, String value2) {
            addCriterion("cold_address not between", value1, value2, "coldAddress");
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

        public Criteria andColdLocationIsNull() {
            addCriterion("cold_location is null");
            return (Criteria) this;
        }

        public Criteria andColdLocationIsNotNull() {
            addCriterion("cold_location is not null");
            return (Criteria) this;
        }

        public Criteria andColdLocationEqualTo(String value) {
            addCriterion("cold_location =", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationNotEqualTo(String value) {
            addCriterion("cold_location <>", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationGreaterThan(String value) {
            addCriterion("cold_location >", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationGreaterThanOrEqualTo(String value) {
            addCriterion("cold_location >=", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationLessThan(String value) {
            addCriterion("cold_location <", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationLessThanOrEqualTo(String value) {
            addCriterion("cold_location <=", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationLike(String value) {
            addCriterion("cold_location like", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationNotLike(String value) {
            addCriterion("cold_location not like", value, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationIn(List<String> values) {
            addCriterion("cold_location in", values, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationNotIn(List<String> values) {
            addCriterion("cold_location not in", values, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationBetween(String value1, String value2) {
            addCriterion("cold_location between", value1, value2, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdLocationNotBetween(String value1, String value2) {
            addCriterion("cold_location not between", value1, value2, "coldLocation");
            return (Criteria) this;
        }

        public Criteria andColdIdLikeInsensitive(String value) {
            addCriterion("upper(cold_id) like", value.toUpperCase(), "coldId");
            return (Criteria) this;
        }

        public Criteria andColdNameLikeInsensitive(String value) {
            addCriterion("upper(cold_name) like", value.toUpperCase(), "coldName");
            return (Criteria) this;
        }

        public Criteria andColdAddressLikeInsensitive(String value) {
            addCriterion("upper(cold_address) like", value.toUpperCase(), "coldAddress");
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

        public Criteria andColdLocationLikeInsensitive(String value) {
            addCriterion("upper(cold_location) like", value.toUpperCase(), "coldLocation");
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
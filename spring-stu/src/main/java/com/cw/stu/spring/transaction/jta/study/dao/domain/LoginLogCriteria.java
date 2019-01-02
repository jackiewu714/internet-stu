package com.cw.stu.spring.transaction.jta.study.dao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer id;

    private String userName;

    private String userNameRange;

    private Long yyuid;

    private String yyid;

    private String yyidRange;

    private Integer staffId;

    private String sys;

    private String sysRange;

    private String ip;

    private String ipRange;

    private String mac;

    private String macRange;

    private Date creDate;

    private Date creDateRange1;

    private Date creDateRange2;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    public LoginLogCriteria() {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNameRange() {
        return userNameRange;
    }

    public void setUserNameRange(String userNameRange) {
        this.userNameRange = userNameRange == null ? null : userNameRange.trim();
    }

    public Long getYyuid() {
        return yyuid;
    }

    public void setYyuid(Long yyuid) {
        this.yyuid = yyuid;
    }

    public String getYyid() {
        return yyid;
    }

    public void setYyid(String yyid) {
        this.yyid = yyid == null ? null : yyid.trim();
    }

    public String getYyidRange() {
        return yyidRange;
    }

    public void setYyidRange(String yyidRange) {
        this.yyidRange = yyidRange == null ? null : yyidRange.trim();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys == null ? null : sys.trim();
    }

    public String getSysRange() {
        return sysRange;
    }

    public void setSysRange(String sysRange) {
        this.sysRange = sysRange == null ? null : sysRange.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getIpRange() {
        return ipRange;
    }

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange == null ? null : ipRange.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getMacRange() {
        return macRange;
    }

    public void setMacRange(String macRange) {
        this.macRange = macRange == null ? null : macRange.trim();
    }

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
    }

    public Date getCreDateRange1() {
        return creDateRange1;
    }

    public void setCreDateRange1(Date creDateRange1) {
        this.creDateRange1 = creDateRange1;
    }

    public Date getCreDateRange2() {
        return creDateRange2;
    }

    public void setCreDateRange2(Date creDateRange2) {
        this.creDateRange2 = creDateRange2;
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andYyuidIsNull() {
            addCriterion("yyuid is null");
            return (Criteria) this;
        }

        public Criteria andYyuidIsNotNull() {
            addCriterion("yyuid is not null");
            return (Criteria) this;
        }

        public Criteria andYyuidEqualTo(Long value) {
            addCriterion("yyuid =", value, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidNotEqualTo(Long value) {
            addCriterion("yyuid <>", value, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidGreaterThan(Long value) {
            addCriterion("yyuid >", value, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidGreaterThanOrEqualTo(Long value) {
            addCriterion("yyuid >=", value, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidLessThan(Long value) {
            addCriterion("yyuid <", value, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidLessThanOrEqualTo(Long value) {
            addCriterion("yyuid <=", value, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidIn(List<Long> values) {
            addCriterion("yyuid in", values, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidNotIn(List<Long> values) {
            addCriterion("yyuid not in", values, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidBetween(Long value1, Long value2) {
            addCriterion("yyuid between", value1, value2, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyuidNotBetween(Long value1, Long value2) {
            addCriterion("yyuid not between", value1, value2, "yyuid");
            return (Criteria) this;
        }

        public Criteria andYyidIsNull() {
            addCriterion("yyid is null");
            return (Criteria) this;
        }

        public Criteria andYyidIsNotNull() {
            addCriterion("yyid is not null");
            return (Criteria) this;
        }

        public Criteria andYyidEqualTo(String value) {
            addCriterion("yyid =", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidNotEqualTo(String value) {
            addCriterion("yyid <>", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidGreaterThan(String value) {
            addCriterion("yyid >", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidGreaterThanOrEqualTo(String value) {
            addCriterion("yyid >=", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidLessThan(String value) {
            addCriterion("yyid <", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidLessThanOrEqualTo(String value) {
            addCriterion("yyid <=", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidLike(String value) {
            addCriterion("yyid like", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidNotLike(String value) {
            addCriterion("yyid not like", value, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidIn(List<String> values) {
            addCriterion("yyid in", values, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidNotIn(List<String> values) {
            addCriterion("yyid not in", values, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidBetween(String value1, String value2) {
            addCriterion("yyid between", value1, value2, "yyid");
            return (Criteria) this;
        }

        public Criteria andYyidNotBetween(String value1, String value2) {
            addCriterion("yyid not between", value1, value2, "yyid");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andSysIsNull() {
            addCriterion("sys is null");
            return (Criteria) this;
        }

        public Criteria andSysIsNotNull() {
            addCriterion("sys is not null");
            return (Criteria) this;
        }

        public Criteria andSysEqualTo(String value) {
            addCriterion("sys =", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotEqualTo(String value) {
            addCriterion("sys <>", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysGreaterThan(String value) {
            addCriterion("sys >", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysGreaterThanOrEqualTo(String value) {
            addCriterion("sys >=", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLessThan(String value) {
            addCriterion("sys <", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLessThanOrEqualTo(String value) {
            addCriterion("sys <=", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysLike(String value) {
            addCriterion("sys like", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotLike(String value) {
            addCriterion("sys not like", value, "sys");
            return (Criteria) this;
        }

        public Criteria andSysIn(List<String> values) {
            addCriterion("sys in", values, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotIn(List<String> values) {
            addCriterion("sys not in", values, "sys");
            return (Criteria) this;
        }

        public Criteria andSysBetween(String value1, String value2) {
            addCriterion("sys between", value1, value2, "sys");
            return (Criteria) this;
        }

        public Criteria andSysNotBetween(String value1, String value2) {
            addCriterion("sys not between", value1, value2, "sys");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andCreDateIsNull() {
            addCriterion("cre_date is null");
            return (Criteria) this;
        }

        public Criteria andCreDateIsNotNull() {
            addCriterion("cre_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreDateEqualTo(Date value) {
            addCriterion("cre_date =", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateNotEqualTo(Date value) {
            addCriterion("cre_date <>", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateGreaterThan(Date value) {
            addCriterion("cre_date >", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cre_date >=", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateLessThan(Date value) {
            addCriterion("cre_date <", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateLessThanOrEqualTo(Date value) {
            addCriterion("cre_date <=", value, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateIn(List<Date> values) {
            addCriterion("cre_date in", values, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateNotIn(List<Date> values) {
            addCriterion("cre_date not in", values, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateBetween(Date value1, Date value2) {
            addCriterion("cre_date between", value1, value2, "creDate");
            return (Criteria) this;
        }

        public Criteria andCreDateNotBetween(Date value1, Date value2) {
            addCriterion("cre_date not between", value1, value2, "creDate");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(user_name) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andYyidLikeInsensitive(String value) {
            addCriterion("upper(yyid) like", value.toUpperCase(), "yyid");
            return (Criteria) this;
        }

        public Criteria andSysLikeInsensitive(String value) {
            addCriterion("upper(sys) like", value.toUpperCase(), "sys");
            return (Criteria) this;
        }

        public Criteria andIpLikeInsensitive(String value) {
            addCriterion("upper(ip) like", value.toUpperCase(), "ip");
            return (Criteria) this;
        }

        public Criteria andMacLikeInsensitive(String value) {
            addCriterion("upper(mac) like", value.toUpperCase(), "mac");
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
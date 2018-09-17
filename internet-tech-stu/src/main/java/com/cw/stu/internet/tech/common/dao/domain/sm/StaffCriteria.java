package com.cw.stu.internet.tech.common.dao.domain.sm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer staffId;

    private String staffName;

    private String staffNameRange;

    private String linkPhone;

    private String linkPhoneRange;

    private String status;

    private String statusRange;

    private Date lastLogintime;

    private Date lastLogintimeRange1;

    private Date lastLogintimeRange2;

    private String lastLoginip;

    private String lastLoginipRange;

    private String staffNick;

    private String staffNickRange;

    private Date effStartdate;

    private Date effStartdateRange1;

    private Date effStartdateRange2;

    private Date effEnddate;

    private Date effEnddateRange1;

    private Date effEnddateRange2;

    private String password;

    private String passwordRange;

    private Integer loginLimit;

    private Date modDate;

    private Date modDateRange1;

    private Date modDateRange2;

    private Integer modStaff;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    public StaffCriteria() {
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

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffNameRange() {
        return staffNameRange;
    }

    public void setStaffNameRange(String staffNameRange) {
        this.staffNameRange = staffNameRange == null ? null : staffNameRange.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getLinkPhoneRange() {
        return linkPhoneRange;
    }

    public void setLinkPhoneRange(String linkPhoneRange) {
        this.linkPhoneRange = linkPhoneRange == null ? null : linkPhoneRange.trim();
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

    public Date getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Date lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public Date getLastLogintimeRange1() {
        return lastLogintimeRange1;
    }

    public void setLastLogintimeRange1(Date lastLogintimeRange1) {
        this.lastLogintimeRange1 = lastLogintimeRange1;
    }

    public Date getLastLogintimeRange2() {
        return lastLogintimeRange2;
    }

    public void setLastLogintimeRange2(Date lastLogintimeRange2) {
        this.lastLogintimeRange2 = lastLogintimeRange2;
    }

    public String getLastLoginip() {
        return lastLoginip;
    }

    public void setLastLoginip(String lastLoginip) {
        this.lastLoginip = lastLoginip == null ? null : lastLoginip.trim();
    }

    public String getLastLoginipRange() {
        return lastLoginipRange;
    }

    public void setLastLoginipRange(String lastLoginipRange) {
        this.lastLoginipRange = lastLoginipRange == null ? null : lastLoginipRange.trim();
    }

    public String getStaffNick() {
        return staffNick;
    }

    public void setStaffNick(String staffNick) {
        this.staffNick = staffNick == null ? null : staffNick.trim();
    }

    public String getStaffNickRange() {
        return staffNickRange;
    }

    public void setStaffNickRange(String staffNickRange) {
        this.staffNickRange = staffNickRange == null ? null : staffNickRange.trim();
    }

    public Date getEffStartdate() {
        return effStartdate;
    }

    public void setEffStartdate(Date effStartdate) {
        this.effStartdate = effStartdate;
    }

    public Date getEffStartdateRange1() {
        return effStartdateRange1;
    }

    public void setEffStartdateRange1(Date effStartdateRange1) {
        this.effStartdateRange1 = effStartdateRange1;
    }

    public Date getEffStartdateRange2() {
        return effStartdateRange2;
    }

    public void setEffStartdateRange2(Date effStartdateRange2) {
        this.effStartdateRange2 = effStartdateRange2;
    }

    public Date getEffEnddate() {
        return effEnddate;
    }

    public void setEffEnddate(Date effEnddate) {
        this.effEnddate = effEnddate;
    }

    public Date getEffEnddateRange1() {
        return effEnddateRange1;
    }

    public void setEffEnddateRange1(Date effEnddateRange1) {
        this.effEnddateRange1 = effEnddateRange1;
    }

    public Date getEffEnddateRange2() {
        return effEnddateRange2;
    }

    public void setEffEnddateRange2(Date effEnddateRange2) {
        this.effEnddateRange2 = effEnddateRange2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordRange() {
        return passwordRange;
    }

    public void setPasswordRange(String passwordRange) {
        this.passwordRange = passwordRange == null ? null : passwordRange.trim();
    }

    public Integer getLoginLimit() {
        return loginLimit;
    }

    public void setLoginLimit(Integer loginLimit) {
        this.loginLimit = loginLimit;
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

    public Integer getModStaff() {
        return modStaff;
    }

    public void setModStaff(Integer modStaff) {
        this.modStaff = modStaff;
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

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNull() {
            addCriterion("link_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("link_phone =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("link_phone <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("link_phone >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("link_phone >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("link_phone <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("link_phone <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("link_phone like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("link_phone not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("link_phone in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("link_phone not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("link_phone between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("link_phone not between", value1, value2, "linkPhone");
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

        public Criteria andLastLogintimeIsNull() {
            addCriterion("last_logintime is null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIsNotNull() {
            addCriterion("last_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeEqualTo(Date value) {
            addCriterion("last_logintime =", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotEqualTo(Date value) {
            addCriterion("last_logintime <>", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThan(Date value) {
            addCriterion("last_logintime >", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_logintime >=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThan(Date value) {
            addCriterion("last_logintime <", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("last_logintime <=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIn(List<Date> values) {
            addCriterion("last_logintime in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotIn(List<Date> values) {
            addCriterion("last_logintime not in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeBetween(Date value1, Date value2) {
            addCriterion("last_logintime between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("last_logintime not between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLoginipIsNull() {
            addCriterion("last_loginip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginipIsNotNull() {
            addCriterion("last_loginip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginipEqualTo(String value) {
            addCriterion("last_loginip =", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotEqualTo(String value) {
            addCriterion("last_loginip <>", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipGreaterThan(String value) {
            addCriterion("last_loginip >", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("last_loginip >=", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipLessThan(String value) {
            addCriterion("last_loginip <", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipLessThanOrEqualTo(String value) {
            addCriterion("last_loginip <=", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipLike(String value) {
            addCriterion("last_loginip like", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotLike(String value) {
            addCriterion("last_loginip not like", value, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipIn(List<String> values) {
            addCriterion("last_loginip in", values, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotIn(List<String> values) {
            addCriterion("last_loginip not in", values, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipBetween(String value1, String value2) {
            addCriterion("last_loginip between", value1, value2, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andLastLoginipNotBetween(String value1, String value2) {
            addCriterion("last_loginip not between", value1, value2, "lastLoginip");
            return (Criteria) this;
        }

        public Criteria andStaffNickIsNull() {
            addCriterion("staff_nick is null");
            return (Criteria) this;
        }

        public Criteria andStaffNickIsNotNull() {
            addCriterion("staff_nick is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNickEqualTo(String value) {
            addCriterion("staff_nick =", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickNotEqualTo(String value) {
            addCriterion("staff_nick <>", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickGreaterThan(String value) {
            addCriterion("staff_nick >", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickGreaterThanOrEqualTo(String value) {
            addCriterion("staff_nick >=", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickLessThan(String value) {
            addCriterion("staff_nick <", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickLessThanOrEqualTo(String value) {
            addCriterion("staff_nick <=", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickLike(String value) {
            addCriterion("staff_nick like", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickNotLike(String value) {
            addCriterion("staff_nick not like", value, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickIn(List<String> values) {
            addCriterion("staff_nick in", values, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickNotIn(List<String> values) {
            addCriterion("staff_nick not in", values, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickBetween(String value1, String value2) {
            addCriterion("staff_nick between", value1, value2, "staffNick");
            return (Criteria) this;
        }

        public Criteria andStaffNickNotBetween(String value1, String value2) {
            addCriterion("staff_nick not between", value1, value2, "staffNick");
            return (Criteria) this;
        }

        public Criteria andEffStartdateIsNull() {
            addCriterion("eff_startdate is null");
            return (Criteria) this;
        }

        public Criteria andEffStartdateIsNotNull() {
            addCriterion("eff_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andEffStartdateEqualTo(Date value) {
            addCriterion("eff_startdate =", value, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateNotEqualTo(Date value) {
            addCriterion("eff_startdate <>", value, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateGreaterThan(Date value) {
            addCriterion("eff_startdate >", value, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("eff_startdate >=", value, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateLessThan(Date value) {
            addCriterion("eff_startdate <", value, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateLessThanOrEqualTo(Date value) {
            addCriterion("eff_startdate <=", value, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateIn(List<Date> values) {
            addCriterion("eff_startdate in", values, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateNotIn(List<Date> values) {
            addCriterion("eff_startdate not in", values, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateBetween(Date value1, Date value2) {
            addCriterion("eff_startdate between", value1, value2, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffStartdateNotBetween(Date value1, Date value2) {
            addCriterion("eff_startdate not between", value1, value2, "effStartdate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateIsNull() {
            addCriterion("eff_enddate is null");
            return (Criteria) this;
        }

        public Criteria andEffEnddateIsNotNull() {
            addCriterion("eff_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEffEnddateEqualTo(Date value) {
            addCriterion("eff_enddate =", value, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateNotEqualTo(Date value) {
            addCriterion("eff_enddate <>", value, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateGreaterThan(Date value) {
            addCriterion("eff_enddate >", value, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("eff_enddate >=", value, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateLessThan(Date value) {
            addCriterion("eff_enddate <", value, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateLessThanOrEqualTo(Date value) {
            addCriterion("eff_enddate <=", value, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateIn(List<Date> values) {
            addCriterion("eff_enddate in", values, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateNotIn(List<Date> values) {
            addCriterion("eff_enddate not in", values, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateBetween(Date value1, Date value2) {
            addCriterion("eff_enddate between", value1, value2, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andEffEnddateNotBetween(Date value1, Date value2) {
            addCriterion("eff_enddate not between", value1, value2, "effEnddate");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLoginLimitIsNull() {
            addCriterion("login_limit is null");
            return (Criteria) this;
        }

        public Criteria andLoginLimitIsNotNull() {
            addCriterion("login_limit is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLimitEqualTo(Integer value) {
            addCriterion("login_limit =", value, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitNotEqualTo(Integer value) {
            addCriterion("login_limit <>", value, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitGreaterThan(Integer value) {
            addCriterion("login_limit >", value, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_limit >=", value, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitLessThan(Integer value) {
            addCriterion("login_limit <", value, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitLessThanOrEqualTo(Integer value) {
            addCriterion("login_limit <=", value, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitIn(List<Integer> values) {
            addCriterion("login_limit in", values, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitNotIn(List<Integer> values) {
            addCriterion("login_limit not in", values, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitBetween(Integer value1, Integer value2) {
            addCriterion("login_limit between", value1, value2, "loginLimit");
            return (Criteria) this;
        }

        public Criteria andLoginLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("login_limit not between", value1, value2, "loginLimit");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andStaffNameLikeInsensitive(String value) {
            addCriterion("upper(staff_name) like", value.toUpperCase(), "staffName");
            return this;
        }

        public Criteria andLinkPhoneLikeInsensitive(String value) {
            addCriterion("upper(link_phone) like", value.toUpperCase(), "linkPhone");
            return this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return this;
        }

        public Criteria andLastLoginipLikeInsensitive(String value) {
            addCriterion("upper(last_loginip) like", value.toUpperCase(), "lastLoginip");
            return this;
        }

        public Criteria andStaffNickLikeInsensitive(String value) {
            addCriterion("upper(staff_nick) like", value.toUpperCase(), "staffNick");
            return this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
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
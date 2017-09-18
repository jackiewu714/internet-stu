package com.cw.common.dao.domain.sm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModuleCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer modId;

    private String modName;

    private String modNameRange;

    private String modType;

    private String modTypeRange;

    private Integer parentId;

    private String pkgName;

    private String pkgNameRange;

    private String status;

    private String statusRange;

    private String feature;

    private String featureRange;

    private Date modDate;

    private Date modDateRange1;

    private Date modDateRange2;

    private Integer modStaff;

    private String url;

    private String urlRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    public ModuleCriteria() {
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

    public Integer getModId() {
        return modId;
    }

    public void setModId(Integer modId) {
        this.modId = modId;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName == null ? null : modName.trim();
    }

    public String getModNameRange() {
        return modNameRange;
    }

    public void setModNameRange(String modNameRange) {
        this.modNameRange = modNameRange == null ? null : modNameRange.trim();
    }

    public String getModType() {
        return modType;
    }

    public void setModType(String modType) {
        this.modType = modType == null ? null : modType.trim();
    }

    public String getModTypeRange() {
        return modTypeRange;
    }

    public void setModTypeRange(String modTypeRange) {
        this.modTypeRange = modTypeRange == null ? null : modTypeRange.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName == null ? null : pkgName.trim();
    }

    public String getPkgNameRange() {
        return pkgNameRange;
    }

    public void setPkgNameRange(String pkgNameRange) {
        this.pkgNameRange = pkgNameRange == null ? null : pkgNameRange.trim();
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

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getFeatureRange() {
        return featureRange;
    }

    public void setFeatureRange(String featureRange) {
        this.featureRange = featureRange == null ? null : featureRange.trim();
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUrlRange() {
        return urlRange;
    }

    public void setUrlRange(String urlRange) {
        this.urlRange = urlRange == null ? null : urlRange.trim();
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

        public Criteria andModIdIsNull() {
            addCriterion("mod_id is null");
            return (Criteria) this;
        }

        public Criteria andModIdIsNotNull() {
            addCriterion("mod_id is not null");
            return (Criteria) this;
        }

        public Criteria andModIdEqualTo(Integer value) {
            addCriterion("mod_id =", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotEqualTo(Integer value) {
            addCriterion("mod_id <>", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThan(Integer value) {
            addCriterion("mod_id >", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mod_id >=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThan(Integer value) {
            addCriterion("mod_id <", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdLessThanOrEqualTo(Integer value) {
            addCriterion("mod_id <=", value, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdIn(List<Integer> values) {
            addCriterion("mod_id in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotIn(List<Integer> values) {
            addCriterion("mod_id not in", values, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdBetween(Integer value1, Integer value2) {
            addCriterion("mod_id between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mod_id not between", value1, value2, "modId");
            return (Criteria) this;
        }

        public Criteria andModNameIsNull() {
            addCriterion("mod_name is null");
            return (Criteria) this;
        }

        public Criteria andModNameIsNotNull() {
            addCriterion("mod_name is not null");
            return (Criteria) this;
        }

        public Criteria andModNameEqualTo(String value) {
            addCriterion("mod_name =", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotEqualTo(String value) {
            addCriterion("mod_name <>", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThan(String value) {
            addCriterion("mod_name >", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameGreaterThanOrEqualTo(String value) {
            addCriterion("mod_name >=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThan(String value) {
            addCriterion("mod_name <", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLessThanOrEqualTo(String value) {
            addCriterion("mod_name <=", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameLike(String value) {
            addCriterion("mod_name like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotLike(String value) {
            addCriterion("mod_name not like", value, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameIn(List<String> values) {
            addCriterion("mod_name in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotIn(List<String> values) {
            addCriterion("mod_name not in", values, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameBetween(String value1, String value2) {
            addCriterion("mod_name between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModNameNotBetween(String value1, String value2) {
            addCriterion("mod_name not between", value1, value2, "modName");
            return (Criteria) this;
        }

        public Criteria andModTypeIsNull() {
            addCriterion("mod_type is null");
            return (Criteria) this;
        }

        public Criteria andModTypeIsNotNull() {
            addCriterion("mod_type is not null");
            return (Criteria) this;
        }

        public Criteria andModTypeEqualTo(String value) {
            addCriterion("mod_type =", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeNotEqualTo(String value) {
            addCriterion("mod_type <>", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeGreaterThan(String value) {
            addCriterion("mod_type >", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mod_type >=", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeLessThan(String value) {
            addCriterion("mod_type <", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeLessThanOrEqualTo(String value) {
            addCriterion("mod_type <=", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeLike(String value) {
            addCriterion("mod_type like", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeNotLike(String value) {
            addCriterion("mod_type not like", value, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeIn(List<String> values) {
            addCriterion("mod_type in", values, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeNotIn(List<String> values) {
            addCriterion("mod_type not in", values, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeBetween(String value1, String value2) {
            addCriterion("mod_type between", value1, value2, "modType");
            return (Criteria) this;
        }

        public Criteria andModTypeNotBetween(String value1, String value2) {
            addCriterion("mod_type not between", value1, value2, "modType");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNull() {
            addCriterion("pkg_name is null");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNotNull() {
            addCriterion("pkg_name is not null");
            return (Criteria) this;
        }

        public Criteria andPkgNameEqualTo(String value) {
            addCriterion("pkg_name =", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotEqualTo(String value) {
            addCriterion("pkg_name <>", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThan(String value) {
            addCriterion("pkg_name >", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_name >=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThan(String value) {
            addCriterion("pkg_name <", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThanOrEqualTo(String value) {
            addCriterion("pkg_name <=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLike(String value) {
            addCriterion("pkg_name like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotLike(String value) {
            addCriterion("pkg_name not like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameIn(List<String> values) {
            addCriterion("pkg_name in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotIn(List<String> values) {
            addCriterion("pkg_name not in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameBetween(String value1, String value2) {
            addCriterion("pkg_name between", value1, value2, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotBetween(String value1, String value2) {
            addCriterion("pkg_name not between", value1, value2, "pkgName");
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

        public Criteria andFeatureIsNull() {
            addCriterion("feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("feature not between", value1, value2, "feature");
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andModNameLikeInsensitive(String value) {
            addCriterion("upper(mod_name) like", value.toUpperCase(), "modName");
            return this;
        }

        public Criteria andModTypeLikeInsensitive(String value) {
            addCriterion("upper(mod_type) like", value.toUpperCase(), "modType");
            return this;
        }

        public Criteria andPkgNameLikeInsensitive(String value) {
            addCriterion("upper(pkg_name) like", value.toUpperCase(), "pkgName");
            return this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return this;
        }

        public Criteria andFeatureLikeInsensitive(String value) {
            addCriterion("upper(feature) like", value.toUpperCase(), "feature");
            return this;
        }

        public Criteria andUrlLikeInsensitive(String value) {
            addCriterion("upper(url) like", value.toUpperCase(), "url");
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
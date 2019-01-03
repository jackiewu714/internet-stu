package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelMdCategoryCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 市场总监与品类关系ID */
    private String relMdCategoryId;

    private String relMdCategoryIdRange;

    /** 市场总监UUID */
    private String mdId;

    private String mdIdRange;

    /** 市场总监名称 */
    private String mdName;

    private String mdNameRange;

    /** 品类ID */
    private String categoryId;

    private String categoryIdRange;

    private String mdPhone;

    private String mdPhoneRange;

    private String mdEmail;

    private String mdEmailRange;

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

    public RelMdCategoryCriteria() {
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

    public String getRelMdCategoryId() {
        return relMdCategoryId;
    }

    public void setRelMdCategoryId(String relMdCategoryId) {
        this.relMdCategoryId = relMdCategoryId == null ? null : relMdCategoryId.trim();
    }

    public String getRelMdCategoryIdRange() {
        return relMdCategoryIdRange;
    }

    public void setRelMdCategoryIdRange(String relMdCategoryIdRange) {
        this.relMdCategoryIdRange = relMdCategoryIdRange == null ? null : relMdCategoryIdRange.trim();
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

    public String getMdPhone() {
        return mdPhone;
    }

    public void setMdPhone(String mdPhone) {
        this.mdPhone = mdPhone == null ? null : mdPhone.trim();
    }

    public String getMdPhoneRange() {
        return mdPhoneRange;
    }

    public void setMdPhoneRange(String mdPhoneRange) {
        this.mdPhoneRange = mdPhoneRange == null ? null : mdPhoneRange.trim();
    }

    public String getMdEmail() {
        return mdEmail;
    }

    public void setMdEmail(String mdEmail) {
        this.mdEmail = mdEmail == null ? null : mdEmail.trim();
    }

    public String getMdEmailRange() {
        return mdEmailRange;
    }

    public void setMdEmailRange(String mdEmailRange) {
        this.mdEmailRange = mdEmailRange == null ? null : mdEmailRange.trim();
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

        public Criteria andRelMdCategoryIdIsNull() {
            addCriterion("rel_md_category_id is null");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdIsNotNull() {
            addCriterion("rel_md_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdEqualTo(String value) {
            addCriterion("rel_md_category_id =", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdNotEqualTo(String value) {
            addCriterion("rel_md_category_id <>", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdGreaterThan(String value) {
            addCriterion("rel_md_category_id >", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("rel_md_category_id >=", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdLessThan(String value) {
            addCriterion("rel_md_category_id <", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("rel_md_category_id <=", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdLike(String value) {
            addCriterion("rel_md_category_id like", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdNotLike(String value) {
            addCriterion("rel_md_category_id not like", value, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdIn(List<String> values) {
            addCriterion("rel_md_category_id in", values, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdNotIn(List<String> values) {
            addCriterion("rel_md_category_id not in", values, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdBetween(String value1, String value2) {
            addCriterion("rel_md_category_id between", value1, value2, "relMdCategoryId");
            return (Criteria) this;
        }

        public Criteria andRelMdCategoryIdNotBetween(String value1, String value2) {
            addCriterion("rel_md_category_id not between", value1, value2, "relMdCategoryId");
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

        public Criteria andMdPhoneIsNull() {
            addCriterion("md_phone is null");
            return (Criteria) this;
        }

        public Criteria andMdPhoneIsNotNull() {
            addCriterion("md_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMdPhoneEqualTo(String value) {
            addCriterion("md_phone =", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneNotEqualTo(String value) {
            addCriterion("md_phone <>", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneGreaterThan(String value) {
            addCriterion("md_phone >", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("md_phone >=", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneLessThan(String value) {
            addCriterion("md_phone <", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneLessThanOrEqualTo(String value) {
            addCriterion("md_phone <=", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneLike(String value) {
            addCriterion("md_phone like", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneNotLike(String value) {
            addCriterion("md_phone not like", value, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneIn(List<String> values) {
            addCriterion("md_phone in", values, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneNotIn(List<String> values) {
            addCriterion("md_phone not in", values, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneBetween(String value1, String value2) {
            addCriterion("md_phone between", value1, value2, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdPhoneNotBetween(String value1, String value2) {
            addCriterion("md_phone not between", value1, value2, "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdEmailIsNull() {
            addCriterion("md_email is null");
            return (Criteria) this;
        }

        public Criteria andMdEmailIsNotNull() {
            addCriterion("md_email is not null");
            return (Criteria) this;
        }

        public Criteria andMdEmailEqualTo(String value) {
            addCriterion("md_email =", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailNotEqualTo(String value) {
            addCriterion("md_email <>", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailGreaterThan(String value) {
            addCriterion("md_email >", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailGreaterThanOrEqualTo(String value) {
            addCriterion("md_email >=", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailLessThan(String value) {
            addCriterion("md_email <", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailLessThanOrEqualTo(String value) {
            addCriterion("md_email <=", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailLike(String value) {
            addCriterion("md_email like", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailNotLike(String value) {
            addCriterion("md_email not like", value, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailIn(List<String> values) {
            addCriterion("md_email in", values, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailNotIn(List<String> values) {
            addCriterion("md_email not in", values, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailBetween(String value1, String value2) {
            addCriterion("md_email between", value1, value2, "mdEmail");
            return (Criteria) this;
        }

        public Criteria andMdEmailNotBetween(String value1, String value2) {
            addCriterion("md_email not between", value1, value2, "mdEmail");
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

        public Criteria andRelMdCategoryIdLikeInsensitive(String value) {
            addCriterion("upper(rel_md_category_id) like", value.toUpperCase(), "relMdCategoryId");
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

        public Criteria andCategoryIdLikeInsensitive(String value) {
            addCriterion("upper(category_id) like", value.toUpperCase(), "categoryId");
            return (Criteria) this;
        }

        public Criteria andMdPhoneLikeInsensitive(String value) {
            addCriterion("upper(md_phone) like", value.toUpperCase(), "mdPhone");
            return (Criteria) this;
        }

        public Criteria andMdEmailLikeInsensitive(String value) {
            addCriterion("upper(md_email) like", value.toUpperCase(), "mdEmail");
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
package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistributorCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 渠道商UUID */
    private String disId;

    private String disIdRange;

    /** 渠道商名称 */
    private String disName;

    private String disNameRange;

    /** 市场总监UUID */
    private String mdId;

    private String mdIdRange;

    /** 市场总监名称 */
    private String mdName;

    private String mdNameRange;

    private String disAddress;

    private String disAddressRange;

    private String disPhone;

    private String disPhoneRange;

    private String disRemark;

    private String disRemarkRange;

    /** 地区 */
    private String area;

    private String areaRange;

    /** 类型 */
    private String type;

    private String typeRange;

    /** 渠道 */
    private String channel;

    private String channelRange;

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

    public DistributorCriteria() {
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

    public String getDisId() {
        return disId;
    }

    public void setDisId(String disId) {
        this.disId = disId == null ? null : disId.trim();
    }

    public String getDisIdRange() {
        return disIdRange;
    }

    public void setDisIdRange(String disIdRange) {
        this.disIdRange = disIdRange == null ? null : disIdRange.trim();
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName == null ? null : disName.trim();
    }

    public String getDisNameRange() {
        return disNameRange;
    }

    public void setDisNameRange(String disNameRange) {
        this.disNameRange = disNameRange == null ? null : disNameRange.trim();
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

    public String getDisAddress() {
        return disAddress;
    }

    public void setDisAddress(String disAddress) {
        this.disAddress = disAddress == null ? null : disAddress.trim();
    }

    public String getDisAddressRange() {
        return disAddressRange;
    }

    public void setDisAddressRange(String disAddressRange) {
        this.disAddressRange = disAddressRange == null ? null : disAddressRange.trim();
    }

    public String getDisPhone() {
        return disPhone;
    }

    public void setDisPhone(String disPhone) {
        this.disPhone = disPhone == null ? null : disPhone.trim();
    }

    public String getDisPhoneRange() {
        return disPhoneRange;
    }

    public void setDisPhoneRange(String disPhoneRange) {
        this.disPhoneRange = disPhoneRange == null ? null : disPhoneRange.trim();
    }

    public String getDisRemark() {
        return disRemark;
    }

    public void setDisRemark(String disRemark) {
        this.disRemark = disRemark == null ? null : disRemark.trim();
    }

    public String getDisRemarkRange() {
        return disRemarkRange;
    }

    public void setDisRemarkRange(String disRemarkRange) {
        this.disRemarkRange = disRemarkRange == null ? null : disRemarkRange.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAreaRange() {
        return areaRange;
    }

    public void setAreaRange(String areaRange) {
        this.areaRange = areaRange == null ? null : areaRange.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypeRange() {
        return typeRange;
    }

    public void setTypeRange(String typeRange) {
        this.typeRange = typeRange == null ? null : typeRange.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getChannelRange() {
        return channelRange;
    }

    public void setChannelRange(String channelRange) {
        this.channelRange = channelRange == null ? null : channelRange.trim();
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

        public Criteria andDisIdIsNull() {
            addCriterion("dis_id is null");
            return (Criteria) this;
        }

        public Criteria andDisIdIsNotNull() {
            addCriterion("dis_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisIdEqualTo(String value) {
            addCriterion("dis_id =", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotEqualTo(String value) {
            addCriterion("dis_id <>", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdGreaterThan(String value) {
            addCriterion("dis_id >", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdGreaterThanOrEqualTo(String value) {
            addCriterion("dis_id >=", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLessThan(String value) {
            addCriterion("dis_id <", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLessThanOrEqualTo(String value) {
            addCriterion("dis_id <=", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLike(String value) {
            addCriterion("dis_id like", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotLike(String value) {
            addCriterion("dis_id not like", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdIn(List<String> values) {
            addCriterion("dis_id in", values, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotIn(List<String> values) {
            addCriterion("dis_id not in", values, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdBetween(String value1, String value2) {
            addCriterion("dis_id between", value1, value2, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotBetween(String value1, String value2) {
            addCriterion("dis_id not between", value1, value2, "disId");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNull() {
            addCriterion("dis_name is null");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNotNull() {
            addCriterion("dis_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisNameEqualTo(String value) {
            addCriterion("dis_name =", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotEqualTo(String value) {
            addCriterion("dis_name <>", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThan(String value) {
            addCriterion("dis_name >", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThanOrEqualTo(String value) {
            addCriterion("dis_name >=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThan(String value) {
            addCriterion("dis_name <", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThanOrEqualTo(String value) {
            addCriterion("dis_name <=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLike(String value) {
            addCriterion("dis_name like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotLike(String value) {
            addCriterion("dis_name not like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameIn(List<String> values) {
            addCriterion("dis_name in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotIn(List<String> values) {
            addCriterion("dis_name not in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameBetween(String value1, String value2) {
            addCriterion("dis_name between", value1, value2, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotBetween(String value1, String value2) {
            addCriterion("dis_name not between", value1, value2, "disName");
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

        public Criteria andDisAddressIsNull() {
            addCriterion("dis_address is null");
            return (Criteria) this;
        }

        public Criteria andDisAddressIsNotNull() {
            addCriterion("dis_address is not null");
            return (Criteria) this;
        }

        public Criteria andDisAddressEqualTo(String value) {
            addCriterion("dis_address =", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressNotEqualTo(String value) {
            addCriterion("dis_address <>", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressGreaterThan(String value) {
            addCriterion("dis_address >", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dis_address >=", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressLessThan(String value) {
            addCriterion("dis_address <", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressLessThanOrEqualTo(String value) {
            addCriterion("dis_address <=", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressLike(String value) {
            addCriterion("dis_address like", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressNotLike(String value) {
            addCriterion("dis_address not like", value, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressIn(List<String> values) {
            addCriterion("dis_address in", values, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressNotIn(List<String> values) {
            addCriterion("dis_address not in", values, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressBetween(String value1, String value2) {
            addCriterion("dis_address between", value1, value2, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisAddressNotBetween(String value1, String value2) {
            addCriterion("dis_address not between", value1, value2, "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisPhoneIsNull() {
            addCriterion("dis_phone is null");
            return (Criteria) this;
        }

        public Criteria andDisPhoneIsNotNull() {
            addCriterion("dis_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDisPhoneEqualTo(String value) {
            addCriterion("dis_phone =", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneNotEqualTo(String value) {
            addCriterion("dis_phone <>", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneGreaterThan(String value) {
            addCriterion("dis_phone >", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("dis_phone >=", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneLessThan(String value) {
            addCriterion("dis_phone <", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneLessThanOrEqualTo(String value) {
            addCriterion("dis_phone <=", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneLike(String value) {
            addCriterion("dis_phone like", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneNotLike(String value) {
            addCriterion("dis_phone not like", value, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneIn(List<String> values) {
            addCriterion("dis_phone in", values, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneNotIn(List<String> values) {
            addCriterion("dis_phone not in", values, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneBetween(String value1, String value2) {
            addCriterion("dis_phone between", value1, value2, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisPhoneNotBetween(String value1, String value2) {
            addCriterion("dis_phone not between", value1, value2, "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisRemarkIsNull() {
            addCriterion("dis_remark is null");
            return (Criteria) this;
        }

        public Criteria andDisRemarkIsNotNull() {
            addCriterion("dis_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDisRemarkEqualTo(String value) {
            addCriterion("dis_remark =", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkNotEqualTo(String value) {
            addCriterion("dis_remark <>", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkGreaterThan(String value) {
            addCriterion("dis_remark >", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("dis_remark >=", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkLessThan(String value) {
            addCriterion("dis_remark <", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkLessThanOrEqualTo(String value) {
            addCriterion("dis_remark <=", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkLike(String value) {
            addCriterion("dis_remark like", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkNotLike(String value) {
            addCriterion("dis_remark not like", value, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkIn(List<String> values) {
            addCriterion("dis_remark in", values, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkNotIn(List<String> values) {
            addCriterion("dis_remark not in", values, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkBetween(String value1, String value2) {
            addCriterion("dis_remark between", value1, value2, "disRemark");
            return (Criteria) this;
        }

        public Criteria andDisRemarkNotBetween(String value1, String value2) {
            addCriterion("dis_remark not between", value1, value2, "disRemark");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
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

        public Criteria andDisIdLikeInsensitive(String value) {
            addCriterion("upper(dis_id) like", value.toUpperCase(), "disId");
            return (Criteria) this;
        }

        public Criteria andDisNameLikeInsensitive(String value) {
            addCriterion("upper(dis_name) like", value.toUpperCase(), "disName");
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

        public Criteria andDisAddressLikeInsensitive(String value) {
            addCriterion("upper(dis_address) like", value.toUpperCase(), "disAddress");
            return (Criteria) this;
        }

        public Criteria andDisPhoneLikeInsensitive(String value) {
            addCriterion("upper(dis_phone) like", value.toUpperCase(), "disPhone");
            return (Criteria) this;
        }

        public Criteria andDisRemarkLikeInsensitive(String value) {
            addCriterion("upper(dis_remark) like", value.toUpperCase(), "disRemark");
            return (Criteria) this;
        }

        public Criteria andAreaLikeInsensitive(String value) {
            addCriterion("upper(area) like", value.toUpperCase(), "area");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andChannelLikeInsensitive(String value) {
            addCriterion("upper(channel) like", value.toUpperCase(), "channel");
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
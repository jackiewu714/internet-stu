package com.cw.stu.internet.tech.common.dao.domain.sm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer logId;

    private String logType;

    private String logTypeRange;

    private String logSerial;

    private String logSerialRange;

    private String operStaffName;

    private String operStaffNameRange;

    private Date operDate;

    private Date operDateRange1;

    private Date operDateRange2;

    private String ipAddress;

    private String ipAddressRange;

    private String macAddress;

    private String macAddressRange;

    private Integer createStaff;

    private Date createDate;

    private Date createDateRange1;

    private Date createDateRange2;

    private String content;

    private String contentRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    public SysLogCriteria() {
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

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getLogTypeRange() {
        return logTypeRange;
    }

    public void setLogTypeRange(String logTypeRange) {
        this.logTypeRange = logTypeRange == null ? null : logTypeRange.trim();
    }

    public String getLogSerial() {
        return logSerial;
    }

    public void setLogSerial(String logSerial) {
        this.logSerial = logSerial == null ? null : logSerial.trim();
    }

    public String getLogSerialRange() {
        return logSerialRange;
    }

    public void setLogSerialRange(String logSerialRange) {
        this.logSerialRange = logSerialRange == null ? null : logSerialRange.trim();
    }

    public String getOperStaffName() {
        return operStaffName;
    }

    public void setOperStaffName(String operStaffName) {
        this.operStaffName = operStaffName == null ? null : operStaffName.trim();
    }

    public String getOperStaffNameRange() {
        return operStaffNameRange;
    }

    public void setOperStaffNameRange(String operStaffNameRange) {
        this.operStaffNameRange = operStaffNameRange == null ? null : operStaffNameRange.trim();
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public Date getOperDateRange1() {
        return operDateRange1;
    }

    public void setOperDateRange1(Date operDateRange1) {
        this.operDateRange1 = operDateRange1;
    }

    public Date getOperDateRange2() {
        return operDateRange2;
    }

    public void setOperDateRange2(Date operDateRange2) {
        this.operDateRange2 = operDateRange2;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getIpAddressRange() {
        return ipAddressRange;
    }

    public void setIpAddressRange(String ipAddressRange) {
        this.ipAddressRange = ipAddressRange == null ? null : ipAddressRange.trim();
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    public String getMacAddressRange() {
        return macAddressRange;
    }

    public void setMacAddressRange(String macAddressRange) {
        this.macAddressRange = macAddressRange == null ? null : macAddressRange.trim();
    }

    public Integer getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Integer createStaff) {
        this.createStaff = createStaff;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDateRange1() {
        return createDateRange1;
    }

    public void setCreateDateRange1(Date createDateRange1) {
        this.createDateRange1 = createDateRange1;
    }

    public Date getCreateDateRange2() {
        return createDateRange2;
    }

    public void setCreateDateRange2(Date createDateRange2) {
        this.createDateRange2 = createDateRange2;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getContentRange() {
        return contentRange;
    }

    public void setContentRange(String contentRange) {
        this.contentRange = contentRange == null ? null : contentRange.trim();
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("log_type like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("log_type not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogSerialIsNull() {
            addCriterion("log_serial is null");
            return (Criteria) this;
        }

        public Criteria andLogSerialIsNotNull() {
            addCriterion("log_serial is not null");
            return (Criteria) this;
        }

        public Criteria andLogSerialEqualTo(String value) {
            addCriterion("log_serial =", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialNotEqualTo(String value) {
            addCriterion("log_serial <>", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialGreaterThan(String value) {
            addCriterion("log_serial >", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialGreaterThanOrEqualTo(String value) {
            addCriterion("log_serial >=", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialLessThan(String value) {
            addCriterion("log_serial <", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialLessThanOrEqualTo(String value) {
            addCriterion("log_serial <=", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialLike(String value) {
            addCriterion("log_serial like", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialNotLike(String value) {
            addCriterion("log_serial not like", value, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialIn(List<String> values) {
            addCriterion("log_serial in", values, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialNotIn(List<String> values) {
            addCriterion("log_serial not in", values, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialBetween(String value1, String value2) {
            addCriterion("log_serial between", value1, value2, "logSerial");
            return (Criteria) this;
        }

        public Criteria andLogSerialNotBetween(String value1, String value2) {
            addCriterion("log_serial not between", value1, value2, "logSerial");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameIsNull() {
            addCriterion("oper_staff_name is null");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameIsNotNull() {
            addCriterion("oper_staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameEqualTo(String value) {
            addCriterion("oper_staff_name =", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameNotEqualTo(String value) {
            addCriterion("oper_staff_name <>", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameGreaterThan(String value) {
            addCriterion("oper_staff_name >", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("oper_staff_name >=", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameLessThan(String value) {
            addCriterion("oper_staff_name <", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameLessThanOrEqualTo(String value) {
            addCriterion("oper_staff_name <=", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameLike(String value) {
            addCriterion("oper_staff_name like", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameNotLike(String value) {
            addCriterion("oper_staff_name not like", value, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameIn(List<String> values) {
            addCriterion("oper_staff_name in", values, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameNotIn(List<String> values) {
            addCriterion("oper_staff_name not in", values, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameBetween(String value1, String value2) {
            addCriterion("oper_staff_name between", value1, value2, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperStaffNameNotBetween(String value1, String value2) {
            addCriterion("oper_staff_name not between", value1, value2, "operStaffName");
            return (Criteria) this;
        }

        public Criteria andOperDateIsNull() {
            addCriterion("oper_date is null");
            return (Criteria) this;
        }

        public Criteria andOperDateIsNotNull() {
            addCriterion("oper_date is not null");
            return (Criteria) this;
        }

        public Criteria andOperDateEqualTo(Date value) {
            addCriterion("oper_date =", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotEqualTo(Date value) {
            addCriterion("oper_date <>", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateGreaterThan(Date value) {
            addCriterion("oper_date >", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateGreaterThanOrEqualTo(Date value) {
            addCriterion("oper_date >=", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateLessThan(Date value) {
            addCriterion("oper_date <", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateLessThanOrEqualTo(Date value) {
            addCriterion("oper_date <=", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateIn(List<Date> values) {
            addCriterion("oper_date in", values, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotIn(List<Date> values) {
            addCriterion("oper_date not in", values, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateBetween(Date value1, Date value2) {
            addCriterion("oper_date between", value1, value2, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotBetween(Date value1, Date value2) {
            addCriterion("oper_date not between", value1, value2, "operDate");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNull() {
            addCriterion("mac_address is null");
            return (Criteria) this;
        }

        public Criteria andMacAddressIsNotNull() {
            addCriterion("mac_address is not null");
            return (Criteria) this;
        }

        public Criteria andMacAddressEqualTo(String value) {
            addCriterion("mac_address =", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotEqualTo(String value) {
            addCriterion("mac_address <>", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThan(String value) {
            addCriterion("mac_address >", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressGreaterThanOrEqualTo(String value) {
            addCriterion("mac_address >=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThan(String value) {
            addCriterion("mac_address <", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLessThanOrEqualTo(String value) {
            addCriterion("mac_address <=", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressLike(String value) {
            addCriterion("mac_address like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotLike(String value) {
            addCriterion("mac_address not like", value, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressIn(List<String> values) {
            addCriterion("mac_address in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotIn(List<String> values) {
            addCriterion("mac_address not in", values, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressBetween(String value1, String value2) {
            addCriterion("mac_address between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andMacAddressNotBetween(String value1, String value2) {
            addCriterion("mac_address not between", value1, value2, "macAddress");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNull() {
            addCriterion("create_staff is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNotNull() {
            addCriterion("create_staff is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffEqualTo(Integer value) {
            addCriterion("create_staff =", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotEqualTo(Integer value) {
            addCriterion("create_staff <>", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThan(Integer value) {
            addCriterion("create_staff >", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_staff >=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThan(Integer value) {
            addCriterion("create_staff <", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThanOrEqualTo(Integer value) {
            addCriterion("create_staff <=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIn(List<Integer> values) {
            addCriterion("create_staff in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotIn(List<Integer> values) {
            addCriterion("create_staff not in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffBetween(Integer value1, Integer value2) {
            addCriterion("create_staff between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotBetween(Integer value1, Integer value2) {
            addCriterion("create_staff not between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andLogTypeLikeInsensitive(String value) {
            addCriterion("upper(log_type) like", value.toUpperCase(), "logType");
            return this;
        }

        public Criteria andLogSerialLikeInsensitive(String value) {
            addCriterion("upper(log_serial) like", value.toUpperCase(), "logSerial");
            return this;
        }

        public Criteria andOperStaffNameLikeInsensitive(String value) {
            addCriterion("upper(oper_staff_name) like", value.toUpperCase(), "operStaffName");
            return this;
        }

        public Criteria andIpAddressLikeInsensitive(String value) {
            addCriterion("upper(ip_address) like", value.toUpperCase(), "ipAddress");
            return this;
        }

        public Criteria andMacAddressLikeInsensitive(String value) {
            addCriterion("upper(mac_address) like", value.toUpperCase(), "macAddress");
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
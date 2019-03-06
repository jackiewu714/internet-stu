package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailySaleReportCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String reportId;

    private String reportIdRange;

    private Integer reportType;

    private Date reportTime;

    private Date reportTimeRange1;

    private Date reportTimeRange2;

    private String reportSaler;

    private String reportSalerRange;

    private Integer reportIsSend;

    private Integer reportIsPaid;

    private String reportLocation;

    private String reportLocationRange;

    private String reportClient;

    private String reportClientRange;

    private String reportProductName;

    private String reportProductNameRange;

    private String reportProductId;

    private String reportProductIdRange;

    private Integer reportQuantity;

    private Float reportWeight;

    private Float reportPrice;

    private Float reportAmount;

    private String reportComment;

    private String reportCommentRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public DailySaleReportCriteria() {
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

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    public String getReportIdRange() {
        return reportIdRange;
    }

    public void setReportIdRange(String reportIdRange) {
        this.reportIdRange = reportIdRange == null ? null : reportIdRange.trim();
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getReportTimeRange1() {
        return reportTimeRange1;
    }

    public void setReportTimeRange1(Date reportTimeRange1) {
        this.reportTimeRange1 = reportTimeRange1;
    }

    public Date getReportTimeRange2() {
        return reportTimeRange2;
    }

    public void setReportTimeRange2(Date reportTimeRange2) {
        this.reportTimeRange2 = reportTimeRange2;
    }

    public String getReportSaler() {
        return reportSaler;
    }

    public void setReportSaler(String reportSaler) {
        this.reportSaler = reportSaler == null ? null : reportSaler.trim();
    }

    public String getReportSalerRange() {
        return reportSalerRange;
    }

    public void setReportSalerRange(String reportSalerRange) {
        this.reportSalerRange = reportSalerRange == null ? null : reportSalerRange.trim();
    }

    public Integer getReportIsSend() {
        return reportIsSend;
    }

    public void setReportIsSend(Integer reportIsSend) {
        this.reportIsSend = reportIsSend;
    }

    public Integer getReportIsPaid() {
        return reportIsPaid;
    }

    public void setReportIsPaid(Integer reportIsPaid) {
        this.reportIsPaid = reportIsPaid;
    }

    public String getReportLocation() {
        return reportLocation;
    }

    public void setReportLocation(String reportLocation) {
        this.reportLocation = reportLocation == null ? null : reportLocation.trim();
    }

    public String getReportLocationRange() {
        return reportLocationRange;
    }

    public void setReportLocationRange(String reportLocationRange) {
        this.reportLocationRange = reportLocationRange == null ? null : reportLocationRange.trim();
    }

    public String getReportClient() {
        return reportClient;
    }

    public void setReportClient(String reportClient) {
        this.reportClient = reportClient == null ? null : reportClient.trim();
    }

    public String getReportClientRange() {
        return reportClientRange;
    }

    public void setReportClientRange(String reportClientRange) {
        this.reportClientRange = reportClientRange == null ? null : reportClientRange.trim();
    }

    public String getReportProductName() {
        return reportProductName;
    }

    public void setReportProductName(String reportProductName) {
        this.reportProductName = reportProductName == null ? null : reportProductName.trim();
    }

    public String getReportProductNameRange() {
        return reportProductNameRange;
    }

    public void setReportProductNameRange(String reportProductNameRange) {
        this.reportProductNameRange = reportProductNameRange == null ? null : reportProductNameRange.trim();
    }

    public String getReportProductId() {
        return reportProductId;
    }

    public void setReportProductId(String reportProductId) {
        this.reportProductId = reportProductId == null ? null : reportProductId.trim();
    }

    public String getReportProductIdRange() {
        return reportProductIdRange;
    }

    public void setReportProductIdRange(String reportProductIdRange) {
        this.reportProductIdRange = reportProductIdRange == null ? null : reportProductIdRange.trim();
    }

    public Integer getReportQuantity() {
        return reportQuantity;
    }

    public void setReportQuantity(Integer reportQuantity) {
        this.reportQuantity = reportQuantity;
    }

    public Float getReportWeight() {
        return reportWeight;
    }

    public void setReportWeight(Float reportWeight) {
        this.reportWeight = reportWeight;
    }

    public Float getReportPrice() {
        return reportPrice;
    }

    public void setReportPrice(Float reportPrice) {
        this.reportPrice = reportPrice;
    }

    public Float getReportAmount() {
        return reportAmount;
    }

    public void setReportAmount(Float reportAmount) {
        this.reportAmount = reportAmount;
    }

    public String getReportComment() {
        return reportComment;
    }

    public void setReportComment(String reportComment) {
        this.reportComment = reportComment == null ? null : reportComment.trim();
    }

    public String getReportCommentRange() {
        return reportCommentRange;
    }

    public void setReportCommentRange(String reportCommentRange) {
        this.reportCommentRange = reportCommentRange == null ? null : reportCommentRange.trim();
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("report_id like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("report_id not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(Integer value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(Integer value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(Integer value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(Integer value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<Integer> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<Integer> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(Integer value1, Integer value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(Date value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(Date value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(Date value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(Date value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(Date value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<Date> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<Date> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(Date value1, Date value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(Date value1, Date value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportSalerIsNull() {
            addCriterion("report_saler is null");
            return (Criteria) this;
        }

        public Criteria andReportSalerIsNotNull() {
            addCriterion("report_saler is not null");
            return (Criteria) this;
        }

        public Criteria andReportSalerEqualTo(String value) {
            addCriterion("report_saler =", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerNotEqualTo(String value) {
            addCriterion("report_saler <>", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerGreaterThan(String value) {
            addCriterion("report_saler >", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerGreaterThanOrEqualTo(String value) {
            addCriterion("report_saler >=", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerLessThan(String value) {
            addCriterion("report_saler <", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerLessThanOrEqualTo(String value) {
            addCriterion("report_saler <=", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerLike(String value) {
            addCriterion("report_saler like", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerNotLike(String value) {
            addCriterion("report_saler not like", value, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerIn(List<String> values) {
            addCriterion("report_saler in", values, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerNotIn(List<String> values) {
            addCriterion("report_saler not in", values, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerBetween(String value1, String value2) {
            addCriterion("report_saler between", value1, value2, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportSalerNotBetween(String value1, String value2) {
            addCriterion("report_saler not between", value1, value2, "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportIsSendIsNull() {
            addCriterion("report_is_send is null");
            return (Criteria) this;
        }

        public Criteria andReportIsSendIsNotNull() {
            addCriterion("report_is_send is not null");
            return (Criteria) this;
        }

        public Criteria andReportIsSendEqualTo(Integer value) {
            addCriterion("report_is_send =", value, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendNotEqualTo(Integer value) {
            addCriterion("report_is_send <>", value, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendGreaterThan(Integer value) {
            addCriterion("report_is_send >", value, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_is_send >=", value, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendLessThan(Integer value) {
            addCriterion("report_is_send <", value, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendLessThanOrEqualTo(Integer value) {
            addCriterion("report_is_send <=", value, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendIn(List<Integer> values) {
            addCriterion("report_is_send in", values, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendNotIn(List<Integer> values) {
            addCriterion("report_is_send not in", values, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendBetween(Integer value1, Integer value2) {
            addCriterion("report_is_send between", value1, value2, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsSendNotBetween(Integer value1, Integer value2) {
            addCriterion("report_is_send not between", value1, value2, "reportIsSend");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidIsNull() {
            addCriterion("report_is_paid is null");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidIsNotNull() {
            addCriterion("report_is_paid is not null");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidEqualTo(Integer value) {
            addCriterion("report_is_paid =", value, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidNotEqualTo(Integer value) {
            addCriterion("report_is_paid <>", value, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidGreaterThan(Integer value) {
            addCriterion("report_is_paid >", value, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_is_paid >=", value, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidLessThan(Integer value) {
            addCriterion("report_is_paid <", value, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidLessThanOrEqualTo(Integer value) {
            addCriterion("report_is_paid <=", value, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidIn(List<Integer> values) {
            addCriterion("report_is_paid in", values, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidNotIn(List<Integer> values) {
            addCriterion("report_is_paid not in", values, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidBetween(Integer value1, Integer value2) {
            addCriterion("report_is_paid between", value1, value2, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportIsPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("report_is_paid not between", value1, value2, "reportIsPaid");
            return (Criteria) this;
        }

        public Criteria andReportLocationIsNull() {
            addCriterion("report_location is null");
            return (Criteria) this;
        }

        public Criteria andReportLocationIsNotNull() {
            addCriterion("report_location is not null");
            return (Criteria) this;
        }

        public Criteria andReportLocationEqualTo(String value) {
            addCriterion("report_location =", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotEqualTo(String value) {
            addCriterion("report_location <>", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationGreaterThan(String value) {
            addCriterion("report_location >", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationGreaterThanOrEqualTo(String value) {
            addCriterion("report_location >=", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationLessThan(String value) {
            addCriterion("report_location <", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationLessThanOrEqualTo(String value) {
            addCriterion("report_location <=", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationLike(String value) {
            addCriterion("report_location like", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotLike(String value) {
            addCriterion("report_location not like", value, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationIn(List<String> values) {
            addCriterion("report_location in", values, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotIn(List<String> values) {
            addCriterion("report_location not in", values, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationBetween(String value1, String value2) {
            addCriterion("report_location between", value1, value2, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportLocationNotBetween(String value1, String value2) {
            addCriterion("report_location not between", value1, value2, "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportClientIsNull() {
            addCriterion("report_client is null");
            return (Criteria) this;
        }

        public Criteria andReportClientIsNotNull() {
            addCriterion("report_client is not null");
            return (Criteria) this;
        }

        public Criteria andReportClientEqualTo(String value) {
            addCriterion("report_client =", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientNotEqualTo(String value) {
            addCriterion("report_client <>", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientGreaterThan(String value) {
            addCriterion("report_client >", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientGreaterThanOrEqualTo(String value) {
            addCriterion("report_client >=", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientLessThan(String value) {
            addCriterion("report_client <", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientLessThanOrEqualTo(String value) {
            addCriterion("report_client <=", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientLike(String value) {
            addCriterion("report_client like", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientNotLike(String value) {
            addCriterion("report_client not like", value, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientIn(List<String> values) {
            addCriterion("report_client in", values, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientNotIn(List<String> values) {
            addCriterion("report_client not in", values, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientBetween(String value1, String value2) {
            addCriterion("report_client between", value1, value2, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportClientNotBetween(String value1, String value2) {
            addCriterion("report_client not between", value1, value2, "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportProductNameIsNull() {
            addCriterion("report_product_name is null");
            return (Criteria) this;
        }

        public Criteria andReportProductNameIsNotNull() {
            addCriterion("report_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportProductNameEqualTo(String value) {
            addCriterion("report_product_name =", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameNotEqualTo(String value) {
            addCriterion("report_product_name <>", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameGreaterThan(String value) {
            addCriterion("report_product_name >", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_product_name >=", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameLessThan(String value) {
            addCriterion("report_product_name <", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameLessThanOrEqualTo(String value) {
            addCriterion("report_product_name <=", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameLike(String value) {
            addCriterion("report_product_name like", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameNotLike(String value) {
            addCriterion("report_product_name not like", value, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameIn(List<String> values) {
            addCriterion("report_product_name in", values, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameNotIn(List<String> values) {
            addCriterion("report_product_name not in", values, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameBetween(String value1, String value2) {
            addCriterion("report_product_name between", value1, value2, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductNameNotBetween(String value1, String value2) {
            addCriterion("report_product_name not between", value1, value2, "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductIdIsNull() {
            addCriterion("report_product_id is null");
            return (Criteria) this;
        }

        public Criteria andReportProductIdIsNotNull() {
            addCriterion("report_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportProductIdEqualTo(String value) {
            addCriterion("report_product_id =", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdNotEqualTo(String value) {
            addCriterion("report_product_id <>", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdGreaterThan(String value) {
            addCriterion("report_product_id >", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_product_id >=", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdLessThan(String value) {
            addCriterion("report_product_id <", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdLessThanOrEqualTo(String value) {
            addCriterion("report_product_id <=", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdLike(String value) {
            addCriterion("report_product_id like", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdNotLike(String value) {
            addCriterion("report_product_id not like", value, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdIn(List<String> values) {
            addCriterion("report_product_id in", values, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdNotIn(List<String> values) {
            addCriterion("report_product_id not in", values, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdBetween(String value1, String value2) {
            addCriterion("report_product_id between", value1, value2, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportProductIdNotBetween(String value1, String value2) {
            addCriterion("report_product_id not between", value1, value2, "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportQuantityIsNull() {
            addCriterion("report_quantity is null");
            return (Criteria) this;
        }

        public Criteria andReportQuantityIsNotNull() {
            addCriterion("report_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andReportQuantityEqualTo(Integer value) {
            addCriterion("report_quantity =", value, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityNotEqualTo(Integer value) {
            addCriterion("report_quantity <>", value, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityGreaterThan(Integer value) {
            addCriterion("report_quantity >", value, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_quantity >=", value, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityLessThan(Integer value) {
            addCriterion("report_quantity <", value, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("report_quantity <=", value, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityIn(List<Integer> values) {
            addCriterion("report_quantity in", values, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityNotIn(List<Integer> values) {
            addCriterion("report_quantity not in", values, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityBetween(Integer value1, Integer value2) {
            addCriterion("report_quantity between", value1, value2, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("report_quantity not between", value1, value2, "reportQuantity");
            return (Criteria) this;
        }

        public Criteria andReportWeightIsNull() {
            addCriterion("report_weight is null");
            return (Criteria) this;
        }

        public Criteria andReportWeightIsNotNull() {
            addCriterion("report_weight is not null");
            return (Criteria) this;
        }

        public Criteria andReportWeightEqualTo(Float value) {
            addCriterion("report_weight =", value, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightNotEqualTo(Float value) {
            addCriterion("report_weight <>", value, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightGreaterThan(Float value) {
            addCriterion("report_weight >", value, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("report_weight >=", value, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightLessThan(Float value) {
            addCriterion("report_weight <", value, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightLessThanOrEqualTo(Float value) {
            addCriterion("report_weight <=", value, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightIn(List<Float> values) {
            addCriterion("report_weight in", values, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightNotIn(List<Float> values) {
            addCriterion("report_weight not in", values, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightBetween(Float value1, Float value2) {
            addCriterion("report_weight between", value1, value2, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportWeightNotBetween(Float value1, Float value2) {
            addCriterion("report_weight not between", value1, value2, "reportWeight");
            return (Criteria) this;
        }

        public Criteria andReportPriceIsNull() {
            addCriterion("report_price is null");
            return (Criteria) this;
        }

        public Criteria andReportPriceIsNotNull() {
            addCriterion("report_price is not null");
            return (Criteria) this;
        }

        public Criteria andReportPriceEqualTo(Float value) {
            addCriterion("report_price =", value, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceNotEqualTo(Float value) {
            addCriterion("report_price <>", value, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceGreaterThan(Float value) {
            addCriterion("report_price >", value, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("report_price >=", value, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceLessThan(Float value) {
            addCriterion("report_price <", value, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceLessThanOrEqualTo(Float value) {
            addCriterion("report_price <=", value, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceIn(List<Float> values) {
            addCriterion("report_price in", values, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceNotIn(List<Float> values) {
            addCriterion("report_price not in", values, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceBetween(Float value1, Float value2) {
            addCriterion("report_price between", value1, value2, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportPriceNotBetween(Float value1, Float value2) {
            addCriterion("report_price not between", value1, value2, "reportPrice");
            return (Criteria) this;
        }

        public Criteria andReportAmountIsNull() {
            addCriterion("report_amount is null");
            return (Criteria) this;
        }

        public Criteria andReportAmountIsNotNull() {
            addCriterion("report_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReportAmountEqualTo(Float value) {
            addCriterion("report_amount =", value, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountNotEqualTo(Float value) {
            addCriterion("report_amount <>", value, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountGreaterThan(Float value) {
            addCriterion("report_amount >", value, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("report_amount >=", value, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountLessThan(Float value) {
            addCriterion("report_amount <", value, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountLessThanOrEqualTo(Float value) {
            addCriterion("report_amount <=", value, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountIn(List<Float> values) {
            addCriterion("report_amount in", values, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountNotIn(List<Float> values) {
            addCriterion("report_amount not in", values, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountBetween(Float value1, Float value2) {
            addCriterion("report_amount between", value1, value2, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportAmountNotBetween(Float value1, Float value2) {
            addCriterion("report_amount not between", value1, value2, "reportAmount");
            return (Criteria) this;
        }

        public Criteria andReportCommentIsNull() {
            addCriterion("report_comment is null");
            return (Criteria) this;
        }

        public Criteria andReportCommentIsNotNull() {
            addCriterion("report_comment is not null");
            return (Criteria) this;
        }

        public Criteria andReportCommentEqualTo(String value) {
            addCriterion("report_comment =", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotEqualTo(String value) {
            addCriterion("report_comment <>", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentGreaterThan(String value) {
            addCriterion("report_comment >", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentGreaterThanOrEqualTo(String value) {
            addCriterion("report_comment >=", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentLessThan(String value) {
            addCriterion("report_comment <", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentLessThanOrEqualTo(String value) {
            addCriterion("report_comment <=", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentLike(String value) {
            addCriterion("report_comment like", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotLike(String value) {
            addCriterion("report_comment not like", value, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentIn(List<String> values) {
            addCriterion("report_comment in", values, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotIn(List<String> values) {
            addCriterion("report_comment not in", values, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentBetween(String value1, String value2) {
            addCriterion("report_comment between", value1, value2, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportCommentNotBetween(String value1, String value2) {
            addCriterion("report_comment not between", value1, value2, "reportComment");
            return (Criteria) this;
        }

        public Criteria andReportIdLikeInsensitive(String value) {
            addCriterion("upper(report_id) like", value.toUpperCase(), "reportId");
            return (Criteria) this;
        }

        public Criteria andReportSalerLikeInsensitive(String value) {
            addCriterion("upper(report_saler) like", value.toUpperCase(), "reportSaler");
            return (Criteria) this;
        }

        public Criteria andReportLocationLikeInsensitive(String value) {
            addCriterion("upper(report_location) like", value.toUpperCase(), "reportLocation");
            return (Criteria) this;
        }

        public Criteria andReportClientLikeInsensitive(String value) {
            addCriterion("upper(report_client) like", value.toUpperCase(), "reportClient");
            return (Criteria) this;
        }

        public Criteria andReportProductNameLikeInsensitive(String value) {
            addCriterion("upper(report_product_name) like", value.toUpperCase(), "reportProductName");
            return (Criteria) this;
        }

        public Criteria andReportProductIdLikeInsensitive(String value) {
            addCriterion("upper(report_product_id) like", value.toUpperCase(), "reportProductId");
            return (Criteria) this;
        }

        public Criteria andReportCommentLikeInsensitive(String value) {
            addCriterion("upper(report_comment) like", value.toUpperCase(), "reportComment");
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
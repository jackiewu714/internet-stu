package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyBackFundReportCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private String reportId;

    private String reportIdRange;

    private String reportBankName;

    private String reportBankNameRange;

    private String reportSummary;

    private String reportSummaryRange;

    private Date reportTime;

    private Date reportTimeRange1;

    private Date reportTimeRange2;

    private String reportLend;

    private String reportLendRange;

    private String reportBorrow;

    private String reportBorrowRange;

    private BigDecimal reportBalance;

    private String reportComment;

    private String reportCommentRange;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public DailyBackFundReportCriteria() {
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

    public String getReportBankName() {
        return reportBankName;
    }

    public void setReportBankName(String reportBankName) {
        this.reportBankName = reportBankName == null ? null : reportBankName.trim();
    }

    public String getReportBankNameRange() {
        return reportBankNameRange;
    }

    public void setReportBankNameRange(String reportBankNameRange) {
        this.reportBankNameRange = reportBankNameRange == null ? null : reportBankNameRange.trim();
    }

    public String getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(String reportSummary) {
        this.reportSummary = reportSummary == null ? null : reportSummary.trim();
    }

    public String getReportSummaryRange() {
        return reportSummaryRange;
    }

    public void setReportSummaryRange(String reportSummaryRange) {
        this.reportSummaryRange = reportSummaryRange == null ? null : reportSummaryRange.trim();
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

    public String getReportLend() {
        return reportLend;
    }

    public void setReportLend(String reportLend) {
        this.reportLend = reportLend == null ? null : reportLend.trim();
    }

    public String getReportLendRange() {
        return reportLendRange;
    }

    public void setReportLendRange(String reportLendRange) {
        this.reportLendRange = reportLendRange == null ? null : reportLendRange.trim();
    }

    public String getReportBorrow() {
        return reportBorrow;
    }

    public void setReportBorrow(String reportBorrow) {
        this.reportBorrow = reportBorrow == null ? null : reportBorrow.trim();
    }

    public String getReportBorrowRange() {
        return reportBorrowRange;
    }

    public void setReportBorrowRange(String reportBorrowRange) {
        this.reportBorrowRange = reportBorrowRange == null ? null : reportBorrowRange.trim();
    }

    public BigDecimal getReportBalance() {
        return reportBalance;
    }

    public void setReportBalance(BigDecimal reportBalance) {
        this.reportBalance = reportBalance;
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

        public Criteria andReportBankNameIsNull() {
            addCriterion("report_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andReportBankNameIsNotNull() {
            addCriterion("report_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportBankNameEqualTo(String value) {
            addCriterion("report_bank_name =", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameNotEqualTo(String value) {
            addCriterion("report_bank_name <>", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameGreaterThan(String value) {
            addCriterion("report_bank_name >", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_bank_name >=", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameLessThan(String value) {
            addCriterion("report_bank_name <", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameLessThanOrEqualTo(String value) {
            addCriterion("report_bank_name <=", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameLike(String value) {
            addCriterion("report_bank_name like", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameNotLike(String value) {
            addCriterion("report_bank_name not like", value, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameIn(List<String> values) {
            addCriterion("report_bank_name in", values, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameNotIn(List<String> values) {
            addCriterion("report_bank_name not in", values, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameBetween(String value1, String value2) {
            addCriterion("report_bank_name between", value1, value2, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportBankNameNotBetween(String value1, String value2) {
            addCriterion("report_bank_name not between", value1, value2, "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportSummaryIsNull() {
            addCriterion("report_summary is null");
            return (Criteria) this;
        }

        public Criteria andReportSummaryIsNotNull() {
            addCriterion("report_summary is not null");
            return (Criteria) this;
        }

        public Criteria andReportSummaryEqualTo(String value) {
            addCriterion("report_summary =", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotEqualTo(String value) {
            addCriterion("report_summary <>", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryGreaterThan(String value) {
            addCriterion("report_summary >", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("report_summary >=", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryLessThan(String value) {
            addCriterion("report_summary <", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryLessThanOrEqualTo(String value) {
            addCriterion("report_summary <=", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryLike(String value) {
            addCriterion("report_summary like", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotLike(String value) {
            addCriterion("report_summary not like", value, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryIn(List<String> values) {
            addCriterion("report_summary in", values, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotIn(List<String> values) {
            addCriterion("report_summary not in", values, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryBetween(String value1, String value2) {
            addCriterion("report_summary between", value1, value2, "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportSummaryNotBetween(String value1, String value2) {
            addCriterion("report_summary not between", value1, value2, "reportSummary");
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

        public Criteria andReportLendIsNull() {
            addCriterion("report_lend is null");
            return (Criteria) this;
        }

        public Criteria andReportLendIsNotNull() {
            addCriterion("report_lend is not null");
            return (Criteria) this;
        }

        public Criteria andReportLendEqualTo(String value) {
            addCriterion("report_lend =", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendNotEqualTo(String value) {
            addCriterion("report_lend <>", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendGreaterThan(String value) {
            addCriterion("report_lend >", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendGreaterThanOrEqualTo(String value) {
            addCriterion("report_lend >=", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendLessThan(String value) {
            addCriterion("report_lend <", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendLessThanOrEqualTo(String value) {
            addCriterion("report_lend <=", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendLike(String value) {
            addCriterion("report_lend like", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendNotLike(String value) {
            addCriterion("report_lend not like", value, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendIn(List<String> values) {
            addCriterion("report_lend in", values, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendNotIn(List<String> values) {
            addCriterion("report_lend not in", values, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendBetween(String value1, String value2) {
            addCriterion("report_lend between", value1, value2, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportLendNotBetween(String value1, String value2) {
            addCriterion("report_lend not between", value1, value2, "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportBorrowIsNull() {
            addCriterion("report_borrow is null");
            return (Criteria) this;
        }

        public Criteria andReportBorrowIsNotNull() {
            addCriterion("report_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andReportBorrowEqualTo(String value) {
            addCriterion("report_borrow =", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowNotEqualTo(String value) {
            addCriterion("report_borrow <>", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowGreaterThan(String value) {
            addCriterion("report_borrow >", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowGreaterThanOrEqualTo(String value) {
            addCriterion("report_borrow >=", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowLessThan(String value) {
            addCriterion("report_borrow <", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowLessThanOrEqualTo(String value) {
            addCriterion("report_borrow <=", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowLike(String value) {
            addCriterion("report_borrow like", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowNotLike(String value) {
            addCriterion("report_borrow not like", value, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowIn(List<String> values) {
            addCriterion("report_borrow in", values, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowNotIn(List<String> values) {
            addCriterion("report_borrow not in", values, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowBetween(String value1, String value2) {
            addCriterion("report_borrow between", value1, value2, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBorrowNotBetween(String value1, String value2) {
            addCriterion("report_borrow not between", value1, value2, "reportBorrow");
            return (Criteria) this;
        }

        public Criteria andReportBalanceIsNull() {
            addCriterion("report_balance is null");
            return (Criteria) this;
        }

        public Criteria andReportBalanceIsNotNull() {
            addCriterion("report_balance is not null");
            return (Criteria) this;
        }

        public Criteria andReportBalanceEqualTo(BigDecimal value) {
            addCriterion("report_balance =", value, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceNotEqualTo(BigDecimal value) {
            addCriterion("report_balance <>", value, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceGreaterThan(BigDecimal value) {
            addCriterion("report_balance >", value, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("report_balance >=", value, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceLessThan(BigDecimal value) {
            addCriterion("report_balance <", value, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("report_balance <=", value, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceIn(List<BigDecimal> values) {
            addCriterion("report_balance in", values, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceNotIn(List<BigDecimal> values) {
            addCriterion("report_balance not in", values, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("report_balance between", value1, value2, "reportBalance");
            return (Criteria) this;
        }

        public Criteria andReportBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("report_balance not between", value1, value2, "reportBalance");
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

        public Criteria andReportBankNameLikeInsensitive(String value) {
            addCriterion("upper(report_bank_name) like", value.toUpperCase(), "reportBankName");
            return (Criteria) this;
        }

        public Criteria andReportSummaryLikeInsensitive(String value) {
            addCriterion("upper(report_summary) like", value.toUpperCase(), "reportSummary");
            return (Criteria) this;
        }

        public Criteria andReportLendLikeInsensitive(String value) {
            addCriterion("upper(report_lend) like", value.toUpperCase(), "reportLend");
            return (Criteria) this;
        }

        public Criteria andReportBorrowLikeInsensitive(String value) {
            addCriterion("upper(report_borrow) like", value.toUpperCase(), "reportBorrow");
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
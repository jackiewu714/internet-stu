package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DailyBackFundReport implements Serializable {
    private String reportId;

    private String reportBankName;

    private String reportSummary;

    private Date reportTime;

    private String reportLend;

    private String reportBorrow;

    private BigDecimal reportBalance;

    private String reportComment;

    private static final long serialVersionUID = 1L;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    public String getReportBankName() {
        return reportBankName;
    }

    public void setReportBankName(String reportBankName) {
        this.reportBankName = reportBankName == null ? null : reportBankName.trim();
    }

    public String getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(String reportSummary) {
        this.reportSummary = reportSummary == null ? null : reportSummary.trim();
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportLend() {
        return reportLend;
    }

    public void setReportLend(String reportLend) {
        this.reportLend = reportLend == null ? null : reportLend.trim();
    }

    public String getReportBorrow() {
        return reportBorrow;
    }

    public void setReportBorrow(String reportBorrow) {
        this.reportBorrow = reportBorrow == null ? null : reportBorrow.trim();
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DailyBackFundReport other = (DailyBackFundReport) that;
        return (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getReportBankName() == null ? other.getReportBankName() == null : this.getReportBankName().equals(other.getReportBankName()))
            && (this.getReportSummary() == null ? other.getReportSummary() == null : this.getReportSummary().equals(other.getReportSummary()))
            && (this.getReportTime() == null ? other.getReportTime() == null : this.getReportTime().equals(other.getReportTime()))
            && (this.getReportLend() == null ? other.getReportLend() == null : this.getReportLend().equals(other.getReportLend()))
            && (this.getReportBorrow() == null ? other.getReportBorrow() == null : this.getReportBorrow().equals(other.getReportBorrow()))
            && (this.getReportBalance() == null ? other.getReportBalance() == null : this.getReportBalance().equals(other.getReportBalance()))
            && (this.getReportComment() == null ? other.getReportComment() == null : this.getReportComment().equals(other.getReportComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getReportBankName() == null) ? 0 : getReportBankName().hashCode());
        result = prime * result + ((getReportSummary() == null) ? 0 : getReportSummary().hashCode());
        result = prime * result + ((getReportTime() == null) ? 0 : getReportTime().hashCode());
        result = prime * result + ((getReportLend() == null) ? 0 : getReportLend().hashCode());
        result = prime * result + ((getReportBorrow() == null) ? 0 : getReportBorrow().hashCode());
        result = prime * result + ((getReportBalance() == null) ? 0 : getReportBalance().hashCode());
        result = prime * result + ((getReportComment() == null) ? 0 : getReportComment().hashCode());
        return result;
    }
}
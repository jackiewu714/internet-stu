package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class DailySaleReport implements Serializable {
    private String reportId;

    private Integer reportType;

    private Date reportTime;

    private String reportSaler;

    private Integer reportIsSend;

    private Integer reportIsPaid;

    private String reportLocation;

    private String reportClient;

    private String reportProductName;

    private String reportProductId;

    private Integer reportQuantity;

    private Float reportWeight;

    private Float reportPrice;

    private Float reportAmount;

    private String reportComment;

    private static final long serialVersionUID = 1L;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
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

    public String getReportSaler() {
        return reportSaler;
    }

    public void setReportSaler(String reportSaler) {
        this.reportSaler = reportSaler == null ? null : reportSaler.trim();
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

    public String getReportClient() {
        return reportClient;
    }

    public void setReportClient(String reportClient) {
        this.reportClient = reportClient == null ? null : reportClient.trim();
    }

    public String getReportProductName() {
        return reportProductName;
    }

    public void setReportProductName(String reportProductName) {
        this.reportProductName = reportProductName == null ? null : reportProductName.trim();
    }

    public String getReportProductId() {
        return reportProductId;
    }

    public void setReportProductId(String reportProductId) {
        this.reportProductId = reportProductId == null ? null : reportProductId.trim();
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
        DailySaleReport other = (DailySaleReport) that;
        return (this.getReportId() == null ? other.getReportId() == null : this.getReportId().equals(other.getReportId()))
            && (this.getReportType() == null ? other.getReportType() == null : this.getReportType().equals(other.getReportType()))
            && (this.getReportTime() == null ? other.getReportTime() == null : this.getReportTime().equals(other.getReportTime()))
            && (this.getReportSaler() == null ? other.getReportSaler() == null : this.getReportSaler().equals(other.getReportSaler()))
            && (this.getReportIsSend() == null ? other.getReportIsSend() == null : this.getReportIsSend().equals(other.getReportIsSend()))
            && (this.getReportIsPaid() == null ? other.getReportIsPaid() == null : this.getReportIsPaid().equals(other.getReportIsPaid()))
            && (this.getReportLocation() == null ? other.getReportLocation() == null : this.getReportLocation().equals(other.getReportLocation()))
            && (this.getReportClient() == null ? other.getReportClient() == null : this.getReportClient().equals(other.getReportClient()))
            && (this.getReportProductName() == null ? other.getReportProductName() == null : this.getReportProductName().equals(other.getReportProductName()))
            && (this.getReportProductId() == null ? other.getReportProductId() == null : this.getReportProductId().equals(other.getReportProductId()))
            && (this.getReportQuantity() == null ? other.getReportQuantity() == null : this.getReportQuantity().equals(other.getReportQuantity()))
            && (this.getReportWeight() == null ? other.getReportWeight() == null : this.getReportWeight().equals(other.getReportWeight()))
            && (this.getReportPrice() == null ? other.getReportPrice() == null : this.getReportPrice().equals(other.getReportPrice()))
            && (this.getReportAmount() == null ? other.getReportAmount() == null : this.getReportAmount().equals(other.getReportAmount()))
            && (this.getReportComment() == null ? other.getReportComment() == null : this.getReportComment().equals(other.getReportComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReportId() == null) ? 0 : getReportId().hashCode());
        result = prime * result + ((getReportType() == null) ? 0 : getReportType().hashCode());
        result = prime * result + ((getReportTime() == null) ? 0 : getReportTime().hashCode());
        result = prime * result + ((getReportSaler() == null) ? 0 : getReportSaler().hashCode());
        result = prime * result + ((getReportIsSend() == null) ? 0 : getReportIsSend().hashCode());
        result = prime * result + ((getReportIsPaid() == null) ? 0 : getReportIsPaid().hashCode());
        result = prime * result + ((getReportLocation() == null) ? 0 : getReportLocation().hashCode());
        result = prime * result + ((getReportClient() == null) ? 0 : getReportClient().hashCode());
        result = prime * result + ((getReportProductName() == null) ? 0 : getReportProductName().hashCode());
        result = prime * result + ((getReportProductId() == null) ? 0 : getReportProductId().hashCode());
        result = prime * result + ((getReportQuantity() == null) ? 0 : getReportQuantity().hashCode());
        result = prime * result + ((getReportWeight() == null) ? 0 : getReportWeight().hashCode());
        result = prime * result + ((getReportPrice() == null) ? 0 : getReportPrice().hashCode());
        result = prime * result + ((getReportAmount() == null) ? 0 : getReportAmount().hashCode());
        result = prime * result + ((getReportComment() == null) ? 0 : getReportComment().hashCode());
        return result;
    }
}
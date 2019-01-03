package com.rhtop.buss.common.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OfferPri implements Serializable {
    /** 关系记录ID */
    private String offerPriId;

    /** 品类id */
    private String cateId;

    /** 品类名称 */
    private String cateName;

    /** 品类规格 */
    private String cateStan;

    /** 厂号 */
    private String manuNum;

    /** 产地 */
    private String prodPla;

    /** 货号 */
    private String artNo;

    private BigDecimal hisOfferPri;

    /** 报盘的总件数 */
    private BigDecimal offerNum;

    /** 价格有限期指一个期限  单位：天 */
    private String expiryDate;

    /** 价格有效的截止时间 */
    private Date deadline;

    /** 创建人 */
    private String createUser;

    /** 创建时间 */
    private Date createTime;

    /** 修改人 */
    private String updateUser;

    /** 修改时间 */
    private Date updateTime;

    /** 报盘总重量 */
    private BigDecimal offerWeight;

    /** 报盘均码(KG/件) */
    private BigDecimal offerAvgWeight;

    /** 抄码价格单位：元/KG */
    private BigDecimal catchweightPri;

    /** 报盘价（标码报价）单位：元/件 */
    private BigDecimal offerPri;

    /** 抄码与标码标识，对应字典CategoryScCodeFlag:S00-标码，S01-抄码 */
    private String standardCatch;

    /** 报盘类型 */
    private String offerType;

    /** 报盘状态，对应字典CategoryOfferStatus:S0A-报盘，待审核，S0F-报盘审核失败，S0S-报盘审核通过，S0T-未报盘 */
    private String offerStatus;

    /** 报盘人 */
    private String offerUser;

    /** 报盘人姓名 */
    private String offerUserName;

    /** 报盘时间 */
    private Date offerTime;

    /** 审核人 */
    private String auditUser;

    /** 审核人姓名 */
    private String auditUserName;

    /** 审核时间 */
    private Date auditTime;

    /** 报盘审核原因 */
    private String offerReason;

    /** 品类外文名称 */
    private String cateEname;

    /** 北方俗语 */
    private String northColloquialism;

    /** 南方俗语 */
    private String southColloquialism;

    /** HS编码 */
    private String hsCode;

    /** 税率 */
    private String taxRate;

    /** 饲养方式 */
    private String rearingMode;

    /** 等级 */
    private String grade;

    /** 单体重量 */
    private String perWeight;

    /** 单体宽度 */
    private String perWidth;

    /** 单体长度 */
    private String perLength;

    /** 净重 */
    private String netWeight;

    /** 箱内数量（个） */
    private String perNumber;

    /** 平均箱重（个） */
    private String avgBoxWeight;

    /** 切割方式 */
    private String cuttingMode;

    /** 包装方式 */
    private String packingMode;

    /** 其他需记录内容 */
    private String otherContent;

    /** 供应商 */
    private String supplier;

    /** 工厂英文名称 */
    private String factoryName;

    /** 品牌 */
    private String category;

    /** 备用字段1 */
    private String bak1;

    /** 无价格购买标识 */
    private String pricelessSign;

    /** 库存总重量 */
    private BigDecimal totalInventory;

    private static final long serialVersionUID = 1L;

    public String getOfferPriId() {
        return offerPriId;
    }

    public void setOfferPriId(String offerPriId) {
        this.offerPriId = offerPriId == null ? null : offerPriId.trim();
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getCateStan() {
        return cateStan;
    }

    public void setCateStan(String cateStan) {
        this.cateStan = cateStan == null ? null : cateStan.trim();
    }

    public String getManuNum() {
        return manuNum;
    }

    public void setManuNum(String manuNum) {
        this.manuNum = manuNum == null ? null : manuNum.trim();
    }

    public String getProdPla() {
        return prodPla;
    }

    public void setProdPla(String prodPla) {
        this.prodPla = prodPla == null ? null : prodPla.trim();
    }

    public String getArtNo() {
        return artNo;
    }

    public void setArtNo(String artNo) {
        this.artNo = artNo == null ? null : artNo.trim();
    }

    public BigDecimal getHisOfferPri() {
        return hisOfferPri;
    }

    public void setHisOfferPri(BigDecimal hisOfferPri) {
        this.hisOfferPri = hisOfferPri;
    }

    public BigDecimal getOfferNum() {
        return offerNum;
    }

    public void setOfferNum(BigDecimal offerNum) {
        this.offerNum = offerNum;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate == null ? null : expiryDate.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getOfferWeight() {
        return offerWeight;
    }

    public void setOfferWeight(BigDecimal offerWeight) {
        this.offerWeight = offerWeight;
    }

    public BigDecimal getOfferAvgWeight() {
        return offerAvgWeight;
    }

    public void setOfferAvgWeight(BigDecimal offerAvgWeight) {
        this.offerAvgWeight = offerAvgWeight;
    }

    public BigDecimal getCatchweightPri() {
        return catchweightPri;
    }

    public void setCatchweightPri(BigDecimal catchweightPri) {
        this.catchweightPri = catchweightPri;
    }

    public BigDecimal getOfferPri() {
        return offerPri;
    }

    public void setOfferPri(BigDecimal offerPri) {
        this.offerPri = offerPri;
    }

    public String getStandardCatch() {
        return standardCatch;
    }

    public void setStandardCatch(String standardCatch) {
        this.standardCatch = standardCatch == null ? null : standardCatch.trim();
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType == null ? null : offerType.trim();
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus == null ? null : offerStatus.trim();
    }

    public String getOfferUser() {
        return offerUser;
    }

    public void setOfferUser(String offerUser) {
        this.offerUser = offerUser == null ? null : offerUser.trim();
    }

    public String getOfferUserName() {
        return offerUserName;
    }

    public void setOfferUserName(String offerUserName) {
        this.offerUserName = offerUserName == null ? null : offerUserName.trim();
    }

    public Date getOfferTime() {
        return offerTime;
    }

    public void setOfferTime(Date offerTime) {
        this.offerTime = offerTime;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    public String getAuditUserName() {
        return auditUserName;
    }

    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName == null ? null : auditUserName.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getOfferReason() {
        return offerReason;
    }

    public void setOfferReason(String offerReason) {
        this.offerReason = offerReason == null ? null : offerReason.trim();
    }

    public String getCateEname() {
        return cateEname;
    }

    public void setCateEname(String cateEname) {
        this.cateEname = cateEname == null ? null : cateEname.trim();
    }

    public String getNorthColloquialism() {
        return northColloquialism;
    }

    public void setNorthColloquialism(String northColloquialism) {
        this.northColloquialism = northColloquialism == null ? null : northColloquialism.trim();
    }

    public String getSouthColloquialism() {
        return southColloquialism;
    }

    public void setSouthColloquialism(String southColloquialism) {
        this.southColloquialism = southColloquialism == null ? null : southColloquialism.trim();
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode == null ? null : hsCode.trim();
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate == null ? null : taxRate.trim();
    }

    public String getRearingMode() {
        return rearingMode;
    }

    public void setRearingMode(String rearingMode) {
        this.rearingMode = rearingMode == null ? null : rearingMode.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getPerWeight() {
        return perWeight;
    }

    public void setPerWeight(String perWeight) {
        this.perWeight = perWeight == null ? null : perWeight.trim();
    }

    public String getPerWidth() {
        return perWidth;
    }

    public void setPerWidth(String perWidth) {
        this.perWidth = perWidth == null ? null : perWidth.trim();
    }

    public String getPerLength() {
        return perLength;
    }

    public void setPerLength(String perLength) {
        this.perLength = perLength == null ? null : perLength.trim();
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight == null ? null : netWeight.trim();
    }

    public String getPerNumber() {
        return perNumber;
    }

    public void setPerNumber(String perNumber) {
        this.perNumber = perNumber == null ? null : perNumber.trim();
    }

    public String getAvgBoxWeight() {
        return avgBoxWeight;
    }

    public void setAvgBoxWeight(String avgBoxWeight) {
        this.avgBoxWeight = avgBoxWeight == null ? null : avgBoxWeight.trim();
    }

    public String getCuttingMode() {
        return cuttingMode;
    }

    public void setCuttingMode(String cuttingMode) {
        this.cuttingMode = cuttingMode == null ? null : cuttingMode.trim();
    }

    public String getPackingMode() {
        return packingMode;
    }

    public void setPackingMode(String packingMode) {
        this.packingMode = packingMode == null ? null : packingMode.trim();
    }

    public String getOtherContent() {
        return otherContent;
    }

    public void setOtherContent(String otherContent) {
        this.otherContent = otherContent == null ? null : otherContent.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getPricelessSign() {
        return pricelessSign;
    }

    public void setPricelessSign(String pricelessSign) {
        this.pricelessSign = pricelessSign == null ? null : pricelessSign.trim();
    }

    public BigDecimal getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(BigDecimal totalInventory) {
        this.totalInventory = totalInventory;
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
        OfferPri other = (OfferPri) that;
        return (this.getOfferPriId() == null ? other.getOfferPriId() == null : this.getOfferPriId().equals(other.getOfferPriId()))
            && (this.getCateId() == null ? other.getCateId() == null : this.getCateId().equals(other.getCateId()))
            && (this.getCateName() == null ? other.getCateName() == null : this.getCateName().equals(other.getCateName()))
            && (this.getCateStan() == null ? other.getCateStan() == null : this.getCateStan().equals(other.getCateStan()))
            && (this.getManuNum() == null ? other.getManuNum() == null : this.getManuNum().equals(other.getManuNum()))
            && (this.getProdPla() == null ? other.getProdPla() == null : this.getProdPla().equals(other.getProdPla()))
            && (this.getArtNo() == null ? other.getArtNo() == null : this.getArtNo().equals(other.getArtNo()))
            && (this.getHisOfferPri() == null ? other.getHisOfferPri() == null : this.getHisOfferPri().equals(other.getHisOfferPri()))
            && (this.getOfferNum() == null ? other.getOfferNum() == null : this.getOfferNum().equals(other.getOfferNum()))
            && (this.getExpiryDate() == null ? other.getExpiryDate() == null : this.getExpiryDate().equals(other.getExpiryDate()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOfferWeight() == null ? other.getOfferWeight() == null : this.getOfferWeight().equals(other.getOfferWeight()))
            && (this.getOfferAvgWeight() == null ? other.getOfferAvgWeight() == null : this.getOfferAvgWeight().equals(other.getOfferAvgWeight()))
            && (this.getCatchweightPri() == null ? other.getCatchweightPri() == null : this.getCatchweightPri().equals(other.getCatchweightPri()))
            && (this.getOfferPri() == null ? other.getOfferPri() == null : this.getOfferPri().equals(other.getOfferPri()))
            && (this.getStandardCatch() == null ? other.getStandardCatch() == null : this.getStandardCatch().equals(other.getStandardCatch()))
            && (this.getOfferType() == null ? other.getOfferType() == null : this.getOfferType().equals(other.getOfferType()))
            && (this.getOfferStatus() == null ? other.getOfferStatus() == null : this.getOfferStatus().equals(other.getOfferStatus()))
            && (this.getOfferUser() == null ? other.getOfferUser() == null : this.getOfferUser().equals(other.getOfferUser()))
            && (this.getOfferUserName() == null ? other.getOfferUserName() == null : this.getOfferUserName().equals(other.getOfferUserName()))
            && (this.getOfferTime() == null ? other.getOfferTime() == null : this.getOfferTime().equals(other.getOfferTime()))
            && (this.getAuditUser() == null ? other.getAuditUser() == null : this.getAuditUser().equals(other.getAuditUser()))
            && (this.getAuditUserName() == null ? other.getAuditUserName() == null : this.getAuditUserName().equals(other.getAuditUserName()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getOfferReason() == null ? other.getOfferReason() == null : this.getOfferReason().equals(other.getOfferReason()))
            && (this.getCateEname() == null ? other.getCateEname() == null : this.getCateEname().equals(other.getCateEname()))
            && (this.getNorthColloquialism() == null ? other.getNorthColloquialism() == null : this.getNorthColloquialism().equals(other.getNorthColloquialism()))
            && (this.getSouthColloquialism() == null ? other.getSouthColloquialism() == null : this.getSouthColloquialism().equals(other.getSouthColloquialism()))
            && (this.getHsCode() == null ? other.getHsCode() == null : this.getHsCode().equals(other.getHsCode()))
            && (this.getTaxRate() == null ? other.getTaxRate() == null : this.getTaxRate().equals(other.getTaxRate()))
            && (this.getRearingMode() == null ? other.getRearingMode() == null : this.getRearingMode().equals(other.getRearingMode()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getPerWeight() == null ? other.getPerWeight() == null : this.getPerWeight().equals(other.getPerWeight()))
            && (this.getPerWidth() == null ? other.getPerWidth() == null : this.getPerWidth().equals(other.getPerWidth()))
            && (this.getPerLength() == null ? other.getPerLength() == null : this.getPerLength().equals(other.getPerLength()))
            && (this.getNetWeight() == null ? other.getNetWeight() == null : this.getNetWeight().equals(other.getNetWeight()))
            && (this.getPerNumber() == null ? other.getPerNumber() == null : this.getPerNumber().equals(other.getPerNumber()))
            && (this.getAvgBoxWeight() == null ? other.getAvgBoxWeight() == null : this.getAvgBoxWeight().equals(other.getAvgBoxWeight()))
            && (this.getCuttingMode() == null ? other.getCuttingMode() == null : this.getCuttingMode().equals(other.getCuttingMode()))
            && (this.getPackingMode() == null ? other.getPackingMode() == null : this.getPackingMode().equals(other.getPackingMode()))
            && (this.getOtherContent() == null ? other.getOtherContent() == null : this.getOtherContent().equals(other.getOtherContent()))
            && (this.getSupplier() == null ? other.getSupplier() == null : this.getSupplier().equals(other.getSupplier()))
            && (this.getFactoryName() == null ? other.getFactoryName() == null : this.getFactoryName().equals(other.getFactoryName()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getBak1() == null ? other.getBak1() == null : this.getBak1().equals(other.getBak1()))
            && (this.getPricelessSign() == null ? other.getPricelessSign() == null : this.getPricelessSign().equals(other.getPricelessSign()))
            && (this.getTotalInventory() == null ? other.getTotalInventory() == null : this.getTotalInventory().equals(other.getTotalInventory()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOfferPriId() == null) ? 0 : getOfferPriId().hashCode());
        result = prime * result + ((getCateId() == null) ? 0 : getCateId().hashCode());
        result = prime * result + ((getCateName() == null) ? 0 : getCateName().hashCode());
        result = prime * result + ((getCateStan() == null) ? 0 : getCateStan().hashCode());
        result = prime * result + ((getManuNum() == null) ? 0 : getManuNum().hashCode());
        result = prime * result + ((getProdPla() == null) ? 0 : getProdPla().hashCode());
        result = prime * result + ((getArtNo() == null) ? 0 : getArtNo().hashCode());
        result = prime * result + ((getHisOfferPri() == null) ? 0 : getHisOfferPri().hashCode());
        result = prime * result + ((getOfferNum() == null) ? 0 : getOfferNum().hashCode());
        result = prime * result + ((getExpiryDate() == null) ? 0 : getExpiryDate().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOfferWeight() == null) ? 0 : getOfferWeight().hashCode());
        result = prime * result + ((getOfferAvgWeight() == null) ? 0 : getOfferAvgWeight().hashCode());
        result = prime * result + ((getCatchweightPri() == null) ? 0 : getCatchweightPri().hashCode());
        result = prime * result + ((getOfferPri() == null) ? 0 : getOfferPri().hashCode());
        result = prime * result + ((getStandardCatch() == null) ? 0 : getStandardCatch().hashCode());
        result = prime * result + ((getOfferType() == null) ? 0 : getOfferType().hashCode());
        result = prime * result + ((getOfferStatus() == null) ? 0 : getOfferStatus().hashCode());
        result = prime * result + ((getOfferUser() == null) ? 0 : getOfferUser().hashCode());
        result = prime * result + ((getOfferUserName() == null) ? 0 : getOfferUserName().hashCode());
        result = prime * result + ((getOfferTime() == null) ? 0 : getOfferTime().hashCode());
        result = prime * result + ((getAuditUser() == null) ? 0 : getAuditUser().hashCode());
        result = prime * result + ((getAuditUserName() == null) ? 0 : getAuditUserName().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getOfferReason() == null) ? 0 : getOfferReason().hashCode());
        result = prime * result + ((getCateEname() == null) ? 0 : getCateEname().hashCode());
        result = prime * result + ((getNorthColloquialism() == null) ? 0 : getNorthColloquialism().hashCode());
        result = prime * result + ((getSouthColloquialism() == null) ? 0 : getSouthColloquialism().hashCode());
        result = prime * result + ((getHsCode() == null) ? 0 : getHsCode().hashCode());
        result = prime * result + ((getTaxRate() == null) ? 0 : getTaxRate().hashCode());
        result = prime * result + ((getRearingMode() == null) ? 0 : getRearingMode().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getPerWeight() == null) ? 0 : getPerWeight().hashCode());
        result = prime * result + ((getPerWidth() == null) ? 0 : getPerWidth().hashCode());
        result = prime * result + ((getPerLength() == null) ? 0 : getPerLength().hashCode());
        result = prime * result + ((getNetWeight() == null) ? 0 : getNetWeight().hashCode());
        result = prime * result + ((getPerNumber() == null) ? 0 : getPerNumber().hashCode());
        result = prime * result + ((getAvgBoxWeight() == null) ? 0 : getAvgBoxWeight().hashCode());
        result = prime * result + ((getCuttingMode() == null) ? 0 : getCuttingMode().hashCode());
        result = prime * result + ((getPackingMode() == null) ? 0 : getPackingMode().hashCode());
        result = prime * result + ((getOtherContent() == null) ? 0 : getOtherContent().hashCode());
        result = prime * result + ((getSupplier() == null) ? 0 : getSupplier().hashCode());
        result = prime * result + ((getFactoryName() == null) ? 0 : getFactoryName().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getBak1() == null) ? 0 : getBak1().hashCode());
        result = prime * result + ((getPricelessSign() == null) ? 0 : getPricelessSign().hashCode());
        result = prime * result + ((getTotalInventory() == null) ? 0 : getTotalInventory().hashCode());
        return result;
    }
}
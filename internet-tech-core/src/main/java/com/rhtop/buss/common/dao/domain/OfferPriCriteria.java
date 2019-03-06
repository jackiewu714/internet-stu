package com.rhtop.buss.common.dao.domain;

import com.rhtop.buss.common.entity.Page;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfferPriCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 关系记录ID */
    private String offerPriId;

    private String offerPriIdRange;

    /** 品类id */
    private String cateId;

    private String cateIdRange;

    /** 品类名称 */
    private String cateName;

    private String cateNameRange;

    /** 品类规格 */
    private String cateStan;

    private String cateStanRange;

    /** 厂号 */
    private String manuNum;

    private String manuNumRange;

    /** 产地 */
    private String prodPla;

    private String prodPlaRange;

    /** 货号 */
    private String artNo;

    private String artNoRange;

    private BigDecimal hisOfferPri;

    /** 报盘的总件数 */
    private BigDecimal offerNum;

    /** 价格有限期指一个期限  单位：天 */
    private String expiryDate;

    private String expiryDateRange;

    /** 价格有效的截止时间 */
    private Date deadline;

    private Date deadlineRange1;

    private Date deadlineRange2;

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

    private String standardCatchRange;

    /** 报盘类型 */
    private String offerType;

    private String offerTypeRange;

    /** 报盘状态，对应字典CategoryOfferStatus:S0A-报盘，待审核，S0F-报盘审核失败，S0S-报盘审核通过，S0T-未报盘 */
    private String offerStatus;

    private String offerStatusRange;

    /** 报盘人 */
    private String offerUser;

    private String offerUserRange;

    /** 报盘人姓名 */
    private String offerUserName;

    private String offerUserNameRange;

    /** 报盘时间 */
    private Date offerTime;

    private Date offerTimeRange1;

    private Date offerTimeRange2;

    /** 审核人 */
    private String auditUser;

    private String auditUserRange;

    /** 审核人姓名 */
    private String auditUserName;

    private String auditUserNameRange;

    /** 审核时间 */
    private Date auditTime;

    private Date auditTimeRange1;

    private Date auditTimeRange2;

    /** 报盘审核原因 */
    private String offerReason;

    private String offerReasonRange;

    /** 品类外文名称 */
    private String cateEname;

    private String cateEnameRange;

    /** 北方俗语 */
    private String northColloquialism;

    private String northColloquialismRange;

    /** 南方俗语 */
    private String southColloquialism;

    private String southColloquialismRange;

    /** HS编码 */
    private String hsCode;

    private String hsCodeRange;

    /** 税率 */
    private String taxRate;

    private String taxRateRange;

    /** 饲养方式 */
    private String rearingMode;

    private String rearingModeRange;

    /** 等级 */
    private String grade;

    private String gradeRange;

    /** 单体重量 */
    private String perWeight;

    private String perWeightRange;

    /** 单体宽度 */
    private String perWidth;

    private String perWidthRange;

    /** 单体长度 */
    private String perLength;

    private String perLengthRange;

    /** 净重 */
    private String netWeight;

    private String netWeightRange;

    /** 箱内数量（个） */
    private String perNumber;

    private String perNumberRange;

    /** 平均箱重（个） */
    private String avgBoxWeight;

    private String avgBoxWeightRange;

    /** 切割方式 */
    private String cuttingMode;

    private String cuttingModeRange;

    /** 包装方式 */
    private String packingMode;

    private String packingModeRange;

    /** 其他需记录内容 */
    private String otherContent;

    private String otherContentRange;

    /** 供应商 */
    private String supplier;

    private String supplierRange;

    /** 工厂英文名称 */
    private String factoryName;

    private String factoryNameRange;

    /** 品牌 */
    private String category;

    private String categoryRange;

    /** 备用字段1 */
    private String bak1;

    private String bak1Range;

    /** 无价格购买标识 */
    private String pricelessSign;

    private String pricelessSignRange;

    /** 库存总重量 */
    private BigDecimal totalInventory;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public OfferPriCriteria() {
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

    public String getOfferPriId() {
        return offerPriId;
    }

    public void setOfferPriId(String offerPriId) {
        this.offerPriId = offerPriId == null ? null : offerPriId.trim();
    }

    public String getOfferPriIdRange() {
        return offerPriIdRange;
    }

    public void setOfferPriIdRange(String offerPriIdRange) {
        this.offerPriIdRange = offerPriIdRange == null ? null : offerPriIdRange.trim();
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }

    public String getCateIdRange() {
        return cateIdRange;
    }

    public void setCateIdRange(String cateIdRange) {
        this.cateIdRange = cateIdRange == null ? null : cateIdRange.trim();
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getCateNameRange() {
        return cateNameRange;
    }

    public void setCateNameRange(String cateNameRange) {
        this.cateNameRange = cateNameRange == null ? null : cateNameRange.trim();
    }

    public String getCateStan() {
        return cateStan;
    }

    public void setCateStan(String cateStan) {
        this.cateStan = cateStan == null ? null : cateStan.trim();
    }

    public String getCateStanRange() {
        return cateStanRange;
    }

    public void setCateStanRange(String cateStanRange) {
        this.cateStanRange = cateStanRange == null ? null : cateStanRange.trim();
    }

    public String getManuNum() {
        return manuNum;
    }

    public void setManuNum(String manuNum) {
        this.manuNum = manuNum == null ? null : manuNum.trim();
    }

    public String getManuNumRange() {
        return manuNumRange;
    }

    public void setManuNumRange(String manuNumRange) {
        this.manuNumRange = manuNumRange == null ? null : manuNumRange.trim();
    }

    public String getProdPla() {
        return prodPla;
    }

    public void setProdPla(String prodPla) {
        this.prodPla = prodPla == null ? null : prodPla.trim();
    }

    public String getProdPlaRange() {
        return prodPlaRange;
    }

    public void setProdPlaRange(String prodPlaRange) {
        this.prodPlaRange = prodPlaRange == null ? null : prodPlaRange.trim();
    }

    public String getArtNo() {
        return artNo;
    }

    public void setArtNo(String artNo) {
        this.artNo = artNo == null ? null : artNo.trim();
    }

    public String getArtNoRange() {
        return artNoRange;
    }

    public void setArtNoRange(String artNoRange) {
        this.artNoRange = artNoRange == null ? null : artNoRange.trim();
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

    public String getExpiryDateRange() {
        return expiryDateRange;
    }

    public void setExpiryDateRange(String expiryDateRange) {
        this.expiryDateRange = expiryDateRange == null ? null : expiryDateRange.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDeadlineRange1() {
        return deadlineRange1;
    }

    public void setDeadlineRange1(Date deadlineRange1) {
        this.deadlineRange1 = deadlineRange1;
    }

    public Date getDeadlineRange2() {
        return deadlineRange2;
    }

    public void setDeadlineRange2(Date deadlineRange2) {
        this.deadlineRange2 = deadlineRange2;
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

    public String getStandardCatchRange() {
        return standardCatchRange;
    }

    public void setStandardCatchRange(String standardCatchRange) {
        this.standardCatchRange = standardCatchRange == null ? null : standardCatchRange.trim();
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType == null ? null : offerType.trim();
    }

    public String getOfferTypeRange() {
        return offerTypeRange;
    }

    public void setOfferTypeRange(String offerTypeRange) {
        this.offerTypeRange = offerTypeRange == null ? null : offerTypeRange.trim();
    }

    public String getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(String offerStatus) {
        this.offerStatus = offerStatus == null ? null : offerStatus.trim();
    }

    public String getOfferStatusRange() {
        return offerStatusRange;
    }

    public void setOfferStatusRange(String offerStatusRange) {
        this.offerStatusRange = offerStatusRange == null ? null : offerStatusRange.trim();
    }

    public String getOfferUser() {
        return offerUser;
    }

    public void setOfferUser(String offerUser) {
        this.offerUser = offerUser == null ? null : offerUser.trim();
    }

    public String getOfferUserRange() {
        return offerUserRange;
    }

    public void setOfferUserRange(String offerUserRange) {
        this.offerUserRange = offerUserRange == null ? null : offerUserRange.trim();
    }

    public String getOfferUserName() {
        return offerUserName;
    }

    public void setOfferUserName(String offerUserName) {
        this.offerUserName = offerUserName == null ? null : offerUserName.trim();
    }

    public String getOfferUserNameRange() {
        return offerUserNameRange;
    }

    public void setOfferUserNameRange(String offerUserNameRange) {
        this.offerUserNameRange = offerUserNameRange == null ? null : offerUserNameRange.trim();
    }

    public Date getOfferTime() {
        return offerTime;
    }

    public void setOfferTime(Date offerTime) {
        this.offerTime = offerTime;
    }

    public Date getOfferTimeRange1() {
        return offerTimeRange1;
    }

    public void setOfferTimeRange1(Date offerTimeRange1) {
        this.offerTimeRange1 = offerTimeRange1;
    }

    public Date getOfferTimeRange2() {
        return offerTimeRange2;
    }

    public void setOfferTimeRange2(Date offerTimeRange2) {
        this.offerTimeRange2 = offerTimeRange2;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    public String getAuditUserRange() {
        return auditUserRange;
    }

    public void setAuditUserRange(String auditUserRange) {
        this.auditUserRange = auditUserRange == null ? null : auditUserRange.trim();
    }

    public String getAuditUserName() {
        return auditUserName;
    }

    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName == null ? null : auditUserName.trim();
    }

    public String getAuditUserNameRange() {
        return auditUserNameRange;
    }

    public void setAuditUserNameRange(String auditUserNameRange) {
        this.auditUserNameRange = auditUserNameRange == null ? null : auditUserNameRange.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getAuditTimeRange1() {
        return auditTimeRange1;
    }

    public void setAuditTimeRange1(Date auditTimeRange1) {
        this.auditTimeRange1 = auditTimeRange1;
    }

    public Date getAuditTimeRange2() {
        return auditTimeRange2;
    }

    public void setAuditTimeRange2(Date auditTimeRange2) {
        this.auditTimeRange2 = auditTimeRange2;
    }

    public String getOfferReason() {
        return offerReason;
    }

    public void setOfferReason(String offerReason) {
        this.offerReason = offerReason == null ? null : offerReason.trim();
    }

    public String getOfferReasonRange() {
        return offerReasonRange;
    }

    public void setOfferReasonRange(String offerReasonRange) {
        this.offerReasonRange = offerReasonRange == null ? null : offerReasonRange.trim();
    }

    public String getCateEname() {
        return cateEname;
    }

    public void setCateEname(String cateEname) {
        this.cateEname = cateEname == null ? null : cateEname.trim();
    }

    public String getCateEnameRange() {
        return cateEnameRange;
    }

    public void setCateEnameRange(String cateEnameRange) {
        this.cateEnameRange = cateEnameRange == null ? null : cateEnameRange.trim();
    }

    public String getNorthColloquialism() {
        return northColloquialism;
    }

    public void setNorthColloquialism(String northColloquialism) {
        this.northColloquialism = northColloquialism == null ? null : northColloquialism.trim();
    }

    public String getNorthColloquialismRange() {
        return northColloquialismRange;
    }

    public void setNorthColloquialismRange(String northColloquialismRange) {
        this.northColloquialismRange = northColloquialismRange == null ? null : northColloquialismRange.trim();
    }

    public String getSouthColloquialism() {
        return southColloquialism;
    }

    public void setSouthColloquialism(String southColloquialism) {
        this.southColloquialism = southColloquialism == null ? null : southColloquialism.trim();
    }

    public String getSouthColloquialismRange() {
        return southColloquialismRange;
    }

    public void setSouthColloquialismRange(String southColloquialismRange) {
        this.southColloquialismRange = southColloquialismRange == null ? null : southColloquialismRange.trim();
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode == null ? null : hsCode.trim();
    }

    public String getHsCodeRange() {
        return hsCodeRange;
    }

    public void setHsCodeRange(String hsCodeRange) {
        this.hsCodeRange = hsCodeRange == null ? null : hsCodeRange.trim();
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate == null ? null : taxRate.trim();
    }

    public String getTaxRateRange() {
        return taxRateRange;
    }

    public void setTaxRateRange(String taxRateRange) {
        this.taxRateRange = taxRateRange == null ? null : taxRateRange.trim();
    }

    public String getRearingMode() {
        return rearingMode;
    }

    public void setRearingMode(String rearingMode) {
        this.rearingMode = rearingMode == null ? null : rearingMode.trim();
    }

    public String getRearingModeRange() {
        return rearingModeRange;
    }

    public void setRearingModeRange(String rearingModeRange) {
        this.rearingModeRange = rearingModeRange == null ? null : rearingModeRange.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getGradeRange() {
        return gradeRange;
    }

    public void setGradeRange(String gradeRange) {
        this.gradeRange = gradeRange == null ? null : gradeRange.trim();
    }

    public String getPerWeight() {
        return perWeight;
    }

    public void setPerWeight(String perWeight) {
        this.perWeight = perWeight == null ? null : perWeight.trim();
    }

    public String getPerWeightRange() {
        return perWeightRange;
    }

    public void setPerWeightRange(String perWeightRange) {
        this.perWeightRange = perWeightRange == null ? null : perWeightRange.trim();
    }

    public String getPerWidth() {
        return perWidth;
    }

    public void setPerWidth(String perWidth) {
        this.perWidth = perWidth == null ? null : perWidth.trim();
    }

    public String getPerWidthRange() {
        return perWidthRange;
    }

    public void setPerWidthRange(String perWidthRange) {
        this.perWidthRange = perWidthRange == null ? null : perWidthRange.trim();
    }

    public String getPerLength() {
        return perLength;
    }

    public void setPerLength(String perLength) {
        this.perLength = perLength == null ? null : perLength.trim();
    }

    public String getPerLengthRange() {
        return perLengthRange;
    }

    public void setPerLengthRange(String perLengthRange) {
        this.perLengthRange = perLengthRange == null ? null : perLengthRange.trim();
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight == null ? null : netWeight.trim();
    }

    public String getNetWeightRange() {
        return netWeightRange;
    }

    public void setNetWeightRange(String netWeightRange) {
        this.netWeightRange = netWeightRange == null ? null : netWeightRange.trim();
    }

    public String getPerNumber() {
        return perNumber;
    }

    public void setPerNumber(String perNumber) {
        this.perNumber = perNumber == null ? null : perNumber.trim();
    }

    public String getPerNumberRange() {
        return perNumberRange;
    }

    public void setPerNumberRange(String perNumberRange) {
        this.perNumberRange = perNumberRange == null ? null : perNumberRange.trim();
    }

    public String getAvgBoxWeight() {
        return avgBoxWeight;
    }

    public void setAvgBoxWeight(String avgBoxWeight) {
        this.avgBoxWeight = avgBoxWeight == null ? null : avgBoxWeight.trim();
    }

    public String getAvgBoxWeightRange() {
        return avgBoxWeightRange;
    }

    public void setAvgBoxWeightRange(String avgBoxWeightRange) {
        this.avgBoxWeightRange = avgBoxWeightRange == null ? null : avgBoxWeightRange.trim();
    }

    public String getCuttingMode() {
        return cuttingMode;
    }

    public void setCuttingMode(String cuttingMode) {
        this.cuttingMode = cuttingMode == null ? null : cuttingMode.trim();
    }

    public String getCuttingModeRange() {
        return cuttingModeRange;
    }

    public void setCuttingModeRange(String cuttingModeRange) {
        this.cuttingModeRange = cuttingModeRange == null ? null : cuttingModeRange.trim();
    }

    public String getPackingMode() {
        return packingMode;
    }

    public void setPackingMode(String packingMode) {
        this.packingMode = packingMode == null ? null : packingMode.trim();
    }

    public String getPackingModeRange() {
        return packingModeRange;
    }

    public void setPackingModeRange(String packingModeRange) {
        this.packingModeRange = packingModeRange == null ? null : packingModeRange.trim();
    }

    public String getOtherContent() {
        return otherContent;
    }

    public void setOtherContent(String otherContent) {
        this.otherContent = otherContent == null ? null : otherContent.trim();
    }

    public String getOtherContentRange() {
        return otherContentRange;
    }

    public void setOtherContentRange(String otherContentRange) {
        this.otherContentRange = otherContentRange == null ? null : otherContentRange.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSupplierRange() {
        return supplierRange;
    }

    public void setSupplierRange(String supplierRange) {
        this.supplierRange = supplierRange == null ? null : supplierRange.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getFactoryNameRange() {
        return factoryNameRange;
    }

    public void setFactoryNameRange(String factoryNameRange) {
        this.factoryNameRange = factoryNameRange == null ? null : factoryNameRange.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCategoryRange() {
        return categoryRange;
    }

    public void setCategoryRange(String categoryRange) {
        this.categoryRange = categoryRange == null ? null : categoryRange.trim();
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getBak1Range() {
        return bak1Range;
    }

    public void setBak1Range(String bak1Range) {
        this.bak1Range = bak1Range == null ? null : bak1Range.trim();
    }

    public String getPricelessSign() {
        return pricelessSign;
    }

    public void setPricelessSign(String pricelessSign) {
        this.pricelessSign = pricelessSign == null ? null : pricelessSign.trim();
    }

    public String getPricelessSignRange() {
        return pricelessSignRange;
    }

    public void setPricelessSignRange(String pricelessSignRange) {
        this.pricelessSignRange = pricelessSignRange == null ? null : pricelessSignRange.trim();
    }

    public BigDecimal getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(BigDecimal totalInventory) {
        this.totalInventory = totalInventory;
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

        public Criteria andOfferPriIdIsNull() {
            addCriterion("offer_pri_id is null");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdIsNotNull() {
            addCriterion("offer_pri_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdEqualTo(String value) {
            addCriterion("offer_pri_id =", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdNotEqualTo(String value) {
            addCriterion("offer_pri_id <>", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdGreaterThan(String value) {
            addCriterion("offer_pri_id >", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdGreaterThanOrEqualTo(String value) {
            addCriterion("offer_pri_id >=", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdLessThan(String value) {
            addCriterion("offer_pri_id <", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdLessThanOrEqualTo(String value) {
            addCriterion("offer_pri_id <=", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdLike(String value) {
            addCriterion("offer_pri_id like", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdNotLike(String value) {
            addCriterion("offer_pri_id not like", value, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdIn(List<String> values) {
            addCriterion("offer_pri_id in", values, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdNotIn(List<String> values) {
            addCriterion("offer_pri_id not in", values, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdBetween(String value1, String value2) {
            addCriterion("offer_pri_id between", value1, value2, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdNotBetween(String value1, String value2) {
            addCriterion("offer_pri_id not between", value1, value2, "offerPriId");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("cate_id is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("cate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(String value) {
            addCriterion("cate_id =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(String value) {
            addCriterion("cate_id <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(String value) {
            addCriterion("cate_id >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(String value) {
            addCriterion("cate_id >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(String value) {
            addCriterion("cate_id <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(String value) {
            addCriterion("cate_id <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLike(String value) {
            addCriterion("cate_id like", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotLike(String value) {
            addCriterion("cate_id not like", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<String> values) {
            addCriterion("cate_id in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<String> values) {
            addCriterion("cate_id not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(String value1, String value2) {
            addCriterion("cate_id between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(String value1, String value2) {
            addCriterion("cate_id not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNull() {
            addCriterion("cate_name is null");
            return (Criteria) this;
        }

        public Criteria andCateNameIsNotNull() {
            addCriterion("cate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCateNameEqualTo(String value) {
            addCriterion("cate_name =", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotEqualTo(String value) {
            addCriterion("cate_name <>", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThan(String value) {
            addCriterion("cate_name >", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameGreaterThanOrEqualTo(String value) {
            addCriterion("cate_name >=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThan(String value) {
            addCriterion("cate_name <", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLessThanOrEqualTo(String value) {
            addCriterion("cate_name <=", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameLike(String value) {
            addCriterion("cate_name like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotLike(String value) {
            addCriterion("cate_name not like", value, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameIn(List<String> values) {
            addCriterion("cate_name in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotIn(List<String> values) {
            addCriterion("cate_name not in", values, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameBetween(String value1, String value2) {
            addCriterion("cate_name between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateNameNotBetween(String value1, String value2) {
            addCriterion("cate_name not between", value1, value2, "cateName");
            return (Criteria) this;
        }

        public Criteria andCateStanIsNull() {
            addCriterion("cate_stan is null");
            return (Criteria) this;
        }

        public Criteria andCateStanIsNotNull() {
            addCriterion("cate_stan is not null");
            return (Criteria) this;
        }

        public Criteria andCateStanEqualTo(String value) {
            addCriterion("cate_stan =", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanNotEqualTo(String value) {
            addCriterion("cate_stan <>", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanGreaterThan(String value) {
            addCriterion("cate_stan >", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanGreaterThanOrEqualTo(String value) {
            addCriterion("cate_stan >=", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanLessThan(String value) {
            addCriterion("cate_stan <", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanLessThanOrEqualTo(String value) {
            addCriterion("cate_stan <=", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanLike(String value) {
            addCriterion("cate_stan like", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanNotLike(String value) {
            addCriterion("cate_stan not like", value, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanIn(List<String> values) {
            addCriterion("cate_stan in", values, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanNotIn(List<String> values) {
            addCriterion("cate_stan not in", values, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanBetween(String value1, String value2) {
            addCriterion("cate_stan between", value1, value2, "cateStan");
            return (Criteria) this;
        }

        public Criteria andCateStanNotBetween(String value1, String value2) {
            addCriterion("cate_stan not between", value1, value2, "cateStan");
            return (Criteria) this;
        }

        public Criteria andManuNumIsNull() {
            addCriterion("manu_num is null");
            return (Criteria) this;
        }

        public Criteria andManuNumIsNotNull() {
            addCriterion("manu_num is not null");
            return (Criteria) this;
        }

        public Criteria andManuNumEqualTo(String value) {
            addCriterion("manu_num =", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumNotEqualTo(String value) {
            addCriterion("manu_num <>", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumGreaterThan(String value) {
            addCriterion("manu_num >", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumGreaterThanOrEqualTo(String value) {
            addCriterion("manu_num >=", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumLessThan(String value) {
            addCriterion("manu_num <", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumLessThanOrEqualTo(String value) {
            addCriterion("manu_num <=", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumLike(String value) {
            addCriterion("manu_num like", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumNotLike(String value) {
            addCriterion("manu_num not like", value, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumIn(List<String> values) {
            addCriterion("manu_num in", values, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumNotIn(List<String> values) {
            addCriterion("manu_num not in", values, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumBetween(String value1, String value2) {
            addCriterion("manu_num between", value1, value2, "manuNum");
            return (Criteria) this;
        }

        public Criteria andManuNumNotBetween(String value1, String value2) {
            addCriterion("manu_num not between", value1, value2, "manuNum");
            return (Criteria) this;
        }

        public Criteria andProdPlaIsNull() {
            addCriterion("prod_pla is null");
            return (Criteria) this;
        }

        public Criteria andProdPlaIsNotNull() {
            addCriterion("prod_pla is not null");
            return (Criteria) this;
        }

        public Criteria andProdPlaEqualTo(String value) {
            addCriterion("prod_pla =", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaNotEqualTo(String value) {
            addCriterion("prod_pla <>", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaGreaterThan(String value) {
            addCriterion("prod_pla >", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaGreaterThanOrEqualTo(String value) {
            addCriterion("prod_pla >=", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaLessThan(String value) {
            addCriterion("prod_pla <", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaLessThanOrEqualTo(String value) {
            addCriterion("prod_pla <=", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaLike(String value) {
            addCriterion("prod_pla like", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaNotLike(String value) {
            addCriterion("prod_pla not like", value, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaIn(List<String> values) {
            addCriterion("prod_pla in", values, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaNotIn(List<String> values) {
            addCriterion("prod_pla not in", values, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaBetween(String value1, String value2) {
            addCriterion("prod_pla between", value1, value2, "prodPla");
            return (Criteria) this;
        }

        public Criteria andProdPlaNotBetween(String value1, String value2) {
            addCriterion("prod_pla not between", value1, value2, "prodPla");
            return (Criteria) this;
        }

        public Criteria andArtNoIsNull() {
            addCriterion("art_no is null");
            return (Criteria) this;
        }

        public Criteria andArtNoIsNotNull() {
            addCriterion("art_no is not null");
            return (Criteria) this;
        }

        public Criteria andArtNoEqualTo(String value) {
            addCriterion("art_no =", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotEqualTo(String value) {
            addCriterion("art_no <>", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoGreaterThan(String value) {
            addCriterion("art_no >", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoGreaterThanOrEqualTo(String value) {
            addCriterion("art_no >=", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoLessThan(String value) {
            addCriterion("art_no <", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoLessThanOrEqualTo(String value) {
            addCriterion("art_no <=", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoLike(String value) {
            addCriterion("art_no like", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotLike(String value) {
            addCriterion("art_no not like", value, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoIn(List<String> values) {
            addCriterion("art_no in", values, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotIn(List<String> values) {
            addCriterion("art_no not in", values, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoBetween(String value1, String value2) {
            addCriterion("art_no between", value1, value2, "artNo");
            return (Criteria) this;
        }

        public Criteria andArtNoNotBetween(String value1, String value2) {
            addCriterion("art_no not between", value1, value2, "artNo");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriIsNull() {
            addCriterion("his_offer_pri is null");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriIsNotNull() {
            addCriterion("his_offer_pri is not null");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriEqualTo(BigDecimal value) {
            addCriterion("his_offer_pri =", value, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriNotEqualTo(BigDecimal value) {
            addCriterion("his_offer_pri <>", value, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriGreaterThan(BigDecimal value) {
            addCriterion("his_offer_pri >", value, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("his_offer_pri >=", value, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriLessThan(BigDecimal value) {
            addCriterion("his_offer_pri <", value, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("his_offer_pri <=", value, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriIn(List<BigDecimal> values) {
            addCriterion("his_offer_pri in", values, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriNotIn(List<BigDecimal> values) {
            addCriterion("his_offer_pri not in", values, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("his_offer_pri between", value1, value2, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andHisOfferPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("his_offer_pri not between", value1, value2, "hisOfferPri");
            return (Criteria) this;
        }

        public Criteria andOfferNumIsNull() {
            addCriterion("offer_num is null");
            return (Criteria) this;
        }

        public Criteria andOfferNumIsNotNull() {
            addCriterion("offer_num is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNumEqualTo(BigDecimal value) {
            addCriterion("offer_num =", value, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumNotEqualTo(BigDecimal value) {
            addCriterion("offer_num <>", value, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumGreaterThan(BigDecimal value) {
            addCriterion("offer_num >", value, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_num >=", value, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumLessThan(BigDecimal value) {
            addCriterion("offer_num <", value, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_num <=", value, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumIn(List<BigDecimal> values) {
            addCriterion("offer_num in", values, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumNotIn(List<BigDecimal> values) {
            addCriterion("offer_num not in", values, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_num between", value1, value2, "offerNum");
            return (Criteria) this;
        }

        public Criteria andOfferNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_num not between", value1, value2, "offerNum");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(String value) {
            addCriterion("expiry_date =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(String value) {
            addCriterion("expiry_date <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(String value) {
            addCriterion("expiry_date >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(String value) {
            addCriterion("expiry_date >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(String value) {
            addCriterion("expiry_date <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(String value) {
            addCriterion("expiry_date <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLike(String value) {
            addCriterion("expiry_date like", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotLike(String value) {
            addCriterion("expiry_date not like", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<String> values) {
            addCriterion("expiry_date in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<String> values) {
            addCriterion("expiry_date not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(String value1, String value2) {
            addCriterion("expiry_date between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(String value1, String value2) {
            addCriterion("expiry_date not between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
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

        public Criteria andOfferWeightIsNull() {
            addCriterion("offer_weight is null");
            return (Criteria) this;
        }

        public Criteria andOfferWeightIsNotNull() {
            addCriterion("offer_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOfferWeightEqualTo(BigDecimal value) {
            addCriterion("offer_weight =", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightNotEqualTo(BigDecimal value) {
            addCriterion("offer_weight <>", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightGreaterThan(BigDecimal value) {
            addCriterion("offer_weight >", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_weight >=", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightLessThan(BigDecimal value) {
            addCriterion("offer_weight <", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_weight <=", value, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightIn(List<BigDecimal> values) {
            addCriterion("offer_weight in", values, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightNotIn(List<BigDecimal> values) {
            addCriterion("offer_weight not in", values, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_weight between", value1, value2, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_weight not between", value1, value2, "offerWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightIsNull() {
            addCriterion("offer_avg_weight is null");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightIsNotNull() {
            addCriterion("offer_avg_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight =", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightNotEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight <>", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightGreaterThan(BigDecimal value) {
            addCriterion("offer_avg_weight >", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight >=", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightLessThan(BigDecimal value) {
            addCriterion("offer_avg_weight <", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_avg_weight <=", value, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightIn(List<BigDecimal> values) {
            addCriterion("offer_avg_weight in", values, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightNotIn(List<BigDecimal> values) {
            addCriterion("offer_avg_weight not in", values, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_avg_weight between", value1, value2, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andOfferAvgWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_avg_weight not between", value1, value2, "offerAvgWeight");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriIsNull() {
            addCriterion("catchweight_pri is null");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriIsNotNull() {
            addCriterion("catchweight_pri is not null");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri =", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriNotEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri <>", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriGreaterThan(BigDecimal value) {
            addCriterion("catchweight_pri >", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri >=", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriLessThan(BigDecimal value) {
            addCriterion("catchweight_pri <", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("catchweight_pri <=", value, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriIn(List<BigDecimal> values) {
            addCriterion("catchweight_pri in", values, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriNotIn(List<BigDecimal> values) {
            addCriterion("catchweight_pri not in", values, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("catchweight_pri between", value1, value2, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andCatchweightPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("catchweight_pri not between", value1, value2, "catchweightPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriIsNull() {
            addCriterion("offer_pri is null");
            return (Criteria) this;
        }

        public Criteria andOfferPriIsNotNull() {
            addCriterion("offer_pri is not null");
            return (Criteria) this;
        }

        public Criteria andOfferPriEqualTo(BigDecimal value) {
            addCriterion("offer_pri =", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriNotEqualTo(BigDecimal value) {
            addCriterion("offer_pri <>", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriGreaterThan(BigDecimal value) {
            addCriterion("offer_pri >", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_pri >=", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriLessThan(BigDecimal value) {
            addCriterion("offer_pri <", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("offer_pri <=", value, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriIn(List<BigDecimal> values) {
            addCriterion("offer_pri in", values, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriNotIn(List<BigDecimal> values) {
            addCriterion("offer_pri not in", values, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_pri between", value1, value2, "offerPri");
            return (Criteria) this;
        }

        public Criteria andOfferPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("offer_pri not between", value1, value2, "offerPri");
            return (Criteria) this;
        }

        public Criteria andStandardCatchIsNull() {
            addCriterion("standard_catch is null");
            return (Criteria) this;
        }

        public Criteria andStandardCatchIsNotNull() {
            addCriterion("standard_catch is not null");
            return (Criteria) this;
        }

        public Criteria andStandardCatchEqualTo(String value) {
            addCriterion("standard_catch =", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotEqualTo(String value) {
            addCriterion("standard_catch <>", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchGreaterThan(String value) {
            addCriterion("standard_catch >", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchGreaterThanOrEqualTo(String value) {
            addCriterion("standard_catch >=", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchLessThan(String value) {
            addCriterion("standard_catch <", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchLessThanOrEqualTo(String value) {
            addCriterion("standard_catch <=", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchLike(String value) {
            addCriterion("standard_catch like", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotLike(String value) {
            addCriterion("standard_catch not like", value, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchIn(List<String> values) {
            addCriterion("standard_catch in", values, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotIn(List<String> values) {
            addCriterion("standard_catch not in", values, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchBetween(String value1, String value2) {
            addCriterion("standard_catch between", value1, value2, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andStandardCatchNotBetween(String value1, String value2) {
            addCriterion("standard_catch not between", value1, value2, "standardCatch");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIsNull() {
            addCriterion("offer_type is null");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIsNotNull() {
            addCriterion("offer_type is not null");
            return (Criteria) this;
        }

        public Criteria andOfferTypeEqualTo(String value) {
            addCriterion("offer_type =", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotEqualTo(String value) {
            addCriterion("offer_type <>", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeGreaterThan(String value) {
            addCriterion("offer_type >", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeGreaterThanOrEqualTo(String value) {
            addCriterion("offer_type >=", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLessThan(String value) {
            addCriterion("offer_type <", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLessThanOrEqualTo(String value) {
            addCriterion("offer_type <=", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLike(String value) {
            addCriterion("offer_type like", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotLike(String value) {
            addCriterion("offer_type not like", value, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeIn(List<String> values) {
            addCriterion("offer_type in", values, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotIn(List<String> values) {
            addCriterion("offer_type not in", values, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeBetween(String value1, String value2) {
            addCriterion("offer_type between", value1, value2, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferTypeNotBetween(String value1, String value2) {
            addCriterion("offer_type not between", value1, value2, "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferStatusIsNull() {
            addCriterion("offer_status is null");
            return (Criteria) this;
        }

        public Criteria andOfferStatusIsNotNull() {
            addCriterion("offer_status is not null");
            return (Criteria) this;
        }

        public Criteria andOfferStatusEqualTo(String value) {
            addCriterion("offer_status =", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusNotEqualTo(String value) {
            addCriterion("offer_status <>", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusGreaterThan(String value) {
            addCriterion("offer_status >", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusGreaterThanOrEqualTo(String value) {
            addCriterion("offer_status >=", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusLessThan(String value) {
            addCriterion("offer_status <", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusLessThanOrEqualTo(String value) {
            addCriterion("offer_status <=", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusLike(String value) {
            addCriterion("offer_status like", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusNotLike(String value) {
            addCriterion("offer_status not like", value, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusIn(List<String> values) {
            addCriterion("offer_status in", values, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusNotIn(List<String> values) {
            addCriterion("offer_status not in", values, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusBetween(String value1, String value2) {
            addCriterion("offer_status between", value1, value2, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferStatusNotBetween(String value1, String value2) {
            addCriterion("offer_status not between", value1, value2, "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferUserIsNull() {
            addCriterion("offer_user is null");
            return (Criteria) this;
        }

        public Criteria andOfferUserIsNotNull() {
            addCriterion("offer_user is not null");
            return (Criteria) this;
        }

        public Criteria andOfferUserEqualTo(String value) {
            addCriterion("offer_user =", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserNotEqualTo(String value) {
            addCriterion("offer_user <>", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserGreaterThan(String value) {
            addCriterion("offer_user >", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserGreaterThanOrEqualTo(String value) {
            addCriterion("offer_user >=", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserLessThan(String value) {
            addCriterion("offer_user <", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserLessThanOrEqualTo(String value) {
            addCriterion("offer_user <=", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserLike(String value) {
            addCriterion("offer_user like", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserNotLike(String value) {
            addCriterion("offer_user not like", value, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserIn(List<String> values) {
            addCriterion("offer_user in", values, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserNotIn(List<String> values) {
            addCriterion("offer_user not in", values, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserBetween(String value1, String value2) {
            addCriterion("offer_user between", value1, value2, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserNotBetween(String value1, String value2) {
            addCriterion("offer_user not between", value1, value2, "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameIsNull() {
            addCriterion("offer_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameIsNotNull() {
            addCriterion("offer_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameEqualTo(String value) {
            addCriterion("offer_user_name =", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameNotEqualTo(String value) {
            addCriterion("offer_user_name <>", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameGreaterThan(String value) {
            addCriterion("offer_user_name >", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("offer_user_name >=", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameLessThan(String value) {
            addCriterion("offer_user_name <", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameLessThanOrEqualTo(String value) {
            addCriterion("offer_user_name <=", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameLike(String value) {
            addCriterion("offer_user_name like", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameNotLike(String value) {
            addCriterion("offer_user_name not like", value, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameIn(List<String> values) {
            addCriterion("offer_user_name in", values, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameNotIn(List<String> values) {
            addCriterion("offer_user_name not in", values, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameBetween(String value1, String value2) {
            addCriterion("offer_user_name between", value1, value2, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameNotBetween(String value1, String value2) {
            addCriterion("offer_user_name not between", value1, value2, "offerUserName");
            return (Criteria) this;
        }

        public Criteria andOfferTimeIsNull() {
            addCriterion("offer_time is null");
            return (Criteria) this;
        }

        public Criteria andOfferTimeIsNotNull() {
            addCriterion("offer_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfferTimeEqualTo(Date value) {
            addCriterion("offer_time =", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeNotEqualTo(Date value) {
            addCriterion("offer_time <>", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeGreaterThan(Date value) {
            addCriterion("offer_time >", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_time >=", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeLessThan(Date value) {
            addCriterion("offer_time <", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_time <=", value, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeIn(List<Date> values) {
            addCriterion("offer_time in", values, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeNotIn(List<Date> values) {
            addCriterion("offer_time not in", values, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeBetween(Date value1, Date value2) {
            addCriterion("offer_time between", value1, value2, "offerTime");
            return (Criteria) this;
        }

        public Criteria andOfferTimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_time not between", value1, value2, "offerTime");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("audit_user is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(String value) {
            addCriterion("audit_user =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(String value) {
            addCriterion("audit_user <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(String value) {
            addCriterion("audit_user >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(String value) {
            addCriterion("audit_user <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(String value) {
            addCriterion("audit_user <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLike(String value) {
            addCriterion("audit_user like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotLike(String value) {
            addCriterion("audit_user not like", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<String> values) {
            addCriterion("audit_user in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<String> values) {
            addCriterion("audit_user not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(String value1, String value2) {
            addCriterion("audit_user between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(String value1, String value2) {
            addCriterion("audit_user not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNull() {
            addCriterion("audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNotNull() {
            addCriterion("audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameEqualTo(String value) {
            addCriterion("audit_user_name =", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotEqualTo(String value) {
            addCriterion("audit_user_name <>", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThan(String value) {
            addCriterion("audit_user_name >", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user_name >=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThan(String value) {
            addCriterion("audit_user_name <", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("audit_user_name <=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLike(String value) {
            addCriterion("audit_user_name like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotLike(String value) {
            addCriterion("audit_user_name not like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIn(List<String> values) {
            addCriterion("audit_user_name in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotIn(List<String> values) {
            addCriterion("audit_user_name not in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameBetween(String value1, String value2) {
            addCriterion("audit_user_name between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("audit_user_name not between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andOfferReasonIsNull() {
            addCriterion("offer_reason is null");
            return (Criteria) this;
        }

        public Criteria andOfferReasonIsNotNull() {
            addCriterion("offer_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOfferReasonEqualTo(String value) {
            addCriterion("offer_reason =", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonNotEqualTo(String value) {
            addCriterion("offer_reason <>", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonGreaterThan(String value) {
            addCriterion("offer_reason >", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonGreaterThanOrEqualTo(String value) {
            addCriterion("offer_reason >=", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonLessThan(String value) {
            addCriterion("offer_reason <", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonLessThanOrEqualTo(String value) {
            addCriterion("offer_reason <=", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonLike(String value) {
            addCriterion("offer_reason like", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonNotLike(String value) {
            addCriterion("offer_reason not like", value, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonIn(List<String> values) {
            addCriterion("offer_reason in", values, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonNotIn(List<String> values) {
            addCriterion("offer_reason not in", values, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonBetween(String value1, String value2) {
            addCriterion("offer_reason between", value1, value2, "offerReason");
            return (Criteria) this;
        }

        public Criteria andOfferReasonNotBetween(String value1, String value2) {
            addCriterion("offer_reason not between", value1, value2, "offerReason");
            return (Criteria) this;
        }

        public Criteria andCateEnameIsNull() {
            addCriterion("cate_Ename is null");
            return (Criteria) this;
        }

        public Criteria andCateEnameIsNotNull() {
            addCriterion("cate_Ename is not null");
            return (Criteria) this;
        }

        public Criteria andCateEnameEqualTo(String value) {
            addCriterion("cate_Ename =", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameNotEqualTo(String value) {
            addCriterion("cate_Ename <>", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameGreaterThan(String value) {
            addCriterion("cate_Ename >", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameGreaterThanOrEqualTo(String value) {
            addCriterion("cate_Ename >=", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameLessThan(String value) {
            addCriterion("cate_Ename <", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameLessThanOrEqualTo(String value) {
            addCriterion("cate_Ename <=", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameLike(String value) {
            addCriterion("cate_Ename like", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameNotLike(String value) {
            addCriterion("cate_Ename not like", value, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameIn(List<String> values) {
            addCriterion("cate_Ename in", values, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameNotIn(List<String> values) {
            addCriterion("cate_Ename not in", values, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameBetween(String value1, String value2) {
            addCriterion("cate_Ename between", value1, value2, "cateEname");
            return (Criteria) this;
        }

        public Criteria andCateEnameNotBetween(String value1, String value2) {
            addCriterion("cate_Ename not between", value1, value2, "cateEname");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismIsNull() {
            addCriterion("north_colloquialism is null");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismIsNotNull() {
            addCriterion("north_colloquialism is not null");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismEqualTo(String value) {
            addCriterion("north_colloquialism =", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismNotEqualTo(String value) {
            addCriterion("north_colloquialism <>", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismGreaterThan(String value) {
            addCriterion("north_colloquialism >", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismGreaterThanOrEqualTo(String value) {
            addCriterion("north_colloquialism >=", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismLessThan(String value) {
            addCriterion("north_colloquialism <", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismLessThanOrEqualTo(String value) {
            addCriterion("north_colloquialism <=", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismLike(String value) {
            addCriterion("north_colloquialism like", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismNotLike(String value) {
            addCriterion("north_colloquialism not like", value, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismIn(List<String> values) {
            addCriterion("north_colloquialism in", values, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismNotIn(List<String> values) {
            addCriterion("north_colloquialism not in", values, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismBetween(String value1, String value2) {
            addCriterion("north_colloquialism between", value1, value2, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismNotBetween(String value1, String value2) {
            addCriterion("north_colloquialism not between", value1, value2, "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismIsNull() {
            addCriterion("south_colloquialism is null");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismIsNotNull() {
            addCriterion("south_colloquialism is not null");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismEqualTo(String value) {
            addCriterion("south_colloquialism =", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismNotEqualTo(String value) {
            addCriterion("south_colloquialism <>", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismGreaterThan(String value) {
            addCriterion("south_colloquialism >", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismGreaterThanOrEqualTo(String value) {
            addCriterion("south_colloquialism >=", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismLessThan(String value) {
            addCriterion("south_colloquialism <", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismLessThanOrEqualTo(String value) {
            addCriterion("south_colloquialism <=", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismLike(String value) {
            addCriterion("south_colloquialism like", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismNotLike(String value) {
            addCriterion("south_colloquialism not like", value, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismIn(List<String> values) {
            addCriterion("south_colloquialism in", values, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismNotIn(List<String> values) {
            addCriterion("south_colloquialism not in", values, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismBetween(String value1, String value2) {
            addCriterion("south_colloquialism between", value1, value2, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismNotBetween(String value1, String value2) {
            addCriterion("south_colloquialism not between", value1, value2, "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andHsCodeIsNull() {
            addCriterion("HS_code is null");
            return (Criteria) this;
        }

        public Criteria andHsCodeIsNotNull() {
            addCriterion("HS_code is not null");
            return (Criteria) this;
        }

        public Criteria andHsCodeEqualTo(String value) {
            addCriterion("HS_code =", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeNotEqualTo(String value) {
            addCriterion("HS_code <>", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeGreaterThan(String value) {
            addCriterion("HS_code >", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HS_code >=", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeLessThan(String value) {
            addCriterion("HS_code <", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeLessThanOrEqualTo(String value) {
            addCriterion("HS_code <=", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeLike(String value) {
            addCriterion("HS_code like", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeNotLike(String value) {
            addCriterion("HS_code not like", value, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeIn(List<String> values) {
            addCriterion("HS_code in", values, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeNotIn(List<String> values) {
            addCriterion("HS_code not in", values, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeBetween(String value1, String value2) {
            addCriterion("HS_code between", value1, value2, "hsCode");
            return (Criteria) this;
        }

        public Criteria andHsCodeNotBetween(String value1, String value2) {
            addCriterion("HS_code not between", value1, value2, "hsCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(String value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(String value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(String value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(String value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(String value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLike(String value) {
            addCriterion("tax_rate like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotLike(String value) {
            addCriterion("tax_rate not like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<String> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<String> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(String value1, String value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(String value1, String value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andRearingModeIsNull() {
            addCriterion("rearing_mode is null");
            return (Criteria) this;
        }

        public Criteria andRearingModeIsNotNull() {
            addCriterion("rearing_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRearingModeEqualTo(String value) {
            addCriterion("rearing_mode =", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeNotEqualTo(String value) {
            addCriterion("rearing_mode <>", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeGreaterThan(String value) {
            addCriterion("rearing_mode >", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeGreaterThanOrEqualTo(String value) {
            addCriterion("rearing_mode >=", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeLessThan(String value) {
            addCriterion("rearing_mode <", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeLessThanOrEqualTo(String value) {
            addCriterion("rearing_mode <=", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeLike(String value) {
            addCriterion("rearing_mode like", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeNotLike(String value) {
            addCriterion("rearing_mode not like", value, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeIn(List<String> values) {
            addCriterion("rearing_mode in", values, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeNotIn(List<String> values) {
            addCriterion("rearing_mode not in", values, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeBetween(String value1, String value2) {
            addCriterion("rearing_mode between", value1, value2, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andRearingModeNotBetween(String value1, String value2) {
            addCriterion("rearing_mode not between", value1, value2, "rearingMode");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andPerWeightIsNull() {
            addCriterion("per_weight is null");
            return (Criteria) this;
        }

        public Criteria andPerWeightIsNotNull() {
            addCriterion("per_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPerWeightEqualTo(String value) {
            addCriterion("per_weight =", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightNotEqualTo(String value) {
            addCriterion("per_weight <>", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightGreaterThan(String value) {
            addCriterion("per_weight >", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightGreaterThanOrEqualTo(String value) {
            addCriterion("per_weight >=", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightLessThan(String value) {
            addCriterion("per_weight <", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightLessThanOrEqualTo(String value) {
            addCriterion("per_weight <=", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightLike(String value) {
            addCriterion("per_weight like", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightNotLike(String value) {
            addCriterion("per_weight not like", value, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightIn(List<String> values) {
            addCriterion("per_weight in", values, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightNotIn(List<String> values) {
            addCriterion("per_weight not in", values, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightBetween(String value1, String value2) {
            addCriterion("per_weight between", value1, value2, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWeightNotBetween(String value1, String value2) {
            addCriterion("per_weight not between", value1, value2, "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWidthIsNull() {
            addCriterion("per_width is null");
            return (Criteria) this;
        }

        public Criteria andPerWidthIsNotNull() {
            addCriterion("per_width is not null");
            return (Criteria) this;
        }

        public Criteria andPerWidthEqualTo(String value) {
            addCriterion("per_width =", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthNotEqualTo(String value) {
            addCriterion("per_width <>", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthGreaterThan(String value) {
            addCriterion("per_width >", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthGreaterThanOrEqualTo(String value) {
            addCriterion("per_width >=", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthLessThan(String value) {
            addCriterion("per_width <", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthLessThanOrEqualTo(String value) {
            addCriterion("per_width <=", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthLike(String value) {
            addCriterion("per_width like", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthNotLike(String value) {
            addCriterion("per_width not like", value, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthIn(List<String> values) {
            addCriterion("per_width in", values, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthNotIn(List<String> values) {
            addCriterion("per_width not in", values, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthBetween(String value1, String value2) {
            addCriterion("per_width between", value1, value2, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerWidthNotBetween(String value1, String value2) {
            addCriterion("per_width not between", value1, value2, "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerLengthIsNull() {
            addCriterion("per_length is null");
            return (Criteria) this;
        }

        public Criteria andPerLengthIsNotNull() {
            addCriterion("per_length is not null");
            return (Criteria) this;
        }

        public Criteria andPerLengthEqualTo(String value) {
            addCriterion("per_length =", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthNotEqualTo(String value) {
            addCriterion("per_length <>", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthGreaterThan(String value) {
            addCriterion("per_length >", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthGreaterThanOrEqualTo(String value) {
            addCriterion("per_length >=", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthLessThan(String value) {
            addCriterion("per_length <", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthLessThanOrEqualTo(String value) {
            addCriterion("per_length <=", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthLike(String value) {
            addCriterion("per_length like", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthNotLike(String value) {
            addCriterion("per_length not like", value, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthIn(List<String> values) {
            addCriterion("per_length in", values, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthNotIn(List<String> values) {
            addCriterion("per_length not in", values, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthBetween(String value1, String value2) {
            addCriterion("per_length between", value1, value2, "perLength");
            return (Criteria) this;
        }

        public Criteria andPerLengthNotBetween(String value1, String value2) {
            addCriterion("per_length not between", value1, value2, "perLength");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNull() {
            addCriterion("net_weight is null");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNotNull() {
            addCriterion("net_weight is not null");
            return (Criteria) this;
        }

        public Criteria andNetWeightEqualTo(String value) {
            addCriterion("net_weight =", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotEqualTo(String value) {
            addCriterion("net_weight <>", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThan(String value) {
            addCriterion("net_weight >", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThanOrEqualTo(String value) {
            addCriterion("net_weight >=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThan(String value) {
            addCriterion("net_weight <", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThanOrEqualTo(String value) {
            addCriterion("net_weight <=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLike(String value) {
            addCriterion("net_weight like", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotLike(String value) {
            addCriterion("net_weight not like", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIn(List<String> values) {
            addCriterion("net_weight in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotIn(List<String> values) {
            addCriterion("net_weight not in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightBetween(String value1, String value2) {
            addCriterion("net_weight between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotBetween(String value1, String value2) {
            addCriterion("net_weight not between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andPerNumberIsNull() {
            addCriterion("per_number is null");
            return (Criteria) this;
        }

        public Criteria andPerNumberIsNotNull() {
            addCriterion("per_number is not null");
            return (Criteria) this;
        }

        public Criteria andPerNumberEqualTo(String value) {
            addCriterion("per_number =", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberNotEqualTo(String value) {
            addCriterion("per_number <>", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberGreaterThan(String value) {
            addCriterion("per_number >", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("per_number >=", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberLessThan(String value) {
            addCriterion("per_number <", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberLessThanOrEqualTo(String value) {
            addCriterion("per_number <=", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberLike(String value) {
            addCriterion("per_number like", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberNotLike(String value) {
            addCriterion("per_number not like", value, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberIn(List<String> values) {
            addCriterion("per_number in", values, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberNotIn(List<String> values) {
            addCriterion("per_number not in", values, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberBetween(String value1, String value2) {
            addCriterion("per_number between", value1, value2, "perNumber");
            return (Criteria) this;
        }

        public Criteria andPerNumberNotBetween(String value1, String value2) {
            addCriterion("per_number not between", value1, value2, "perNumber");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightIsNull() {
            addCriterion("avg_box_weight is null");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightIsNotNull() {
            addCriterion("avg_box_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightEqualTo(String value) {
            addCriterion("avg_box_weight =", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightNotEqualTo(String value) {
            addCriterion("avg_box_weight <>", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightGreaterThan(String value) {
            addCriterion("avg_box_weight >", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightGreaterThanOrEqualTo(String value) {
            addCriterion("avg_box_weight >=", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightLessThan(String value) {
            addCriterion("avg_box_weight <", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightLessThanOrEqualTo(String value) {
            addCriterion("avg_box_weight <=", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightLike(String value) {
            addCriterion("avg_box_weight like", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightNotLike(String value) {
            addCriterion("avg_box_weight not like", value, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightIn(List<String> values) {
            addCriterion("avg_box_weight in", values, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightNotIn(List<String> values) {
            addCriterion("avg_box_weight not in", values, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightBetween(String value1, String value2) {
            addCriterion("avg_box_weight between", value1, value2, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightNotBetween(String value1, String value2) {
            addCriterion("avg_box_weight not between", value1, value2, "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andCuttingModeIsNull() {
            addCriterion("cutting_mode is null");
            return (Criteria) this;
        }

        public Criteria andCuttingModeIsNotNull() {
            addCriterion("cutting_mode is not null");
            return (Criteria) this;
        }

        public Criteria andCuttingModeEqualTo(String value) {
            addCriterion("cutting_mode =", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeNotEqualTo(String value) {
            addCriterion("cutting_mode <>", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeGreaterThan(String value) {
            addCriterion("cutting_mode >", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeGreaterThanOrEqualTo(String value) {
            addCriterion("cutting_mode >=", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeLessThan(String value) {
            addCriterion("cutting_mode <", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeLessThanOrEqualTo(String value) {
            addCriterion("cutting_mode <=", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeLike(String value) {
            addCriterion("cutting_mode like", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeNotLike(String value) {
            addCriterion("cutting_mode not like", value, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeIn(List<String> values) {
            addCriterion("cutting_mode in", values, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeNotIn(List<String> values) {
            addCriterion("cutting_mode not in", values, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeBetween(String value1, String value2) {
            addCriterion("cutting_mode between", value1, value2, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andCuttingModeNotBetween(String value1, String value2) {
            addCriterion("cutting_mode not between", value1, value2, "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeIsNull() {
            addCriterion("packing_mode is null");
            return (Criteria) this;
        }

        public Criteria andPackingModeIsNotNull() {
            addCriterion("packing_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPackingModeEqualTo(String value) {
            addCriterion("packing_mode =", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeNotEqualTo(String value) {
            addCriterion("packing_mode <>", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeGreaterThan(String value) {
            addCriterion("packing_mode >", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeGreaterThanOrEqualTo(String value) {
            addCriterion("packing_mode >=", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeLessThan(String value) {
            addCriterion("packing_mode <", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeLessThanOrEqualTo(String value) {
            addCriterion("packing_mode <=", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeLike(String value) {
            addCriterion("packing_mode like", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeNotLike(String value) {
            addCriterion("packing_mode not like", value, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeIn(List<String> values) {
            addCriterion("packing_mode in", values, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeNotIn(List<String> values) {
            addCriterion("packing_mode not in", values, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeBetween(String value1, String value2) {
            addCriterion("packing_mode between", value1, value2, "packingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeNotBetween(String value1, String value2) {
            addCriterion("packing_mode not between", value1, value2, "packingMode");
            return (Criteria) this;
        }

        public Criteria andOtherContentIsNull() {
            addCriterion("other_content is null");
            return (Criteria) this;
        }

        public Criteria andOtherContentIsNotNull() {
            addCriterion("other_content is not null");
            return (Criteria) this;
        }

        public Criteria andOtherContentEqualTo(String value) {
            addCriterion("other_content =", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotEqualTo(String value) {
            addCriterion("other_content <>", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentGreaterThan(String value) {
            addCriterion("other_content >", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentGreaterThanOrEqualTo(String value) {
            addCriterion("other_content >=", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentLessThan(String value) {
            addCriterion("other_content <", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentLessThanOrEqualTo(String value) {
            addCriterion("other_content <=", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentLike(String value) {
            addCriterion("other_content like", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotLike(String value) {
            addCriterion("other_content not like", value, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentIn(List<String> values) {
            addCriterion("other_content in", values, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotIn(List<String> values) {
            addCriterion("other_content not in", values, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentBetween(String value1, String value2) {
            addCriterion("other_content between", value1, value2, "otherContent");
            return (Criteria) this;
        }

        public Criteria andOtherContentNotBetween(String value1, String value2) {
            addCriterion("other_content not between", value1, value2, "otherContent");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("factory_name is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("factory_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("factory_name =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("factory_name <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("factory_name >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("factory_name >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("factory_name <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("factory_name <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("factory_name like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("factory_name not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("factory_name in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("factory_name not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("factory_name between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("factory_name not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andBak1IsNull() {
            addCriterion("bak1 is null");
            return (Criteria) this;
        }

        public Criteria andBak1IsNotNull() {
            addCriterion("bak1 is not null");
            return (Criteria) this;
        }

        public Criteria andBak1EqualTo(String value) {
            addCriterion("bak1 =", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotEqualTo(String value) {
            addCriterion("bak1 <>", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThan(String value) {
            addCriterion("bak1 >", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1GreaterThanOrEqualTo(String value) {
            addCriterion("bak1 >=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThan(String value) {
            addCriterion("bak1 <", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1LessThanOrEqualTo(String value) {
            addCriterion("bak1 <=", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Like(String value) {
            addCriterion("bak1 like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotLike(String value) {
            addCriterion("bak1 not like", value, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1In(List<String> values) {
            addCriterion("bak1 in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotIn(List<String> values) {
            addCriterion("bak1 not in", values, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1Between(String value1, String value2) {
            addCriterion("bak1 between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andBak1NotBetween(String value1, String value2) {
            addCriterion("bak1 not between", value1, value2, "bak1");
            return (Criteria) this;
        }

        public Criteria andPricelessSignIsNull() {
            addCriterion("priceless_sign is null");
            return (Criteria) this;
        }

        public Criteria andPricelessSignIsNotNull() {
            addCriterion("priceless_sign is not null");
            return (Criteria) this;
        }

        public Criteria andPricelessSignEqualTo(String value) {
            addCriterion("priceless_sign =", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignNotEqualTo(String value) {
            addCriterion("priceless_sign <>", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignGreaterThan(String value) {
            addCriterion("priceless_sign >", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignGreaterThanOrEqualTo(String value) {
            addCriterion("priceless_sign >=", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignLessThan(String value) {
            addCriterion("priceless_sign <", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignLessThanOrEqualTo(String value) {
            addCriterion("priceless_sign <=", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignLike(String value) {
            addCriterion("priceless_sign like", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignNotLike(String value) {
            addCriterion("priceless_sign not like", value, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignIn(List<String> values) {
            addCriterion("priceless_sign in", values, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignNotIn(List<String> values) {
            addCriterion("priceless_sign not in", values, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignBetween(String value1, String value2) {
            addCriterion("priceless_sign between", value1, value2, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andPricelessSignNotBetween(String value1, String value2) {
            addCriterion("priceless_sign not between", value1, value2, "pricelessSign");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIsNull() {
            addCriterion("total_inventory is null");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIsNotNull() {
            addCriterion("total_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryEqualTo(BigDecimal value) {
            addCriterion("total_inventory =", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotEqualTo(BigDecimal value) {
            addCriterion("total_inventory <>", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryGreaterThan(BigDecimal value) {
            addCriterion("total_inventory >", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_inventory >=", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryLessThan(BigDecimal value) {
            addCriterion("total_inventory <", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_inventory <=", value, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryIn(List<BigDecimal> values) {
            addCriterion("total_inventory in", values, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotIn(List<BigDecimal> values) {
            addCriterion("total_inventory not in", values, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_inventory between", value1, value2, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andTotalInventoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_inventory not between", value1, value2, "totalInventory");
            return (Criteria) this;
        }

        public Criteria andOfferPriIdLikeInsensitive(String value) {
            addCriterion("upper(offer_pri_id) like", value.toUpperCase(), "offerPriId");
            return (Criteria) this;
        }

        public Criteria andCateIdLikeInsensitive(String value) {
            addCriterion("upper(cate_id) like", value.toUpperCase(), "cateId");
            return (Criteria) this;
        }

        public Criteria andCateNameLikeInsensitive(String value) {
            addCriterion("upper(cate_name) like", value.toUpperCase(), "cateName");
            return (Criteria) this;
        }

        public Criteria andCateStanLikeInsensitive(String value) {
            addCriterion("upper(cate_stan) like", value.toUpperCase(), "cateStan");
            return (Criteria) this;
        }

        public Criteria andManuNumLikeInsensitive(String value) {
            addCriterion("upper(manu_num) like", value.toUpperCase(), "manuNum");
            return (Criteria) this;
        }

        public Criteria andProdPlaLikeInsensitive(String value) {
            addCriterion("upper(prod_pla) like", value.toUpperCase(), "prodPla");
            return (Criteria) this;
        }

        public Criteria andArtNoLikeInsensitive(String value) {
            addCriterion("upper(art_no) like", value.toUpperCase(), "artNo");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLikeInsensitive(String value) {
            addCriterion("upper(expiry_date) like", value.toUpperCase(), "expiryDate");
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

        public Criteria andStandardCatchLikeInsensitive(String value) {
            addCriterion("upper(standard_catch) like", value.toUpperCase(), "standardCatch");
            return (Criteria) this;
        }

        public Criteria andOfferTypeLikeInsensitive(String value) {
            addCriterion("upper(offer_type) like", value.toUpperCase(), "offerType");
            return (Criteria) this;
        }

        public Criteria andOfferStatusLikeInsensitive(String value) {
            addCriterion("upper(offer_status) like", value.toUpperCase(), "offerStatus");
            return (Criteria) this;
        }

        public Criteria andOfferUserLikeInsensitive(String value) {
            addCriterion("upper(offer_user) like", value.toUpperCase(), "offerUser");
            return (Criteria) this;
        }

        public Criteria andOfferUserNameLikeInsensitive(String value) {
            addCriterion("upper(offer_user_name) like", value.toUpperCase(), "offerUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserLikeInsensitive(String value) {
            addCriterion("upper(audit_user) like", value.toUpperCase(), "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLikeInsensitive(String value) {
            addCriterion("upper(audit_user_name) like", value.toUpperCase(), "auditUserName");
            return (Criteria) this;
        }

        public Criteria andOfferReasonLikeInsensitive(String value) {
            addCriterion("upper(offer_reason) like", value.toUpperCase(), "offerReason");
            return (Criteria) this;
        }

        public Criteria andCateEnameLikeInsensitive(String value) {
            addCriterion("upper(cate_Ename) like", value.toUpperCase(), "cateEname");
            return (Criteria) this;
        }

        public Criteria andNorthColloquialismLikeInsensitive(String value) {
            addCriterion("upper(north_colloquialism) like", value.toUpperCase(), "northColloquialism");
            return (Criteria) this;
        }

        public Criteria andSouthColloquialismLikeInsensitive(String value) {
            addCriterion("upper(south_colloquialism) like", value.toUpperCase(), "southColloquialism");
            return (Criteria) this;
        }

        public Criteria andHsCodeLikeInsensitive(String value) {
            addCriterion("upper(HS_code) like", value.toUpperCase(), "hsCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateLikeInsensitive(String value) {
            addCriterion("upper(tax_rate) like", value.toUpperCase(), "taxRate");
            return (Criteria) this;
        }

        public Criteria andRearingModeLikeInsensitive(String value) {
            addCriterion("upper(rearing_mode) like", value.toUpperCase(), "rearingMode");
            return (Criteria) this;
        }

        public Criteria andGradeLikeInsensitive(String value) {
            addCriterion("upper(grade) like", value.toUpperCase(), "grade");
            return (Criteria) this;
        }

        public Criteria andPerWeightLikeInsensitive(String value) {
            addCriterion("upper(per_weight) like", value.toUpperCase(), "perWeight");
            return (Criteria) this;
        }

        public Criteria andPerWidthLikeInsensitive(String value) {
            addCriterion("upper(per_width) like", value.toUpperCase(), "perWidth");
            return (Criteria) this;
        }

        public Criteria andPerLengthLikeInsensitive(String value) {
            addCriterion("upper(per_length) like", value.toUpperCase(), "perLength");
            return (Criteria) this;
        }

        public Criteria andNetWeightLikeInsensitive(String value) {
            addCriterion("upper(net_weight) like", value.toUpperCase(), "netWeight");
            return (Criteria) this;
        }

        public Criteria andPerNumberLikeInsensitive(String value) {
            addCriterion("upper(per_number) like", value.toUpperCase(), "perNumber");
            return (Criteria) this;
        }

        public Criteria andAvgBoxWeightLikeInsensitive(String value) {
            addCriterion("upper(avg_box_weight) like", value.toUpperCase(), "avgBoxWeight");
            return (Criteria) this;
        }

        public Criteria andCuttingModeLikeInsensitive(String value) {
            addCriterion("upper(cutting_mode) like", value.toUpperCase(), "cuttingMode");
            return (Criteria) this;
        }

        public Criteria andPackingModeLikeInsensitive(String value) {
            addCriterion("upper(packing_mode) like", value.toUpperCase(), "packingMode");
            return (Criteria) this;
        }

        public Criteria andOtherContentLikeInsensitive(String value) {
            addCriterion("upper(other_content) like", value.toUpperCase(), "otherContent");
            return (Criteria) this;
        }

        public Criteria andSupplierLikeInsensitive(String value) {
            addCriterion("upper(supplier) like", value.toUpperCase(), "supplier");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLikeInsensitive(String value) {
            addCriterion("upper(factory_name) like", value.toUpperCase(), "factoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryLikeInsensitive(String value) {
            addCriterion("upper(category) like", value.toUpperCase(), "category");
            return (Criteria) this;
        }

        public Criteria andBak1LikeInsensitive(String value) {
            addCriterion("upper(bak1) like", value.toUpperCase(), "bak1");
            return (Criteria) this;
        }

        public Criteria andPricelessSignLikeInsensitive(String value) {
            addCriterion("upper(priceless_sign) like", value.toUpperCase(), "pricelessSign");
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
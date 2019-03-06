package com.rhtop.buss.common.dao.sys.domain;

import com.rhtop.buss.common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileAttachCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /** 主键ID */
    private Integer id;

    /** 关联记录ID，关联的表的主键ID */
    private String refId;

    private String refIdRange;

    /** 关联业务类型，对应字典FileAttachBusiType：CATE_IMG-品类图片，PAY_IMG-打款凭证，SEND_IMG-发货凭证 */
    private String refBusiType;

    private String refBusiTypeRange;

    /** 原文件名 */
    private String oriFileName;

    private String oriFileNameRange;

    /** 文件类型 */
    private String fileType;

    private String fileTypeRange;

    /** 生成文件名 */
    private String genFileName;

    private String genFileNameRange;

    /** 文件存储在服务器上的绝对路径 */
    private String fileSaveLocation;

    private String fileSaveLocationRange;

    /** 文件服务器host */
    private String fileServerHost;

    private String fileServerHostRange;

    /** 文件http路径 */
    private String fileServerPath;

    private String fileServerPathRange;

    /** 备注 */
    private String remark;

    private String remarkRange;

    /** 上传人 */
    private String createUser;

    private String createUserRange;

    /** 上传时间 */
    private Date createTime;

    private Date createTimeRange1;

    private Date createTimeRange2;

    private String extracClause;

    private String extracSelectColunm;

    private String extracTable;

    private Page page;

    public FileAttachCriteria() {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    public String getRefIdRange() {
        return refIdRange;
    }

    public void setRefIdRange(String refIdRange) {
        this.refIdRange = refIdRange == null ? null : refIdRange.trim();
    }

    public String getRefBusiType() {
        return refBusiType;
    }

    public void setRefBusiType(String refBusiType) {
        this.refBusiType = refBusiType == null ? null : refBusiType.trim();
    }

    public String getRefBusiTypeRange() {
        return refBusiTypeRange;
    }

    public void setRefBusiTypeRange(String refBusiTypeRange) {
        this.refBusiTypeRange = refBusiTypeRange == null ? null : refBusiTypeRange.trim();
    }

    public String getOriFileName() {
        return oriFileName;
    }

    public void setOriFileName(String oriFileName) {
        this.oriFileName = oriFileName == null ? null : oriFileName.trim();
    }

    public String getOriFileNameRange() {
        return oriFileNameRange;
    }

    public void setOriFileNameRange(String oriFileNameRange) {
        this.oriFileNameRange = oriFileNameRange == null ? null : oriFileNameRange.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileTypeRange() {
        return fileTypeRange;
    }

    public void setFileTypeRange(String fileTypeRange) {
        this.fileTypeRange = fileTypeRange == null ? null : fileTypeRange.trim();
    }

    public String getGenFileName() {
        return genFileName;
    }

    public void setGenFileName(String genFileName) {
        this.genFileName = genFileName == null ? null : genFileName.trim();
    }

    public String getGenFileNameRange() {
        return genFileNameRange;
    }

    public void setGenFileNameRange(String genFileNameRange) {
        this.genFileNameRange = genFileNameRange == null ? null : genFileNameRange.trim();
    }

    public String getFileSaveLocation() {
        return fileSaveLocation;
    }

    public void setFileSaveLocation(String fileSaveLocation) {
        this.fileSaveLocation = fileSaveLocation == null ? null : fileSaveLocation.trim();
    }

    public String getFileSaveLocationRange() {
        return fileSaveLocationRange;
    }

    public void setFileSaveLocationRange(String fileSaveLocationRange) {
        this.fileSaveLocationRange = fileSaveLocationRange == null ? null : fileSaveLocationRange.trim();
    }

    public String getFileServerHost() {
        return fileServerHost;
    }

    public void setFileServerHost(String fileServerHost) {
        this.fileServerHost = fileServerHost == null ? null : fileServerHost.trim();
    }

    public String getFileServerHostRange() {
        return fileServerHostRange;
    }

    public void setFileServerHostRange(String fileServerHostRange) {
        this.fileServerHostRange = fileServerHostRange == null ? null : fileServerHostRange.trim();
    }

    public String getFileServerPath() {
        return fileServerPath;
    }

    public void setFileServerPath(String fileServerPath) {
        this.fileServerPath = fileServerPath == null ? null : fileServerPath.trim();
    }

    public String getFileServerPathRange() {
        return fileServerPathRange;
    }

    public void setFileServerPathRange(String fileServerPathRange) {
        this.fileServerPathRange = fileServerPathRange == null ? null : fileServerPathRange.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemarkRange() {
        return remarkRange;
    }

    public void setRemarkRange(String remarkRange) {
        this.remarkRange = remarkRange == null ? null : remarkRange.trim();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(String value) {
            addCriterion("ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(String value) {
            addCriterion("ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(String value) {
            addCriterion("ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(String value) {
            addCriterion("ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(String value) {
            addCriterion("ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLike(String value) {
            addCriterion("ref_id like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotLike(String value) {
            addCriterion("ref_id not like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<String> values) {
            addCriterion("ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<String> values) {
            addCriterion("ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(String value1, String value2) {
            addCriterion("ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(String value1, String value2) {
            addCriterion("ref_id not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeIsNull() {
            addCriterion("ref_busi_type is null");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeIsNotNull() {
            addCriterion("ref_busi_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeEqualTo(String value) {
            addCriterion("ref_busi_type =", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeNotEqualTo(String value) {
            addCriterion("ref_busi_type <>", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeGreaterThan(String value) {
            addCriterion("ref_busi_type >", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ref_busi_type >=", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeLessThan(String value) {
            addCriterion("ref_busi_type <", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("ref_busi_type <=", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeLike(String value) {
            addCriterion("ref_busi_type like", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeNotLike(String value) {
            addCriterion("ref_busi_type not like", value, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeIn(List<String> values) {
            addCriterion("ref_busi_type in", values, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeNotIn(List<String> values) {
            addCriterion("ref_busi_type not in", values, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeBetween(String value1, String value2) {
            addCriterion("ref_busi_type between", value1, value2, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeNotBetween(String value1, String value2) {
            addCriterion("ref_busi_type not between", value1, value2, "refBusiType");
            return (Criteria) this;
        }

        public Criteria andOriFileNameIsNull() {
            addCriterion("ori_file_name is null");
            return (Criteria) this;
        }

        public Criteria andOriFileNameIsNotNull() {
            addCriterion("ori_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriFileNameEqualTo(String value) {
            addCriterion("ori_file_name =", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameNotEqualTo(String value) {
            addCriterion("ori_file_name <>", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameGreaterThan(String value) {
            addCriterion("ori_file_name >", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("ori_file_name >=", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameLessThan(String value) {
            addCriterion("ori_file_name <", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameLessThanOrEqualTo(String value) {
            addCriterion("ori_file_name <=", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameLike(String value) {
            addCriterion("ori_file_name like", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameNotLike(String value) {
            addCriterion("ori_file_name not like", value, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameIn(List<String> values) {
            addCriterion("ori_file_name in", values, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameNotIn(List<String> values) {
            addCriterion("ori_file_name not in", values, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameBetween(String value1, String value2) {
            addCriterion("ori_file_name between", value1, value2, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andOriFileNameNotBetween(String value1, String value2) {
            addCriterion("ori_file_name not between", value1, value2, "oriFileName");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andGenFileNameIsNull() {
            addCriterion("gen_file_name is null");
            return (Criteria) this;
        }

        public Criteria andGenFileNameIsNotNull() {
            addCriterion("gen_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andGenFileNameEqualTo(String value) {
            addCriterion("gen_file_name =", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameNotEqualTo(String value) {
            addCriterion("gen_file_name <>", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameGreaterThan(String value) {
            addCriterion("gen_file_name >", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("gen_file_name >=", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameLessThan(String value) {
            addCriterion("gen_file_name <", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameLessThanOrEqualTo(String value) {
            addCriterion("gen_file_name <=", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameLike(String value) {
            addCriterion("gen_file_name like", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameNotLike(String value) {
            addCriterion("gen_file_name not like", value, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameIn(List<String> values) {
            addCriterion("gen_file_name in", values, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameNotIn(List<String> values) {
            addCriterion("gen_file_name not in", values, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameBetween(String value1, String value2) {
            addCriterion("gen_file_name between", value1, value2, "genFileName");
            return (Criteria) this;
        }

        public Criteria andGenFileNameNotBetween(String value1, String value2) {
            addCriterion("gen_file_name not between", value1, value2, "genFileName");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationIsNull() {
            addCriterion("file_save_location is null");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationIsNotNull() {
            addCriterion("file_save_location is not null");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationEqualTo(String value) {
            addCriterion("file_save_location =", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationNotEqualTo(String value) {
            addCriterion("file_save_location <>", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationGreaterThan(String value) {
            addCriterion("file_save_location >", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationGreaterThanOrEqualTo(String value) {
            addCriterion("file_save_location >=", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationLessThan(String value) {
            addCriterion("file_save_location <", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationLessThanOrEqualTo(String value) {
            addCriterion("file_save_location <=", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationLike(String value) {
            addCriterion("file_save_location like", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationNotLike(String value) {
            addCriterion("file_save_location not like", value, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationIn(List<String> values) {
            addCriterion("file_save_location in", values, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationNotIn(List<String> values) {
            addCriterion("file_save_location not in", values, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationBetween(String value1, String value2) {
            addCriterion("file_save_location between", value1, value2, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationNotBetween(String value1, String value2) {
            addCriterion("file_save_location not between", value1, value2, "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileServerHostIsNull() {
            addCriterion("file_server_host is null");
            return (Criteria) this;
        }

        public Criteria andFileServerHostIsNotNull() {
            addCriterion("file_server_host is not null");
            return (Criteria) this;
        }

        public Criteria andFileServerHostEqualTo(String value) {
            addCriterion("file_server_host =", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostNotEqualTo(String value) {
            addCriterion("file_server_host <>", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostGreaterThan(String value) {
            addCriterion("file_server_host >", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostGreaterThanOrEqualTo(String value) {
            addCriterion("file_server_host >=", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostLessThan(String value) {
            addCriterion("file_server_host <", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostLessThanOrEqualTo(String value) {
            addCriterion("file_server_host <=", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostLike(String value) {
            addCriterion("file_server_host like", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostNotLike(String value) {
            addCriterion("file_server_host not like", value, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostIn(List<String> values) {
            addCriterion("file_server_host in", values, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostNotIn(List<String> values) {
            addCriterion("file_server_host not in", values, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostBetween(String value1, String value2) {
            addCriterion("file_server_host between", value1, value2, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerHostNotBetween(String value1, String value2) {
            addCriterion("file_server_host not between", value1, value2, "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerPathIsNull() {
            addCriterion("file_server_path is null");
            return (Criteria) this;
        }

        public Criteria andFileServerPathIsNotNull() {
            addCriterion("file_server_path is not null");
            return (Criteria) this;
        }

        public Criteria andFileServerPathEqualTo(String value) {
            addCriterion("file_server_path =", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathNotEqualTo(String value) {
            addCriterion("file_server_path <>", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathGreaterThan(String value) {
            addCriterion("file_server_path >", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathGreaterThanOrEqualTo(String value) {
            addCriterion("file_server_path >=", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathLessThan(String value) {
            addCriterion("file_server_path <", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathLessThanOrEqualTo(String value) {
            addCriterion("file_server_path <=", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathLike(String value) {
            addCriterion("file_server_path like", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathNotLike(String value) {
            addCriterion("file_server_path not like", value, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathIn(List<String> values) {
            addCriterion("file_server_path in", values, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathNotIn(List<String> values) {
            addCriterion("file_server_path not in", values, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathBetween(String value1, String value2) {
            addCriterion("file_server_path between", value1, value2, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andFileServerPathNotBetween(String value1, String value2) {
            addCriterion("file_server_path not between", value1, value2, "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andRefIdLikeInsensitive(String value) {
            addCriterion("upper(ref_id) like", value.toUpperCase(), "refId");
            return (Criteria) this;
        }

        public Criteria andRefBusiTypeLikeInsensitive(String value) {
            addCriterion("upper(ref_busi_type) like", value.toUpperCase(), "refBusiType");
            return (Criteria) this;
        }

        public Criteria andOriFileNameLikeInsensitive(String value) {
            addCriterion("upper(ori_file_name) like", value.toUpperCase(), "oriFileName");
            return (Criteria) this;
        }

        public Criteria andFileTypeLikeInsensitive(String value) {
            addCriterion("upper(file_type) like", value.toUpperCase(), "fileType");
            return (Criteria) this;
        }

        public Criteria andGenFileNameLikeInsensitive(String value) {
            addCriterion("upper(gen_file_name) like", value.toUpperCase(), "genFileName");
            return (Criteria) this;
        }

        public Criteria andFileSaveLocationLikeInsensitive(String value) {
            addCriterion("upper(file_save_location) like", value.toUpperCase(), "fileSaveLocation");
            return (Criteria) this;
        }

        public Criteria andFileServerHostLikeInsensitive(String value) {
            addCriterion("upper(file_server_host) like", value.toUpperCase(), "fileServerHost");
            return (Criteria) this;
        }

        public Criteria andFileServerPathLikeInsensitive(String value) {
            addCriterion("upper(file_server_path) like", value.toUpperCase(), "fileServerPath");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andCreateUserLikeInsensitive(String value) {
            addCriterion("upper(create_user) like", value.toUpperCase(), "createUser");
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
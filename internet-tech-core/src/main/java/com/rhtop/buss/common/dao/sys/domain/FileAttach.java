package com.rhtop.buss.common.dao.sys.domain;

import java.io.Serializable;
import java.util.Date;

public class FileAttach implements Serializable {
    /** 主键ID */
    private Integer id;

    /** 关联记录ID，关联的表的主键ID */
    private String refId;

    /** 关联业务类型，对应字典FileAttachBusiType：CATE_IMG-品类图片，PAY_IMG-打款凭证，SEND_IMG-发货凭证 */
    private String refBusiType;

    /** 原文件名 */
    private String oriFileName;

    /** 文件类型 */
    private String fileType;

    /** 生成文件名 */
    private String genFileName;

    /** 文件存储在服务器上的绝对路径 */
    private String fileSaveLocation;

    /** 文件服务器host */
    private String fileServerHost;

    /** 文件http路径 */
    private String fileServerPath;

    /** 备注 */
    private String remark;

    /** 上传人 */
    private String createUser;

    /** 上传时间 */
    private Date createTime;

    private static final long serialVersionUID = 1L;

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

    public String getRefBusiType() {
        return refBusiType;
    }

    public void setRefBusiType(String refBusiType) {
        this.refBusiType = refBusiType == null ? null : refBusiType.trim();
    }

    public String getOriFileName() {
        return oriFileName;
    }

    public void setOriFileName(String oriFileName) {
        this.oriFileName = oriFileName == null ? null : oriFileName.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getGenFileName() {
        return genFileName;
    }

    public void setGenFileName(String genFileName) {
        this.genFileName = genFileName == null ? null : genFileName.trim();
    }

    public String getFileSaveLocation() {
        return fileSaveLocation;
    }

    public void setFileSaveLocation(String fileSaveLocation) {
        this.fileSaveLocation = fileSaveLocation == null ? null : fileSaveLocation.trim();
    }

    public String getFileServerHost() {
        return fileServerHost;
    }

    public void setFileServerHost(String fileServerHost) {
        this.fileServerHost = fileServerHost == null ? null : fileServerHost.trim();
    }

    public String getFileServerPath() {
        return fileServerPath;
    }

    public void setFileServerPath(String fileServerPath) {
        this.fileServerPath = fileServerPath == null ? null : fileServerPath.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        FileAttach other = (FileAttach) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRefId() == null ? other.getRefId() == null : this.getRefId().equals(other.getRefId()))
            && (this.getRefBusiType() == null ? other.getRefBusiType() == null : this.getRefBusiType().equals(other.getRefBusiType()))
            && (this.getOriFileName() == null ? other.getOriFileName() == null : this.getOriFileName().equals(other.getOriFileName()))
            && (this.getFileType() == null ? other.getFileType() == null : this.getFileType().equals(other.getFileType()))
            && (this.getGenFileName() == null ? other.getGenFileName() == null : this.getGenFileName().equals(other.getGenFileName()))
            && (this.getFileSaveLocation() == null ? other.getFileSaveLocation() == null : this.getFileSaveLocation().equals(other.getFileSaveLocation()))
            && (this.getFileServerHost() == null ? other.getFileServerHost() == null : this.getFileServerHost().equals(other.getFileServerHost()))
            && (this.getFileServerPath() == null ? other.getFileServerPath() == null : this.getFileServerPath().equals(other.getFileServerPath()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRefId() == null) ? 0 : getRefId().hashCode());
        result = prime * result + ((getRefBusiType() == null) ? 0 : getRefBusiType().hashCode());
        result = prime * result + ((getOriFileName() == null) ? 0 : getOriFileName().hashCode());
        result = prime * result + ((getFileType() == null) ? 0 : getFileType().hashCode());
        result = prime * result + ((getGenFileName() == null) ? 0 : getGenFileName().hashCode());
        result = prime * result + ((getFileSaveLocation() == null) ? 0 : getFileSaveLocation().hashCode());
        result = prime * result + ((getFileServerHost() == null) ? 0 : getFileServerHost().hashCode());
        result = prime * result + ((getFileServerPath() == null) ? 0 : getFileServerPath().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}
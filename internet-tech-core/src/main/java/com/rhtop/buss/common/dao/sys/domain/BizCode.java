package com.rhtop.buss.common.dao.sys.domain;

import java.io.Serializable;

public class BizCode implements Serializable {
    private Integer id;

    /** 业务模块 */
    private String catalog;

    /** 操作细类 */
    private String block;

    /** 业务操作编码 */
    private String bizCode;

    /** 姓名 */
    private String name;

    /** 描述 */
    private String feature;

    /** 日志数据格式 */
    private String logFormat;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block == null ? null : block.trim();
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode == null ? null : bizCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat == null ? null : logFormat.trim();
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
        BizCode other = (BizCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCatalog() == null ? other.getCatalog() == null : this.getCatalog().equals(other.getCatalog()))
            && (this.getBlock() == null ? other.getBlock() == null : this.getBlock().equals(other.getBlock()))
            && (this.getBizCode() == null ? other.getBizCode() == null : this.getBizCode().equals(other.getBizCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFeature() == null ? other.getFeature() == null : this.getFeature().equals(other.getFeature()))
            && (this.getLogFormat() == null ? other.getLogFormat() == null : this.getLogFormat().equals(other.getLogFormat()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        result = prime * result + ((getBlock() == null) ? 0 : getBlock().hashCode());
        result = prime * result + ((getBizCode() == null) ? 0 : getBizCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFeature() == null) ? 0 : getFeature().hashCode());
        result = prime * result + ((getLogFormat() == null) ? 0 : getLogFormat().hashCode());
        return result;
    }
}
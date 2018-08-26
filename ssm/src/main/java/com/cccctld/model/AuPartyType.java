package com.cccctld.model;

import java.util.Date;

public class AuPartyType {
    private String id;

    private String name;

    private String keyword;

    private String tableName;

    private String codePrefix;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    private String remark;

    public AuPartyType(String id, String name, String keyword, String tableName, String codePrefix, String enableStatus, Date enableDate, Date createDate, Date modifyDate, String remark) {
        this.id = id;
        this.name = name;
        this.keyword = keyword;
        this.tableName = tableName;
        this.codePrefix = codePrefix;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.remark = remark;
    }

    public AuPartyType() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getCodePrefix() {
        return codePrefix;
    }

    public void setCodePrefix(String codePrefix) {
        this.codePrefix = codePrefix == null ? null : codePrefix.trim();
    }

    public String getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus == null ? null : enableStatus.trim();
    }

    public Date getEnableDate() {
        return enableDate;
    }

    public void setEnableDate(Date enableDate) {
        this.enableDate = enableDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
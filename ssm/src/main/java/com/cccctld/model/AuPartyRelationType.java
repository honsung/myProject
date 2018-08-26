package com.cccctld.model;

import java.util.Date;

public class AuPartyRelationType {
    private String id;

    private String name;

    private String rootPartytypeId;

    private String keyword;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    private String remark;

    public AuPartyRelationType(String id, String name, String rootPartytypeId, String keyword, String enableStatus, Date enableDate, Date createDate, Date modifyDate, String remark) {
        this.id = id;
        this.name = name;
        this.rootPartytypeId = rootPartytypeId;
        this.keyword = keyword;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.remark = remark;
    }

    public AuPartyRelationType() {
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

    public String getRootPartytypeId() {
        return rootPartytypeId;
    }

    public void setRootPartytypeId(String rootPartytypeId) {
        this.rootPartytypeId = rootPartytypeId == null ? null : rootPartytypeId.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
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
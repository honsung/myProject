package com.cccctld.model;

import java.util.Date;

public class AuConnectRule {
    private String id;

    private String relationTypeId;

    private String parentPartytypeId;

    private String childPartytypeId;

    private String name;

    private Date createDate;

    private Date modifyDate;

    private String remark;

    public AuConnectRule(String id, String relationTypeId, String parentPartytypeId, String childPartytypeId, String name, Date createDate, Date modifyDate, String remark) {
        this.id = id;
        this.relationTypeId = relationTypeId;
        this.parentPartytypeId = parentPartytypeId;
        this.childPartytypeId = childPartytypeId;
        this.name = name;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.remark = remark;
    }

    public AuConnectRule() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRelationTypeId() {
        return relationTypeId;
    }

    public void setRelationTypeId(String relationTypeId) {
        this.relationTypeId = relationTypeId == null ? null : relationTypeId.trim();
    }

    public String getParentPartytypeId() {
        return parentPartytypeId;
    }

    public void setParentPartytypeId(String parentPartytypeId) {
        this.parentPartytypeId = parentPartytypeId == null ? null : parentPartytypeId.trim();
    }

    public String getChildPartytypeId() {
        return childPartytypeId;
    }

    public void setChildPartytypeId(String childPartytypeId) {
        this.childPartytypeId = childPartytypeId == null ? null : childPartytypeId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
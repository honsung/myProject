package com.honsung.model;

import java.util.Date;

public class AuParty {
    private String id;

    private String partytypeId;

    private String partytypeKeyword;

    private String isInherit;

    private String isReal;

    private String name;

    private String email;

    private String ownerOrg;

    private String remark;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    public AuParty(String id, String partytypeId, String partytypeKeyword, String isInherit, String isReal, String name, String email, String ownerOrg, String remark, String enableStatus, Date enableDate, Date createDate, Date modifyDate) {
        this.id = id;
        this.partytypeId = partytypeId;
        this.partytypeKeyword = partytypeKeyword;
        this.isInherit = isInherit;
        this.isReal = isReal;
        this.name = name;
        this.email = email;
        this.ownerOrg = ownerOrg;
        this.remark = remark;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public AuParty() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPartytypeId() {
        return partytypeId;
    }

    public void setPartytypeId(String partytypeId) {
        this.partytypeId = partytypeId == null ? null : partytypeId.trim();
    }

    public String getPartytypeKeyword() {
        return partytypeKeyword;
    }

    public void setPartytypeKeyword(String partytypeKeyword) {
        this.partytypeKeyword = partytypeKeyword == null ? null : partytypeKeyword.trim();
    }

    public String getIsInherit() {
        return isInherit;
    }

    public void setIsInherit(String isInherit) {
        this.isInherit = isInherit == null ? null : isInherit.trim();
    }

    public String getIsReal() {
        return isReal;
    }

    public void setIsReal(String isReal) {
        this.isReal = isReal == null ? null : isReal.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg == null ? null : ownerOrg.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}
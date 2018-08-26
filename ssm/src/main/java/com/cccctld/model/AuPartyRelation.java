package com.cccctld.model;

import java.util.Date;

public class AuPartyRelation {
    private String id;

    private String relationtypeId;

    private String relationtypeKeyword;

    private String parentCode;

    private String parentPartyid;

    private String partyid;

    private String code;

    private String name;

    private String partytypeId;

    private Short typeLevel;

    private String orderCode;

    private String isLeaf;

    private String typeIsLeaf;

    private String isInherit;

    private String isChief;

    private String email;

    private Date createDate;

    private Date modifyDate;

    public AuPartyRelation(String id, String relationtypeId, String relationtypeKeyword, String parentCode, String parentPartyid, String partyid, String code, String name, String partytypeId, Short typeLevel, String orderCode, String isLeaf, String typeIsLeaf, String isInherit, String isChief, String email, Date createDate, Date modifyDate) {
        this.id = id;
        this.relationtypeId = relationtypeId;
        this.relationtypeKeyword = relationtypeKeyword;
        this.parentCode = parentCode;
        this.parentPartyid = parentPartyid;
        this.partyid = partyid;
        this.code = code;
        this.name = name;
        this.partytypeId = partytypeId;
        this.typeLevel = typeLevel;
        this.orderCode = orderCode;
        this.isLeaf = isLeaf;
        this.typeIsLeaf = typeIsLeaf;
        this.isInherit = isInherit;
        this.isChief = isChief;
        this.email = email;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public AuPartyRelation() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRelationtypeId() {
        return relationtypeId;
    }

    public void setRelationtypeId(String relationtypeId) {
        this.relationtypeId = relationtypeId == null ? null : relationtypeId.trim();
    }

    public String getRelationtypeKeyword() {
        return relationtypeKeyword;
    }

    public void setRelationtypeKeyword(String relationtypeKeyword) {
        this.relationtypeKeyword = relationtypeKeyword == null ? null : relationtypeKeyword.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getParentPartyid() {
        return parentPartyid;
    }

    public void setParentPartyid(String parentPartyid) {
        this.parentPartyid = parentPartyid == null ? null : parentPartyid.trim();
    }

    public String getPartyid() {
        return partyid;
    }

    public void setPartyid(String partyid) {
        this.partyid = partyid == null ? null : partyid.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPartytypeId() {
        return partytypeId;
    }

    public void setPartytypeId(String partytypeId) {
        this.partytypeId = partytypeId == null ? null : partytypeId.trim();
    }

    public Short getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(Short typeLevel) {
        this.typeLevel = typeLevel;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    public String getTypeIsLeaf() {
        return typeIsLeaf;
    }

    public void setTypeIsLeaf(String typeIsLeaf) {
        this.typeIsLeaf = typeIsLeaf == null ? null : typeIsLeaf.trim();
    }

    public String getIsInherit() {
        return isInherit;
    }

    public void setIsInherit(String isInherit) {
        this.isInherit = isInherit == null ? null : isInherit.trim();
    }

    public String getIsChief() {
        return isChief;
    }

    public void setIsChief(String isChief) {
        this.isChief = isChief == null ? null : isChief.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
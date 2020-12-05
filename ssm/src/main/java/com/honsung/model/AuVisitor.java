package com.honsung.model;

import java.util.Date;

public class AuVisitor {
    private String id;

    private String originalId;

    private String visitorType;

    private String name;

    private String code;

    private String partytypeId;

    private String partyrelationtypeId;

    private Date createDate;

    private Date modifyDate;

    public AuVisitor(String id, String originalId, String visitorType, String name, String code, String partytypeId, String partyrelationtypeId, Date createDate, Date modifyDate) {
        this.id = id;
        this.originalId = originalId;
        this.visitorType = visitorType;
        this.name = name;
        this.code = code;
        this.partytypeId = partytypeId;
        this.partyrelationtypeId = partyrelationtypeId;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public AuVisitor() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOriginalId() {
        return originalId;
    }

    public void setOriginalId(String originalId) {
        this.originalId = originalId == null ? null : originalId.trim();
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType == null ? null : visitorType.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPartytypeId() {
        return partytypeId;
    }

    public void setPartytypeId(String partytypeId) {
        this.partytypeId = partytypeId == null ? null : partytypeId.trim();
    }

    public String getPartyrelationtypeId() {
        return partyrelationtypeId;
    }

    public void setPartyrelationtypeId(String partyrelationtypeId) {
        this.partyrelationtypeId = partyrelationtypeId == null ? null : partyrelationtypeId.trim();
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
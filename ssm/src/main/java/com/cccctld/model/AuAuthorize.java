package com.cccctld.model;

import java.util.Date;

public class AuAuthorize {
    private String id;

    private String visitorId;

    private String visitorCode;

    private String visitorType;

    private String resourceId;

    private String resourceCode;

    private String resourceType;

    private String authorizeStatus;

    private Integer accessType;

    private String isAppend;

    private Date createDate;

    private Date modifyDate;

    private String systemId;

    public AuAuthorize(String id, String visitorId, String visitorCode, String visitorType, String resourceId, String resourceCode, String resourceType, String authorizeStatus, Integer accessType, String isAppend, Date createDate, Date modifyDate, String systemId) {
        this.id = id;
        this.visitorId = visitorId;
        this.visitorCode = visitorCode;
        this.visitorType = visitorType;
        this.resourceId = resourceId;
        this.resourceCode = resourceCode;
        this.resourceType = resourceType;
        this.authorizeStatus = authorizeStatus;
        this.accessType = accessType;
        this.isAppend = isAppend;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.systemId = systemId;
    }

    public AuAuthorize() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId == null ? null : visitorId.trim();
    }

    public String getVisitorCode() {
        return visitorCode;
    }

    public void setVisitorCode(String visitorCode) {
        this.visitorCode = visitorCode == null ? null : visitorCode.trim();
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType == null ? null : visitorType.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode == null ? null : resourceCode.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getAuthorizeStatus() {
        return authorizeStatus;
    }

    public void setAuthorizeStatus(String authorizeStatus) {
        this.authorizeStatus = authorizeStatus == null ? null : authorizeStatus.trim();
    }

    public Integer getAccessType() {
        return accessType;
    }

    public void setAccessType(Integer accessType) {
        this.accessType = accessType;
    }

    public String getIsAppend() {
        return isAppend;
    }

    public void setIsAppend(String isAppend) {
        this.isAppend = isAppend == null ? null : isAppend.trim();
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

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }
}
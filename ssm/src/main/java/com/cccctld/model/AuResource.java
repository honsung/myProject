package com.cccctld.model;

import java.util.Date;

public class AuResource {
    private String id;

    private String resourceType;

    private String isPublic;

    private Integer accessType;

    private String name;

    private String value;

    private String filterType;

    private String fieldChinesename;

    private String fieldName;

    private String tableChinesename;

    private String tableName;

    private String partyType;

    private String help;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    public AuResource(String id, String resourceType, String isPublic, Integer accessType, String name, String value, String filterType, String fieldChinesename, String fieldName, String tableChinesename, String tableName, String partyType, String help, String enableStatus, Date enableDate, Date createDate, Date modifyDate) {
        this.id = id;
        this.resourceType = resourceType;
        this.isPublic = isPublic;
        this.accessType = accessType;
        this.name = name;
        this.value = value;
        this.filterType = filterType;
        this.fieldChinesename = fieldChinesename;
        this.fieldName = fieldName;
        this.tableChinesename = tableChinesename;
        this.tableName = tableName;
        this.partyType = partyType;
        this.help = help;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public AuResource() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic == null ? null : isPublic.trim();
    }

    public Integer getAccessType() {
        return accessType;
    }

    public void setAccessType(Integer accessType) {
        this.accessType = accessType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType == null ? null : filterType.trim();
    }

    public String getFieldChinesename() {
        return fieldChinesename;
    }

    public void setFieldChinesename(String fieldChinesename) {
        this.fieldChinesename = fieldChinesename == null ? null : fieldChinesename.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public String getTableChinesename() {
        return tableChinesename;
    }

    public void setTableChinesename(String tableChinesename) {
        this.tableChinesename = tableChinesename == null ? null : tableChinesename.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType == null ? null : partyType.trim();
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help == null ? null : help.trim();
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
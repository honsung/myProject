package com.honsung.model;

import java.util.Date;

public class AuFunctree {
    private String id;

    private String type;

    private String name;

    private String keyword;

    private String hotKey;

    private String url;

    private String code;

    private String parentCode;

    private String totalCode;

    private Short treeLevel;

    private String orderCode;

    private String help;

    private String isLeaf;

    private String typeIsLeaf;

    private String systemId;

    private String treeId;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    private String isSsl;

    private String isPublic;

    private String isDataLimit;

    private String isRecordLimit;

    public AuFunctree(String id, String type, String name, String keyword, String hotKey, String url, String code, String parentCode, String totalCode, Short treeLevel, String orderCode, String help, String isLeaf, String typeIsLeaf, String systemId, String treeId, String enableStatus, Date enableDate, Date createDate, Date modifyDate, String isSsl, String isPublic, String isDataLimit, String isRecordLimit) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.keyword = keyword;
        this.hotKey = hotKey;
        this.url = url;
        this.code = code;
        this.parentCode = parentCode;
        this.totalCode = totalCode;
        this.treeLevel = treeLevel;
        this.orderCode = orderCode;
        this.help = help;
        this.isLeaf = isLeaf;
        this.typeIsLeaf = typeIsLeaf;
        this.systemId = systemId;
        this.treeId = treeId;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.isSsl = isSsl;
        this.isPublic = isPublic;
        this.isDataLimit = isDataLimit;
        this.isRecordLimit = isRecordLimit;
    }

    public AuFunctree() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getHotKey() {
        return hotKey;
    }

    public void setHotKey(String hotKey) {
        this.hotKey = hotKey == null ? null : hotKey.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getTotalCode() {
        return totalCode;
    }

    public void setTotalCode(String totalCode) {
        this.totalCode = totalCode == null ? null : totalCode.trim();
    }

    public Short getTreeLevel() {
        return treeLevel;
    }

    public void setTreeLevel(Short treeLevel) {
        this.treeLevel = treeLevel;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help == null ? null : help.trim();
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

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId == null ? null : treeId.trim();
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

    public String getIsSsl() {
        return isSsl;
    }

    public void setIsSsl(String isSsl) {
        this.isSsl = isSsl == null ? null : isSsl.trim();
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic == null ? null : isPublic.trim();
    }

    public String getIsDataLimit() {
        return isDataLimit;
    }

    public void setIsDataLimit(String isDataLimit) {
        this.isDataLimit = isDataLimit == null ? null : isDataLimit.trim();
    }

    public String getIsRecordLimit() {
        return isRecordLimit;
    }

    public void setIsRecordLimit(String isRecordLimit) {
        this.isRecordLimit = isRecordLimit == null ? null : isRecordLimit.trim();
    }
}
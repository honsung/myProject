package com.honsung.model;

import java.util.Date;

public class AuRole {
    private String id;

    private String roleName;

    private String roleType;

    private String roleLevel;

    private String companyId;

    private String companyCode;

    private String companyName;

    private String companyAbbr;

    private String orgCode;

    private String orgName;

    private String remark;

    private String enableStatus;

    private Date enableDate;

    private String creator;

    private Date createDate;

    private Date modifyDate;

    private String creatorname;

    private String modifier;

    private String modifiername;

    private String column1;

    private String column2;

    private String column3;

    public AuRole(String id, String roleName, String roleType, String roleLevel, String companyId, String companyCode, String companyName, String companyAbbr, String orgCode, String orgName, String remark, String enableStatus, Date enableDate, String creator, Date createDate, Date modifyDate, String creatorname, String modifier, String modifiername, String column1, String column2, String column3) {
        this.id = id;
        this.roleName = roleName;
        this.roleType = roleType;
        this.roleLevel = roleLevel;
        this.companyId = companyId;
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.companyAbbr = companyAbbr;
        this.orgCode = orgCode;
        this.orgName = orgName;
        this.remark = remark;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.creator = creator;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.creatorname = creatorname;
        this.modifier = modifier;
        this.modifiername = modifiername;
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
    }

    public AuRole() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel == null ? null : roleLevel.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAbbr() {
        return companyAbbr;
    }

    public void setCompanyAbbr(String companyAbbr) {
        this.companyAbbr = companyAbbr == null ? null : companyAbbr.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifiername() {
        return modifiername;
    }

    public void setModifiername(String modifiername) {
        this.modifiername = modifiername == null ? null : modifiername.trim();
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1 == null ? null : column1.trim();
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2 == null ? null : column2.trim();
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3 == null ? null : column3.trim();
    }
}
package com.cccctld.model;

import java.util.Date;

public class AuDepartment {
    private String id;

    private String deptNo;

    private String deptName;

    private String deptFlag;

    private String deptType;

    private String deptLevel;

    private String deptLeader;

    private String remark;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    private String column1;

    private String column2;

    private String column3;

    public AuDepartment(String id, String deptNo, String deptName, String deptFlag, String deptType, String deptLevel, String deptLeader, String remark, String enableStatus, Date enableDate, Date createDate, Date modifyDate, String column1, String column2, String column3) {
        this.id = id;
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.deptFlag = deptFlag;
        this.deptType = deptType;
        this.deptLevel = deptLevel;
        this.deptLeader = deptLeader;
        this.remark = remark;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
    }

    public AuDepartment() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptFlag() {
        return deptFlag;
    }

    public void setDeptFlag(String deptFlag) {
        this.deptFlag = deptFlag == null ? null : deptFlag.trim();
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType == null ? null : deptType.trim();
    }

    public String getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(String deptLevel) {
        this.deptLevel = deptLevel == null ? null : deptLevel.trim();
    }

    public String getDeptLeader() {
        return deptLeader;
    }

    public void setDeptLeader(String deptLeader) {
        this.deptLeader = deptLeader == null ? null : deptLeader.trim();
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
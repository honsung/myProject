package com.honsung.model;

import java.util.Date;

public class AuPosition {
    private String id;

    private String positionNo;

    private String positionName;

    private String positionFlag;

    private String positionType;

    private String positionLevel;

    private String leaderFlag;

    private String leaderLevel;

    private String remark;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    private String column1;

    private String column2;

    private String column3;

    public AuPosition(String id, String positionNo, String positionName, String positionFlag, String positionType, String positionLevel, String leaderFlag, String leaderLevel, String remark, String enableStatus, Date enableDate, Date createDate, Date modifyDate, String column1, String column2, String column3) {
        this.id = id;
        this.positionNo = positionNo;
        this.positionName = positionName;
        this.positionFlag = positionFlag;
        this.positionType = positionType;
        this.positionLevel = positionLevel;
        this.leaderFlag = leaderFlag;
        this.leaderLevel = leaderLevel;
        this.remark = remark;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
    }

    public AuPosition() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(String positionNo) {
        this.positionNo = positionNo == null ? null : positionNo.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getPositionFlag() {
        return positionFlag;
    }

    public void setPositionFlag(String positionFlag) {
        this.positionFlag = positionFlag == null ? null : positionFlag.trim();
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType == null ? null : positionType.trim();
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel == null ? null : positionLevel.trim();
    }

    public String getLeaderFlag() {
        return leaderFlag;
    }

    public void setLeaderFlag(String leaderFlag) {
        this.leaderFlag = leaderFlag == null ? null : leaderFlag.trim();
    }

    public String getLeaderLevel() {
        return leaderLevel;
    }

    public void setLeaderLevel(String leaderLevel) {
        this.leaderLevel = leaderLevel == null ? null : leaderLevel.trim();
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
package com.honsung.model;

import java.io.Serializable;
import java.util.Date;

public class AuUser implements Serializable{
    
	private static final long serialVersionUID = 8494492489525507983L;

	private String id;

    private String partyId;

    private String loginId;

    private String password;

    private String pwdQuestion;

    private String pwdAnswer;

    private String name;

    private String isAdmin;

    private String agentStatus;

    private String email;

    private String loginIp;

    private String enableStatus;

    private Date enableDate;

    private String auditFlag;

    private String auditUser;

    private Date auditTime;

    private String createUser;

    private Date createDate;

    private String modifyUser;

    private Date modifyDate;

    private Date loginDate;

    private Date retireDate;

    private String systemCode;

    private Short failedTimes;

    public AuUser(String id, String partyId, String loginId, String password, String pwdQuestion, String pwdAnswer, String name, String isAdmin, String agentStatus, String email, String loginIp, String enableStatus, Date enableDate, String auditFlag, String auditUser, Date auditTime, String createUser, Date createDate, String modifyUser, Date modifyDate, Date loginDate, Date retireDate, String systemCode, Short failedTimes) {
        this.id = id;
        this.partyId = partyId;
        this.loginId = loginId;
        this.password = password;
        this.pwdQuestion = pwdQuestion;
        this.pwdAnswer = pwdAnswer;
        this.name = name;
        this.isAdmin = isAdmin;
        this.agentStatus = agentStatus;
        this.email = email;
        this.loginIp = loginIp;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.auditFlag = auditFlag;
        this.auditUser = auditUser;
        this.auditTime = auditTime;
        this.createUser = createUser;
        this.createDate = createDate;
        this.modifyUser = modifyUser;
        this.modifyDate = modifyDate;
        this.loginDate = loginDate;
        this.retireDate = retireDate;
        this.systemCode = systemCode;
        this.failedTimes = failedTimes;
    }

    public AuUser() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPwdQuestion() {
        return pwdQuestion;
    }

    public void setPwdQuestion(String pwdQuestion) {
        this.pwdQuestion = pwdQuestion == null ? null : pwdQuestion.trim();
    }

    public String getPwdAnswer() {
        return pwdAnswer;
    }

    public void setPwdAnswer(String pwdAnswer) {
        this.pwdAnswer = pwdAnswer == null ? null : pwdAnswer.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin == null ? null : isAdmin.trim();
    }

    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus == null ? null : agentStatus.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
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

    public String getAuditFlag() {
        return auditFlag;
    }

    public void setAuditFlag(String auditFlag) {
        this.auditFlag = auditFlag == null ? null : auditFlag.trim();
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getRetireDate() {
        return retireDate;
    }

    public void setRetireDate(Date retireDate) {
        this.retireDate = retireDate;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    public Short getFailedTimes() {
        return failedTimes;
    }

    public void setFailedTimes(Short failedTimes) {
        this.failedTimes = failedTimes;
    }
}
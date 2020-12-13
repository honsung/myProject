package com.honsung.model;

import java.util.Date;

public class Employee {
    private String id;

    private String personNo;

    private String personName;

    private String englishName;

    private String personType;

    private String sex;

    private String mobile;

    private String tel;

    private String email;

    private String address;

    private String postalcode;

    private String remark;

    private String enableStatus;

    private Date enableDate;

    private Date createDate;

    private Date modifyDate;

    private String column1;

    private String column2;

    private String column3;

    public Employee(String id, String personNo, String personName, String englishName, String personType, String sex, String mobile, String tel, String email, String address, String postalcode, String remark, String enableStatus, Date enableDate, Date createDate, Date modifyDate, String column1, String column2, String column3) {
        this.id = id;
        this.personNo = personNo;
        this.personName = personName;
        this.englishName = englishName;
        this.personType = personType;
        this.sex = sex;
        this.mobile = mobile;
        this.tel = tel;
        this.email = email;
        this.address = address;
        this.postalcode = postalcode;
        this.remark = remark;
        this.enableStatus = enableStatus;
        this.enableDate = enableDate;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
    }

    public Employee() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo == null ? null : personNo.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType == null ? null : personType.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
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
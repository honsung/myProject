package com.honsung.model;

import java.util.Date;

public class AuSysparas {
    private String id;

    private String propertykey;

    private String value;

    private Date inittime;

    private Date updatetime;

    private String creatorid;

    private String creatorname;

    private String description;

    private String enable;

    private String propertytype;

    private String cloumn1;

    public AuSysparas(String id, String propertykey, String value, Date inittime, Date updatetime, String creatorid, String creatorname, String description, String enable, String propertytype, String cloumn1) {
        this.id = id;
        this.propertykey = propertykey;
        this.value = value;
        this.inittime = inittime;
        this.updatetime = updatetime;
        this.creatorid = creatorid;
        this.creatorname = creatorname;
        this.description = description;
        this.enable = enable;
        this.propertytype = propertytype;
        this.cloumn1 = cloumn1;
    }

    public AuSysparas() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPropertykey() {
        return propertykey;
    }

    public void setPropertykey(String propertykey) {
        this.propertykey = propertykey == null ? null : propertykey.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Date getInittime() {
        return inittime;
    }

    public void setInittime(Date inittime) {
        this.inittime = inittime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype == null ? null : propertytype.trim();
    }

    public String getCloumn1() {
        return cloumn1;
    }

    public void setCloumn1(String cloumn1) {
        this.cloumn1 = cloumn1 == null ? null : cloumn1.trim();
    }
}
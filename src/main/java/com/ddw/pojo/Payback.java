package com.ddw.pojo;

import java.util.Date;

public class Payback {
    private Integer pid;

    private String pbamount;

    private Date pbdatetime;

    private String uid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPbamount() {
        return pbamount;
    }

    public void setPbamount(String pbamount) {
        this.pbamount = pbamount == null ? null : pbamount.trim();
    }

    public Date getPbdatetime() {
        return pbdatetime;
    }

    public void setPbdatetime(Date pbdatetime) {
        this.pbdatetime = pbdatetime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}
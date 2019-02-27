package com.ddw.pojo;

public class Dcoin {
    private Integer dcoinamount;

    private String uid;

    public Integer getDcoinamount() {
        return dcoinamount;
    }

    public void setDcoinamount(Integer dcoinamount) {
        this.dcoinamount = dcoinamount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}
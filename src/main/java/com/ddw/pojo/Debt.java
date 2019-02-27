package com.ddw.pojo;

import java.util.Date;

public class Debt {
    private Double totaldebt;

    private Date debtdatetime;

    private Integer debtperiod;

    private Integer interestid;

    private String confirmerid;

    private String uid;

    public Double getTotaldebt() {
        return totaldebt;
    }

    public void setTotaldebt(Double totaldebt) {
        this.totaldebt = totaldebt;
    }

    public Date getDebtdatetime() {
        return debtdatetime;
    }

    public void setDebtdatetime(Date debtdatetime) {
        this.debtdatetime = debtdatetime;
    }

    public Integer getDebtperiod() {
        return debtperiod;
    }

    public void setDebtperiod(Integer debtperiod) {
        this.debtperiod = debtperiod;
    }

    public Integer getInterestid() {
        return interestid;
    }

    public void setInterestid(Integer interestid) {
        this.interestid = interestid;
    }

    public String getConfirmerid() {
        return confirmerid;
    }

    public void setConfirmerid(String confirmerid) {
        this.confirmerid = confirmerid == null ? null : confirmerid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}
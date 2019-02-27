package com.ddw.pojo;

import java.util.Date;

public class Interest {
    private Integer interestid;

    private Double interestrate;

    private Date intodate;

    private Date outdate;

    private String setterid;

    public Integer getInterestid() {
        return interestid;
    }

    public void setInterestid(Integer interestid) {
        this.interestid = interestid;
    }

    public Double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(Double interestrate) {
        this.interestrate = interestrate;
    }

    public Date getIntodate() {
        return intodate;
    }

    public void setIntodate(Date intodate) {
        this.intodate = intodate;
    }

    public Date getOutdate() {
        return outdate;
    }

    public void setOutdate(Date outdate) {
        this.outdate = outdate;
    }

    public String getSetterid() {
        return setterid;
    }

    public void setSetterid(String setterid) {
        this.setterid = setterid == null ? null : setterid.trim();
    }
}
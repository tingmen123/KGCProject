package com.ddw.pojo;

public class Debtstate {
    private Integer debtstateid;

    private String debtstate;

    public Integer getDebtstateid() {
        return debtstateid;
    }

    public void setDebtstateid(Integer debtstateid) {
        this.debtstateid = debtstateid;
    }

    public String getDebtstate() {
        return debtstate;
    }

    public void setDebtstate(String debtstate) {
        this.debtstate = debtstate == null ? null : debtstate.trim();
    }
}
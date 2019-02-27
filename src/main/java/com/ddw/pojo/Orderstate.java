package com.ddw.pojo;

public class Orderstate {
    private Integer orderstateid;

    private String orderstatename;

    public Integer getOrderstateid() {
        return orderstateid;
    }

    public void setOrderstateid(Integer orderstateid) {
        this.orderstateid = orderstateid;
    }

    public String getOrderstatename() {
        return orderstatename;
    }

    public void setOrderstatename(String orderstatename) {
        this.orderstatename = orderstatename == null ? null : orderstatename.trim();
    }
}
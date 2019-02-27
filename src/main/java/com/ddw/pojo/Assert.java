package com.ddw.pojo;

public class Assert {
    private Double carprice;

    private Double houseprice;

    private Double otherasserts;

    private Double otherdebts;

    private String uid;

    public Double getCarprice() {
        return carprice;
    }

    public void setCarprice(Double carprice) {
        this.carprice = carprice;
    }

    public Double getHouseprice() {
        return houseprice;
    }

    public void setHouseprice(Double houseprice) {
        this.houseprice = houseprice;
    }

    public Double getOtherasserts() {
        return otherasserts;
    }

    public void setOtherasserts(Double otherasserts) {
        this.otherasserts = otherasserts;
    }

    public Double getOtherdebts() {
        return otherdebts;
    }

    public void setOtherdebts(Double otherdebts) {
        this.otherdebts = otherdebts;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}
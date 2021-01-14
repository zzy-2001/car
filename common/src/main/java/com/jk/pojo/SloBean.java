package com.jk.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SloBean {

    //广告列表    t_slogan
    private Integer id;
    private String  name;
    private String picture;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date stdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endate;
    private Integer status;
    private Integer placeid;
    private String  site;
    //广告位置表  t_place
    private String  name1;
    private Integer status1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getStdate() {
        return stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public Date getEndate() {
        return endate;
    }

    public void setEndate(Date endate) {
        this.endate = endate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Integer getStatus1() {
        return status1;
    }

    public void setStatus1(Integer status1) {
        this.status1 = status1;
    }
}

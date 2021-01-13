package com.jk.pojo;

import java.io.Serializable;

public class CarBean implements Serializable{

    private static final long serialVersionUID = -6933279853273927646L;
    //车型表 t_car
    private Integer id;
    private String  name;
    private Integer typeid;
    private Integer hottest;
    private Integer first;
    private Integer status;
    //分类列表 t_type
    private String  name1;
    //车型颜色列表: t_color
    private String  name2;
    private String  color;

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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getHottest() {
        return hottest;
    }

    public void setHottest(Integer hottest) {
        this.hottest = hottest;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

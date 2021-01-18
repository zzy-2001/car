package com.jk.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="t_ord" )
public class OrdBean {

    private String id;
    private String code;
    private Integer carid;
    private Integer price;
    private String time;
    private Integer status;
    private Integer userid;
    private String phone;
    private String address;
    private Integer orderst;
    //@Field(value="c_name")//映射
    //@DateTimeFormat(pattern=("yyyy-MM-dd"))//处理时间
    //@Transient//业务字段

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOrderst() {
        return orderst;
    }

    public void setOrderst(Integer orderst) {
        this.orderst = orderst;
    }
}

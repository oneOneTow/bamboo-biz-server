package com.luzhiqing.bamboo.controller.request;


import com.luzhiqing.bamboo.constants.ExpressCompayType;
import com.luzhiqing.bamboo.constants.OrderType;

public class ExpressOrderRequestVO {

    private String expressNumber;
    private ExpressCompayType expressCompany;
    private String phone;
    private String address;
    private String name;
    private String remark;
    private OrderType orderType;

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public ExpressCompayType getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(ExpressCompayType expressCompany) {
        this.expressCompany = expressCompany;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }
}

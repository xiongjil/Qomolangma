package com.bj.glocloud.req.user;

import com.bj.glocloud.req.AbsReq;

/**
 * @author Xionge
 * @date 2018/11/11
 * @description Request for create Address
 */
public class AddressCreateReq extends AbsReq {
    /** 详细地址 */
    private String address;

    /** 收货人姓名 */
    private String name;

    /** 收货人手机号 */
    private String phone;

    /** 邮编 */
    private String postCode;

    public String getLocation() {
        return address;
    }

    public void setLocation(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "LocationCreateReq{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}

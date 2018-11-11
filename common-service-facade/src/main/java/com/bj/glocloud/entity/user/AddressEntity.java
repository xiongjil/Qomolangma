package com.bj.glocloud.entity.user;


import java.io.Serializable;

/**
 * @author Xionge
 * @date 2018/11/10
 *
 * @description Address Info
 */
public class AddressEntity implements Serializable{

    // Key
    private String id;

    // Detail Address
    private String address;

    // Name
    private String name;

    // Phone
    private String phone;

    // Post code
    private String postCode;

    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", postCode='" + postCode + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}

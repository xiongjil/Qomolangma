package com.bj.glocloud.entity.user;

import com.bj.glocloud.enumeration.user.UserStateEnum;
import com.bj.glocloud.enumeration.user.UserTypeEnum;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author Xionge
 * @Date 2018/11/10
 */
public class UserEntity implements Serializable {

    // Key
    private String id;

    // User Name
    private String username;

    // Password
    private String password;

    // Phone Number
    private String phone;

    // Email
    private String mail;

    // Licence Picture
    private String licencePic;

    // Register Time
    private Timestamp registerTime;

    // User Type {@link com.bj.glocloud.enumeration.user.UserTypeEnum}
    private UserTypeEnum userTypeEnum;

    // User State {@link com.bj.glocloud.enumeration.user.UserStateEnum }
    private UserStateEnum userStateEnum;

    // Role
    private RoleEntity roleEntity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLicencePic() {
        return licencePic;
    }

    public void setLicencePic(String licencePic) {
        this.licencePic = licencePic;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public UserTypeEnum getUserTypeEnum() {
        return userTypeEnum;
    }

    public void setUserTypeEnum(UserTypeEnum userTypeEnum) {
        this.userTypeEnum = userTypeEnum;
    }

    public UserStateEnum getUserStateEnum() {
        return userStateEnum;
    }

    public void setUserStateEnum(UserStateEnum userStateEnum) {
        this.userStateEnum = userStateEnum;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", licencePic='" + licencePic + '\'' +
                ", registerTime=" + registerTime +
                ", userTypeEnum=" + userTypeEnum +
                ", userStateEnum=" + userStateEnum +
                ", roleEntity=" + roleEntity +
                '}';
    }
}

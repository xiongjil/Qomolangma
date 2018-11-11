package com.bj.glocloud.req.user;

import com.bj.glocloud.entity.user.RoleEntity;
import com.bj.glocloud.req.AbsReq;

/**
 * @author Xionge
 * @date 2018/11/11
 * @description Request for create Administrator
 */
public class AdminCreateReq extends AbsReq {

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

    /** 角色ID */
    private String roleId;

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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "AdminCreateReq{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}

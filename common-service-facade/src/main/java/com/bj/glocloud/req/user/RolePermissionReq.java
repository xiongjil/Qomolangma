package com.bj.glocloud.req.user;

import com.bj.glocloud.req.AbsReq;

import java.util.List;

/**
 * @author Xionge
 * @date 2018/11/11
 * @description Request for Role Permission
 */
public class RolePermissionReq extends AbsReq {

    /** 角色ID */
    private String roleId;

    /** 权限ID列表 */
    private List<String> permissionIdList;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<String> getPermissionIdList() {
        return permissionIdList;
    }

    public void setPermissionIdList(List<String> permissionIdList) {
        this.permissionIdList = permissionIdList;
    }

    @Override
    public String toString() {
        return "RolePermissionReq{" +
                "roleId='" + roleId + '\'' +
                ", permissionIdList=" + permissionIdList +
                '}';
    }
}

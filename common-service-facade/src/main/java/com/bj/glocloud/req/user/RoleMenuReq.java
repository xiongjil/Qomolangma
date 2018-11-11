package com.bj.glocloud.req.user;

import com.bj.glocloud.req.AbsReq;

import java.util.List;

/**
 * @author Xionge
 * @date 2018/11/11
 * @description Request for create Address
 */
public class RoleMenuReq extends AbsReq {

    /** 角色ID */
    private String roleId;

    /**菜单ID列表*/
    private List<String> menuIdList;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<String> getMenuIdList() {
        return menuIdList;
    }

    public void setMenuIdList(List<String> menuIdList) {
        this.menuIdList = menuIdList;
    }

    @Override
    public String toString() {
        return "RoleMenuReq{" +
                "roleId='" + roleId + '\'' +
                ", menuIdList=" + menuIdList +
                '}';
    }
}

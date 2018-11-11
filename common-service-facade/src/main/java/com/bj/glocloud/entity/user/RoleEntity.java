package com.bj.glocloud.entity.user;

import java.io.Serializable;
import java.util.List;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Role Entity
 */
public class RoleEntity implements Serializable {

    // Key
    private String id;

    // Role Name
    private String name;

    // Role Description
    private String desc;

    // Role Menu
    private List<MenuEntity> menuList;

    // Assigned Permissions for role
    private List<PermissionEntity> permissionList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<MenuEntity> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuEntity> menuList) {
        this.menuList = menuList;
    }

    public List<PermissionEntity> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<PermissionEntity> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", menuList=" + menuList +
                ", permissionList=" + permissionList +
                '}';
    }
}

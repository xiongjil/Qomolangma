package com.bj.glocloud.entity.user;

import java.io.Serializable;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Entity for Permission
 */
public class PermissionEntity implements Serializable {

    // Key
    private String id;

    // Permission Name
    private String permission;

    // Description for Permission
    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "id='" + id + '\'' +
                ", permission='" + permission + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

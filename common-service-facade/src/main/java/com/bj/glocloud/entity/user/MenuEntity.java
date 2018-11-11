package com.bj.glocloud.entity.user;

import java.io.Serializable;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Menu Entity
 */
public class MenuEntity implements Serializable {

    // Key
    private String id;

    // Menu Name
    private String menuName;

    // Url of Menu
    private String url;

    // Parent Id
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "id='" + id + '\'' +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}

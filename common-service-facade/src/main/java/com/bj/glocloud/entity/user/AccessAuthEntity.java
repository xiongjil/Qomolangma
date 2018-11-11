package com.bj.glocloud.entity.user;

import com.bj.glocloud.enumeration.HttpMethodEnum;

import java.io.Serializable;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Access Authorization Entity
 */
public class AccessAuthEntity implements Serializable {

    // Request URL
    private String url;

    // Method Name
    private String methodName;

    // Http Request Method
    private HttpMethodEnum httpMethodEnum;

    // Is Login Required
    private boolean isLoginRequired;

    // Permission
    private String permission;

    public AccessAuthEntity() {
    }

    public AccessAuthEntity(String url, String methodName, HttpMethodEnum httpMethodEnum, boolean isLoginRequired, String permission) {
        this.url = url;
        this.methodName = methodName;
        this.httpMethodEnum = httpMethodEnum;
        this.isLoginRequired = isLoginRequired;
        this.permission = permission;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public HttpMethodEnum getHttpMethodEnum() {
        return httpMethodEnum;
    }

    public void setHttpMethodEnum(HttpMethodEnum httpMethodEnum) {
        this.httpMethodEnum = httpMethodEnum;
    }

    public boolean isLogin() {
        return isLoginRequired;
    }

    public void setLogin(boolean isLoginRequired) {
        isLoginRequired = isLoginRequired;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "AccessAuthEntity{" +
                "url='" + url + '\'' +
                ", methodName='" + methodName + '\'' +
                ", httpMethodEnum=" + httpMethodEnum +
                ", isLogin=" + isLoginRequired +
                ", permission='" + permission + '\'' +
                '}';
    }
}

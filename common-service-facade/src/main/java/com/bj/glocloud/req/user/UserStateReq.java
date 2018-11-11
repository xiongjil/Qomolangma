package com.bj.glocloud.req.user;

import com.bj.glocloud.req.AbsReq;

/**
 * @author Xionge
 * @date 2018/11/11
 * @description Request for User State
 */
public class UserStateReq extends AbsReq {

    /** 用户ID */
    private String userId;

    /** 用户状态 {@link com.bj.glocloud.enumeration.user.UserStateEnum} */
    private int userState;

    public UserStateReq(String userId, int userState) {
        this.userId = userId;
        this.userState = userState;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }
}

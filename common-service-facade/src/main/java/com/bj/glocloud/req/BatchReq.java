package com.bj.glocloud.req;

import java.util.List;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Batch Request
 */
public class BatchReq<T> extends AbsReq {

    // Request List
    private List<T> reqList;

    public List<T> getReqList() {
        return reqList;
    }

    public void setReqList(List<T> reqList) {
        this.reqList = reqList;
    }
}
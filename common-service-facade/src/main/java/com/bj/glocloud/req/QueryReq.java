package com.bj.glocloud.req;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Query Request
 */
public class QueryReq extends AbsReq {

    // Page
    protected int page = 1;

    // Number per Page
    protected int numPerPage = 10;

    // Current Page Number
    protected int currentPage;

    public int getCurrentPage() {
        return (page-1)*numPerPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNumPerPage() {
        return numPerPage;
    }

    public void setNumPerPage(int numPerPage) {
        this.numPerPage = numPerPage;
    }
}

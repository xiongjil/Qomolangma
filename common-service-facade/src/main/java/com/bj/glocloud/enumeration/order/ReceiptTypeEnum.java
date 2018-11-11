package com.bj.glocloud.enumeration.order;

import com.bj.glocloud.enumeration.BaseEnum;

/**
 * @author Xionge
 * @date 2017/11/6 上午11:09
 *
 * @description 发票类型
 */
public enum ReceiptTypeEnum implements BaseEnum {

    COMMON(1,"普通发票"),
    ONLINE(2,"电子发票"),
    ADDTAX(3,"增值税发票"),
    ;

    private int code;
    private String msg;

    ReceiptTypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}

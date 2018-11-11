package com.bj.glocloud.exception;

import com.bj.glocloud.enumeration.ExpCodeEnum;

import java.io.Serializable;

/**
 * @Author Xionge
 * @Date 2011/11/10
 * General Business Exception
 */
public class CommonBizException extends RuntimeException implements Serializable {
    private ExpCodeEnum codeEnum;

    public CommonBizException(ExpCodeEnum codeEnum){
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonBizException(){}

    public ExpCodeEnum getCodeEnum() {
        return codeEnum;
    }
}

package com.bj.glocloud.exception;

import java.io.Serializable;

import com.bj.glocloud.enumeration.ExpCodeEnum;

/**
 * @author Xionge
 * @date 2018/11/10
 *
 * @description General System Exception
 */
public class CommonSysException extends RuntimeException implements Serializable {

    private ExpCodeEnum codeEnum;

    public CommonSysException(ExpCodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonSysException() {

    }
}

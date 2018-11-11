package com.bj.glocloud.utils;

import java.util.UUID;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Key Generator Util
 */
public class KeyGenerator {

    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static String getKey(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}

package com.clesun.bigdataservice.utils;

import java.util.UUID;

/**
 * Created by clesun on 2017/4/27.
 */
public class UUIDUtils {
    /**
     * 生成最基础uuid
     * @author lxq
     * @DATE 2017/4/27
     * @return
     */
    public static String random() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-","");
    }

}

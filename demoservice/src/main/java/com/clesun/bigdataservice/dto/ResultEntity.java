package com.clesun.bigdataservice.dto;

import java.io.Serializable;

/**
 * author: lixq
 * date: 2018/8/14
 * 描述:返回值处理
 */
public class ResultEntity implements Serializable {
    /**
     *时间戳
     */
    private Long timestamp = System.currentTimeMillis();
    /**
     *数据
     */
    private Object data = null;

    public ResultEntity(Object data) {
        this.timestamp = System.currentTimeMillis();
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

package com.clesun.client.dto;

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
    private Long timestamp;
    /**
     *数据
     */
    private Object data;
    /**
     *接口返回错误码
     */
    private int code;
    /**
     *接口返回信息
     */
    private String msg;

    public ResultEntity(Object data,int code,String msg) {
        this.timestamp = System.currentTimeMillis();
        this.data = data;
        this.code = code;
        this.msg = msg;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

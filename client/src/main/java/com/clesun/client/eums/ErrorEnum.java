package com.clesun.client.eums;

/**
 * author: lixq
 * date: 2018/8/13
 * 描述: 错误类型
 */
public enum ErrorEnum {
    /*
     * 错误信息
     * */
    E_400("400", "请求处理异常，请稍后再试"),

    E_404("404", "请求不存在"),

    E_500("500", "请求方式有误,请检查 GET/POST"),

    E_501("501", "请求路径不存在"),

    E_502("502", "权限不足"),

    E_503("503", "服务器暂时不可用"),

    E_504("504", "网关超时"),

    E_505("505", "服务器不支持请求中所用的 HTTP 协议版本"),

    E_10008("10008", "角色删除失败,尚有用户属于此角色"),

    E_10009("10009", "账户已存在"),

    E_20011("20011", "token已过期,请重新登陆"),

    E_90003("90003", "缺少必填参数");

    private String errorCode;

    private String errorMsg;

    ErrorEnum() {
    }

    ErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

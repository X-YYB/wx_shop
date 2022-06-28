package com.young.xshop.common;

/**
 * @Description: 状态码
 * @Author: yangyb
 * @Date:2022/6/26 17:52
 * Version: 1.0
 **/
public enum ResultCode {
    SUCCESS("0","成功"),
    ERROR("-1","系统异常"),
    PARAM_ERROR("1001","参数异常"),
    USER_EXIST_ERROR("2001","用户已存在"),
    USER_ACCOUNT_ERROR("2002","账户或密码错误");
    public String code;
    public String msg;

    ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

package com.young.xshop.common;

/**
 * @Description: 自定义异常
 * @Author: yangyb
 * @Date:2022/6/28 20:18
 * Version: 1.0
 **/
public class UserException extends RuntimeException {

    String code;
    String msg;

    public UserException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public UserException(ResultCode resultCode) {
        this.code = resultCode.code;
        this.msg = resultCode.msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

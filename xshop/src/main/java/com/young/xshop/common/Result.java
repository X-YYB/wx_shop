package com.young.xshop.common;

/**
 * @Description: 统一返回结果集
 * @Author: yangyb
 * @Date:2022/6/26 17:47
 * Version: 1.0
 **/
public class Result <T>{

    private String code;

    private String msg;

    private T data;

    //不带参数的成功返回
    public static Result success(){
        Result result= new Result<>();
        result.setCode(ResultCode.SUCCESS.code);
        result.setMsg(ResultCode.SUCCESS.msg);
       return result;
    }
    //带参数的成功返回
    public static <T> Result<T> success(T data){
        Result<T> result= new Result<>();
        result.setCode(ResultCode.SUCCESS.code);
        result.setMsg(ResultCode.SUCCESS.msg);
        return result;
    }

    //不带参数的失败返回
    public static Result error(){
        Result result= new Result<>();
        result.setCode(ResultCode.ERROR.code);
        result.setMsg(ResultCode.ERROR.msg);
        return result;
    }
    //带参数的失败返回
    //不带参数的失败返回
    public static Result error(String code,String msg){
        Result result= new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.young.xshop.common;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 控制器全局异常拦截
 * @Author: yangyb
 * @Date:2022/6/28 22:07
 * Version: 1.0
 **/
@ControllerAdvice(basePackages = "com.young.xshop.controller")
public class GlobalExceptionHandler {

    private static final Log log= LogFactory.get();

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(HttpServletRequest request,Exception e){
        log.error("异常信息",e);
        return Result.error();
    }

    @ExceptionHandler(UserException.class)
    @ResponseBody
    public Result userError(HttpServletRequest request,UserException userException){
        log.error("用户异常信息",userException);
        return Result.error(userException.getCode(),userException.getMsg());
    }
}

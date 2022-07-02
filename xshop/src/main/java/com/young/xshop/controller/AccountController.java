package com.young.xshop.controller;

import cn.hutool.core.util.StrUtil;
import com.young.xshop.common.Result;
import com.young.xshop.common.ResultCode;
import com.young.xshop.common.UserException;
import com.young.xshop.entity.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 账户入口
 * @Author: yangyb
 * @Date:2022/6/26 19:04
 * Version: 1.0
 **/
@RestController
public class AccountController {

    @PostMapping("/login")
    public Result<UserInfo> login(@RequestBody UserInfo userInfo, HttpServletRequest request)  {
        if(StrUtil.isBlank(userInfo.getName())||StrUtil.isBlank(userInfo.getPassword())){
            throw new UserException(ResultCode.USER_ACCOUNT_ERROR);
        }

        return Result.success();
    }
}

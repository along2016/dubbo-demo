package com.aliang.web.controller;

import com.aliang.api.UserInfoService;
import com.aliang.exception.ServiceException;
import com.aliang.web.result.ApiResultMessage;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "userInfo")
public class UserInfoController {

    @Reference
    private UserInfoService userInfoService;

    @GetMapping(value = "list")
    public ApiResultMessage<String> list() {
        System.out.println("==========================================================");
        String userInfo = null;
        try {
            userInfo = userInfoService.getUserInfo();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        System.out.println("=================**********************===================");
        return ApiResultMessage.success(userInfo);
    }
}

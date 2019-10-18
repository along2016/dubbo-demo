package com.aliang.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "userInfo")
public class UserInfoController {

    @GetMapping(value = "list")
    public String list(){
        return "success";
    }
}

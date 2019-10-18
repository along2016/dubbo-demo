package com.aliang.provider.service.impl;

import com.aliang.provider.annotation.PrintLog;
import com.aliang.api.UserInfoService;
import com.aliang.exception.ServiceException;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Override
    @PrintLog
    public String getUserInfo() throws ServiceException {
        System.out.println("88888888888888888888888888888888888888888");
        if(true){
//            throw new IllegalArgumentException("参数异常");
            throw new ServiceException("我错了！");
        }
        return "my name is wangjiliang";
    }
}

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
        for(int i = 0; i < 5; i++){
            if(i == 3){
                throw new ServiceException("我错了！");
            }
            System.out.println("===============" + i);
        }

        return "my name is wangjiliang";
    }
}

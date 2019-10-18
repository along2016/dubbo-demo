package com.aliang.web.interception;

import com.aliang.exception.ServiceException;
import com.aliang.web.result.ApiResultMessage;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.aliang.web.controller")
public class WebExceptionHandler{

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResultMessage serviceException(Exception e){
        String message = e.getMessage();
        if(StringUtils.isEmpty(message)){
            message = e.getCause().toString();
        }
        return ApiResultMessage.error(message);
    }
}

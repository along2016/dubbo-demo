package com.aliang.web.result;

import lombok.Data;

@Data
public class ApiResultMessage<T> {

    private static final int OK = 0;
    private static final int FAIL = 1;
    private static final String SUCCESS = "操作成功";
    private static final String ERROR = "操作失败";

    /**
     * 状态码
     */
    private int code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 数据
     */
    private T value;

    public static <T> ApiResultMessage<T> error(){
        return error(ERROR);
    }

    public static <T> ApiResultMessage<T> error(String message){
        return error(FAIL, message);
    }

    public static <T> ApiResultMessage<T> error(String message, T value){
        return result(FAIL, message, value);
    }

    public static <T> ApiResultMessage<T> error(int status, String message){
        return result(status, message, null);
    }

    public static <T> ApiResultMessage<T> result(int status, String message, T value){
        return new ApiResultMessage<T>().value(value).message(message).status(status);
    }

    public static <T> ApiResultMessage<T> success(){
        return success(SUCCESS);
    }

    public static <T> ApiResultMessage<T> success(String message){
        return success(OK, message);
    }

    public static <T> ApiResultMessage<T> success(String message, T value){
        return result(OK, message, value);
    }

    public static <T> ApiResultMessage<T> success(int status, String message){
        return result(status, message, null);
    }

    public ApiResultMessage<T> message(String message){
        this.message = message;
        return this;
    }

    public ApiResultMessage<T> status(int status){
        this.code = status;
        return this;
    }

    public ApiResultMessage<T> value(T value){
        this.value = value;
        return this;
    }
}

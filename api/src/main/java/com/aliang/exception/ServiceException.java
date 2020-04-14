package com.aliang.exception;

public class ServiceException extends Exception {
    private int code;
    private String message;

    public ServiceException(String message){

        super(message);
        this.code = -1;
    }

    public ServiceException(int errorCode, String message){
        super(message);
        this.code = errorCode;
    }
}

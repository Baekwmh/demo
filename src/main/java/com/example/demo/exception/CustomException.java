package com.example.demo.exception;

import com.example.demo.common.ExceptionType;

public class CustomException extends RuntimeException {
    protected Integer code;
    protected String message;

    public  CustomException(ExceptionType type){
        this.code = type.getCode();
        this.message = type.getMsg();
    }
}

package com.p.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有异常
    private R result;
    @ExceptionHandler
    public R doException(Exception e){
        //处理异常
        e.printStackTrace();
        return result.error("服务器故障，稍后再试");
    }
}

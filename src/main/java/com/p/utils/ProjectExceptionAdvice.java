package com.p.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有异常
    @ExceptionHandler
    public R doException(Exception e){
        //处理异常
        e.printStackTrace();
        return new R("服务器故障，稍后再试");
    }
}

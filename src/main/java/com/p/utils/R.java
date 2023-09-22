package com.p.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {//统一返回格式
    private Integer code;
    private Object data;
    private String msg;
    public R(Boolean flag){//返回结果
        if(flag){
            this.code = 200;
    }}

    public R(Boolean flag, Object data) {//返回结果和数据
        this.code = 200;
        this.data = data;
    }

    public R(String msg) {//返回错误信息
        this.code = 400;
        this.msg = msg;
    }
}

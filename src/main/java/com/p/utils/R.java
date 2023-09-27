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

    public R success(Object data,String msg){
        this.code = 200;
        this.data = data;
        this.msg = msg;
        return new R(code,data,msg);
    }
    public R success(String msg){
        this.code = 200;
        this.msg = msg;
        return new R(code,null,msg);
    }
    public R success() {
        this.code = 200;
        return new R(code,null,null);
    }

    public R error(String msg){
        this.code = 400;
        this.msg = msg;
        return new R(code,null,msg);
    }
    public R forbidden(String msg){
        this.code = 403;
        this.msg = msg;
        return new R(code,null,msg);
    }


}

package com.p.controller;

import com.p.entity.Admin;
import com.p.service.AdminService;
import com.p.utils.Jwt;
import com.p.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/Login")

public class LoginController {
    @Autowired
    AdminService adminService;

    @PostMapping
    public R login(@RequestBody Admin admin){//默认管理员登录
        int code=adminService.selectByIdAndPassword(admin)?200:400;
        String msg=code==200?"登陆成功":"登陆失败，用户名或密码错误";
        //下发令牌
        if(code==200){
            HashMap<String, Object> claims=new HashMap<>();
            claims.put("id",admin.getId());
            claims.put("name",admin.getPassword());
            claims.put("role","admin");
            String jwt=new Jwt().create(claims);
            return new R().success(jwt,msg);
        }
        return new R().error(msg);
        }
    }

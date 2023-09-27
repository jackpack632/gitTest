package com.p.controller;

import com.p.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("")
public class CookieController_demo {

    @GetMapping("c1")
    public R setCookie(HttpServletResponse response){
        response.addCookie(new Cookie("UserName","admin"));
        return new R().success("设置成功");
    }

    @GetMapping("c2")
    public R getCookie(HttpServletRequest request){
        Cookie[] cookies=request.getCookies();
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("UserName")){
                System.out.println(cookie.getValue());
                return new R(200,"获取成功",cookie.getValue());
            }
        }
        return new R().error("获取失败");
    }
}

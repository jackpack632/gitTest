package com.p.filter.demo;

import com.alibaba.fastjson.JSONObject;
import com.p.utils.Jwt;
import com.p.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Slf4j
//@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter_demo implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //0、强转,为了使用子类的方法，比如获取url
        HttpServletRequest req=(HttpServletRequest)servletRequest;
        HttpServletResponse resp=(HttpServletResponse)servletResponse;
        //1、获取url
        String url=req.getRequestURI();
        //2、判断是否是登录请求,如果是登录请求，放行
        if(url.contains("/Login")){
            log.info("登录请求，放行");
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }
        //3、获取令牌
        String jwt=req.getHeader("token");//令牌请求头为token
        //4、判断令牌是否存在，如果不存在，返回未登录
        if(!StringUtils.hasLength(jwt)){
            log.info("token不存在，返回未登录");
            R error=new R().error("token not found");
            //转换对象为json的String
            String notLogin= JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return;}
        //5、判断令牌是否有效，如果无效，返回未登录
        try {
            Jwt.parseJwt(jwt);
        } catch (Exception e) {//解析失败
            e.printStackTrace();
            log.info("token无效，返回未登录");
            R error=new R().error("token invalid");
            String notLogin= JSONObject.toJSONString(error);
            resp.getWriter().write(notLogin);
            return;
        }
        //6、放行
        log.info("token有效，放行");
        filterChain.doFilter(servletRequest,servletResponse);
        return;
    }
}

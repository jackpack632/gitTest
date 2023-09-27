package com.p.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.p.utils.Jwt;
import com.p.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
@Component//把拦截器交给spring管理
public class LoginCheckInterceptor implements HandlerInterceptor{
    @Override//返回true放行，返回false拦截
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //放行前逻辑
        //1、获取url
        String url=request.getRequestURI();
        log.info("请求路径为："+url);
        //2、判断是否是登录请求,如果是登录请求，放行。拦截器在配置类中配置了，所以不用拦截
        //3、获取令牌
        String jwt=request.getHeader("Authorization");//直接获取请求头，但是需要判断Bearer
        if(StringUtils.hasLength(jwt)&&jwt.startsWith("Bearer ")){
            jwt=jwt.substring(7);
        }
        log.info("令牌为："+jwt);
        //4、判断令牌是否存在，如果不存在，返回未登录
        if(!StringUtils.hasLength(jwt)){
            log.info("token不存在，返回未登录");
            R error=new R().forbidden("token not found");
            //转换对象为json的String
            String notLogin= JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return false;}

        //5、判断令牌是否有效，如果无效，返回未登录
        try {
            Jwt.parseJwt(jwt);
        } catch (Exception e) {//解析失败
            e.printStackTrace();
            log.info("token无效，返回未登录");
            R error=new R().forbidden("token invalid");
            String notLogin= JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return false;
        }
        //6、放行
        log.info("token有效，放行");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //放行后逻辑
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}

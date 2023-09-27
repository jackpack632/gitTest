package com.p.config;

import com.p.interceptor.LoginCheckInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {//配置类，用于配置拦截器
    @Autowired
    private LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {//注册拦截器
        registry.addInterceptor(loginCheckInterceptor)//添加拦截器
                .addPathPatterns("/**")//拦截路径，/*代表一级路径，/**代表多级路径
                .excludePathPatterns("/Login")
                .excludePathPatterns("/WeatherRoadSystem");//放行路径，除了指定路径，其他都拦截


    }
}

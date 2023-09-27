package com.p.filter.demo;


import javax.servlet.*;
import java.io.IOException;
import javax.servlet.annotation.WebFilter;


//@WebFilter(urlPatterns = "/*")

public class DemoFilter implements Filter {

    @Override//多次请求时，每次请求都会调用
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行前逻辑
        System.out.println("拦截到了请求");
        //放行
        filterChain.doFilter(servletRequest,servletResponse);//把请求和响应放行，放行后回到doFilter方法，继续执行后面的代码
        //filterChain:过滤器链，过滤器链上有多个过滤器，放行后会继续执行下一个过滤器的doFilter方法，顺序是按照类名的字典顺序
        //放行后逻辑，当controller执行完毕后，会回到这里，并逐级返回之前过滤器的放行后逻辑
    }
}

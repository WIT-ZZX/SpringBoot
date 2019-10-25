package com.zzx.config.Filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器 方式二
 * 通过注解的方式
 * 需要在 Application 添加扫描配置
 * Created by Administrator on 2019/10/25.
 */
@WebFilter(urlPatterns = "/hello_1")
public class MyFilter2 implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter2 init..");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter2 doFilter..");
        //查看请求耗时
        Long t = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("MyFilter2 耗时："+ (System.currentTimeMillis() -t)+"ms"  );
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter2 destroy..");
    }
}

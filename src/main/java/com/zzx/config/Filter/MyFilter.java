package com.zzx.config.Filter;


import javax.servlet.*;
import javax.servlet.FilterConfig;
import java.io.IOException;

/**
 * 过滤器
 * 自定义 过滤器，然后添加到 FilterRegistrationBean
 * 必须实现 Filter 接口，Servlet
 *
 * Created by Administrator on 2019/10/25.
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter init..");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter doFilter..");
        //查看请求耗时
        Long t = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("MyFilter 耗时："+ (System.currentTimeMillis() -t)+"ms"  );
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy..");
    }
}

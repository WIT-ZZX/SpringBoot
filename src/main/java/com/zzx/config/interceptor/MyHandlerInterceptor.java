package com.zzx.config.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义 拦截器
 *
 * Created by Administrator on 2019/10/25.
 */
public class MyHandlerInterceptor implements HandlerInterceptor {
    ThreadLocal<Long> time = new ThreadLocal<>();//需定义 一个全局变量 来存放时间

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyHandlerInterceptor: preHandle... ");
        time.set(System.currentTimeMillis());
        //返回 true 才会执行 postHandle或afterCompletion
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyHandlerInterceptor: postHandle... ");
        //记录请求耗时
        System.out.println("请求耗时："+ (System.currentTimeMillis() - time.get())+"ms");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyHandlerInterceptor: afterCompletion... ");
    }
}

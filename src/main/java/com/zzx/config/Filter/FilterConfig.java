package com.zzx.config.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义的过滤器
 * 方式1 ， 方法生成bean
 * 方式 2， 注解生成 （MyFilter2 类测试）
 *
 * Created by Administrator on 2019/10/25.
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean testFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());//配置 自定义的 过滤器
        filterRegistrationBean.addUrlPatterns("/hello");//指定 过滤的 请求
        filterRegistrationBean.setOrder(1);//设置优先级
        return filterRegistrationBean;//不能 注入的方式，因为是servlet
    }
}

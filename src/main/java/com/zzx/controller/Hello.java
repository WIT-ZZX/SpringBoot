package com.zzx.controller;

import com.zzx.model.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * kevin
 *
 * @RestController 返回体为json格式
 *
 * Created by Administrator on 2019/10/22.
 */
@RestController
public class Hello {
    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello")
    public People hello(){
        People user = new People();
        user.setName("kevin");
        user.setPwd("123");

        logger.info("hello world");
        return user;
    }

    @RequestMapping("/hello_1")
    public String hello_1(){
        return "hello world again";
    }

    @RequestMapping("/hello_2")
    public String hello_2(){
        return "hello world again again";
    }
}

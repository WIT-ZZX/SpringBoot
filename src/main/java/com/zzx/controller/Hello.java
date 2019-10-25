package com.zzx.controller;

import com.zzx.model.User;
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
    public User hello(){
        User user = new User();
        user.setName("kevin");
        user.setPwd("123");

        logger.info("hello world");
        return user;
    }

    @RequestMapping("/hello_1")
    public String hello_1(){
        return "hello world again";
    }

}

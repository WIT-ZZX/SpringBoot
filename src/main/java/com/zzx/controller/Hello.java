package com.zzx.controller;

import com.zzx.model.User;
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

    @RequestMapping("/hello")
    public User hello(){
        System.out.print("hello world");
        User user = new User();
        user.setName("kevin");
        user.setPwd("123");
        return user;
    }

}

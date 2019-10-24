package com.zzx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * kevin
 * Created by Administrator on 2019/10/22.
 */
@RestController
public class Hello {

    @RequestMapping("/hell0")
    public void hello(){
        System.out.print("hello world");
    }

}

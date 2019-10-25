package com.zzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * kevin
 * Created by Administrator on 2019/10/22.
 */
@SpringBootApplication
@ServletComponentScan(basePackageClasses = com.zzx.config.Filter.MyFilter2.class)
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}

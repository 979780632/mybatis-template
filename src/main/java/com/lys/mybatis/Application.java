package com.lys.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(scanBasePackages = "com.lys.mybatis.controller")
//@ComponentScan("com.lys.mybatis.mapper")
//@MapperScan("com.lys.mybatis.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

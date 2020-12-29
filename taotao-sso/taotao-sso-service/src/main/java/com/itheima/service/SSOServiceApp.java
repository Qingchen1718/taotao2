package com.itheima.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/*
 *  @创建时间:  2020/12/29 14:31
 *  @描述：    TODO
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class SSOServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(SSOServiceApp.class ,args);
    }
}

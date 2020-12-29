package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/*
 *  @创建时间:  2020/12/28 8:56
 *  @描述：    TODO
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class SearchServieApp {

    public static void main(String[] args) {
        SpringApplication.run(SearchServieApp.class ,args);
    }
}

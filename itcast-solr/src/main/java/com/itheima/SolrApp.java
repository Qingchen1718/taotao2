package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/*
 *  @创建时间:  2020/12/25 10:02
 *  @描述：    TODO
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class SolrApp {

    public static void main(String[] args) {
        SpringApplication.run(SolrApp.class , args);
    }
}

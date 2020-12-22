package com.itheima.controller;

import com.itheima.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @创建时间:  2020/12/22 10:21
 *  @描述：    TODO
 */
@RestController
public class TestController {

    //@Autowired 只能注入自己项目的对象

    @Reference
    private TestService testService;


    @RequestMapping("/sayHi")
    public String sayHi(){

        testService.sayHi();

        return "sucess~!~!";
    }
}

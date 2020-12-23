package com.itheima.controller;

/*
 *  @创建时间:  2020/12/23 9:41
 *  @描述：    TODO
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/index")
    public String page(){
        System.out.println("index========");
        return "index";
    }

}

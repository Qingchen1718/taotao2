package com.itheima.controller;

/*
 *  @创建时间:  2020/12/23 9:41
 *  @描述：    TODO
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    //访问页面：localhost:8082/index
    //localhost:8082/home
    //localhost:8082/aa

    //localhost:8082/aa/bb/cc
    @RequestMapping("/{path}")
    public String page(@PathVariable(name = "path") String path ){
        System.out.println("========"+ path );
        return path;
    }


/*
    @RequestMapping("/index")
    public String page(){
        System.out.println("index========");
        return "index";
    }
    @RequestMapping("/home")
    public String page2(){
        System.out.println("home========");
        return "home";
    }
*/


}

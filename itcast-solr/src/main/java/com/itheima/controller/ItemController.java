package com.itheima.controller;

import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @创建时间:  2020/12/25 10:14
 *  @描述：    TODO
 */
@RestController
public class ItemController {
    private static final String TAG = "ItemController";

    @Autowired
    private ItemService itemService;

    @RequestMapping("/addIndex")
    public String addIndex(){

        itemService.addIndex();
        return "succes~~!";
    }
}

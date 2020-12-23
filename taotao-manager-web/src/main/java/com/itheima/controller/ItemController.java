package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @创建时间:  2020/12/23 10:36
 *  @描述：    TODO
 */
@RestController
public class ItemController {

    @Reference
    private ItemService itemService;


    //http://localhost:8082/rest/item?page=1&rows=30

    @RequestMapping("/rest/item")
    public TaoResult<Item> findByPage(int page , int rows){
        TaoResult<Item> taoResult = itemService.findByPage(page, rows);

        System.out.println("taoResult===" + taoResult);

        return taoResult;
    }
}

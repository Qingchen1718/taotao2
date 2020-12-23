package com.itheima.controller;

import com.itheima.pojo.ItemCat;
import com.itheima.service.ItemCatService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *  @创建时间:  2020/12/23 13:49
 *  @描述：    TODO
 */

@RestController
public class ItemCatController {

    //localhost:8080/aa?id=3;
    //localhost:8080/aa

    @Reference
    private ItemCatService itemCatService;


    //http://localhost:8082/rest/item/cat
    @RequestMapping("/rest/item/cat")
    public List<ItemCat> queryItemCatByParentId(@RequestParam(value = "id", defaultValue = "0") Long parentId) {

        List<ItemCat> itemCatList = itemCatService.queryItemCatByParentId(parentId);

        System.out.println("itemCatList=" + itemCatList);

        return itemCatList;
    }
}

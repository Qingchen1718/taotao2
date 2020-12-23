package com.itheima.service.impl;

import com.itheima.mapper.ItemCatMapper;
import com.itheima.pojo.ItemCat;
import com.itheima.service.ItemCatService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/*
 *  @创建时间:  2020/12/23 13:46
 *  @描述：    TODO
 */
@Service
public class ItemCatServiceImpl  implements ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<ItemCat> queryItemCatByParentId(Long parentId) {

        ItemCat cat =new ItemCat();

        //select * from tb_item_cat where parent_id =0;

        cat.setParentId(parentId);

        return itemCatMapper.select(cat);
        //return itemCatMapper.selectByExample(cat);  // 这个方法会多一个distinct属性的问题
    }
}

package com.itheima.service.impl;

import com.itheima.mapper.ItemDescMapper;
import com.itheima.pojo.ItemDesc;
import com.itheima.service.ItemDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *  @创建时间:  2020/12/24 9:23
 *  @描述：    TODO
 */

//由于这个类的方法只会在商品服务(ItemServiceImpl)里面调用， 所以此处不需要打上dubbo的@Service
@Service
public class ItemDescServiceImpl  implements ItemDescService {

    @Autowired
    private ItemDescMapper itemDescMapper;

    @Override
    public void saveItemDesc(ItemDesc itemDesc) {

        itemDescMapper.insert(itemDesc);
    }
}

package com.itheima.service;

import com.itheima.pojo.ItemDesc;

/*
 *  @创建时间:  2020/12/24 9:22
 *  @描述：    TODO
 */
public interface ItemDescService {

    void saveItemDesc(ItemDesc itemDesc);

    ItemDesc queryById (Long itemId);
}

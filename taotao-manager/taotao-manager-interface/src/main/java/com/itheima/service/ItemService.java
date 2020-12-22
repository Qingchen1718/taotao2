package com.itheima.service;

import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;

/*
 *  @创建时间:  2020/12/22 14:19
 *  @描述：    TODO
 */
public interface ItemService {


    //商品表的数据太多了， 所以我们要分页查询。

    /**
     * 分页查询商品
     * @param page 查询第几页
     * @param rows 每页显示多少条
     * @return 这一页的数据
     */
    TaoResult<Item> findByPage(Integer page , Integer rows);
}

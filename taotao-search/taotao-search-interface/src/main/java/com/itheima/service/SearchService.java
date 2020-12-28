package com.itheima.service;

import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;

/*
 *  @创建时间:  2020/12/28 8:44
 *  @描述：    TODO
 */
public interface SearchService {

    /**
     * 搜索商品，结果太多，所以要使用分页查询
     * @param query 搜索的关键字
     * @param page 查询第几页
     * @param rows 每页返回多少条记录
     * @return
     */
    TaoResult<Item> search(String query, Integer page, Integer rows);
}

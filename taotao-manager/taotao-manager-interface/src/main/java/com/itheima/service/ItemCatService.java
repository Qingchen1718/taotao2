package com.itheima.service;

import com.itheima.pojo.ItemCat;

import java.util.List;

/*
 *  @创建时间:  2020/12/23 13:43
 *  @描述：    TODO
 */
public interface ItemCatService {

    /**
     * 根据分类的id 查找出来它所有的分类，如果传递的是0，表示查看所有的一级分类数据
     * @param parentId 分类的父亲id
     * @return
     */
    List<ItemCat> queryItemCatByParentId(Long parentId);
}

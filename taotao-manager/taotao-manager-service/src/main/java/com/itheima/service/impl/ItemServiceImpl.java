package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/*
 *  @创建时间:  2020/12/22 14:34
 *  @描述：    商品service
 */
@Service
public class ItemServiceImpl implements ItemService {

    // 1. itemmapper 毕竟是一个接口 ， 需要让springboot 做出来接口的代理类对象。
    // 2. mapper需要查询数据库，但是没有设置数据库怎么连接， 一般是在service层设置数据库。
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public TaoResult<Item> findByPage(Integer page, Integer rows) {

        //1. 分页设置 只是设置查询第几页，每页查询多少条数据
        PageHelper.startPage(page, rows);

        //2. 查询
        //List<Item> list = itemMapper.selectByExample(null);
        Page<Item> pageData = (Page<Item>)itemMapper.selectByExample(null);


        //3. 创建taoResult对象
        TaoResult result = new TaoResult(pageData.getTotal() , pageData.getResult());

        //4. 不要忘记返回result
        return result;
    }
}

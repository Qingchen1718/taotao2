package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import com.itheima.pojo.ItemDesc;
import com.itheima.pojo.TaoResult;
import com.itheima.service.ItemDescService;
import com.itheima.service.ItemService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

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

    @Autowired
    private ItemDescService itemDescService;

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

    @Override
    public void saveItem(Item item, String desc) {

        //由于页面没有提交过来status | created |  updated ,
        //所以我们需要自己赋值了。
        item.setStatus(1);//1:正常， 2：下架，3：删除
        item.setCreated(new Date()); //创建时间
        item.setUpdated(item.getCreated()); //更新时间


        //保存商品
        itemMapper.insert(item);

        //----------------------------------------
        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setCreated(item.getCreated()); //创建时间
        itemDesc.setUpdated(item.getCreated()); //更新时间
        itemDesc.setItemDesc( desc);
        itemDesc.setItemId(item.getId());

        itemDescService.saveItemDesc(itemDesc);




    }
}

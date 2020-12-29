package com.itheima.service.impl;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/*
 *  @创建时间:  2020/12/29 14:24
 *  @描述：    TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String doLogin(User user) throws Exception {

        User loginUser = userMapper.selectOne(user);

        if(loginUser != null){

            return "login_success_"+loginUser.getId();
        }

        return null;
    }
}

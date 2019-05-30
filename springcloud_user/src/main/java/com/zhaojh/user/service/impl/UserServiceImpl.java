package com.zhaojh.user.service.impl;

import com.zhaojh.user.mapper.IUserMapper;
import com.zhaojh.user.pojo.User;
import com.zhaojh.user.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public int addUser(User user){
        return userMapper.addUser(user);
    }

    /**
     * 用户登录，根据用户名判断用户收否存在
     * @param loginname
     * @return
     */
    @Override
    public User findUserByName(String loginname){
        return userMapper.findUserByName(loginname);
    }


}

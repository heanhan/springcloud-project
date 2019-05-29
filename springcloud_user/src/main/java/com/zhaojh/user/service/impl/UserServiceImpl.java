package com.zhaojh.user.service.impl;

import com.zhaojh.user.mapper.IUserMapper;
import com.zhaojh.user.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;
}

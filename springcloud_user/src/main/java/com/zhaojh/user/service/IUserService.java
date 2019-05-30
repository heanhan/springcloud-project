package com.zhaojh.user.service;

import com.zhaojh.user.pojo.User;

public interface IUserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 用户登录，根据用户名判断用户收否存在
     * @param loginname
     * @return
     */
    public User findUserByName(String loginname);

}

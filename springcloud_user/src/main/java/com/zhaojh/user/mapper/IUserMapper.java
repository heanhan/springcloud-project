package com.zhaojh.user.mapper;

import com.zhaojh.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper {

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

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

    /**
     * 根据身份证查询当前用户是否可用
     * @param identitycard
     * @return
     */
    public User findByIdentitycard(String identitycard,String status);

    /**
     * 修改用户状态
     * @param id
     * @param status
     * @return
     */
    public int modifyUserStatus(String id,String status);
}

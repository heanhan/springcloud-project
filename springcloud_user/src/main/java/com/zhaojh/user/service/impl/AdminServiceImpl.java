package com.zhaojh.user.service.impl;

import com.zhaojh.user.mapper.IAdminMapper;
import com.zhaojh.user.mapper.IUserMapper;
import com.zhaojh.user.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private IUserMapper userMapper;

    /**
     * 修改用户的状态
     * @param id
     * @param status
     * @return
     */
    public int modifedUser(String id,String status){
        return userMapper.modifyUserStatus(id,status);
    }

}

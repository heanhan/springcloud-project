package com.zhaojh.user.service;

public interface IAdminService {

    /**
     * 修改用户的状态
     * @param id
     * @param status
     * @return
     */
    public int modifedUser(String id,String status);
}

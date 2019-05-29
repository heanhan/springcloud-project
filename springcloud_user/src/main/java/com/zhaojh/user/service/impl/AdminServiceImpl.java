package com.zhaojh.user.service.impl;

import com.zhaojh.user.mapper.IAdminMapper;
import com.zhaojh.user.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private IAdminMapper adminMapper;

}

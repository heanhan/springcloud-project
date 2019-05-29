package com.zhaojh.article.service.impl;

import com.zhaojh.article.mapper.IChanelMapper;
import com.zhaojh.article.mapper.IColumntsMapper;
import com.zhaojh.article.service.IChanelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IChanelServiceImpl implements IChanelService {

    @Resource
    private IChanelMapper chanelMapper;

}

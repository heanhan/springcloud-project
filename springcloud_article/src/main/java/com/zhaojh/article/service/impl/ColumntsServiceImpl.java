package com.zhaojh.article.service.impl;

import com.zhaojh.article.mapper.IColumntsMapper;
import com.zhaojh.article.service.IColumntsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ColumntsServiceImpl implements IColumntsService {

    @Resource
    private IColumntsMapper columntsMapper;
}

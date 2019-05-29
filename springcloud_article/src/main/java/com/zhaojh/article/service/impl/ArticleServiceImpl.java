package com.zhaojh.article.service.impl;

import com.zhaojh.article.mapper.IArticleMapper;
import com.zhaojh.article.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Resource
    private IArticleMapper articleMapper;
}

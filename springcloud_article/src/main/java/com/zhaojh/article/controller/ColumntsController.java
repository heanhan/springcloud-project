package com.zhaojh.article.controller;

import com.common.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/columnts")
@CrossOrigin
public class ColumntsController {

    @Autowired
    private IdWorker idWorker;


}

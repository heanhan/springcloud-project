package com.zhaojh.article.controller;


import com.zhaojh.common.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/chanel")
public class ChanelController {

    @Autowired
    private IdWorker idWorker;


}

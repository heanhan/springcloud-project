package com.zhaojh.qa.controller;


import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@RequestMapping(value="/reply")
public class ReplyController {

    @GetMapping(value = "/test")
    @HystrixCommand(fallbackMethod = "defaultCallTest")
    public String test(){
        Lists.newArrayList("","");


        return null;

    }

    public String defaultCallTest(){
        return "服务失败，调用熔断器的熔断方法！";
    }
}

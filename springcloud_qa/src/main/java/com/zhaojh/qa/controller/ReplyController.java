package com.zhaojh.qa.controller;


import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@RequestMapping(value="/reply")
public class ReplyController {

    @GetMapping(value = "/test")
    public String test(){
        Lists.newArrayList("","");


        return null;

    }
}

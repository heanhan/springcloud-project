package com.zhaojh.qa.controller;

import com.zhaojh.common.pojo.Result;
import com.zhaojh.qa.client.ILabelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/problem")
public class ProblemController {

    @Autowired
    private ILabelClient labelClient;


    @GetMapping(value="/findLabelInProblem")
    public Result findLabelInProblem(){
        System.out.println("输出labelClient"+labelClient);
        Result allLabel = labelClient.findAllLabel();
        return allLabel;
    }


}

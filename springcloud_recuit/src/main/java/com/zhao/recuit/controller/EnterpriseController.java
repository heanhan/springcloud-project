package com.zhao.recuit.controller;


import com.zhao.recuit.pojo.Enterprise;
import com.zhao.recuit.service.IEnterpriseService;
import com.zhaojh.pojo.Result;
import com.zhaojh.pojo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/enterprise")
public class EnterpriseController {

    @Autowired
    private IEnterpriseService enterpriseService;

    //添加企业

    //查询热门企业
    @PostMapping(value="/findAllEnterpriseIsHot")
    public Result findAllEnterpriseIsHot()
    {
        List<Enterprise> allEnterpriseIsHot = enterpriseService.findAllEnterpriseIsHot("1");
        if(!allEnterpriseIsHot.isEmpty()) {
            return new Result(true, StatusCode.OK,"查询成功",allEnterpriseIsHot);
        }
        return new Result(false,StatusCode.ERROR,"无查询结果");
    }

}

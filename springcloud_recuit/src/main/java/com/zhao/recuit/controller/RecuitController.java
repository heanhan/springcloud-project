package com.zhao.recuit.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhao.recuit.pojo.Recuit;
import com.zhao.recuit.service.IRecuiitService;
import com.zhaojh.pojo.Result;
import com.zhaojh.pojo.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/recuit")
@CrossOrigin
public class RecuitController {

    @Autowired
    private IRecuiitService recuiitService;

    /**
     *查询最新职位
     * timeBs 查询： one 一天(默认)、 three 三天、 seven  七天、month 本月
     * state 职位状态：在招 0（默认），停止招聘 1，所有
     */
    @PostMapping(value="/findAllNewRecuit")
    public Result findAllNewRecuit(
            @RequestParam(required = false) String timeBs,
            @RequestParam(required = false) String state,
            @RequestParam(required = false) String pageNum,
            @RequestParam(required = false) String pageSize)
    {

        Map<String,Object> param=new HashMap<String,Object>();

        if(timeBs==null&&"".equals(timeBs))
        {
            timeBs="one";//默认查询一天内的心职位
        }
        if(state==null&&"".equals(state)) {
            state="0";
        }
        if(pageNum==null&&"".equals(pageNum)){
            pageNum="1";
        }
        if(pageSize==null&&"".equals(pageSize)){
            pageSize="10";
        }
        param.put("timeBs",timeBs);
        param.put("state",state);
        PageHelper.startPage(Integer.parseInt(pageNum),Integer.parseInt(pageSize));
        List<Recuit> allNewRecuit = recuiitService.findAllNewRecuit(param);
        PageInfo<Recuit> pageInfo=new PageInfo<Recuit>(allNewRecuit);
        return new Result(true, StatusCode.OK,"查询成功",pageInfo);
    }
}

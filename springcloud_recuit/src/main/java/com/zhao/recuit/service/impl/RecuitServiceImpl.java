package com.zhao.recuit.service.impl;

import com.zhao.recuit.mapper.IRecuitMapper;
import com.zhao.recuit.pojo.Recuit;
import com.zhao.recuit.service.IRecuiitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RecuitServiceImpl implements IRecuiitService {

    @Resource
    private IRecuitMapper recuitMapper;

    /**
     *查询最新职位
     * timeBs 查询： one 一天(默认)、 three 三天、 seven  七天、month 本月
     * state 职位状态：在招 0（默认），停止招聘 1，所有
     */
    @Override
    public List<Recuit> findAllNewRecuit(Map<String,Object> param){
        return recuitMapper.findAllNewRecuit(param);
    }
}

package com.zhao.recuit.mapper;

import com.zhao.recuit.pojo.Recuit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IRecuitMapper {

    /**
     *查询最新职位
     * timeBs 查询： one 一天(默认)、 three 三天、 seven  七天、month 本月
     * state 职位状态：在招 0（默认），停止招聘 1，所有
     */
    public List<Recuit> findAllNewRecuit(Map<String,Object> param);
}

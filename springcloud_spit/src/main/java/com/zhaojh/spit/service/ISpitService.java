package com.zhaojh.spit.service;

import com.zhaojh.spit.pojo.Spit;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface ISpitService {


    /**
     * @param spit 吐槽
     * @return int 0
     */
    Spit addSpit(Spit spit);

    /**
     * 查询所有的吐槽
     * @return list<Spit>
     */
    List<Spit> findAllSpit();


    /**
     *
     * @param map  参数
     * @return  返回分页数据
     */
    Page<Spit> findAllSpitByPage(Map<String,String> map);
}

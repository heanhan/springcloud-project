package com.zhaojh.spit.service.impl;

import com.zhaojh.spit.dao.ISpitDao;
import com.zhaojh.spit.pojo.Spit;
import com.zhaojh.spit.service.ISpitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpitServiceImpl implements ISpitService {

    @Autowired
    private ISpitDao spitDao;

    /**
     * 添加吐槽内容
     * @param spit  吐槽
     * @return
     */
    @Override
    public Spit addSpit(Spit spit){
        return  spitDao.save(spit);
    }

    /**
     * 查询所有的吐槽
     * @return list<Spit>
     */
    @Override
    public List<Spit> findAllSpit(){
        return spitDao.findAll();
    }

    /**
     *
     * @param map  参数
     * @return  返回分页数据
     */
    @Override
    public Page<Spit> findAllSpitByPage(Map<String,String> map){
        Integer page = Integer.parseInt(map.get("page"));
        Integer size = Integer.parseInt(map.get("size"));
        PageRequest pageRequest = PageRequest.of(page,size);
        Example<Spit> example= Example.of(null);
        return spitDao.findAll(example,pageRequest);
    }

}

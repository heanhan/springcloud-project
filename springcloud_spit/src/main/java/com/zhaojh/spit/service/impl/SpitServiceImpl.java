package com.zhaojh.spit.service.impl;

import com.zhaojh.spit.dao.ISpitDao;
import com.zhaojh.spit.pojo.Spit;
import com.zhaojh.spit.service.ISpitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

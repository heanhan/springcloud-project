package com.zhao.recuit.service.impl;

import com.zhao.recuit.mapper.IEnterpriseMapper;
import com.zhao.recuit.pojo.Enterprise;
import com.zhao.recuit.service.IEnterpriseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnterpriseServiceImpl implements IEnterpriseService {

    @Resource
    private IEnterpriseMapper enterpriseMapper;

    /**
     * 查询热门企业
     * @param ishot
     * @return
     */
    @Override
    public List<Enterprise> findAllEnterpriseIsHot(String ishot){
        return enterpriseMapper.findAllEnterpriseIsHot(ishot);
    }

}

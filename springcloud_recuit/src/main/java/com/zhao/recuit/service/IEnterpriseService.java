package com.zhao.recuit.service;

import com.zhao.recuit.pojo.Enterprise;

import java.util.List;

public interface IEnterpriseService {

    /**
     * 查询热门企业
     * @param ishot
     * @return
     */
    public List<Enterprise> findAllEnterpriseIsHot(String ishot);
}

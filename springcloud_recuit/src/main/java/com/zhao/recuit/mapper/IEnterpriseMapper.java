package com.zhao.recuit.mapper;

import com.zhao.recuit.pojo.Enterprise;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IEnterpriseMapper {


    /**
     * 查询热门企业
     * @param ishot
     * @return
     */
    public List<Enterprise> findAllEnterpriseIsHot(String ishot);
}

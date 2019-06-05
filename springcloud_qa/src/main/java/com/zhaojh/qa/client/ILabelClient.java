package com.zhaojh.qa.client;

import com.zhaojh.common.pojo.Result;
import com.zhaojh.qa.client.impl.LabelClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value ="springcloud-labels",fallback = LabelClientImpl.class)
public interface ILabelClient {

    @GetMapping(value="/findAllLabel")
    public Result findAllLabel();



}

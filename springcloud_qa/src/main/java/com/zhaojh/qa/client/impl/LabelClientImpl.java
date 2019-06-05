package com.zhaojh.qa.client.impl;

import com.zhaojh.common.pojo.Result;
import com.zhaojh.common.pojo.StatusCode;
import com.zhaojh.qa.client.ILabelClient;
import org.springframework.stereotype.Component;

@Component
public class LabelClientImpl implements ILabelClient {

    /**
     * 查询所有的标签
     * @return
     */
    @Override
    public Result findAllLabel() {
        Result resultHystry = new Result(false, StatusCode.ERROR, "熔断器返回消息");
        return resultHystry;
    }
}

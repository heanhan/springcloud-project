package com.zhaojh.article.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Columnts {

    /**
     * ID
     */
    private String id;

    /**
     * 专栏名称
     */
    private String name;

    /**
     * 专栏简介
     */
    private String summary;

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 申请日期
     */
    private Date createtime;

    /**
     * 审核日期
     */
    private Date checktime;

    /**
     * 状态
     */
    private String state;
}

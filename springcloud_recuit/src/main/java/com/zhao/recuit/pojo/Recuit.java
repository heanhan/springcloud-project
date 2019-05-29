package com.zhao.recuit.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 求职的信息
 */
@Data
public class Recuit {
    private String id;//主键id
    private String jobname;//职位名称
    private String salary;//薪水
    private String condition;//经验要求
    private String education;//学历
    private String type;//任职方式
    private String address;//工作地址
    private String eid;//企业id
    private Date createtime;//创建时间
    private String state;//状态
    private String url;//网址
    private String label;//标签
    private String content1;//职位描述
    private String content2;//职位要求

}

package com.zhao.recuit.pojo;


import lombok.Data;

/**
 * 提供置为的企业信息
 */
@Data
public class Enterprise {
    private String id;//id
    private String name;//企业名称
    private String summary;//企业介绍
    private String address;//地址
    private String labels;//标签列表
    private String coordinate;//坐标
    private String ishot;//是否热门
    private String logo;
    private int jobcount;//职位数
    private String url;
}

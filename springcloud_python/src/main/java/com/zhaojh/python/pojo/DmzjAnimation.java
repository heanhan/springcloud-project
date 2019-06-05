package com.zhaojh.python.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class DmzjAnimation implements Serializable {

    private int id;
    private String hahawebname;// 标题
    private String antag;//动画种类
    private String japanname;//日文名
    private String allname;//别名
    private String year;//播放时间
    private String state;//播放状态
    private String tag;//类型
    private String original;//原作
    private String screenwriter;//监督
    private String company;//制作公司
    private String website;//官网
    private String content;//剧情简介
    private String contentdetail;//剧情简介
    private String goal;//评分
    private String mentotal;//评分人数
    private String url;//相关url
}

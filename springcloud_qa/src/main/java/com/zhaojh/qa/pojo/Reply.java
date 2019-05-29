package com.zhaojh.qa.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Reply {

    /**
     * 编号
     */
    private String id;

    /**
     * 问题ID
     */
    private String problemid;

    /**
     * 创建日期
     */
    private Date createtime;

    /**
     * 更新日期
     */
    private Date updatetime;

    /**
     * 回答人ID
     */
    private String userid;

    /**
     * 回答人昵称
     */
    private String nickname;

    /**
     * 回答内容
     */
    private String content;
}

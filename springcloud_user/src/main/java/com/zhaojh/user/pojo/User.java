package com.zhaojh.user.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 用户名
     */
    private String loginname;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 角色
     */
    private String roles;

    /**
     * 身份证号
     */
    private String identitycard;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生年月日
     */
    private Date birthday;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 联系方式
     */
    private String mobile;

    /**
     * E-Mail
     */
    private String email;

    /**
     * 注册日期
     */
    private Date regdate;

    /**
     * 修改日期
     */
    private Date updatedate;

    /**
     * 最后登陆日期
     */
    private Date lastdate;

    /**
     * 在线时长（分钟）
     */
    private Long online;

    /**
     * 兴趣
     */
    private String interest;

    /**
     * 个性
     */
    private String personality;

    /**
     * 粉丝数
     */
    private Integer fanscount;

    /**
     * 关注数
     */
    private Integer followcount;

    /**
     * 用户状态  状态：0，正常，1 禁言，2 封杀
     */
    private String status;

}
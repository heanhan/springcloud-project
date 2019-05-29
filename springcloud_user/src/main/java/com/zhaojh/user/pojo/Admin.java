package com.zhaojh.user.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 
 */
@Data
public class Admin implements Serializable {
    /**
     * ID
     */
    private String id;

    /**
     * 登陆名称
     */
    private String loginname;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态
     */
    private String state;

}
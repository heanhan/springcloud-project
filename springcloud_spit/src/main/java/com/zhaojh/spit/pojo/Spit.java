package com.zhaojh.spit.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "springcloud_spit")
@Data
public class Spit {

    @Id
    private String _id;// Id   mongondb 默认id 为_id ，手动添加后为即为自定义id,
    private String content; //吐槽内容

    @JsonFormat(pattern = "yyyy-MM-dd HH:dd:ss",timezone="GMT+8")
    private Date publishtime; //发布日期
    private String userid; //发布人ID
    private String nickname; //发布人昵称
    private int visits; //浏览量
    private int thumbup; //点赞数
    private int share; //分享数
    private int comment; //回复数
    private String state; //是否可见  0不可见（仅主人），1 可见（所有人）
    private String parentid; //上级ID
}

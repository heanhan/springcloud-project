package com.zhaojh.elasticsearch.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "projectname" ,type="post",indexStoreType="fs",shards=5,replicas=1,refreshInterval="-1")
@Data
public class Post {

    @Id
    private String id;

    @Field(index= true ,analyzer="ik_max_word",searchAnalyzer="ik_max_word")
    private String title;

    @Field(index= true ,analyzer="ik_max_word",searchAnalyzer="ik_max_word")
    private String content;

    private int userId;

    private int weight;
}

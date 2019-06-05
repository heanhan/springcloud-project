package com.zhaojh.elasticsearch.dao;

import com.zhaojh.elasticsearch.pojo.Post;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostRepository extends ElasticsearchRepository<Post, String> {
}

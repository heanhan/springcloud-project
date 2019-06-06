package com.zhaojh.spit.dao;

import com.zhaojh.spit.pojo.Spit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpitDao extends MongoRepository<Spit,String> {


}

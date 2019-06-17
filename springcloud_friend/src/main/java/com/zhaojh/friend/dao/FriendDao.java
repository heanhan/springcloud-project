package com.zhaojh.friend.dao;

import com.zhaojh.friend.pojo.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendDao extends JpaRepository<Friend,String>, JpaSpecificationExecutor<Friend> {
}

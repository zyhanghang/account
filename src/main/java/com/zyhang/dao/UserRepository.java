package com.zyhang.dao;

import com.zyhang.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zyhang
 * @create 2020-10-07 3:43 PM
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

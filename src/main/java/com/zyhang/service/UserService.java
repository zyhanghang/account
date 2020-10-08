package com.zyhang.service;

import com.zyhang.pojo.User;

import java.util.List;

/**
 * @author zyhang
 * @create 2020-10-07 3:59 PM
 */
public interface UserService {

    User getUserById(Long id);

    List<User> getUsers();

    User addUser(User user);

    User updateUser(Long id, User user);

    void deleteUserById(Long id);
}

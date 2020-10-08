package com.zyhang.service;

import com.zyhang.dao.UserRepository;
import com.zyhang.pojo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author zyhang
 * @create 2020-10-07 4:04 PM
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public User updateUser(Long id, User user) {
        User u = userRepository.getOne(id);
        System.out.println(id);
        if (u == null) {
            throw new RuntimeException("no such user");
        }
        BeanUtils.copyProperties(user, u);
        return userRepository.save(u);
    }

    @Transactional
    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}

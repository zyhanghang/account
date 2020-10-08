package com.zyhang.controller;

import com.zyhang.pojo.User;
import com.zyhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zyhang
 * @create 2020-10-07 4:15 PM
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> listUsers() {
        return userService.getUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "add success";
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody User user) {
        System.out.println("userId is=" + user.getId());
        userService.updateUser(user.getId(), user);
        return "update success";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
        return "delete success";
    }
}
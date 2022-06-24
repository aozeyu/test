package com.yzy.test.controller;

import com.yzy.test.entity.User;
import com.yzy.test.service.UserService;
import com.yzy.test.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: test
 * @description: 333
 * @packagename: com.yzy.test.controller
 * @author: 姚泽宇
 * @date: 2022-06-23 09:29
 **/
@RestController
public class UserController {
    @Autowired
    private UserServiceimpl userService;
    @GetMapping("getusers")
    @CrossOrigin
    public List<User> getUser() {
        return userService.getUsers();
    }
}

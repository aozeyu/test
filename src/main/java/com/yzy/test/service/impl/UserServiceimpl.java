package com.yzy.test.service.impl;

import com.yzy.test.dao.UserMapper;
import com.yzy.test.entity.User;
import com.yzy.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: test
 * @description: 333
 * @packagename: com.yzy.test.service.impl
 * @author: 姚泽宇
 * @date: 2022-06-23 09:36
 **/
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUsers() {
        return userMapper.getAllUsers();
    }
}

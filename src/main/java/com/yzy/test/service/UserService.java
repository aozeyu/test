package com.yzy.test.service;

import com.yzy.test.dao.UserMapper;
import com.yzy.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: test
 * @description: 333
 * @packagename: com.yzy.test.service
 * @author: 姚泽宇
 * @date: 2022-06-23 09:31
 **/
@Service
public interface UserService{

    public List<User> getUsers();
}

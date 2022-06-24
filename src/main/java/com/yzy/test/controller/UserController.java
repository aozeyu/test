package com.yzy.test.controller;

import com.yzy.test.dao.MessageRepository;
import com.yzy.test.entity.Message;
import com.yzy.test.entity.User;
import com.yzy.test.service.UserService;
import com.yzy.test.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
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

//    jpa中的repository相当于是业务层service
    @Autowired
    private MessageRepository messageRepository;
    @GetMapping("getusers")
    @CrossOrigin
    public List<User> getUser() {
        return userService.getUsers();
    }

    @RequestMapping("getMessages")
    @CrossOrigin
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }


    @GetMapping("/postMessage")
    @CrossOrigin
    private String postMessage(@RequestParam String author, @RequestParam String message) {
        if (author.equals("") || message.equals("")) {
            return "留言失败";
        }else {
            messageRepository.save(new Message((long)(messageRepository.findAll().size() + 1), author,message,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
            return "留言成功";
        }

    }
}

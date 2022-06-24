package com.yzy.test.dao;

import com.yzy.test.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: test
 * @description: 333
 * @packagename: com.yzy.test.dao
 * @author: 姚泽宇
 * @date: 2022-06-24 17:32
 **/
public interface MessageRepository extends JpaRepository<Message,Long> {
}

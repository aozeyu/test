package com.yzy.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;




/**
 * @program: test
 * @description: 333
 * @packagename: com.yzy.test.entity
 * @author: 姚泽宇
 * @date: 2022-06-24 17:27
 **/

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    private Long id;
    private String author;
    private String message;
    private String time;
}

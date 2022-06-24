package com.yzy.test.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: test
 * @description: 333
 * @packagename: com.yzy.test.entity
 * @author: 姚泽宇
 * @date: 2022-06-23 09:27
 **/
@Data
public class User {
    private Date date;
    private String name;
    private String province;
    private String city;
    private String address;
    private String zip;
}

package com.cn.springdemo.dao;

import org.springframework.stereotype.Repository;

/**
 * Dao
 */
@Repository("userDao")
public class UserDao {
    public void insert(){
        System.out.println("insert over !!");
    }
}

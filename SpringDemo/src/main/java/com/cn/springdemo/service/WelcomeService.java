package com.cn.springdemo.service;

import com.cn.springdemo.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ws")
public class WelcomeService {

    private String message = "hello world";

    private UserDao dao;

    @Resource(name = "userDao")
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHello(){
        System.out.println(message);
        dao.insert();
    }

}

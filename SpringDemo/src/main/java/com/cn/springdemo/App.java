package com.cn.springdemo;

import com.cn.springdemo.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        WelcomeService ws = (WelcomeService)ac.getBean("ws");
        ws.sayHello();



//        WelcomeService ws = new WelcomeService();
//        ws.setMessage("hello world");
//        ws.sayHello();

    }
}

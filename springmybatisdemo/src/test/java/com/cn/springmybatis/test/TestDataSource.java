package com.cn.springmybatis.test;

import com.cn.springmybatis.domain.User;
import com.cn.springmybatis.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestDataSource {
    @Test
    public void testConn() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        DataSource ds = (DataSource)ac.getBean("dataSource");
        System.out.println(ds.getConnection());

    }

    @Test
    public void testUserService() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService us = (UserService)ac.getBean("userService");

        User u = new User();
        u.setName("yangsailin2");
        u.setAge(18);
        us.insert(u);

    }
}

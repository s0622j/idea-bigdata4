package com.cn.springmybatis.test;

import com.cn.springmybatis.domain.Item;
import com.cn.springmybatis.domain.Order;
import com.cn.springmybatis.domain.User;
import com.cn.springmybatis.service.ItemService;
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

    @Test
    public void testItemService() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ItemService is = (ItemService)ac.getBean("itemService");

        Item it = new Item();
        it.setItemName("ii00000000");
        Order o = new Order();
        o.setId(2);

        it.setOrder(o);
        is.insert(it);

    }

    @Test
    public void selectOne() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        ItemService is = (ItemService)ac.getBean("itemService");

        Item it = is.selectOne(2);
        System.out.println(it.getItemName());
        System.out.println(it.getOrder().getOrderNo());
        System.out.println(it.getOrder().getUser().getName());

    }

    @Test
    public void longTx() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService us = (UserService)ac.getBean("userService");

        us.longTx();

    }
}

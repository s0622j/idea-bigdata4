package com.cn.mybatisdemo.test;

import com.cn.mybatisdemo.domain.Item;
import com.cn.mybatisdemo.domain.Order;
import com.cn.mybatisdemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestOrder {

    /**
     * insert
     * @throws Exception
     */
    @Test
    public void insert() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();

        User u = new User();
        u.setId(2);
        Order o = new Order();
        o.setOrderNo("No005");
        o.setUser(u);

        s.insert("orders.insert",o);
        s.commit();
        s.close();
    }


    /**
     * select
     * @throws Exception
     */
    @Test
    public void select1() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();

//        Order order = s.selectOne("orders.selectOne",1);
        Order order = s.selectOne("orders.selectOne2",1);
        System.out.println(order.getOrderNo());
        s.commit();
        s.close();
    }

    /**
     * select
     * @throws Exception
     */
    @Test
    public void select2() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();

//        Order order = s.selectOne("orders.selectOne",1);
        Order order = s.selectOne("orders.selectOne3",1);
        System.out.println(order.getOrderNo() + order.getUser().getName());
        for (Item i : order.getItems()){
            System.out.println(i.getId() + " : " + i.getItemName());
        }
        s.commit();
        s.close();
    }

    /**
     * select
     * @throws Exception
     */
    @Test
    public void selectAll() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();

        List<Order> list = s.selectList("orders.selectAll");
        for (Order o : list){
            System.out.println(o.getOrderNo() + "," + o.getUser().getName());
        }
        s.commit();
        s.close();
    }
}

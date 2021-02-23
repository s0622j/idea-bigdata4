package com.cn.mybatisdemo.test;

import com.cn.mybatisdemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestCRUD {

    /**
     * insert
     * @throws Exception
     */
    @Test
    public void insert() throws Exception {
        //指定配置文件的路径(类路径)
        String resource = "mybatis-config.xml";
        //加载文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂builder,相当于连接池
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);

        //通过sf开启会话，相当于开连接池
        SqlSession s = sf.openSession();

        User u = new User();
        u.setName("Tom");
        u.setAge(12);
        s.insert("users.insert",u);
        s.commit();
        s.close();
    }

    /**
     * update
     * @throws Exception
     */
    @Test
    public void update() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession s = sf.openSession();
        User u = new User();

        u.setId(1);
        u.setName("Tomas");
        u.setAge(32);
        s.update("users.update",u);
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

        User user = s.selectOne("users.selectOne",1);
        System.out.println(user.getName());
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

        List<User> users = s.selectList("users.selectAll");
        for (User uu : users){
            System.out.println(uu.getName() + "," + uu.getAge());
        }
        s.commit();
        s.close();
    }
}

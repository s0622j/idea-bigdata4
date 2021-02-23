package com.cn.mybatisdemo;

import com.cn.mybatisdemo.dao.UserDao;
import com.cn.mybatisdemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) {

        UserDao dao = new UserDao();
//        User u = dao.selectOne(1);
//        System.out.println(u.getName());
        List<User> list = dao.selectAll();
        for (User u : list){
            System.out.println(u.getName());
        }

//        try {
//            //指定配置文件的路径(类路径)
//            String resource = "mybatis-config.xml";
//            //加载文件
//            InputStream inputStream = Resources.getResourceAsStream(resource);
//            //创建会话工厂builder,相当于连接池
//            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
//
//            //通过sf开启会话，相当于开连接池
//            SqlSession s = sf.openSession();
//
//            User u = new User();
//            u.setName("Tom");
//            u.setAge(12);
//            s.insert("users.insert",u);
//            s.commit();
//            s.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}

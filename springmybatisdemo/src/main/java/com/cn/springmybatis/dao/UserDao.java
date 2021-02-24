package com.cn.springmybatis.dao;

import com.cn.springmybatis.domain.Order;
import com.cn.springmybatis.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao
 */

@Repository
public class UserDao extends SqlSessionDaoSupport implements BaseDao<User> {


    public void insert(User user) {
        getSqlSession().insert("users.insert",user);
    }

    public void update(User user) {
        getSqlSession().update("users.update",user);
    }

    public void delete(Integer id) {
        getSqlSession().delete("users.delete",id);
    }

    public User selectOne(Integer id) {
        return getSqlSession().selectOne("users.selectOne2",id);
    }

    public List<User> selectAll() {
        return getSqlSession().selectList("users.selectAll2");
    }
}

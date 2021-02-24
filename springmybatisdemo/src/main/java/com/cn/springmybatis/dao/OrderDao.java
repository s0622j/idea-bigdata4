package com.cn.springmybatis.dao;

import com.cn.springmybatis.domain.Order;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderDao
 */

@Repository
public class OrderDao extends SqlSessionDaoSupport implements BaseDao<Order> {
    public void insert(Order order) {

    }

    public void update(Order order) {

    }

    public void delete(Integer id) {

    }

    public Order selectOne(Integer id) {
        return null;
    }

    public List<Order> selectAll() {
        return null;
    }
}

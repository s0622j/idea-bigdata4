package com.cn.springmybatis.dao.impl;

import com.cn.springmybatis.dao.BaseDao;
import com.cn.springmybatis.domain.Item;
import com.cn.springmybatis.domain.Order;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ItemDaoImpl
 */

@Repository
public class ItemDaoImpl extends SqlSessionDaoSupport implements BaseDao<Item> {

    public void insert(Item item) {
        getSqlSession().insert("items.insert",item);
    }

    public void update(Item item) {

    }

    public void delete(Integer id) {

    }

    public Item selectOne(Integer id) {
        return getSqlSession().selectOne("items.selectOne",id);
    }

    public List<Item> selectAll() {
        return null;
    }
}

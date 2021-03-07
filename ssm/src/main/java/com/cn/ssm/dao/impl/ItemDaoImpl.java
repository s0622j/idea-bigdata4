package com.cn.ssm.dao.impl;


import com.cn.ssm.dao.BaseDao;
import com.cn.ssm.domain.Item;
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
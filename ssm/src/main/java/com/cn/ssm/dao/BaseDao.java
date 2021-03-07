package com.cn.ssm.dao;

import java.util.List;

/**
 * 基本Dao接口
 * @param <T>
 */
public interface BaseDao<T> {
    public void insert(T t);
    public void update(T t);
    public void delete(Integer id);
    public T selectOne(Integer id);
    public List<T> selectAll();
}
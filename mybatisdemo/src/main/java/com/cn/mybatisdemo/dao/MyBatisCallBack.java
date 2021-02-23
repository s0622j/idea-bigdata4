package com.cn.mybatisdemo.dao;

import org.apache.ibatis.session.SqlSession;

/**
 * 回调接口
 */
public interface MyBatisCallBack {
    public Object doInMybatis(SqlSession s);
}

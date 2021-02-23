package com.cn.mybatisdemo.dao;

import com.cn.mybatisdemo.util.Util;
import org.apache.ibatis.session.SqlSession;

/**
 * 模板类
 */
public class DaoTemplate {
    /**
     *
     */
    public static Object execute(MyBatisCallBack cb){
        SqlSession s = null;
        try {
            s = Util.openSession();
            //s.insert("users.insert", user);
            Object ret = cb.doInMybatis(s);
            s.commit();
            return ret;
        }catch (Exception e){
            Util.rollbackTx(s);
        }finally {
            Util.closeSession(s);
        }
        return null;
    }
}

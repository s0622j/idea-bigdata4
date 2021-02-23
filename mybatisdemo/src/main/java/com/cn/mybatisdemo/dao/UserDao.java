package com.cn.mybatisdemo.dao;

import com.cn.mybatisdemo.domain.User;
import com.cn.mybatisdemo.util.Util;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {

    /**
     * 插入操作
     * @param user
     */
    public void insert(final User user){
        DaoTemplate.execute(new MyBatisCallBack() {
            public Object doInMybatis(SqlSession s) {
                s.insert("users.insert",user);
                return null;
            }
        });

//        SqlSession s = null;
//        try {
//            s = Util.openSession();
//            s.insert("users.insert", user);
//            s.commit();
//        }catch (Exception e){
//            Util.rollbackTx(s);
//        }finally {
//            Util.closeSession(s);
//            }
    }

    /**
     * 更新操作
     */
    public void update(final User user){
        DaoTemplate.execute(new MyBatisCallBack() {
            public Object doInMybatis(SqlSession s) {
                s.update("users.update" , user);
                return null;
            }
        });

//        SqlSession s = null;
//        try {
//            s = Util.openSession();
//            s.update("users.update", user);
//            s.commit();
//        }catch (Exception e){
//            Util.rollbackTx(s);
//        }finally {
//            Util.closeSession(s);
//        }
    }

    public User selectOne(final Integer id){
        return (User) DaoTemplate.execute(new MyBatisCallBack() {
            public Object doInMybatis(SqlSession s) {
                return s.selectOne("users.selectOne2" , id);
            }
        });
    }

    public List<User> selectAll(){
        return (List<User>) DaoTemplate.execute(new MyBatisCallBack() {
            public Object doInMybatis(SqlSession s) {
                return s.selectList("users.selectAll2");
            }
        });
    }
}

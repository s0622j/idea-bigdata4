package com.cn.springmybatis.service.impl;

import com.cn.springmybatis.dao.BaseDao;
import com.cn.springmybatis.domain.Item;
import com.cn.springmybatis.domain.Order;
import com.cn.springmybatis.domain.User;
import com.cn.springmybatis.service.ItemService;
import com.cn.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Resource(name = "itemDaoImpl")
    private BaseDao<Item> itemDao;

    /* 重写该方法，注入指定的Dao对象 */
    @Resource(name = "userDao")
    @Override
    public void setDao(BaseDao<User> dao) {
        super.setDao(dao);
    }

    /**
     * 长事务测试
     */
    public void longTx(){
        //插入item
        Item i = new Item();
        i.setItemName("ttttttt");
        itemDao.insert(i);

        Order o = new Order();
        o.setId(2);

        this.delete(1);

    };

    //    //注入指定的dao
//    @Resource(name = "userDao")
//    private BaseDao<User> dao;
//
//    public void insert(User user) {
//        dao.insert(user);
//    }
//
//    public void update(User user) {
//        dao.update(user);
//    }
//
//    public void delete(Integer id) {
//        dao.delete(id);
//    }
//
//    public User selectOne(Integer id) {
//        return dao.selectOne(id);
//    }
//
//    public List<User> selectAll() {
//        return dao.selectAll();
//    }
}

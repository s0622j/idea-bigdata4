package com.cn.springmybatis.service.impl;

import com.cn.springmybatis.dao.BaseDao;
import com.cn.springmybatis.domain.Item;
import com.cn.springmybatis.domain.User;
import com.cn.springmybatis.service.ItemService;
import com.cn.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service("itemService")
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {
    /* 重写该方法，注入指定的Dao对象 */
    @Resource(name = "itemDao")
    @Override
    public void setDao(BaseDao<Item> dao) {
        super.setDao(dao);
    }


}

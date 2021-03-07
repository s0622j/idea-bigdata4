package com.cn.ssm.service;


import com.cn.ssm.domain.User;

public interface UserService extends BaseService<User>{

    public void longTx();
}

package com.springmvc.web.controller;

import com.springmvc.domain.Users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DB {
    public static Map<Integer, Users> tables = new HashMap<Integer, Users>();
    static {
        for (int i = 1 ; i<=15; i++){
            Users u = new Users();
            u.setId(i);
            u.setName("tom" + i);
            u.setAge(i % 20);
            tables.put(i,u);
        }
    }

    /**
     * 查询全部
     * @return
     */
    public static List<Users> findAll(){
        return new ArrayList<Users>(tables.values());
    }

    /**
     * 删除
     * @param uid
     */
    public  static void delete(Integer uid){
        tables.remove(uid);
    }

    /**
     * 查询
     * @param uid
     */
    public  static Users select(Integer uid){
       return tables.get(uid);
    }

    /**
     * 更新
     * @param user
     */
    public  static void update(Users user){
        tables.put(user.getId(),user);
    }

    /**
     * 删除全部
     */
    public static void deleteAll(){
        tables.clear();
    }
}

package com.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegController {
    @RequestMapping("/toReg")
    public String toRegView(){
        return "reg";
    }

//    @RequestMapping("/doReg")
//    public String doReg(HttpServletRequest req){
//        System.out.println("插入数据");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        System.out.println("username:" + username + "password:" +password);
//        return "index2";
//    }

    @RequestMapping("/doReg2")
    public String doReg(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println("插入数据111111");
        System.out.println("username:" + username + "password:" +password);
        return "index2";
    }
}

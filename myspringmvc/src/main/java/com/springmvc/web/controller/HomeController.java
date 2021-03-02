package com.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 */
@Controller
public class HomeController {

    /**
     * 打开主页
     * @return
     */
    @RequestMapping(value = {"/home"})
    public String openHome(){
        System.out.println("hello world");
        // /index.jsp
        return "index";
    }

    /**
     * 打开主页
     * @return
     */
    @RequestMapping(value = {"/home2"})
    public String openHome2(){
        System.out.println("how are you?????");
        // /index.jsp
        return "index2";
    }
}

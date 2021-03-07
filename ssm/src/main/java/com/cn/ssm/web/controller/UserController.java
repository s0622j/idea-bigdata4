package com.cn.ssm.web.controller;

import com.cn.ssm.domain.User;
import com.cn.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Controller
public class UserController {
    @Resource(name = "userService")
    private UserService us;
    /**
     * 查看全部user
     * @return
     */
    @RequestMapping("/user/findall")
    public String findAll(Model m){
        List<User> list = us.selectAll();
        m.addAttribute("allUsers",list);
        return "user/userList";
    }

    @RequestMapping("/user/hello")
    public String accessHtml(){
        System.out.println("kkkkkkk");
        return "forward:/html/hello.html";
    }
}

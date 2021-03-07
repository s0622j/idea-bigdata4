package com.springmvc.web.controller;

import com.springmvc.domain.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/selectOne")
    public String selectOne(Model model,@RequestParam("uid") int uid){
        System.out.println("接收到了参数 ：uid = " + uid);
        String username = "tomson";
        //将数据存放到model中，向jsp传递
        model.addAttribute("myusername",username);
        return "selectOne";
    }

    @RequestMapping("/selectAll")
    public String selectAll(Model m,HttpSession s){
//        List<Users> list = new ArrayList<Users>();
//        for (int i = 1 ; i <= 50 ; i++){
//            Users u = new Users();
//            u.setId(i);
//            u.setName("tom"+i);
//            u.setAge(i % 20);
//            list.add(u);
//        }
        //
//        m.addAttribute("allUsers",list);
        if (s.getAttribute("user") == null){
            return "redirect/toLogin";
        }
        m.addAttribute("allUsers",DB.findAll());
        return "userList";
    }

    @RequestMapping("/deleteOne")
    public String deleteOne(@RequestParam("uid") int uid){
        System.out.println("delete uid = " + uid);
        DB.delete(uid);
        //forward;请求转发,服务器端完成
        //redirect;重定向,
        return "redirect:/selectAll";
//        return "userList";
    }

    @RequestMapping("/editOne")
    public String editOne(Model m ,@RequestParam("uid") Integer uid){
        Users u = DB.select(uid);
        m.addAttribute("user",u);
        return "editUser";
    }

    @RequestMapping("/updateOne")
    public String updateOne(Model m ,Users user){
        DB.update(user);
        return "forward:/selectAll";
    }

    @RequestMapping("/toLogin")
    public String doLogin(){
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(Users u , HttpSession s){
        //将数据存放到session范围
        s.setAttribute("user",u);
        return "index";
    }
}

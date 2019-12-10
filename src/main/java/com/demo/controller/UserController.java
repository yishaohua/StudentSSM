package com.demo.controller;

import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("list")
    public String list(Model model){
        List<User> us= userService.list();
        model.addAttribute("us", us);
        return "view";
    }
    @RequestMapping("add")
    public String add(User user,Model model){
        userService.add(user);
        return "redirect:list";
    }
    @RequestMapping("del")
    public String del(int id){
        userService.del(id);
        return "redirect:list";
    }
    @RequestMapping("editUI")
    public String editUI(int id,Model model){
        User user = userService.get(id);
        model.addAttribute("user",user);
        return "edit";
    }
    @RequestMapping("update")
    public String update(User user){
        userService.update(user);
        return "redirect:list";
    }

}
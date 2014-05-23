package com.hawk.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/getUser")
    public String getUser(Model model){
        model.addAttribute("myname", "I am 玄玉");
        return "myfree";
    }

    @RequestMapping("/getUserName")
    public String getUserName(Model model){
        model.addAttribute("myname", "I am Larry");
        return "username";
    }
}
package com.atguigu.controller;

import com.atguigu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/index.do")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user, ModelMap map){
        return "success";
    }

}

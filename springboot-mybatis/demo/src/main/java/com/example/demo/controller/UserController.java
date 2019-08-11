package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: demo
 * @description:
 * @author: zhangwei
 * @create: 2019-08-11 16:59
 **/
@Controller
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser/{id}")
    public String getUser(@PathVariable int id) {
        return userService.sel(id).toString();
    }
}


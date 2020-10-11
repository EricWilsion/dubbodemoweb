package com.offcn.dubbodemo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.dubbodemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 *
 * @author 26086
 * @date 2020/9/10 18:33
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return userService.getName();



    }





}

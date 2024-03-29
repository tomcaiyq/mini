package com.hthj.mini.controller;

import com.hthj.mini.pojo.User;
import com.hthj.mini.service.UserService;
import com.hthj.mini.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public Result<List<User>> user() {
        return userService.getUser();
    }

}

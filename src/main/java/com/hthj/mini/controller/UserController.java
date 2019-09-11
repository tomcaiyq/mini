package com.hthj.mini.controller;

import com.hthj.mini.pojo.User;
import com.hthj.mini.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> user() {
        List<User> users = userService.getUser();
        for (User user : users) {
            System.out.println(user.getUId());
        }
        return users;
    }
}
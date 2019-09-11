package com.hthj.mini.service.impl;

import com.hthj.mini.dao.UserDao;
import com.hthj.mini.pojo.User;
import com.hthj.mini.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.select();
    }
}

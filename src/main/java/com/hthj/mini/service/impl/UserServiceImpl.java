package com.hthj.mini.service.impl;

import com.hthj.mini.constant.Constant;
import com.hthj.mini.dao.UserDao;
import com.hthj.mini.pojo.User;
import com.hthj.mini.service.UserService;
import com.hthj.mini.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Result<List<User>> getUser() {
        List<User> users = userDao.select();
        User user = users.get(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(user.getBirthday()));
        return new Result<>(Constant.SUCCESS_CODE, Constant.SUCCESS_MSG, userDao.select());
    }
}

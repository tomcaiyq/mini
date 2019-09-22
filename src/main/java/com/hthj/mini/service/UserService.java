package com.hthj.mini.service;

import com.hthj.mini.pojo.User;
import com.hthj.mini.util.Result;

import java.util.List;

public interface UserService {
    Result<List<User>> getUser();
}

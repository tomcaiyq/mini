package com.hthj.mini.dao;

import com.hthj.mini.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from t_user")
    List<User> select();
}

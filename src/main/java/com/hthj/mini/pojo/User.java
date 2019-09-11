package com.hthj.mini.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long uId;
    private String username;
    private Date birthday;
    private String password;
    private String email;
    private String phone;
    private int gender;
}

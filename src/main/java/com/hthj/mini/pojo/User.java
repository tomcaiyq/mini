package com.hthj.mini.pojo;

import lombok.Data;

@Data
public class User {
    private Long uid;
    private String username;
    private Long birthday;
    private String password;
    private String email;
    private String phone;
    private int gender;

}


package com.xuzi.community.service;

import com.xuzi.community.entity.User;

import java.util.Map;

public interface UserService {

    User findById(int id);

    //注册用户
    Map<String, Object> register(User user);

    //激活用户
    int activation(int userId, String code);

}

package com.xuzi.community.service;

import com.xuzi.community.entity.LoginTicket;
import com.xuzi.community.entity.User;

import java.util.Map;

public interface UserService {

    User findById(int id);

    User findByName(String username);

    //注册用户
    Map<String, Object> register(User user);

    //激活用户
    int activation(int userId, String code);

    //用户登录
    Map<String, Object> login(String username, String password, long expiredSeconds);

    //用户登出
    void logout(String ticket);

    //查询登录凭证
    LoginTicket findLoginTicket(String ticket);

    //修改头像
    void updateHeader(String headerUrl, int id);

    //修改密码
    void updatePassword(int id, String newPassword);

}

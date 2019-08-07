package com.xuzi.community.service.impl;

import com.xuzi.community.dao.UserMapper;
import com.xuzi.community.entity.User;
import com.xuzi.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.selectById(id);
    }
}

package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: zhangwei
 * @create: 2019-08-11 16:57
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User sel(int id) {
        return userMapper.Sel(id);
    }
}


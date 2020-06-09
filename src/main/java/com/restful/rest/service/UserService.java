package com.restful.rest.service;

import com.restful.rest.Dao.User;
import com.restful.rest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void add(User user){
        userMapper.add(user);
    }
}

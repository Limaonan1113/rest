package com.restful.rest.service;

import com.restful.rest.model.User;
import com.restful.rest.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    /**
     * 用户添加add
     * @param user
     */
    public void add(User user){

        log.info("user",user.toString());
        userMapper.add(user);
    }

    public List<User> show(){
        return userMapper.show();
    }
}

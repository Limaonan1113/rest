package com.restful.rest.mapper;

import com.restful.rest.Dao.User;

import java.util.List;

public interface UserMapper {
        void add(User user);

        List<User> show();
}

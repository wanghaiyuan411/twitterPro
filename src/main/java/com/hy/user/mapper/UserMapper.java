package com.hy.user.mapper;


import com.hy.service.entity.User;

public interface UserMapper{
    User selectUserById(int userid);

    void insertUser(User user);
}

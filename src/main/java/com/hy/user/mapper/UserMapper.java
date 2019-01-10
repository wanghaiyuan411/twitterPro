package com.hy.user.mapper;


import com.hy.service.entity.User;

public interface UserMapper{
    User selectById(int userid);
    User selectByUser(User user);
    User checkByUser(User user);
    void insertUser(User user);
}

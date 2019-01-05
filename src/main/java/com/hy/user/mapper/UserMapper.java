package com.hy.user.mapper;


import com.hy.user.entity.User;

//@Component
public interface UserMapper{
    User selectUserById(int userid);
}

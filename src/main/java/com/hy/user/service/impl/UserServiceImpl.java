package com.hy.user.service.impl;

import com.hy.service.entity.User;
import com.hy.service.service.UserService;
import com.hy.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserById(int userid) {
        User user = userMapper.selectUserById(userid);
        return user;
    }

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}

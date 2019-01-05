package com.hy.user.service.impl;

import com.hy.common.entity.User;
import com.hy.user.mapper.UserMapper;
import com.hy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    public User getUserById(int userid) {
        User user = userMapper.selectUserById(userid);
        return user;
    }
}

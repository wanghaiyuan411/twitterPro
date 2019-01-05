package com.hy.service.service;


import com.hy.service.entity.User;

public interface UserService {
    User getUserById(int userid);
    void insertUser(User user);
}

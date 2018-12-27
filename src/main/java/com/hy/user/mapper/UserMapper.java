package com.hy.user.mapper;

import com.hy.common.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper{
    User selectUserById(int userid);
}

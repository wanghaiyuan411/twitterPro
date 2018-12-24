package com.hy.user.mapper;

import com.hy.common.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper {
    User selectUserById(int userid);
}

package com.hy.common.model;

import com.hy.service.entity.User;

/**
 * Author wanghaiyuan
 * Date 2019/1/5 17:59.
 */
public class RespGetUser extends RespBase {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

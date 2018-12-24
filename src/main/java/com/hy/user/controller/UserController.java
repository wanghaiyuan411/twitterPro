package com.hy.user.controller;

import com.hy.common.entity.User;
import com.hy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public User getUserInfo(@RequestBody int userid){
        return userService.getUserById(userid);
    }
}

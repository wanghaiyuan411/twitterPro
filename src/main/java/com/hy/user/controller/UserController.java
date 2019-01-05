package com.hy.user.controller;

import com.hy.user.entity.User;
import com.hy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public User getUserInfo(HttpServletRequest httpservletRequest, int userid){
        //TODO HttpServletRequest
        System.out.print(1122);
        return userService.getUserById(userid);
    }
}

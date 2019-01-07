package com.hy.user.controller;

import com.hy.common.model.RespBase;
import com.hy.common.model.RespGetUser;
import com.hy.service.entity.User;
import com.hy.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public RespGetUser getUserInfo(HttpServletRequest httpservletRequest, HttpServletResponse response, int userid){
        //TODO HttpServletRequest
        System.out.print(1122);
        User user = userService.getUserById(userid);
        RespGetUser getUserModel = new RespGetUser();
        getUserModel.setUser(user);
        return getUserModel;
    }
    //@ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUser(HttpServletRequest httpservletRequest, User user){
        userService.insertUser(user);
        RespBase respBase = new RespBase();
        return "redirect:/register.jsp";
    }
    private void response(HttpServletResponse response) {
        StringBuffer stringBuffer = new StringBuffer("<html>");
        stringBuffer.append("Error page").append("</html>");
        try {
            response.getWriter().write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

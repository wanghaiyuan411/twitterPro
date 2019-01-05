package com.hy.user.controller;

import com.hy.common.entity.User;
import com.hy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public User getUserInfo(HttpServletRequest httpservletRequest, HttpServletResponse response, int userid){
        //TODO HttpServletRequest
        System.out.print(1122);
        User user = userService.getUserById(userid);
        /*try {
            response.getWriter().write(JSON.toJSONString(user));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //response(response);
        return user;
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

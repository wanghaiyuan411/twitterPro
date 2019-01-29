package com.hy.user.controller;

import com.hy.common.model.RespBase;
import com.hy.common.model.RespGetUser;
import com.hy.service.entity.Twitter;
import com.hy.service.entity.User;
import com.hy.service.service.RedisService;
import com.hy.service.service.TwitterService;
import com.hy.service.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TwitterService twitterService;
    @Autowired
    private RedisService redisService;
    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
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
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUser(HttpServletRequest httpservletRequest, User user){
        userService.insertUser(user);
        RespBase respBase = new RespBase();
        return "redirect:/register.jsp";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, User user, ModelMap modelMap){
        Long result = redisService.hSet("user", "id_2", "James Hardon");
        LOGGER.info("Result = {}", result);
        LOGGER.error("sfdasgfas");
        String username = user.getUsername();
        String password = user.getPassword();
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            return "/";
        }
        user = userService.loginUser(user);
        if (user == null){
            return "/";
        }
        if (user.getUserid() == null){
            return "/";
        }
        List<Twitter> list = twitterService.getTwittersByUser(user);
        modelMap.put("pageInfo", list);
        System.out.println("user = " + user.getUsername() +", "+user.getPassword());
        HttpSession session = request.getSession();
        session.setAttribute("userSession", user);
        return "/home.jsp";
    }

}

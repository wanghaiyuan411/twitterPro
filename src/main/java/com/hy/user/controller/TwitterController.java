package com.hy.user.controller;

import com.hy.common.model.RespGetTwitter;
import com.hy.service.entity.Twitter;
import com.hy.service.entity.User;
import com.hy.service.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Controller
@RequestMapping(value = "/twitter")
public class TwitterController {
    @Autowired
    private TwitterService twitterService;

    @ResponseBody
    @RequestMapping(value = "/getTwitters", method = RequestMethod.POST)
    public RespGetTwitter getTwitters(User user){
        List<Twitter> list = twitterService.getTwittersByUser(user);
        RespGetTwitter respGetTwitter = new RespGetTwitter();
        respGetTwitter.setTwitters(list);
        return respGetTwitter;
    }
}

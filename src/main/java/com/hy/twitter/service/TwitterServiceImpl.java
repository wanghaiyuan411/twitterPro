package com.hy.twitter.service;

import com.hy.service.entity.Twitter;
import com.hy.service.entity.User;
import com.hy.service.service.TwitterService;
import com.hy.twitter.mapper.TwitterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Author wanghaiyuan
 * Date 2019/1/9 14:57.
 */
@Service("twitterService")
public class TwitterServiceImpl implements TwitterService {
    @Autowired
    private TwitterMapper twitterMapper;

    public List<Twitter> getTwittersByUser(User user) {
        return twitterMapper.getTwittersByUser(user);
    }
}

package com.hy.service.service;

import com.hy.service.entity.Twitter;
import com.hy.service.entity.User;
import java.util.List;

/**
 * Author wanghaiyuan
 * Date 2019/1/9 14:57.
 */
public interface TwitterService {
    List<Twitter> getTwittersByUser(User user);
}

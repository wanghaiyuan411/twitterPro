package com.hy.twitter.mapper;

import com.hy.service.entity.Twitter;
import com.hy.service.entity.User;
import java.util.List;

/**
 * Author wanghaiyuan
 * Date 2019/1/9 14:58.
 */
public interface TwitterMapper {
    List<Twitter> getTwittersByUser(User user);
}

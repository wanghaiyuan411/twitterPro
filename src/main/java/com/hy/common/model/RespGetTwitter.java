package com.hy.common.model;

import com.hy.service.entity.Twitter;
import java.util.List;

/**
 * Author wanghaiyuan
 * Date 2019/1/9 15:44.
 */
public class RespGetTwitter extends RespBase {
    private List<Twitter> twitters;

    public List<Twitter> getTwitters() {
        return twitters;
    }

    public void setTwitters(List<Twitter> twitters) {
        this.twitters = twitters;
    }
}

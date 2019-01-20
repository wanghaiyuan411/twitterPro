package com.hy.service.service;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * Author wanghaiyuan
 * Date 2019/1/19 22:29.
 */
@Service("redisService")
public class RedisService {
    private Jedis jedis;
    private JedisConnectionFactory jedisConnectionFactory;

    @Bean
    public Jedis jedis(){
        this.jedis = jedisConnectionFactory.getShardInfo().createResource();
        return this.jedis;
    }
    public RedisService(){
    }
    public Long hSet(String key, String field, String value){
        return this.jedis.hset(key, field, value);
    }
    public String hGet(String key, String field){
        return this.jedis.hget(key, field);
    }

    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }

    public JedisConnectionFactory getJedisConnectionFactory() {
        return jedisConnectionFactory;
    }

    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        this.jedisConnectionFactory = jedisConnectionFactory;
    }
}

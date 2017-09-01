package com.yuewen.service;

import lombok.Cleanup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.exceptions.JedisException;

import java.util.*;

/**
 * Created by duanyixiao on 2017/8/16.
 */
@Service
public class RedisClient {
    private static final Logger logger = LoggerFactory.getLogger(RedisClient.class);

    @Autowired
    JedisPool jedisPool;


    //region *****************************hash
    public Optional<Long> hset(String key, String field, String value) {
        try {
            @Cleanup Jedis jedis = jedisPool.getResource();
            return Optional.ofNullable(jedis.hset(key, field, value));
        }catch (Exception e){
            logger.info("RedisClient.hset : exception,e={}",e);
            return Optional.empty();
        }
    }

    public Optional<String> hget(String key, String field) {
        try {
            @Cleanup Jedis jedis = jedisPool.getResource();
            return Optional.ofNullable(jedis.hget(key, field));
        }catch (Exception e){
            logger.info("RedisClient.hget : exception,e={}",e);
            return Optional.empty();
        }
    }

    public Optional<Map<String, String>> hgetAll(String key) {
        try {
            @Cleanup Jedis jedis = jedisPool.getResource();
            return Optional.ofNullable(jedis.hgetAll(key));
        }catch (Exception e){
            logger.error("RedisClient.hgetAll : exception,e={}",e);
            return Optional.empty();
        }
    }

    public Optional<String> hmset(String key, Map<String, String> map) {
        try {
            @Cleanup Jedis jedis = jedisPool.getResource();
            return Optional.ofNullable(jedis.hmset(key, map));
        }catch (Exception e){
            logger.error("RedisClient.hmset : exception,e={}",e);
            return Optional.empty();
        }
    }

    public Optional<Long> hlen(String key) {
        try {
            @Cleanup Jedis jedis = jedisPool.getResource();
            return Optional.ofNullable(jedis.hlen(key));
        }catch (Exception e){
            logger.error("RedisClient.hlen : exception ,e={}",e);
            return Optional.empty();
        }
    }

    public Optional<List<Object>> hmgetWithPipeline(String key, String... filed) {
        @Cleanup Jedis jedis = jedisPool.getResource();
        if (jedis != null) {
            try {
                @Cleanup Pipeline pipeline = jedis.pipelined();
                pipeline.hmget(key, filed);
                return Optional.ofNullable(pipeline.syncAndReturnAll());
            } catch (Exception e) {
                logger.error("RedisClient.hmgetWithPipeline : exception, e={}",e);
            }
        }
        return Optional.empty();
    }

    //endregion   *****************************hash

    
    public void setWithPipeline(Map<String, String> map) {
        @Cleanup Jedis jedis = jedisPool.getResource();
        if (jedis == null)
            return;
        try {
            @Cleanup Pipeline pipeline = jedis.pipelined();
            map.forEach(pipeline::set);
            pipeline.sync();
        } catch (Exception e) {
            logger.error("RedisClient.setWithPipeline : exception ,e ={}",e);
        }
    }


    public Optional<Long> del(String key) {
        try {
            @Cleanup Jedis jedis = jedisPool.getResource();
            return Optional.ofNullable(jedis.del(key));
        } catch (Exception e) {
            logger.error("RedisClient.del : exception, e={}",e);
            return Optional.empty();
        }

    }
    
}

package com.yuewen.config;

import com.yuewen.constants.ConfigFileCons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by duanyixiao on 2017/8/15.
 */
@Configuration
public class RedisConfig {

    @Autowired
    private ConfigFileCons config;

    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxWaitMillis(config.maxWait);
        jedisPoolConfig.setMaxIdle(config.maxIdle);
        return jedisPoolConfig;
    }

    @Bean
    public JedisPool jedisPool() {
        JedisPool jedisPool = null;
        if ("uat".equals(config.currentContext)) {
            jedisPool = new JedisPool(jedisPoolConfig(), config.host, config.port, config.timeout,
                    null, config.db);
        } else if ("online".equals(config.currentContext)) {
            jedisPool = new JedisPool(jedisPoolConfig(), config.host, config.port, config.timeout,
                    config.redis_password);
        }
        return jedisPool;
    }

}

package com.yuewen.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by duanyixiao on 2017/8/15.
 */
@Configuration
public class RedisConfig {

    @Value("${redis.host}")
    public String host;

    @Value(("${redis.port}"))
    public int port;

    @Value("${redis.password}")
    public String password;

    @Value("${redis.timeout}")
    public int timeout;

    @Value("${redis.db}")
    public int db;

    @Value("${redis.poolSize}")
    public int poolSize;

    @Value("${redis.maxIdle}")
    public int maxIdle;

    @Value("${redis.maxWait}")
    public int maxWait;

    @Value("${redis.currentContext}")
    public String currentContext;


    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxWaitMillis(maxWait);
        jedisPoolConfig.setMaxIdle(maxIdle);
        return jedisPoolConfig;
    }

    @Bean
    public JedisPool jedisPool() {
        JedisPool jedisPool = null;
        if ("uat".equals(currentContext)) {
            jedisPool = new JedisPool(jedisPoolConfig(), host, port, timeout,
                    password, db);
        } else if ("online".equals(currentContext)) {
            jedisPool = new JedisPool(jedisPoolConfig(), host, port, timeout,
                    password);
        }
        return jedisPool;
    }

    public static void main(String[] args) {

    }

}

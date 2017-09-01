package com.yuewen.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by duanyixiao on 2017/7/25.
 */

@Component
@PropertySource("data.properties")
public class ConfigFileCons {
    //redis
    @Value("${redis.host}")
    public String host;
    @Value(("${redis.port}"))
    public int port;
    @Value("${redis.password}")
    public String redis_password;
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

    @Value("${currentContext}")
    public String currentContext;
}

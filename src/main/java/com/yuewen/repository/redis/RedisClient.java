package com.yuewen.repository.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by duanyixiao on 2017/11/5.
 */
@Repository
public class RedisClient {

    @Autowired
    JedisPool pool;

    public void pipeVoid(Consumer<Pipeline> action) {
        try (Jedis jedis = pool.getResource()) {
            Pipeline pipe = jedis.pipelined();
            action.accept(pipe);
            pipe.sync();
        }
    }

    public List<Object> pipeReturn(Consumer<Pipeline> action) {
        try (Jedis jedis = pool.getResource()) {
            Pipeline pipe = jedis.pipelined();
            action.accept(pipe);
            return pipe.syncAndReturnAll();
        }
    }

    public <T> T execute(Function<Jedis, T> action) {
        try (Jedis jedis = pool.getResource()) {
            return action.apply(jedis);
        }
    }
}

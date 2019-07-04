package com.clesun.bigdataservice.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

/**
 * Created by clesun on 2017/3/14.
 * Redis链接池
 */
public class RedisPool {
    private static JedisPool writePool = null;
    private static JedisPool readPool = null;
    /**
     * 构建redis连接池
     *
     * @return JedisPool
     */
    public static JedisPool getWritePool() {
        if (writePool == null) {
            JedisPoolConfig config = new JedisPoolConfig();
            //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
            //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
            config.setMaxTotal(500);
            //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。
            config.setMaxIdle(5);
            //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
            config.setMaxWaitMillis(1000 * 100);
            //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
            config.setTestOnBorrow(true);
            writePool = new JedisPool(config, "123.56.200.218", 6379, Protocol.DEFAULT_TIMEOUT,"admin123");
        }
        return writePool;
    }
    /**
     * 构建redis连接池
     *
     * @return JedisPool
     */
    public static JedisPool getReadPool() {
        if (readPool == null) {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(500);
            config.setMaxIdle(5);
            config.setMaxWaitMillis(1000 * 100);
            config.setTestOnBorrow(true);
            readPool = new JedisPool(config, "59.110.16.178", 6379,Protocol.DEFAULT_TIMEOUT,"admin123");
        }
        return readPool;
    }


    /**
     * 获取写redis链接
     * @return
     */
    public static Jedis getWriteJedis(){
        if(writePool == null){
            getWritePool();
        }
        return writePool.getResource();
    }

    /**
     * 获取读redis链接
     * @return
     */
    public static Jedis getReadJedis(){
        if(readPool == null){
            getReadPool();
        }
        return readPool.getResource();
    }

    /**
     * 返还到连接池
     *
     * @param redis
     */
    public static void returnResource(Jedis redis) {
        if (redis != null) {
            redis.close();
        }
    }
}

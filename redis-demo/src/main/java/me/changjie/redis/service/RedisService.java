package me.changjie.redis.service;

import java.util.concurrent.TimeUnit;

/**
 * Created by ChangJie on 2019-09-25.
 */
public interface RedisService {

    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 存储数据
     */
    void set(String key, String value, long expried);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}

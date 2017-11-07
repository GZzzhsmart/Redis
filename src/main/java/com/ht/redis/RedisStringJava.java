package com.ht.redis;

import redis.clients.jedis.Jedis;

/**
 * redis字符串实例
 */
public class RedisStringJava {

    public static void main(String...args){
        //连接本地的Redis服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置Redis字符串数据
        jedis.set("runoobkey","www.runoob.com");
        //获取存储的数据并输出
        System.out.println("redis存储的字符串为："+jedis.get("runoobkey"));
    }
}

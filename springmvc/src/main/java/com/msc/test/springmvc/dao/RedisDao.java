package com.msc.test.springmvc.dao;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisDao {
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("连接测试。。。");
		System.out.println("Server is running: " + jedis.ping());
		
		//字符串操作
		System.out.println("字符串操作。。。");
		// set the data in redis string
		jedis.set("tutorial-name", "Redis tutorial");
		// Get the stored data and print it
		System.out.println("Stored string in redis:: " + jedis.get("tutorial-name"));
		
		//列表操作
		System.out.println("列表操作。。。");
		//store data in redis list 
		jedis.lpush("tutorial-list", "Redis");
		jedis.lpush("tutorial-list", "Mongodb");
		jedis.lpush("tutorial-list", "Mysql");
		jedis.rpush("tutorial-list", "Oracle");
		// Get the stored data and print it
//		List<String> list = jedis.lrange("tutorial-list", 0, 5);
		List<String> list = jedis.lrange("tutorial-list", 0, -1);


		for (int i = 0; i < list.size(); i++) {
			System.out.println("Stored string in redis:: " + list.get(i));
		}
		
		jedis.close();
	} 
}

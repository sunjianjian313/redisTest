package redis.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;


public class test {
	
	private Jedis jedis;
	
	
	@Test
	public void setUp(){
		jedis = new Jedis("172.20.20.92",6379);
		jedis.set("test", "连接连接。。。。。");
		System.out.println(jedis.get("test"));
		System.out.println(jedis.get("name"));
		System.out.println(jedis.hmget("user","name","age"));
		System.out.println(jedis.hgetAll("user"));
	}

}

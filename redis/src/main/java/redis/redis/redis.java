package redis.redis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class redis {
	private Jedis jedis;

	@Before
	public void setup() {
		jedis = new Jedis("49.213.13.139",6379);
		// jedis.auth("admin");  

	}
//	public static void main(String[] args) {
//		//连接本地的 Redis 服务
//	      Jedis jedis = new Jedis("49.213.13.139",6379);
//	      System.out.println("Connection to server sucessfully==redis缓存连接成功。。。。");
//	      //查看服务是否运行
//	      System.out.println("Server is running: "+jedis.ping());
//	      
//	      //设置 redis 字符串数据
//	      jedis.set("w3ckey", "Redis tutorial");
//	     // 获取存储的数据并输出
//	     System.out.println("Stored string in redis:: "+ jedis.get("w3ckey"));
//	     
//	     
//	     //存储数据到列表中
//	      jedis.lpush("tutorial-list", "Redis");
//	      jedis.lpush("tutorial-list", "Mongodb");
//	      jedis.lpush("tutorial-list", "Mysql");
//	     // 获取存储的数据并输出
//	     List<String> list = jedis.lrange("tutorial-list", 0 ,5);
//	     for(int i=0; i<list.size(); i++) {
//	       System.out.println("Stored string in redis:: "+list.get(i));
//	       
//	     }
//	     
//	}
	
	
	  @Test
	 	public void testString() {
	 		jedis.set("name", "zhengyong");
	 		System.out.println(jedis.get("name"));
	 		jedis.append("name", " haha");
	 		System.out.println(jedis.get("name"));

	 		jedis.del("name");
	 		System.out.println(jedis.get("name"));

	 		jedis.mset("name", "zhengy", "age", "25", "qq", "946793737");
	 		jedis.incr("age");
	 		System.out.println(jedis.get("name"));
	 		System.out.println(jedis.get("age"));
	 		System.out.println(jedis.get("qq"));
	 	}
	  
 //      @Test
//	 	public void testMap() {
//	 		Map<String, String> map = new HashMap<String, String>();
//	 		map.put("name", "sunjianjian");
//	 		map.put("age", "23");
//	 		map.put("qq", "123456");
//	 		jedis.hmset("user", map);
//	 		System.out.println(jedis.hmget("user", "name", "age"));
//	 		jedis.hdel("user", "age");
//	 		System.out.println(jedis.hmget("user", "age"));
//	 		System.out.println(jedis.hlen("user"));
//	 		System.out.println(jedis.exists("user"));
//	 		System.out.println(jedis.hkeys("user"));
//	 		System.out.println(jedis.hvals("user"));
//	 		System.out.println(jedis.hgetAll("user"));
//	 	}
//	  @Test
//	 	public void testList() {
//	 		jedis.del("list");
//	 		System.out.println(jedis.lrange("list", 0, -1));
//	 		jedis.lpush("list", "spring");
//	 		jedis.lpush("list", "springMVC");
//	 		jedis.lpush("list", "mybatis");
//	 		System.out.println(jedis.lrange("list", 0, -1));
//	 	}
//       
//	  @Test
//	 	public void testSet() {
//	 		jedis.sadd("set", "sunjianjian");
//	 		jedis.sadd("set", "chunpeng");
//	 		jedis.sadd("set", "zz");
//	 		jedis.sadd("set", "who");
//	 		jedis.srem("set", "who");
//	 		System.out.println(jedis.smembers("set"));
//	 		System.out.println(jedis.sismember("set", "who"));
//	 		System.out.println(jedis.srandmember("set"));
//	 		System.out.println(jedis.scard("set"));
//	 	}
//	  @Test
//	 	public void testSort() {
//	 		jedis.del("a");
//	 		jedis.rpush("a", "1");
//	 		jedis.lpush("a", "6"); 
//	 		jedis.lpush("a", "3");
//	 		jedis.lpush("a", "9");
//	 		System.out.println(jedis.lrange("a", 0, -1));
//	 		System.out.println(jedis.sort("a"));
//	 		System.out.println(jedis.lrange("a", 0, -1));
//	 	}

}

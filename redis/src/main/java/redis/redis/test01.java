package redis.redis;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


import redis.clients.jedis.Jedis;

public class test01 {
	
	
	
	
	@Test
	public void setUp(){
//		
//		
//		Map<String, Object> map =new HashMap<String,Object>();
//		String mf ="女";
//		if(mf!=null){
//			try {
//				map.put("TouchPoint",URLEncoder.encode(mf,"uft-8"));
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		if(mf.equals("男")){
//			map.put("MEM_MF",  "M");
//		}
//		 if(mf.equals("女")){
//			map.put("MEM_MF",  "F");
//		}
//		 if(mf.equals("")){
//			map.put("MEM_MF",  null);
//		}
//	
	
		 
	//	String date=SimpleDateFormat("yyyyMMddHHmmss").format( Calendar.getInstance().getTime());
		System.out.println( getFormatDate());
	}


	public static String getFormatDate(){
		return new SimpleDateFormat("yyyyMMddHHmmss").format( Calendar.getInstance().getTime());
	}
	

}

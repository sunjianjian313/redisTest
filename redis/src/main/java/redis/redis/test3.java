package redis.redis;

import java.util.Arrays;

public class test3 {
	public static void main(String[] args) {
		String str1="a,b,c";
		String str2="a,b,c,";
		String str3=",a,b,c";
		
		String[] s1 = str1.split(",");
		System.out.println(Arrays.asList(s1));
		String[] s2 = str2.split(",",-1);
		System.out.println(Arrays.asList(s2));
		String[] s3 = str3.split(",");
		System.out.println(Arrays.asList(s3));
		
		
		
	      Integer lockStockTimeout=33;
		  if(lockStockTimeout instanceof Integer==false){
			  System.out.println("string 类型");
				
		  }else{
			  System.out.println("Integer 类型");
		  }
		
	}

}

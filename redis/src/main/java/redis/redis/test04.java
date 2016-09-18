package redis.redis;

import java.util.ArrayList;
import java.util.List;

public class test04 {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<String>();
		strList.add("1");
		strList.add("2");
		
		List<Integer> inList =new ArrayList<Integer>();
		inList.add(1);
		inList.add(2);
		
		
		
		if(strList.get(0 )instanceof String ==true){
			System.out.println("String");
		}
		
		
		String [] str={"1","2","3"};
		
		System.out.println(strList);
		System.out.println(inList);
		System.out.println(str);
	}

}

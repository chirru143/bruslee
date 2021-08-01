package com.pack.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employee {
	public static void main(String[] args) {
		Map<Integer,String>s=new HashMap<>();
		s.put(5 , "asfjb");
		s.put(8 , "sfjb");
        s.put(4 , "bb");
		s.put(1, "bb");
		s.put(1 , "csfb");
		s.put(12, "venu");
		
	 System.out.println(s);
	 Iterator<Integer> e=s.keySet().iterator();
	 while(e.hasNext()) {
	 int key=(int)e.next();
		 System.out.println("Roll no: "+ key + " name:" +s.get(key));
 }
	 

		
	}
	

}

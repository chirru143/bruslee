package com.pack.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Student {
	public static void main(String[] args) {
		
		Map<Integer,String>s=new HashMap<>();
		s.put(5 , "Nir");
		s.put(8 , "balu");
        s.put(4 , "venkat");
		s.put(1, "abcd");
		s.put(1 , "lakshmi");
		
		System.out.println(s);
		
	//	Iterator<Entry<Integer, String>> e=s.entrySet().iterator();
//		while(e.hasNext()) {
//		
//			Integer ee=(Integer)e.next();
//			
//			System.out.println("Roll number:"+e+ " name "+s.get(e));
//		}
		
		
//		Iterator<Integer> e=s.keySet().iterator();
//		
//		while(e.hasNext()) {
//		  int ee=(int)e.next();
//		  System.out.println("Roll number:"+ee+ " name "+s.get(ee));
//		}
	



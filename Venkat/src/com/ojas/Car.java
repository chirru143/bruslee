package com.ojas;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 class Car {
	public static void main(String[] args) {
	
		List<Integer>a=Arrays.asList(1,2,32,223,3,12,11,4,6,5,3,2,1);
		
		List<String> aa=Arrays.asList("venkat","venu","dhjshd","sai");
		Set<Integer> sa=new HashSet<>();
		
		 //List<Integer> s1=a.stream().sorted().collect(Collectors.toList());
				// s1. forEach(System.out::println);
		
		//a.stream().sorted().forEach(System.out::println); 
	//	aa.stream().sorted().forEach(System.out::println);
		//a.stream().distinct().forEach(System.out::println);
		//System.out.println("Sum:"+a.stream().mapToInt(i -> i).sum());
		
		a.stream().filter(x -> Collections.frequency(a , x)>1)
		.collect(Collectors.toSet()).forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	
	}

}

package com.ojas;


import java.util.ArrayList;
import java.util.List;


public class ForEachDemo {
	public static void main(String[] args) {
		List<student1> s=new ArrayList<student1>();
		s.add(new student1(1,"ven",3000));
		s.add(new student1(2,"balu",5000));
        s.add(new student1(4,"harish",2000));
		s.add(new student1(8,"akshdak",1000));
		s.add(new student1(99,"abdja",7000));
		
	

//		List<student1>s2=s.stream().sorted().collect(Collectors.toList());
//		System.out.println(s2);
//		
		
//	 List<student1> s2=s.stream().sorted(Comparator.comparing(student1::getSname)).
//			 collect(Collectors.toList());
		
	

		
	// System.out.println(s);
		
		
//		
//		List<String> s2=s.stream().sorted().collect(Collectors.toList());
//		System.out.println(s2);
//		
//		s.stream().forEach(t->System.out.println(t));
//		Map<Integer,String>a=new HashMap<>();
//		a.put(1, "ckajckja");
//		a.put(2, "ckajckja");
//		a.put(3, "ckajckja");
//		a.put(4, "ckajckja");
//		
//		
//		
//		a.forEach((key , value)-> System.out.println(key+ " :"+value));
//		a.entrySet().stream().forEach(x-> System.out.println(x));
//		
//	}
	}
}

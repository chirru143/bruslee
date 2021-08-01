package com.ojas;

import java.util.Arrays;
import java.util.List;

public class SuppilerDemo {//implements Supplier<String> {

//	@Override
//	public String get() {
//		// TODO Auto-generated method stub
//		return "javaTech"	;
//	}
public static void main(String[] args) {
	
//	  Supplier <String> d=()->"kjs dfkj dfkj hkf";
//	  
//	   System.out.println(d.get());
//	   
	   
	   List<String> s=Arrays.asList();
	   
	   System.out.println(s.stream().findAny().orElseGet(()->"hi venkat chennaiah your software developer"));
	 }
	 
}

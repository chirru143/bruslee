package com.ojas;

public class SecondLargetArray {
public static void main(String[] args) {
	int[] a={3,9,5,6};
	int temp;
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]<a[j]) {  //a[i]>a[j] samallest number find out 
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
//	if(i==1) {
//		break;
//	}
//	System.out.println("second largest number"+a[1]);
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	
		System.out.println("second largest number"+a[1]);
		
		//System.out.println("second smallest number"+a[1]);
			
		}










	}

	


package com.ojas;

public class SecondLargestArray {
	public static void main(String[] args) {
	int[] a={3,9,5,6};
	int largest=a[0];
	int second=a[0];
	for(int i=0;i<a.length;i++) {
		if(largest>a[i]) {
			largest=a[i];
		
				
			}
		}
	
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	
		System.out.println("second largest number"+a[1]);
		

}
}

package com.qa.test.com.qa.test;

public class sumofElementsinanArray {

	public static void main(String[] args) {
		
		int[] akshay = {1,2,3,4,5} ;
		int i ;
		int sum= 0;
		//System.out.println(akshay[3]);
		for(i=0;i<akshay.length;i++){
			sum = sum+ akshay[i];
		}
		System.out.println(sum);
	}

}

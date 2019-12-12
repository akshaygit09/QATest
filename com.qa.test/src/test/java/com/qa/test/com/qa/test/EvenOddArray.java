package com.qa.test.com.qa.test;

public class EvenOddArray {
	public static void main(String[] args) {
		int[] akshay = {19,12,35,42,27} ;
		
		for(int i =0;i<akshay.length;i++){
			if(akshay[i]%2==0){
				System.out.println("Even : " + akshay[i]);
			}
			else{
				System.out.println("Odd :" + akshay[i]);
			}
		}
		
	}
	
	
}

package com.qa.test.com.qa.test;

public class swap {

	public static void main(String[] args) {
			int a = 5 ;
			int b = 20 ;
			System.out.println("Before swapping a : " + a);
			System.out.println("Before swapping a : " + b);
/**
 * With the help of third variable
 */
					
//			int temp = a ; //20
//			a=b;
//			b=temp;
			
/**
 * Without using third variable			
 */
			a=a+b; //30
			b=a-b; //10
			a=a-b; //20
			
			
			
			System.out.println("After swapping a : " + a);
			System.out.println("After swapping b : " + b);
			
			
	}

}

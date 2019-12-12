package com.qa.test.com.qa.test;

import java.util.Scanner;

public class numberofDigitInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		long num = sc.nextLong(); //1234
		
//		String s = num + "" ;
//		System.out.println(s.length());
		int count = 0;
		while(num!=0){
		num = num/10;
		count++ ;
		}
		System.out.println(count);
		
		
		
		
	}

}

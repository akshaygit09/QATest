package com.qa.test.com.qa.test;

import java.util.Scanner;

public class sumofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();  //721
		int sum = 0 ;
		while(num !=0){
			sum = sum + num%10;   //1
			num = num/10 ;		//72	
			
		}
		System.out.println(sum);
		
	}

}

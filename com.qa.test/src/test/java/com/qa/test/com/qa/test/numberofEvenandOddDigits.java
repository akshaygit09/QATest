package com.qa.test.com.qa.test;

import java.util.Scanner;

public class numberofEvenandOddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int oddcount =0;
		int evencount =0;
		
		while(num!=0){
			int digit = 0;
			digit = num%10;
			if(digit%2==0){
				evencount++ ;
			}else{
				oddcount++;
				}
			num = num/10;
		}
		System.out.println("Even Count : " + evencount + "\n" + "Odd Count : "+ oddcount);
		
		
			
			
		
		
	}

}

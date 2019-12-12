package com.qa.test.com.qa.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt(); //4
		int i;
		int fact=1;
		for(i=1 ;i<=num ; i++){
		fact = fact*i;
		}
		System.out.println(fact);
	}
}

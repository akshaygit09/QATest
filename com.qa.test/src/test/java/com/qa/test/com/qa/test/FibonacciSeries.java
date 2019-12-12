package com.qa.test.com.qa.test;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a =0;
		int b = 1;
		int count = 10 ;
		System.out.print(a+ " " + b);
		for(int i=2;i<count;i++){
			int c = a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}
		
				
				
	}

}

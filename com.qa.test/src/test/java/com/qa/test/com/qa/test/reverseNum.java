package com.qa.test.com.qa.test;

import java.util.Scanner;

public class reverseNum {

		/**
		 * Logic 1 : While loop
		 */
/*		while(num>0){
			rev = rev*10 + num%10 ;  
			num = num/10 ;
					}
		System.out.print(rev);
*/
		/**
		 * Using recursion
		 */
		int rev = 0;
		void reverse(int num){
			if(num != 0){
				rev = rev *10 + num% 10;
				num = num/10;
				reverse(num);
			}
			System.out.println(rev);
			
		}
		


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int numb = sc.nextInt();
			int rev = 0;
			reverseNum r = new reverseNum();
			r.reverse(numb);


	}

}

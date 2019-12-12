package com.qa.test.com.qa.test;

import java.util.Scanner;

public class ReverseearchWordinaString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String name = sc.nextLine();
		String reversedString="";
		
		String words[] = name.split(" ");
	//	char words[] = name.toCharArray();
	
		for (int j=0 ; j<words.length ; j++){
			String word = words[j];
			String reverseWords = "";
			
		for(int i = word.length()-1;i>=0;i--){
			reverseWords = reverseWords + word.charAt(i);
		}
		reversedString = reversedString + reverseWords + " ";
			System.out.print(reverseWords);
			
			
		}
		
			
		
			
	}

}

package com.qa.test.com.qa.test;

import java.util.HashMap;
import java.util.Scanner;

public class countWordsinaString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String name = sc.nextLine();
		//Testing
		char ch[]= name.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
// 		int count =0;
		for(char c : ch){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		
		}
		System.out.println(map);
		
		
		
		
		
		
	}

}

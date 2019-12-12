package com.qa.test.com.qa.test;

import java.util.Scanner;

public class maxandMininanArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter all the elements:");
				int i ;
		 for( i=0;i<n;i++){//for reading array
			 array[i]=sc.nextInt();
	        }
		 int max = array[0];
		for(i=1;i<array.length;i++){
			if(max<array[i]){
				max=array[i];
			}
		}
		System.out.println("Maximum number in your array is : " + max);
	}

}

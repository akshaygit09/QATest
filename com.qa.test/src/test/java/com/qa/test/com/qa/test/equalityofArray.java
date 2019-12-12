package com.qa.test.com.qa.test;

public class equalityofArray {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4,5};
		int array2[]= {1,2,3,4,5};
		
		for(int i=0;i<array1.length;i++){
			if(array1[i]==array2[i]){
				System.out.println("Equal Array");
			}
				else
					System.out.println("Different Array");
				
			}
		}
	}


package com.promineotech;

public class Week4CodingAssignment {

	public static void main(String[] args) {
		
		// Q1. create an array of int called ages 
		// 3, 9, 23, 64, 2, 8, 28, 93
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		
		// subtract the first element from the last element
		
		int num = ages[7];
		System.out.println(num);
		
		int num1 = ages[ages.length - 1] - ages[0];
		
		System.out.println(num1);
		
		//System.out.println("The length of the ages array: " + ages.length);
		int num2 = ages2[ages2.length - 1] - ages2[0];
		
		System.out.println(num2);
		
		
		// Use a loop to iterate through the array and calc avg age
		int sum = 0;
		
		for(int i = 0; i < ages.length; i++) {
			
			sum += ages[i];
			
			System.out.println(sum + " the value of i " + i);
			
		}
		
		System.out.println(sum/ages.length);
		

	}

}

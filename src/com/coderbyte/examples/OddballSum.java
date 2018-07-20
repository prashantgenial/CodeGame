package com.coderbyte.examples;

import java.util.Arrays;

/*
 * Write a function called oddball_sum which takes in a list of numbers and returns the sum of all the odd elements.
 * To solve this challenge we'll simply loop through the array while maintaining a final count,
 *  and every time an odd number is encountered we'll add it to the count.
 *  http://prepwork.appacademy.io/coding-test-1/practice-coding-exercise/
 * */

public class OddballSum {

	public static void main(String[] args) {
		
		int[] numbs= {1,2,5,18,19,21};
		
		System.out.println("Odd ball sum:"+oddball_sum(numbs));
		System.out.println("Odd ball sum1:"+oddball_sum1(numbs));
	}

	
	public static int oddball_sum(int[] nums) {
		 
		  // final count of all odd numbers added up
		  int final_count = 0;
		  
		  // loop through entire list
		  for (int i = 0; i < nums.length; i++) {
		    
		    // we divide by 2, and if there is a remainder then
		    // the number must be odd so we add it to final_count
		    if (nums[i] % 2 == 1) {
		      final_count += nums[i];
		    }
		    
		  }
		  
		  return final_count;
		  
		}
	
		public static int oddball_sum1(int[] nums) {
		  return Arrays.stream(nums).filter(i -> i%2 != 0).sum();
		}
}

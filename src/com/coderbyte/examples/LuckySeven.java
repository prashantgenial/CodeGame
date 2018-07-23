package com.coderbyte.examples;

import java.util.Arrays;

/*
 * Write a function called lucky_sevens which takes an array of integers and returns true if any three consecutive elements sum to 7.
 * */

public class LuckySeven {

	public static void main(String[] args) {
		
		int[] nums= {1,2,4,18,19,21};
		int[] nums1= {1,2,5,18,19,21};
		
		System.out.println("Nums:"+ luckySeven(nums));
		System.out.println("Nums1:"+ luckySeven(nums1));
	}
	
	public static boolean luckySeven(int[] arr) {
		// if less than 3 elements then this challenge is not possible
		 if (arr.length < 3) {
		    return false;
		  }
		
		for (int i = 0; i< arr.length; i++){
		    if ((i < arr.length -2) && (arr[i]+arr[i+1]+arr[i+2]) == 7) return true;
		}
	
//		Arrays.stream(arr).reduce(Integer::sum);
		 // if loop is finished and no elements summed to 7
		  return false;
	}
	
	
}

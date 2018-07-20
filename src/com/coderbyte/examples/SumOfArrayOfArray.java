package com.coderbyte.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Sum of several arrays
 * You will be given an array of several arrays that each contain integers and
 *  your goal is to write a function that will sum up all the numbers in all the arrays. 
 *  For example, if the input is [[3, 2], [1], [4, 12]] then your program should output 22 because 3 + 2 + 1 + 4 + 12 = 22.
 * */

public class SumOfArrayOfArray {

	public static void main(String[] args) {
		
		int[][] arr = {{3,2},{5,4},{12,2}};
		System.out.println("Sum:"+sum_array(arr));
		System.out.println("Another Sum :"+sumArray(arr));
		System.out.println("Another Sum2 :"+sumArray1(arr));
	}

	public static Integer sum_array(int[][] arr) {		  
	  // store our final answer
	  Integer sum = 0;		  
	  // loop through entire array
	  for (Integer i = 0; i < arr.length; i++) {		    
	    // loop through each inner array
	    for (Integer j = 0; j < arr[i].length; j++) {
	      // add this number to the current final sum
	      sum += arr[i][j];		      
	    }		    
	  }	  
	  return sum;	  
	}
	
	public static int sumArray(int[][] arr) {
		Integer count = 0;
		for (Integer i = 0; i < arr.length; i++) {		    
			count += Arrays.stream(arr[i]).reduce(0, (x, y) -> x + y);	    
		}
		return count;
	}
	
	public static int sumArray1(int[][] arr) {
		return Arrays.stream(arr).flatMapToInt(IntStream::of).sum();
	}
}

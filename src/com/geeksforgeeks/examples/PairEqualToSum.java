package com.geeksforgeeks.examples;

import java.util.Arrays;

public class PairEqualToSum {

	public static void main(String[] args) {
		//Given an array A[] and a number x, check for pair in A[] with sum as x
		int[] nums = {1, 4, -8, 6, 45, 10};
		int sum = 16;
		
		Arrays.stream(nums).sorted().forEach(System.out::println);
		System.out.println("-------------------");
		System.out.println(hasArrayTwoCandidates(nums, sum));
	}

	
	// Function to check if array has 2 elements 
    // whose sum is equal to the given value
    static boolean hasArrayTwoCandidates(int A[], int sum)
    {
        int l, r;
     
        /* Sort the elements */
        Arrays.sort(A);
     
        /* Now look for the two candidates 
        in the sorted array*/
        l = 0;
        r = A.length-1;
        
        while (l < r)
        {
            if(A[l] + A[r] == sum)
                return true; 
            else if(A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        } 
        return false;
    }
}

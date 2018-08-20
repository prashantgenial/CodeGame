package com.geeksforgeeks.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountpairswithSum {

	public static void main(String args[])
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
        getPairsCount(arr, sum);
        printPairsUsingSet(arr,6);
        printSumPairs(arr,6);
    }
	
	 // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0;// Initialize result
 
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.printf("Count of pairs is %d",count);
    }
    
    /** 
     * * Given an array of integers finds two elements in the array whose sum is equal to n. 
     * * @param numbers 
     * * @param n 
     * */ 
    public static void printPairsUsingSet(int[] numbers, int n){
    	if(numbers.length < 2){ return; } 
    	Set set = new HashSet(numbers.length); 
    	for(int value : numbers){ 
    		int target = n - value; // if target number is not in set then add 
    		if(!set.contains(target)){ 
    			set.add(value); 
    		}
    		else { 
    			System.out.printf("(%d, %d) %n", value, target); 
    			} 
    		} 
    	}
    
    public static void printSumPairs(int []input, int k){
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for(int i=0;i<input.length;i++){

            if(pairs.containsKey(input[i]))
                System.out.println(input[i] +", "+ pairs.get(input[i]));
            else
                pairs.put(k-input[i], input[i]);
        }

    }
}

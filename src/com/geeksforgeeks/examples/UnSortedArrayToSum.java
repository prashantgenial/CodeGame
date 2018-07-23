package com.geeksforgeeks.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Input :  arr1[] = {-1, -2, 4, -6, 5, 7}
         arr2[] = {6, 3, 4, 0}  
         x = 8
Output : 4 4
         5 3

Input : arr1[] = {1, 2, 4, 5, 7} 
        arr2[] = {5, 6, 3, 4, 8}  
        x = 9
Output : 1 8
         4 5
         5 4
         
https://www.geeksforgeeks.org/given-two-unsorted-arrays-find-pairs-whose-sum-x/         
 * */
public class UnSortedArrayToSum {

	public static void main(String[] args) {
		Integer[] arr1 = {1, 2, 4, 5, 7}; 
		Integer[] arr2 = {5, 6, 3, 4, 8};
		Integer x = 9;
        
        findPairs(arr1,arr2,x);

	}

	 // Function to find all pairs in both arrays
    // whose sum is equal to given value x
    public static void findPairs(Integer arr1[], Integer arr2[], Integer x)
    {
        // Insert all elements of first array in a hash
        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
         
        for (int i = 0; i < arr1.length; i ++)
            s.put(arr1[i], 0);
        
//        Arrays.stream(arr1).map(s1 -> s1).collect(Collectors.toMap(s1,0));
        
        // Subtract sum from second array elements one
        // by one and check it's present in array first
        // or not
        for (int j = 0; j < arr2.length; j ++)
            if (s.containsKey(x - arr2[j]))
                System.out.println(x - arr2[j] + " " + arr2[j]);             
    }

	private static Function s(Map<Integer, Integer> s, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}

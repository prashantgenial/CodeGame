package com.geeksforgeeks.examples;

/**
 * Input : arr[] = { 3, 4, 5, 1, 2 }
Output : YES
The above array is sorted and rotated.
Sorted array: {1, 2, 3, 4, 5}. 
Rotating this sorted array clockwise 
by 3 positions, we get: { 3, 4, 5, 1, 2}

Input: arr[] = {7, 9, 11, 12, 5}
Output: YES

Input: arr[] = {1, 2, 3}
Output: NO
 * @author Prashant Gupta
 *
 */
public class CheckIfSortRotated {
	// Function to check if an array is  
	// sorted and rotated clockwise  
	static void checkIfSortRotated1(int arr[],  
	                               int n)  
	{  
	    int minEle = Integer.MAX_VALUE; 
	    int maxEle = Integer.MIN_VALUE; 
	  
	    int minIndex = -1;  
	  
	    // Find the minimum element  
	    // and it's index  
	    for (int i = 0; i < n; i++)  
	    {  
	        if (arr[i] < minEle)  
	        {  
	            minEle = arr[i];  
	            minIndex = i;  
	        }  
	    }  
	  
	    boolean flag1 = true;  
	  
	    // Check if all elements before  
	    // minIndex are in increasing order  
	    for (int i = 1; i < minIndex; i++)  
	    {  
	        if (arr[i] < arr[i - 1])  
	        {  
	            flag1 = false;  
	            break;  
	        }  
	    }  
	  
	    boolean flag2 = true;  
	  
	    // Check if all elements after  
	    // minIndex are in increasing order  
	    for (int i = minIndex + 1; i < n; i++) 
	    {  
	        if (arr[i] < arr[i - 1])  
	        {  
	            flag2 = false;  
	            break;  
	        }  
	    }  
	  
	    // Check if last element of the array  
	    // is smaller than the first element 
	    if (flag1 && flag2 && (arr[n - 1] < 
	                           arr[0]))  
	        System.out.println("YES");  
	    else
	        System.out.print("NO");  
	}  
	  
	// Driver code  
	public static void main (String[] args) 
	{ 
	    int arr[] = { 3, 4, 5, 1, 2 };  
	      
	    int n = arr.length; 
	      
	    checkIfSortRotated1(arr, n);  
	}
}

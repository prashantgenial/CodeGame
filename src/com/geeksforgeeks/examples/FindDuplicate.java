package com.geeksforgeeks.examples;

import java.util.HashSet;
import java.util.Set;

class FindDuplicate 
{ 
 // Function to print duplicates 
    void printRepeating(int arr[], int size) 
    { 
        int i;   
        System.out.println("The repeating elements are : "); 
     
        for (i = 0; i < size; i++) 
        { 
            if (arr[Math.abs(arr[i])] >= 0) 
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
            else
                System.out.print(Math.abs(arr[i]) + " "); 
        }          
    }  
  
    // Driver program  
    public static void main(String[] args)  
    { 
        FindDuplicate duplicate = new FindDuplicate(); 
        int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
        int arr_size = arr.length; 
  
       // duplicate.printRepeating(arr, arr_size); 
        
        //below solution work for integer and string both
        Set<Integer> aSet = new HashSet<>();
        for(int c : arr) {
        	if(aSet.add(Integer.valueOf(c))  == false){
        		System.out.println("Duplicate : "+c);
        	}
        }
    } 
} 

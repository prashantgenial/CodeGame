package com.geeksforgeeks.examples;

import java.util.HashSet;
import java.util.Set;

public class SetToArr {

	public static void main(String[] args) {
		// Creating a hash set of strings
        Set<String> s = new HashSet<String>();
        s.add("Geeks");
        s.add("for");
        System.out.println(s);
        
        int n = s.size();
        String arr[] = new String[n];
 
        // Please refer below post for syntax
        // details of toArray()
        // https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/
        arr = s.toArray(arr);
        
        String[] arr1 = s.stream().toArray(String[] ::new);
        
        for(String a: arr) {
        	System.out.println(a);
        }

	}

}

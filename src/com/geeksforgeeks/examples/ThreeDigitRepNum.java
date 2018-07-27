package com.geeksforgeeks.examples;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Print all 3 digit repeating numbers in a very large number
   Given a very large number, print all the 3 digit repeating numbers with their frequency.
   If a 3 digit number appears more then once, print the number and its frequency
   Input: 123412345123456
Output: 123 - 3 times
         234 - 3 times
         345 - 2 times 

Input: 43243243
Output: 432 - 2 times
        324 - 2 times
        243 - 2 times
 * */
public class ThreeDigitRepNum {

	public static void main(String[] args) {
		
		 // Input string
        String s = "123412345123456";
        printNumbers(s);
	}

	private static void printNumbers(String s) {
		int i = 0, j = 0, val = 0;
        
        // Hashmap to store the
        // frequency of a 3 digit number
        Map<Integer, Integer> hm = new LinkedHashMap<>();
 
        // first three digit number
        val = (s.charAt(0) - '0') * 100 + (s.charAt(1) - '0') * 10 + (s.charAt(2) - '0');
        
        hm.put(val, 1);
        for (i = 3; i < s.length(); i++) {
            val = (val % 100) * 10 + s.charAt(i) - '0';
 
            // if key already exists increase value by 1
            if (hm.containsKey(val)) {
                hm.put(val, hm.get(val) + 1);
            }
            else {
                hm.put(val, 1);
            }
        }
        
        hm.entrySet().stream().filter( x -> x.getValue() > 1).forEach(e -> System.out.println(e.getKey() + ":"+ e.getValue()));
	}

}

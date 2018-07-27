package com.geeksforgeeks.examples;

import java.util.Map;
import java.util.TreeMap;

/*
 * Maximum occurring character in an input string | Set-2
Given a string containing lowercase characters.
 The task is to print the maximum occurring character in the input string.
  If 2 or more characters appear the same number of times,
   print the lexicographically (alphabetically) lowest (first) character.

Examples:

Input: test sample
Output: e
‘t’, ‘e’ and ‘s’ appears 2 times, but ‘e’ is the lexicographically smallest character.

Input: sample program
Output: a
https://www.geeksforgeeks.org/maximum-occurring-character-in-an-input-string-set-2/
https://itexpertsconsultant.wordpress.com/2016/05/14/java-8-sorted-map-by-key-value/
 * */

public class MaxOccureCharaInString {

	public static void main(String[] args) {
		
		//String x = "Prashant Gupta";
		String x = "test sample";
		printMaxOccurCharacter(x.toCharArray());
	}

	private static void printMaxOccurCharacter(char[] x) {
		Map<Character,Integer> m = new TreeMap<>();
		
		for(int i=0 ; i < x.length; i++) {			
			if(m.containsKey(x[i]))
				  m.put(x[i], m.get(x[i]) + 1);
            else 
                m.put(x[i], 1);
		}
		
		m.entrySet().stream()
		.filter(e -> e.getValue() > 1)
		.sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
		.limit(1)
		.forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
		
		//OR
		
		m.entrySet().stream()
		.filter(e -> e.getValue() > 1)
		.sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue()))
		.limit(1)
		.forEach(e -> System.out.println(e.getKey()+":"+e.getValue()));
	}

}

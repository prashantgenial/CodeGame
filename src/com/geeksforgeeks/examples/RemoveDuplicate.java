package com.geeksforgeeks.examples;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String args[]) {
		Integer[] arr = {1,2,3,1,3,1,3,8,3,1,5,2};
		Arrays.stream(arr).distinct().forEach(System.out::println);		
		
		printRandom();
	}

	private static void printRandom() {
		String[] array = {"prat", "preet", "sratt"};
		    Arrays.stream(array).map(name-> name.charAt(0))
		            .distinct()
		            .map(ch -> Arrays.stream(array).filter(name->name.charAt(0) == ch).findAny().get())
		            .forEach(System.out::println);
	}
	
	
}

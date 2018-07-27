package com.geeksforgeeks.examples;

import java.util.Arrays;


// First Upper case of words


public class FirstUpperCaseString {
	public static void main(String args[]) {
		String arr [] = {"pooja","abhi","prat","ashish"};
		Arrays.stream(arr).filter(word -> word.length() > 0)
		.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
		.forEach(System.out::println);
	}

}

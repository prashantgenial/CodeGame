package com.geeksforgeeks.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Given a String of length N reverse the whole string without reversing the individual words in it. Words are separated by dots.
 * Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
 * */

public class ReverseString {

		public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		System.out.println("Input String:"+s);
		System.out.println("Reverse String:"+reverseString(s));
		

	}

	private static String reverseString(String input){
		List<String> s = Arrays.asList(input.split("\\.")) ;
		Collections.reverse(s);	//reverse list
		return String.join(".", s);
	}
}

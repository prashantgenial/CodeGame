package com.coderbyte.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * You will be given 2 parameters: a low and high number. Your goal is to print all numbers between low and high,
 *  and for each of these numbers print whether or not the number is divisible by 3. If the number is divisible by 3, print the word "div3"
 *  directly after the number.
 * */

public class DivisorsOfThree {

	public static void main(String[] args) {
		
		test_divisior1(2,20);

	}

	public static void test_divisior(int low,int high) {
		
		List<Integer> output = new ArrayList<>();
		
		for (int i = low; i <= high; i++) {
		    // check if the current number is evenly divisible by 3
		    if (i % 3 == 0) {  output.add(i); }		    
		}
		
		output.stream().forEach(System.out::println);
	}
	
	public static void test_divisior1(int low,int high) {
		IntStream.range(low,high).filter(i -> i%3 == 0).forEach(System.out::println);		
	}
}

package com.java2novice.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeekEx {

	public static void main(String[] args) {

		
		/*
		 * The Stream.peek() method is mainly to support debugging, 
		 * where you want to see the elements as they flow past a certain point in a pipeline.
		 * */
		List<String> collect = Stream.of("bus", "car", "bycle", "flight", "train")
		.filter(e -> e.length() > 3)
		.peek(e -> System.out.println("Filtered value: " + e))
		.map(String::toUpperCase)
		.peek(e -> System.out.println("Mapped value: " + e))
		.collect(Collectors.toList());

		System.out.println(collect);
	}

}

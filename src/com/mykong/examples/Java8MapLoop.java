package com.mykong.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Java 8 loops for Map
 * https://www.mkyong.com/tutorials/java-8-tutorials/
 * */

public class Java8MapLoop {

	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("Old Way Loop:");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		System.out.println("Java 8 way:");
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		System.out.println("Java 8 way if do some processing inside loop:");
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
		List<String> items1 = new ArrayList<>();
		items1.add("A");
		items1.add("B");
		items1.add("C");
		items1.add("D");
		items1.add("E");
		//Stream and filter
		//Output : B
		items1.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
	}
}

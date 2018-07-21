package com.concretepage.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
public class ReduceDemo1 {
    public static void main(String[] args) {
    	  int[] array = {23,43,56,97,32};
    	  Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
    	  
    	  int startValue = 100;
    	  int sum = Arrays.stream(array).reduce(startValue, (x,y) -> x+y);
    	  System.out.println(sum);
    	  
    	  Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
    	  Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(s -> System.out.println(s));
    	  
    	  Double[] dArr = {23.0,44.85,99.8,29.77};
    	  System.out.println(Arrays.stream(dArr).reduce(0.0,(Double a,Double b) -> a+b));
    	  
    	  List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
          String result = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2);
          System.out.println(result);
          
          // creating a list of Strings
          List<String> words = Arrays.asList("GFG", "Geeks", "for",
                                             "GeeksQuiz", "GeeksforGeeks");
   
          // The lambda expression passed to
          // reduce() method takes two Strings
          // and returns the the longer String.
          // The result of the reduce() method is
          // an Optional because the list on which
          // reduce() is called may be empty.
          Optional<String> longestString = words.stream()
                                     .reduce((word1, word2)
                               -> word1.length() > word2.length()
                                             ? word1 : word2);
   
          // Displaying the longest String
          longestString.ifPresent(System.out::println);
          
          //https://www.geeksforgeeks.org/stream-reduce-java-examples/
       // To get the product of all elements
          // in given range excluding the
          // rightmost element
          int product = IntStream.range(2, 8)
                       .reduce((num1, num2) -> num1 * num2)
                       .orElse(-1);
   
          // Displaying the product
          System.out.println("The product is : " + product);
    }
}  